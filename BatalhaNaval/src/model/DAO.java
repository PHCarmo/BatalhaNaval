package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class DAO {
    private String driver, url, user, password;
    private Connection conexao;
    private Statement fluxoSQL;
    private ResultSet rs;
    
    public DAO() {
        this.url = "jdbc:mysql://localhost:3306/batalha_naval";
        this.user = "root";
        this.password = "1234";
    }
    
    public Connection abreConexao() {
        try{
            this.driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            this.conexao = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Conectado");
            return conexao;
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Classe JDBC não encontrada.");
            return null;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco."
                    + "\nErro: " + e.getMessage());
            System.out.println(e);
            return null;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            return null;
        }
    }
    
    public void fechaConexao() {
        try{
            conexao.close();
            //JOptionPane.showMessageDialog(null, "Encerrado");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível encerrar a conexão."
                    + "\nErro: " + e.getMessage());
        }
    }
    
    public void executaUpdateSQL(String strSQL) {
        this.conexao = abreConexao();
        try{
            fluxoSQL = this.conexao.createStatement();
            fluxoSQL.executeUpdate(strSQL);
            //JOptionPane.showMessageDialog(null, "Comando executado com sucesso");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução da Query"
                    + "\nErro: " + e.getMessage());
        }
        fechaConexao();
    }
    
    public ResultSet executaQuerySQL(String strSQL) {
        this.conexao = abreConexao();
        try{
            fluxoSQL = this.conexao.createStatement();
            rs = fluxoSQL.executeQuery(strSQL);
            
            //JOptionPane.showMessageDialog(null, "Comando executado com sucesso");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na execução da Query"
                    + "\nErro: " + e.getMessage());
        }finally{
            return rs;
        }
    }
    
    public int pegaPorcentagem(int conquista){
        String comando = "SELECT progresso FROM conquistas WHERE conquistas.id="+conquista+";";
        ResultSet rs = executaQuerySQL(comando);
        int porcentagem = 100;
        try{
            rs.next();
            porcentagem = rs.getInt("progresso");
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        return porcentagem;
    }
    
    public void zeraConquistas(){
        for(int x = 1; x < 11; x++){
            String comando = "UPDATE conquistas SET progresso=0 WHERE conquistas.id="+x;
            executaUpdateSQL(comando);
        }
    }
    
    public String partidas(String comando, String tipo){
        String texto = "";
        try{
            ResultSet rs = executaQuerySQL(comando);
            if(rs.next()){
                rs.previous();
                while(rs.next()){
                    texto += rs.getString("player") + " " + rs.getString("situacao")
                            + " com " + rs.getString("vidas") + " vidas \nsobrando em " +
                            rs.getString("dt") + "\n---------------------------------------------------\n";
                }
            }else{
                texto = "Sem " + tipo + " para mostrar.";
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return texto;
    }
}
