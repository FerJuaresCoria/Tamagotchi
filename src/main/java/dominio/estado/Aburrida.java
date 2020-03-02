public class Aburrida implements EstadoMascota{

  private int tiempo;

  public void come(Mascota unaMascota){
    if(this.tiempo >= 80){
      unaMascota.cambiarEstado(new Contenta());
    }
  }

  public void juga(Mascota unaMascota){
    unaMascota.cambiarEstado(new Contenta());
  }

  public boolean podesJugar(Mascota unaMascota){
    return true;
  }
}