public class App {
    public static void main(String[] args)  {
        Persona  humano = new Persona();
        humano.setNombre("abel");
        humano.setEdad("37");
        humano.setTelefono ("80901090155");
        
        System.out.println(humano.getNombre());
        System.out.println(humano.getEdad());
        System.out.println(humano.getTelefono());

    }
}

class Persona {
   private String nombre;
   private String edad;
    private String telefono;

 public void setNombre(String nombre){
    this.nombre=nombre;
 }
 public void setEdad(String edad){
    this.edad=edad;
 }
 public void setTelefono(String telefono){
    this.telefono=telefono;
 }
 public String getNombre(){
    return this.nombre;
 }
 public String getEdad(){
    return this.edad;
 }
 public String getTelefono(){
    return this.telefono;
 }
}