import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MoteurInference {

    public MoteurInference() {
    }

    public static boolean chainageAvantComp(ArrayList<String> baseFaits, ArrayList<RegleComposee> baseReglesComp, String propVerif) {
        ListIterator<RegleComposee> iter = baseReglesComp.listIterator();
//      verifier que propVerif n'est pas dans baseFaits & baseRegles n'est pas vide
        while (!baseFaits.contains(propVerif) && iter.hasNext()) {
            RegleComposee regle = iter.next();
//          verifier l'existence du premisse dans les bases des faits
            int counter = 0;
            for (int i = 0; i < regle.getPremisses().length; i++) {
                if (baseFaits.contains(regle.getPremisses()[i])) {
                    counter++;
                }
            }
            /*
          ajouter la conclusion aux baseFaits
          Supprimer la regle de la baseRegle (de iter en fait)
*/
            if (counter == regle.getPremisses().length){
                baseFaits.add(regle.getConclusion());
                iter.remove();
            }
        }
        if (!baseFaits.contains(propVerif) && !baseReglesComp.isEmpty()){
            chainageAvantComp(baseFaits, baseReglesComp, propVerif);
        }
//          vérifier si elle s’est arrêtée parce que la propVerif est retrouvée dans la liste des baseFaits ou non
        return baseFaits.contains(propVerif);
    }

}
