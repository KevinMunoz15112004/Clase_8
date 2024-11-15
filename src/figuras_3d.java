public class figuras_3d extends FigurasGeometricas{
    double lado;
    int nLados;
    int nCaras;
    //Constructor completo
    public figuras_3d(String tipo, double lado, int nLados, int nCaras) {
        super(tipo);
        this.lado = lado;
        this.nLados = nLados;
        this.nCaras = nCaras;
    }
    //Constructor con parámetros de la clase hija
    public figuras_3d(double lado, int nLados, int nCaras) {
        this.lado = lado;
        this.nLados = nLados;
    }
    //Constrcutor con paráemtros de la clase padre
    public figuras_3d(String tipo){
        super(tipo);
    }
    //Constructor vacio
    public figuras_3d(){

    }

    public double getLado() {
        return lado;
    }

    public int getnLados() {
        return nLados;
    }

    public int getnCaras() {
        return nCaras;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public void setnCaras(int nCaras) {
        this.nCaras = nCaras;
    }

    public void calcularArea(){
        System.out.println("Area 3d:");
    }

    public void calcularVolumen(){
        System.out.println("Volumen 3d:");
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Datos 3d");
    }
}
