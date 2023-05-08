class Cheque {
    private Cliente cliente;
    private Banco banco;
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    public Cheque() {}
    public Cheque(Cliente cliente,Banco banco , double valorCheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorCheque = valorCheque;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getNombreBanco() {
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setBanco(Banco banco){
        this.banco=banco;
    }
    public Banco getBanco(){
        return banco;
    }
    public double getValorCheque() {
        return valorCheque;
    }
    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    public void calcularComision (){
        this.comision=valorCheque*0.003;
    }
    public double getComision (){
        return comision;
    }
    @Override
    public String toString() {
        return "Cheque{" +
                "cliente=" + cliente +
                ", banco=" + banco +
                ", valorCheque=" + valorCheque +
                ", comision=" + comision +
                '}';
    }
}
class Cliente{
    private String nombres;
    private String apellidos;
    private String cedula;
    public Cliente() {}
    public Cliente(String nombres, String apellidos, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
class Banco{
    private String nombreBanco;
    private int numSucursales;
    public Banco() {}
    public Banco(String nombreBanco, int numSucursales) {
        this.nombreBanco = nombreBanco;
        this.numSucursales = numSucursales;
    }
    public String getNombreBanco() {
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    public int getNumSucursales() {
        return numSucursales;
    }
    public void setNumSucursales(int numSucursales) {
        this.numSucursales = numSucursales;
    }
    @Override
    public String toString() {
        return "Banco{" +
                "nombreBanco='" + nombreBanco + '\'' +
                ", numSucursales=" + numSucursales +
                '}';
    }
}
public class Ejercicio4 {
    public static void main(String[] args) {
        Cliente cliente1= new Cliente("Luis Mateo","Valarezo Delgado ","1127627852");
        Banco banco1=new Banco("Pichincha",8);
        Cheque cheque1=new Cheque(cliente1,banco1,1000);
        cheque1.calcularComision();
        System.out.println(cheque1);
    }
}