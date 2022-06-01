public class Main {



    public static void main(String[] args) {
        Game game = new Game();
        AgentJoueur J1 = new AgentJoueur('X');
        AgentJoueur J2  =  new AgentJoueur('O');
        Game.afficher(Game.getTicTacToe());

        //jouer tant que le jeu n'est pas terminer
        //arreté la partie dans le cas ou le joueur a gagné
        boolean g1 = J1.gagner(Game.getTicTacToe(), J1.getSymbole());
        boolean g2 = J2.gagner(Game.getTicTacToe(), J2.getSymbole());
        while (!g1 & !g2 ){
            J1.jouer(Game.getTicTacToe());
            System.out.println("J1 joue");
            Game.afficher(Game.getTicTacToe());
            if (J1.gagner(Game.getTicTacToe(), J1.getSymbole())){
                System.out.println(J1.getSymbole()+"a gagné");
                break;
            }
            if( Game.GameOver()){
                System.out.println("match null");
                break;
            }
            J2.jouer(Game.getTicTacToe());
            System.out.println("J2 joue");

            Game.afficher(Game.getTicTacToe());
            if (J2.gagner(Game.getTicTacToe(), J2.getSymbole())){
                System.out.println(J2.getSymbole()+"a gagné");
                break;
            }
            if( Game.GameOver()){
                System.out.println("match null");
                break;
            }
        }





    }
}
