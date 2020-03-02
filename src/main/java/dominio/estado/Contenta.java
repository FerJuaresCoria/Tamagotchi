public class Contenta implements EstadoMascota{

  private int cantJuegos;

  public void come(Mascota unaMascota){
    unaMascota.aumentarFelicidad(1);
  }

  public void juga(Mascota unaMascota){
    unaMascota.aumentarFelicidad(2);
    this.cantJuegos++;
    if (cantJuegos >= 5){
      unaMascota.cambiarEstado(new Hambrienta());
      this.cantJuegos = 0;
    }
  }

  public boolean podesJugar(Mascota unaMascota){
    return true;
  }
}