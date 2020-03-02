public class Aburrida implements EstadoMascota{

  private int tiempo;

  public void come(Mascota unaMascota){
    if(this.tiempo >= 80){
      unaMascota.cambiarEstado(new Contenta());
    }
  }

  public void juga(Mascota unaMascota){
    //Pasar a contenta
  }

  public boolean podesJugar(Mascota unaMascota){
    return true;
  }
}