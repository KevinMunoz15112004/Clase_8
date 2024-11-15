public class figuras_2d extends FigurasGeometricas{
    int nlados;

    //Constructor con parametros completo
    public figuras_2d(String tipo, int nlados) {
        super(tipo);
        this.nlados = nlados;
    }
    //Constructor con parámetros en la clase hija
    public figuras_2d(int nlados) {
        this.nlados = nlados;
    }
    //Constructor con parámetros en la clase padre
    public figuras_2d(String tipo){
        super(tipo);
    }
    //Constructor vacio
    public figuras_2d(){

    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public void calcularArea(){
        System.out.println("Area 2d");
    }
    public void calcularPerimetro(){
        System.out.println("Perimetro 2d");
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Datos 2d");
    }
}
