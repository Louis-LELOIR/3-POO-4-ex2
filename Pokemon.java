public class Pokemon {

  private String nom;
  private int pv;
  private String atk;

  public Pokemon(String nom, int pv, String atk){
    this.nom = nom;
    this.pv = pv;
    this.atk = atk;
  }

  public String getNom(){
    return this.nom;
  }
  public int getPv(){
    return this.pv;
  }
  public String getAtk(){
    return this.atk;
  }
}