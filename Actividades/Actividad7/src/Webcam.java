public class Webcam {
  private String resolucion;
  private int fps;
  private boolean encendida;
  private double tamaño;

  
/* 1. Implementa un **constructor** que inicialice la resolución, FPS y establezca la cámara como apagada por defecto.*/ 
  public Webcam(String resolucion, int fps){
    this.resolucion = resolucion;
    this.fps = fps;
    this.encendida = false;
    this.tamaño = calcularTamaño();
  }

//2. Implementa los **métodos getters y setters** necesarios.
  public String getResolucion(){
    return resolucion;
  }
  public int getFps(){
    return fps;
  }
  public boolean getEstado(){
    return encendida;
  }
  public double getTamaño(){
    return tamaño;
  }

  public void setResolucion(String resolucion){
    this.resolucion = resolucion;
  }
  public void setFps(int fps){
    this.fps = fps;
  }
  
//3. Implementa un método `encender()` que active la cámara.
  public void encender(){
    encendida = true;
    System.out.println("La camara esta encendida");
  }
//4. Implementa un método `apagar()` que la desactive.
  public void apagar(){
    encendida = false;
    System.out.println("La camara esta apagada"); 
  }
/*5. Implementa un método `tomarFoto()` que:
   - Solo funcione si la cámara está encendida.
   - Devuelva un mensaje indicando que la foto fue tomada con la resolución y el tamaño estimado del archivo.
   - Calcule el tamaño estimado del archivo de imagen usando la siguiente fórmula:
     
     ```
     tamaño = (ancho * alto * FPS) / 1000000.0
     ```
     
     Donde `ancho` y `alto` se obtienen de la resolución proporcionada en el formato "ancho x alto". */
    public void tomarFoto() {
      if(!encendida) {
        System.out.println("La camara esta apagada, no se puede tomar la foto.");
      }
      System.out.println("La foto fue tomada con resolucion: " + resolucion + " y un tamaño estimado de " + tamaño + " MB");
    }
    private double calcularTamaño(){
      try{
        String[] partes = resolucion.split("x");
        int ancho = Integer.parseInt(partes[0]);
        int alto = Integer.parseInt(partes[1]);
        return (ancho * alto * fps) / 1000000.0;
    } catch(Exception e) {
      System.out.println("Ocurrio un error");
      return 0.0;
    }
    }
  
  /*5. Implementa un método `tomarFoto()` que:
   - Solo funcione si la cámara está encendida.
   - Devuelva un mensaje indicando que la foto fue tomada con la resolución y el tamaño estimado del archivo.
   - Calcule el tamaño estimado del archivo de imagen usando la siguiente fórmula:
     
     ```
     tamaño = (ancho * alto * FPS) / 1000000.0
     ```
     
     Donde `ancho` y `alto` se obtienen de la resolución proporcionada en el formato "ancho x alto". */
     public static void main(String[] args) {
      Webcam cam = new Webcam("1920x1080", 30);
      cam.tomarFoto(); 
      cam.encender();
      cam.tomarFoto(); 
      cam.apagar();
  }



}
