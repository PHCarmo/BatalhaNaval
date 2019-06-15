package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.DAO;
import view.JFJogo;
import view.JFMenu;

public final class Jogo {
    JFJogo jfjogo;
    JFMenu jfmenu;
    DAO dao = new DAO();
    JButton[] botoes = new JButton[100];
    int vidas = 10;
    int pontos = 0;
    int erros = 0;
    int acertos = 0;
    int[][] navios = new int[4][5];
    String[][] posicoes = new String[10][10];
    ButtonHandler handler = new ButtonHandler();
    
    public Jogo(JFJogo jframe, JFMenu jframe2){
        jfjogo = jframe;
        jfmenu = jframe2;
        listeners();
        inicializaMatriz();
        inicializaBotoes();
        conquistaI();
    }
    
    public class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            identifica(ae.getActionCommand());
        }
    }
    
    public int pegaPorcentagem(int conquista){
        return dao.pegaPorcentagem(conquista);
    }
    
    public void alteraProgresso(int conquista, int progresso){
        String comando = "UPDATE conquistas SET progresso=" +
                (pegaPorcentagem(conquista) + progresso) +
                " WHERE conquistas.id=" + conquista + ";";
        dao.executaUpdateSQL(comando);
    }
    
    public void insertPartida(String situacao){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String comando = "INSERT INTO historico(player, vidas, situacao, dt) VALUES('"
                + jfjogo.jLabel40.getText() + "'," + vidas + ",'" + situacao + "','" + sdf.format(new Date()) + "');";
        dao.executaUpdateSQL(comando);
    }
    
    public void listeners(){
        jfjogo.jButton1.addActionListener(handler);
        jfjogo.jButton2.addActionListener(handler);
        jfjogo.jButton3.addActionListener(handler);
        jfjogo.jButton4.addActionListener(handler);
        jfjogo.jButton5.addActionListener(handler);
        jfjogo.jButton6.addActionListener(handler);
        jfjogo.jButton7.addActionListener(handler);
        jfjogo.jButton8.addActionListener(handler);
        jfjogo.jButton9.addActionListener(handler);
        jfjogo.jButton10.addActionListener(handler);
        jfjogo.jButton11.addActionListener(handler);
        jfjogo.jButton12.addActionListener(handler);
        jfjogo.jButton13.addActionListener(handler);
        jfjogo.jButton14.addActionListener(handler);
        jfjogo.jButton15.addActionListener(handler);
        jfjogo.jButton16.addActionListener(handler);
        jfjogo.jButton17.addActionListener(handler);
        jfjogo.jButton18.addActionListener(handler);
        jfjogo.jButton19.addActionListener(handler);
        jfjogo.jButton20.addActionListener(handler);
        jfjogo.jButton21.addActionListener(handler);
        jfjogo.jButton22.addActionListener(handler);
        jfjogo.jButton23.addActionListener(handler);
        jfjogo.jButton24.addActionListener(handler);
        jfjogo.jButton25.addActionListener(handler);
        jfjogo.jButton26.addActionListener(handler);
        jfjogo.jButton27.addActionListener(handler);
        jfjogo.jButton28.addActionListener(handler);
        jfjogo.jButton29.addActionListener(handler);
        jfjogo.jButton30.addActionListener(handler);
        jfjogo.jButton31.addActionListener(handler);
        jfjogo.jButton32.addActionListener(handler);
        jfjogo.jButton33.addActionListener(handler);
        jfjogo.jButton34.addActionListener(handler);
        jfjogo.jButton35.addActionListener(handler);
        jfjogo.jButton36.addActionListener(handler);
        jfjogo.jButton37.addActionListener(handler);
        jfjogo.jButton38.addActionListener(handler);
        jfjogo.jButton39.addActionListener(handler);
        jfjogo.jButton40.addActionListener(handler);
        jfjogo.jButton41.addActionListener(handler);
        jfjogo.jButton42.addActionListener(handler);
        jfjogo.jButton43.addActionListener(handler);
        jfjogo.jButton44.addActionListener(handler);
        jfjogo.jButton45.addActionListener(handler);
        jfjogo.jButton46.addActionListener(handler);
        jfjogo.jButton47.addActionListener(handler);
        jfjogo.jButton48.addActionListener(handler);
        jfjogo.jButton49.addActionListener(handler);
        jfjogo.jButton50.addActionListener(handler);
        jfjogo.jButton51.addActionListener(handler);
        jfjogo.jButton52.addActionListener(handler);
        jfjogo.jButton53.addActionListener(handler);
        jfjogo.jButton54.addActionListener(handler);
        jfjogo.jButton55.addActionListener(handler);
        jfjogo.jButton56.addActionListener(handler);
        jfjogo.jButton57.addActionListener(handler);
        jfjogo.jButton58.addActionListener(handler);
        jfjogo.jButton59.addActionListener(handler);
        jfjogo.jButton60.addActionListener(handler);
        jfjogo.jButton61.addActionListener(handler);
        jfjogo.jButton62.addActionListener(handler);
        jfjogo.jButton63.addActionListener(handler);
        jfjogo.jButton64.addActionListener(handler);
        jfjogo.jButton65.addActionListener(handler);
        jfjogo.jButton66.addActionListener(handler);
        jfjogo.jButton67.addActionListener(handler);
        jfjogo.jButton68.addActionListener(handler);
        jfjogo.jButton69.addActionListener(handler);
        jfjogo.jButton70.addActionListener(handler);
        jfjogo.jButton71.addActionListener(handler);
        jfjogo.jButton72.addActionListener(handler);
        jfjogo.jButton73.addActionListener(handler);
        jfjogo.jButton74.addActionListener(handler);
        jfjogo.jButton75.addActionListener(handler);
        jfjogo.jButton76.addActionListener(handler);
        jfjogo.jButton77.addActionListener(handler);
        jfjogo.jButton78.addActionListener(handler);
        jfjogo.jButton79.addActionListener(handler);
        jfjogo.jButton80.addActionListener(handler);
        jfjogo.jButton81.addActionListener(handler);
        jfjogo.jButton82.addActionListener(handler);
        jfjogo.jButton83.addActionListener(handler);
        jfjogo.jButton84.addActionListener(handler);
        jfjogo.jButton85.addActionListener(handler);
        jfjogo.jButton86.addActionListener(handler);
        jfjogo.jButton87.addActionListener(handler);
        jfjogo.jButton88.addActionListener(handler);
        jfjogo.jButton89.addActionListener(handler);
        jfjogo.jButton90.addActionListener(handler);
        jfjogo.jButton91.addActionListener(handler);
        jfjogo.jButton92.addActionListener(handler);
        jfjogo.jButton93.addActionListener(handler);
        jfjogo.jButton94.addActionListener(handler);
        jfjogo.jButton95.addActionListener(handler);
        jfjogo.jButton96.addActionListener(handler);
        jfjogo.jButton97.addActionListener(handler);
        jfjogo.jButton98.addActionListener(handler);
        jfjogo.jButton99.addActionListener(handler);
        jfjogo.jButton100.addActionListener(handler);
        jfjogo.jButton55.addActionListener(handler);
    }
    
    public void inicializaMatriz(){
        for(int a = 0; a < 4; a++){
            for(int b = 0; b < 5; b++){
                navios[a][b] = 0;
            }
        }
        
        for(int a = 0; a < 10; a++){
            for(int b = 0; b < 10; b++){
                posicoes[a][b] = "0";
            }
        }
        
        Random gerador = new Random();
        
        //Navio tamanho 5
        for(int i = 0; i < 2; i++){
            int pos1 = gerador.nextInt(10);
            int pos2 = gerador.nextInt(6);
            
            while(!posicoes[pos1][pos2].equals("0") || !posicoes[pos1][pos2+1].equals("0") ||
                    !posicoes[pos1][pos2+2].equals("0") || !posicoes[pos1][pos2+3].equals("0")
                    || !posicoes[pos1][pos2+4].equals("0")){
                pos1 = gerador.nextInt(10);
                pos2 = gerador.nextInt(7);
            }
            
            for(int x = 0; x < 5; x++){
                posicoes[pos1][pos2] = "5."+(i+1);
                pos2++;
            }
        }
        
        //Navio tamanho 4
        for(int i = 0; i < 3; i++){
            int pos1 = gerador.nextInt(10);
            int pos2 = gerador.nextInt(7);
            
            while(!posicoes[pos1][pos2].equals("0") || !posicoes[pos1][pos2+1].equals("0") ||
                    !posicoes[pos1][pos2+2].equals("0") || !posicoes[pos1][pos2+3].equals("0")){
                pos1 = gerador.nextInt(10);
                pos2 = gerador.nextInt(7);
            }
            
            for(int x = 0; x < 4; x++){
                posicoes[pos1][pos2] = "4."+(i+1);
                pos2++;
            }
        }
        
        //Navio tamanho 3
        for(int i = 0; i < 4; i++){
            int pos1 = gerador.nextInt(10);
            int pos2 = gerador.nextInt(8);
            
            while(!posicoes[pos1][pos2].equals("0") || !posicoes[pos1][pos2+1].equals("0") ||
                    !posicoes[pos1][pos2+2].equals("0")){
                pos1 = gerador.nextInt(10);
                pos2 = gerador.nextInt(8);
            }
            
            for(int x = 0; x < 3; x++){
                posicoes[pos1][pos2] = "3."+(i+1);
                pos2++;
            }
        }
        
        //Navio tamanho 2
        for(int i = 0; i < 5; i++){
            int pos1 = gerador.nextInt(10);
            int pos2 = gerador.nextInt(9);
            
            while(!posicoes[pos1][pos2].equals("0") || !posicoes[pos1][pos2+1].equals("0")){
                pos1 = gerador.nextInt(10);
                pos2 = gerador.nextInt(9);
            }
            
            for(int x = 0; x < 2; x++){
                posicoes[pos1][pos2] = "2."+(i+1);
                pos2++;
            }
        }
        
        //Navio tamanho 1
        for(int i = 0; i < 6; i++){
            int pos1 = gerador.nextInt(10);
            int pos2 = gerador.nextInt(10);
            
            while(!posicoes[pos1][pos2].equals("0")){
                pos1 = gerador.nextInt(10);
                pos2 = gerador.nextInt(10);
            }
            
            for(int x = 0; x < 1; x++){
                posicoes[pos1][pos2] = "1."+(i+1);
                pos2++;
            }
        }
    }
    
    public void inicializaBotoes(){
        JButton[] temp = {
            jfjogo.jButton1,jfjogo.jButton2,jfjogo.jButton3,jfjogo.jButton4,jfjogo.jButton5,
            jfjogo.jButton6,jfjogo.jButton7,jfjogo.jButton8,jfjogo.jButton9,jfjogo.jButton10,
            jfjogo.jButton11,jfjogo.jButton12,jfjogo.jButton13,jfjogo.jButton14,jfjogo.jButton15,
            jfjogo.jButton16,jfjogo.jButton17,jfjogo.jButton18,jfjogo.jButton19,jfjogo.jButton20,
            jfjogo.jButton21,jfjogo.jButton22,jfjogo.jButton23,jfjogo.jButton24,jfjogo.jButton25,
            jfjogo.jButton26,jfjogo.jButton27,jfjogo.jButton28,jfjogo.jButton29,jfjogo.jButton30,
            jfjogo.jButton31,jfjogo.jButton32,jfjogo.jButton33,jfjogo.jButton34,jfjogo.jButton35,
            jfjogo.jButton36,jfjogo.jButton37,jfjogo.jButton38,jfjogo.jButton39,jfjogo.jButton40,
            jfjogo.jButton41,jfjogo.jButton42,jfjogo.jButton43,jfjogo.jButton44,jfjogo.jButton45,
            jfjogo.jButton46,jfjogo.jButton47,jfjogo.jButton48,jfjogo.jButton49,jfjogo.jButton50,
            jfjogo.jButton51,jfjogo.jButton52,jfjogo.jButton53,jfjogo.jButton54,jfjogo.jButton55,
            jfjogo.jButton56,jfjogo.jButton57,jfjogo.jButton58,jfjogo.jButton59,jfjogo.jButton60,
            jfjogo.jButton61,jfjogo.jButton62,jfjogo.jButton63,jfjogo.jButton64,jfjogo.jButton65,
            jfjogo.jButton66,jfjogo.jButton67,jfjogo.jButton68,jfjogo.jButton69,jfjogo.jButton70,
            jfjogo.jButton71,jfjogo.jButton72,jfjogo.jButton73,jfjogo.jButton74,jfjogo.jButton75,
            jfjogo.jButton76,jfjogo.jButton77,jfjogo.jButton78,jfjogo.jButton79,jfjogo.jButton80,
            jfjogo.jButton81,jfjogo.jButton82,jfjogo.jButton83,jfjogo.jButton84,jfjogo.jButton85,
            jfjogo.jButton86,jfjogo.jButton87,jfjogo.jButton88,jfjogo.jButton89,jfjogo.jButton90,
            jfjogo.jButton91,jfjogo.jButton92,jfjogo.jButton93,jfjogo.jButton94,jfjogo.jButton95,
            jfjogo.jButton96,jfjogo.jButton97,jfjogo.jButton98,jfjogo.jButton99,jfjogo.jButton100};
        botoes = temp;
    }

    public void identifica(String num){
        JButton botao = botoes[Integer.parseInt(num)-1];
        
        int number = Integer.parseInt(botao.getText());
        number--;
        int linha = number / 10;
        int coluna = number % 10;
        double num_pos = Double.parseDouble(posicoes[linha][coluna]);
        
        if(num_pos == 0){
            botao.setBackground(new Color(51,153,255));
            botao.setEnabled(false);
            
            vidas--;
            erros++;
            jfjogo.jLabel42.setText(""+vidas);
            
            if(pegaPorcentagem(9) < 100){
                alteraProgresso(9, 1);
            }
            if(pegaPorcentagem(9) == 100){
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Afogado: Atire 100 vezes contra a água.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
            
            if(erros == 10){
                insertPartida("Perdeu");
                JOptionPane.showMessageDialog(null, "Você Perdeu!"
                        + "\nSuas Vidas Acabaram!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                jfmenu.setVisible(true);
                jfjogo.dispose();
            }
        }
        else if(num_pos > 5){
            botao.setBackground(new Color(153,153,153));
            botao.setEnabled(false);
            if((num_pos * 10) % 10 == 1){
                navios[3][0]++;
                if(navios[3][0] == 5){
                    acerto(5);
                }
            }
            else if((num_pos * 10) % 10 == 2){
                navios[3][1]++;
                if(navios[3][1] == 5){
                    acerto(5);
                }
            }
        }
        else if(num_pos > 4){
            botao.setBackground(new Color(255,102,0));
            botao.setEnabled(false);
            if((num_pos * 10) % 10 == 1){
                navios[2][0]++;
                if(navios[2][0] == 4){
                    acerto(4);
                }
            }
            else if((num_pos * 10) % 10 == 2){
                navios[2][1]++;
                if(navios[2][1] == 4){
                    acerto(4);
                }
            }
            else if((num_pos * 10) % 10 == 3){
                navios[2][2]++;
                if(navios[2][2] == 4){
                    acerto(4);
                }
            }
        }
        else if(num_pos > 3){
            botao.setBackground(new Color(255,255,0));
            botao.setEnabled(false);
            if((num_pos * 10) % 10 == 1){
                navios[1][0]++;
                if(navios[1][0] == 3){
                    acerto(3);
                }
            }
            else if((num_pos * 10) % 10 == 2){
                navios[1][1]++;
                if(navios[1][1] == 3){
                    acerto(3);
                }
            }
            else if((num_pos * 10) % 10 == 3){
                navios[1][2]++;
                if(navios[1][2] == 3){
                    acerto(3);
                }
            }
            else if((num_pos * 10) % 10 == 4){
                navios[1][3]++;
                if(navios[1][3] == 3){
                    acerto(3);
                }
            }
        }
        else if(num_pos > 2){
            botao.setBackground(new Color(51,102,255));
            botao.setEnabled(false);
            if((num_pos * 10) % 10 == 1){
                navios[0][0]++;
                if(navios[0][0] == 2){
                    acerto(2);
                }
            }
            else if((num_pos * 10) % 10 == 2){
                navios[0][1]++;
                if(navios[0][1] == 2){
                    acerto(2);
                }
            }
            else if((num_pos * 10) % 10 == 3){
                navios[0][2]++;
                if(navios[0][2] == 2){
                    acerto(2);
                }
            }
            else if((num_pos * 10) % 10 == 4){
                navios[0][3]++;
                if(navios[0][3] == 2){
                    acerto(2);
                }
            }
            else if((num_pos * 10) % 10 == 5){
                navios[0][4]++;
                if(navios[0][4] == 2){
                    acerto(2);
                }
            }
        }
        else if(num_pos > 1){
            botao.setBackground(new Color(0,255,0));
            botao.setEnabled(false);
            acerto(1);
        }
    }
    
    public void acerto(int tamanho){
        acertos++;
        pontos++;
        jfjogo.jLabel44.setText(""+pontos);
        
        if(pegaPorcentagem(tamanho + 3) < 100){
            alteraProgresso(tamanho + 3, 10);
            if(tamanho == 1 && pegaPorcentagem(tamanho+3) == 100){
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Profundezas: Encontre 10 submarinos.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(tamanho == 2 && pegaPorcentagem(tamanho+3) == 100){
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Ostentação: Encontre 10 iates.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(tamanho == 3 && pegaPorcentagem(tamanho+3) == 100){
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Travessia: Encontre 10 balsas.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(tamanho == 4 && pegaPorcentagem(tamanho+3) == 100){
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Peso Pesado: Encontre 10 cargueiros.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(tamanho == 5 && pegaPorcentagem(tamanho+3) == 100){
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Cineasta: Encontre 10 titanics.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(acertos == 8){
            insertPartida("Ganhou");
            if(pegaPorcentagem(10) < 100 && vidas == 10){
                alteraProgresso(10, 100);
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Perfect: Vença o jogo sem perder nenhuma vida.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "Parabéns, Você Ganhou!"
                    + "\nVocê encontrou 8 embarcações!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            jfmenu.setVisible(true);
            jfjogo.dispose();
        }
    }
    
    public void conquistaI(){
        int porcentagem = pegaPorcentagem(3);
        if(porcentagem < 10){
            alteraProgresso(1, 100);
            JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                    + "Jogador I: Jogue Batalha Naval 1 vez.",
                    "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
        }
        if(porcentagem < 50){
           alteraProgresso(2, 20);
            if(pegaPorcentagem(2) == 100){
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Jogador II: Jogue Batalha Naval 5 vezes.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(porcentagem < 100){
            alteraProgresso(3, 10);
            if(pegaPorcentagem(3) == 100){
                JOptionPane.showMessageDialog(null, "Nova conquista desbloqueada!\n"
                        + "Jogador III: Jogue Batalha Naval 10 vezes.",
                        "Conquista Realizada", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
