public class FigurasGeometricas {
    String tipo;

    public FigurasGeometricas(String tipo) {
        this.tipo = tipo;
    }

    public FigurasGeometricas(){

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarDatos(){
        System.out.println("Datos Generados");
    }

}
