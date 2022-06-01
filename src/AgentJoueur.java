import java.util.Random;
import java.util.Scanner;

public class AgentJoueur {
    private char symbole;


    // génère à chaque fois deux nombres aléatoires entiers entre 0 et 2 ,affecte un symbole à la case adéquate.
    public void jouer(char[][] TicTacToe) {
        Random rand = new Random();
        int x;
        int y;

        //on génére deux coordonnées
        do {
            x = rand.nextInt((2) + 1);
            y = rand.nextInt((2) + 1);
        }
        //tant que la case correspondante est remplie
        while (TicTacToe[x][y] != '-');
        TicTacToe[x][y] = this.symbole;
    }


    //Et retourne true si le symbole en paramètre a gagné la partie
    public boolean gagner(char[][] TicTacToe, char symbole){
        boolean flag = false;
        //vérification des lignes et des colonnes
        for (int i = 0; i < TicTacToe.length; i++) {
            if ((TicTacToe[i][0] == symbole) && (TicTacToe[i][1] == symbole) && (TicTacToe[i][2] == symbole) ||
                    (TicTacToe[0][i] == symbole) && (TicTacToe[1][i] == symbole) && (TicTacToe[2][i] == symbole)){
                flag = true;
                break;
            }
        //vérification des deux diagonales
        else if ((TicTacToe[0][0] == symbole) && (TicTacToe[1][1] == symbole) && (TicTacToe[2][2] == symbole) ||
                (TicTacToe[0][2] == symbole) && (TicTacToe[1][1] == symbole) && (TicTacToe[2][0] == symbole)){
            flag = true;
        }
            }
        return flag;
    }





    public AgentJoueur(char symbole) {
        this.symbole = symbole;
    }

    public char getSymbole() {
        return symbole;
    }

    public void setSymbole(char symbole) {
        this.symbole = symbole;
    }
}
