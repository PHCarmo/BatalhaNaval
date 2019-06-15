package controller;

public class Instrucoes {
    public String getRegra(int regra){
        String text = "";
        if(regra == 1){
            text = "+ As embarcações encontram-se na horizontal.\n" +
            "+ Elas são divididas em partes, de\n"
                + " acordo com o seu tamanho, por exemplo,\n"
                + " o iate possui tamanho 2 e se divide \n"
                + " em 2 partes, cada parte em um botão.\n" +
            "+ As partes de uma embarcação estão \n" +
            " divididas em botões consecutivos.\n" +
            "+ Cada embarcação possui uma cor diferente.\n" +
                "+ Ao clicar em um botão, a cor do botão \n"
                + " irá mudar de acordo com a cor da \n"
                + " embarcação que se encontra naquela \n"
                + " coordenada.";
        }
        else if(regra == 2){
            text = "+ Para vencer encontre 8 embarcações.\n" +
            "+ Simples, só não pode perder!";
        }
        else if(regra == 3){
            text = "+ Se você não encontrar uma parte de\n"
                + " uma embarcação ao clicar em um botão,\n"
                + " é dito que você atirou na água.\n" +
            "+ Sempre que atirar na água você irá perder\n"
                + " uma vida.\n" +
            "+ Se perder as 10 vidas, você perde o jogo, \n"
                + " Game Over!";
        }
        else if(regra == 4){
            text = "+ Na verdade não, toda vez que um novo jogo \n"
                + " é iniciado as posições das embarcações são \n"
                + " geradas automaticamente de forma aleatória. \n"
                + "+ Achou que era fácil assim? Vai precisar ser \n"
                + " mais inteligente para trapacear aqui.";
        }
        else if(regra == 5){
            text = "+ Existem 50 botões com partes de embarcações\n"
                + " e 50 botões com água, sendo assim, a \n"
                + " probabilidade de errar ou acertar ao escolher \n"
                + " um botão ao acaso é a mesma, então não me\n"
                + " venha com churumelas.\n"
                + "+ Jogue quantas vezes quiser. \n"
                + "+ Tente realizar todas as conquistas, se \n"
                + " for capaz é claro. \n"
                + "+ Divirta-se.";
        }
        return text;
    }
}
