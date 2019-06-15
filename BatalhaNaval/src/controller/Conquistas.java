package controller;

import javax.swing.JOptionPane;
import model.DAO;
import view.JFConquistas;

public class Conquistas {
    DAO dao = new DAO();
    
    public int pegaPorcentagem(int conquista){
        return dao.pegaPorcentagem(conquista);
    }
    
    public void zeraConquistas(JFConquistas jframe){
        if(JOptionPane.showConfirmDialog(null, "Isto irá fazer com que você perca todas as"
                + "suas conquistar."
                + "\nVocê tem certeza que quer fazer isso?") == JOptionPane.OK_OPTION){
            dao.zeraConquistas();
            
            jframe.jButton1.setText("✖  Jogador I");
            jframe.jButton2.setText("✖  Jogador II");
            jframe.jButton3.setText("✖ Jogador III");
            jframe.jButton4.setText("✖  Profundezas");
            jframe.jButton5.setText("✖  Ostentação");
            jframe.jButton6.setText("✖  Travessia");
            jframe.jButton7.setText("✖  Peso Pesado");
            jframe.jButton8.setText("✖  Cineasta");
            jframe.jButton9.setText("✖  Afogado");
            jframe.jButton10.setText("✖  Perfect");
            
            JOptionPane.showMessageDialog(null, "O progesso das suas"
                    + " conquistas foi resetado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
   public void initBotoes(JFConquistas jframe){
        if(pegaPorcentagem(1) == 100){
            jframe.jButton1.setText("✔ Jogador I");
        }
        if(pegaPorcentagem(2) == 100){
            jframe.jButton2.setText("✔ Jogador II");
        }
        if(pegaPorcentagem(3) == 100){
            jframe.jButton3.setText("✔ Jogador III");
        }
        if(pegaPorcentagem(4) == 100){
            jframe.jButton4.setText("✔ Profundezas");
        }
        if(pegaPorcentagem(5) == 100){
            jframe.jButton5.setText("✔ Ostentação");
        }
        if(pegaPorcentagem(6) == 100){
            jframe.jButton6.setText("✔ Travessia");
        }
        if(pegaPorcentagem(7) == 100){
            jframe.jButton7.setText("✔ Peso Pesado");
        }
        if(pegaPorcentagem(8) == 100){
            jframe.jButton8.setText("✔ Cineasta");
        }
        if(pegaPorcentagem(9) == 100){
            jframe.jButton9.setText("✔ Afogado");
        }
        if(pegaPorcentagem(10) == 100){
            jframe.jButton10.setText("✔ Perfect");
        }
    }
}
