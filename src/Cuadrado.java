public class Cuadrado extends figuras_2d{
    double lado;

    //Constructor completo con parámetros
    public Cuadrado(int nLados, double lado) {
        super(nLados);
        this.lado = lado;
    }
    //Constructor con parámetros en la clase hija
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    //Constructor con parámetros en la clase padre
    public Cuadrado(int nLados) {
        super(nLados);
    }
    //Constructor vacío
    public Cuadrado() {

    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public void calcularArea() {
        System.out.println("Area Cuadrado");
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Cuadrado");
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Datos Cuadrado");
    }
}
