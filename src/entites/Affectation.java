package entites;
import java.util.Date;

public class Affectation {

    private Long        id;
    private Date        dateaff;
    private boolean     pilote;

    public Date getDateaff() {
        return dateaff;
    }
    public void setDateaff(Date dateaff) {
        this.dateaff = dateaff;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public boolean isPilote() {
        return pilote;
    }
    public void setPilote(boolean pilote) {
        this.pilote = pilote;
    }
  
}
