package entites;

public class Client {
    
    private Long           numcli;
    private String        nomcli;
    private String        adrcli;

    public String getAdrcli() {
        return adrcli;
    }
    public void setAdrcli(String adrcli) {
        this.adrcli = adrcli;
    }
    public String getNomcli() {
        return nomcli;
    }
    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }
    public Long getNumcli() {
        return numcli;
    }
    public void setNumcli(Long numcli) {
        this.numcli = numcli;
    }
     
}