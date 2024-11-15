public class Circulo extends figuras_2d {
    double radio;

    //Constructor completo con parámetros
    public Circulo(int nlados, double radio) {
        super(nlados);
        this.radio = radio;
    }

    //Constructor con parámetros de clase hija
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Constructor con parámetros en clase padre
    public Circulo(int nlados) {
        super(nlados);
    }
    //Constructor vacio
    public Circulo() {

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(double radio){
      return  Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro(double radio){
        return 2 * Math.PI * radio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Datos Circulo");
        System.out.println("Area: "+ calcularArea(radio));
        System.out.println("Perimetro: "+ calcularPerimetro(radio));
    }

}