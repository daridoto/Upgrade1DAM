interface API{
  String obtenerDatos();
}

class ApiGitHub implements API{
  public String obtenerDatos(){
    return "Repositorios de usuario: repo1, repo 2, repo3";
  }
}
class ApiClima implements API{
  @Override
  public String obtenerDatos(){
    return "Temperatura actual: 22ºC";
  }
}

class ClienteAPI {
  private API api;

  public ClienteAPI(API api){
    this.api = api;
  }
  public void setAPI(API api){
    this.api = api;
  }
  public void mostrarDatos(){
    System.out.println("Los datos obtenidos son: " + api.obtenerDatos());
  }

}


public class MainDarioSarasa {

  public static void main(String[] args) {
    ClienteAPI miEjemplo = new ClienteAPI(new ApiGitHub());
    miEjemplo.mostrarDatos();

    miEjemplo.setAPI(new ApiClima());
    miEjemplo.mostrarDatos();
  }
}
