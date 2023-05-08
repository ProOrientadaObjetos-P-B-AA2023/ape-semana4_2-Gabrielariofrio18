class Automotor {
    private String cedulaDueño;
    private String marcaVehiculo;
    private Fabricante fabricanteVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    public Automotor() {}
    public Automotor(String cedulaDueño, String marcaVehiculo,
                     int anioFabricacion,Fabricante fabricanteVehiculo, double valorVehiculo) {
        this.cedulaDueño=cedulaDueño;
        this.marcaVehiculo=marcaVehiculo;
        this.fabricanteVehiculo=fabricanteVehiculo;
        this.anioFabricacion=anioFabricacion;
        this.valorVehiculo=valorVehiculo;
    }
    public String getCedulaDueño() {
        return cedulaDueño;
    }
    public void setCedulaDueño(String cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }
    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }
    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public double getValorVehiculo() {
        return valorVehiculo;
    }
    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    public double getValorMatricula(){
        return valorMatricula;
    }
    public void setFabricanteVehiculo(Fabricante fabricanteVehiculo){
        this.fabricanteVehiculo=fabricanteVehiculo;
    }
    public Fabricante getFabricanteVehiculo(){
        return fabricanteVehiculo;
    }
    public void calcularValor_Matricula(){
        int antiguedad= 2023-this.anioFabricacion;
        this.valorMatricula=(0.002*this.valorVehiculo*antiguedad);
    }
    @Override
    public String toString() {
        return "Automotor{" +
                "cedulaDueño='" + cedulaDueño + '\'' +
                ", marcaVehiculo='" + marcaVehiculo + '\'' +
                ", fabricanteVehiculo=" + fabricanteVehiculo +
                ", anioFabricacion=" + anioFabricacion +
                ", valorVehiculo=" + valorVehiculo +
                ", valorMatricula=" + valorMatricula +
                '}';
    }
}
class Fabricante{
    private String nombre;
    private String ciudadOrigen;
    public Fabricante() {}
    public Fabricante(String nombre, String ciudadOrigen) {
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    @Override
    public String toString() {
        return "Fabricante{" +
                "nombre='" + nombre + '\'' +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                '}';
    }
}
public class Ejercicio3 {
    public static void main(String[] args) {
        Fabricante fabricante1=new Fabricante("Chevrolet Cruze","Surcorea");
        Automotor automotor1=new Automotor("1127363472","Chevrolet",2010,fabricante1,10000);
        automotor1.calcularValor_Matricula();
        System.out.println(automotor1);
    }
}

