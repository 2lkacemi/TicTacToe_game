public class Game {

    // Création de la matrice
    static char[][] TicTacToe = new char[3][3];

    RegleComposee R1 = new RegleComposee();

    public Game() {
        for (int i = 0; i < TicTacToe.length; i++) {
            for (int j = 0; j < TicTacToe[i].length; j++) {
                TicTacToe[i][j] = '-';
            }
        }
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

    //retourne true si toutes les cases contiennent des symboles différents du symbole ‘-‘
    public static boolean GameOver() {
        boolean flag = true;
        for (int i = 0; i < TicTacToe.length; i++) {
            for (int j = 0; j < TicTacToe[i].length; j++) {
                if (TicTacToe[i][j] == '-'){
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

    public static char[][] getTicTacToe() {
        return TicTacToe;
    }

}
