public class Hambrienta implements EstadoMascota{
  public void come(Mascota unaMascota){
    unaMascota.cambiarEstado(new Contenta());
  }

  public void juga(Mascota unaMascota){
    if (podesJugar()) {
      System.out.println("No puede jugar porque tiene hambre");
    } else {
      System.out.println("Ya jugó");
    }
  }

  public boolean podesJugar(Mascota unaMascota){
    return false;
  }
}