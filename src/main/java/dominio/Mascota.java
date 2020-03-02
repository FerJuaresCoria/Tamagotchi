public class Mascota{

  private String nombre;
  private int felicidad;
  private EstadoMascota estado;

  public Mascota(String nombre) {
    this.nombre     = nombre;
    this.felicidad  = 0;
    this.estado = new contenta();
  }

  public int nivelFelicidad(){
    return this.felicidad;
  }

  public boolean podesJugar(){

    return this.estado.podesJugar(this);
  }

  public void juga(){

    this.estado.juga(this);
  }

  public void come(){
    
    this.estado.come(this);

  }

  public void cambiarEstado(EstadoMascota estado){

    this.estado = estado;
  }

  public void aumentarFelicidad(int aumento){
    this.felicidad += aumento;
  }

}