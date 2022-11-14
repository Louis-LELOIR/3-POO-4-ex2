public class Pokemon {

  private String nom;
  private int pv;
  private int atk;

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
  public int getAtk(){
    return this.atk;
  }
  public void setPv(int atk){
    this.pv -= atk;
  }

  public boolean estKo() {
    return (pv === 0) ? true: false;
  }

  public void attaquer(Pokemon p){
    p.setPv(this.atk);
  }

  @Override
  public String toString(){
    return "Nom : " + this.getNom() + " PV : " + this.getPv() + " Puissance attaque : " + this.getAtk();
  }
}