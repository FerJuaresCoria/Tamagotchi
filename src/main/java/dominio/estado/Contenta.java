public class Contenta implements EstadoMascota{

  private int cantJuegos;

  public void come(Mascota unaMascota){
    //incrementar nivel de felicidad en 1
  }

  public void juga(Mascota unaMascota){
    //incrementar nivel de felicidad en 2
    if (cantJuegos >= 5){
      //Pasar a hambrienta
    }
  }

  public boolean podesJugar(Mascota unaMascota){
    return true;
  }
}