public class TesteFormaGeometrica {
    public static void main(String[] args) {
        FormaGeometrica forma1 = new Quadrado(4);
        FormaGeometrica forma2 = new Circulo(9);

        System.out.println("Area do Quadrado: " + forma1.calcularArea());
        System.out.println("Perimetro do Quadrado: " + forma1.calcularPerimetro());

        System.out.println("Area do Circulo:" + forma2.calcularArea());
        System.out.println("Perimetro do Círculo: " + forma2.calcularPerimetro());
    }
}
