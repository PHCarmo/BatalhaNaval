package controller;

import javax.swing.JOptionPane;
import model.DAO;

public class Historico {
    DAO dao = new DAO();
    
    public String todasPartidas(){
        String comando = "SELECT * FROM historico;";
        return dao.partidas(comando, "partidas");
    }
    
    public String vitorias(){
        String comando = "SELECT * FROM historico WHERE historico.situacao='Ganhou';";
        return dao.partidas(comando, "vitórias");
    }
    
    public String derrotas(){
        String comando = "SELECT * FROM historico WHERE historico.situacao='Perdeu';";
        return dao.partidas(comando, "derrotas");
    }
    
    public String limpar(){
        if(JOptionPane.showConfirmDialog(null, "Isto irá fazer com que você perca todo o "
                + "histórico."
                + "\nVocê tem certeza que quer fazer isso?") == JOptionPane.OK_OPTION){
            
            String comando = "DELETE FROM historico WHERE historico.id>0;";
            dao.executaUpdateSQL(comando);
            
            JOptionPane.showMessageDialog(null, "As partidas do"
                    + " histórico foram resetadas com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }
        return "Sem partidas para mostrar.";
    }
}
