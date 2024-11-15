import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Generar objetos
        FigurasGeometricas figura1 = new FigurasGeometricas();
        figura1.mostrarDatos();
        figuras_2d figura2D = new figuras_2d();
        figura2D.mostrarDatos();
        figuras_3d figura3D = new figuras_3d();
        figura3D.mostrarDatos();
        //Objetos de circulo
        Circulo circulo1 = new Circulo();
        System.out.println("---------- CÁLCULOS DEL CÍRCULO ----------");
        System.out.println("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();
        circulo1.mostrarDatos();
        circulo1.calcularArea(5);
        circulo1.calcularPerimetro(5);
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.mostrarDatos();
    }
}