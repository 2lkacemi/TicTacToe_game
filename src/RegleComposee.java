public class RegleComposee {

    private String conclusion;
    private String[] premisses;

    public RegleComposee() {
    }

    public RegleComposee(String premissesComposees, String réponse){
        premisses = premissesComposees.split("&", 2);
        this.conclusion = réponse;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String[] getPremisses() {
        return premisses;
    }

    public void setPremisses(String[] premisses) {
        this.premisses = premisses;
    }
}
