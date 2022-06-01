public class AgentArbitre {

    public static boolean GameOver() {
        boolean flag = true;
        for (int i = 0; i < Game.TicTacToe.length; i++) {
            for (int j = 0; j < Game.TicTacToe[i].length; j++) {
                if (Game.TicTacToe[i][j] == '-'){
                    flag = false;
                    break;
                }
            }
            if (!flag){
                break;
            }
        }
        return flag;
    }

    public static void afficher(char[][] TicTacToe){
        // Affichage de la matrice
        for(int i = 0; i < TicTacToe.length; i++){
            for(int j = 0; j < TicTacToe[i].length; j++){
                System.out.print(TicTacToe[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("***************************");
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

    //e méthode  Partie q/matrice et les 2 joueurs et décide qui va jouer des deux.
    public static void Partie(int tour, char[][] TicTacToe, AgentJoueur J1, AgentJoueur J2){
        AgentJoueur J;
        if (tour % 2 == 0){
            J = J1;
        }else{
            J = J2;
        }
        System.out.println("le joueur "+ J + "va jouer");
        J.jouer(TicTacToe);
        afficher(TicTacToe);




    }
}
