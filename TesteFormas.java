import java.util.ArrayList;

public class TesteFormas {
    public static void main(String[] args) {
        ArrayList <FiguraPlana> formas = new ArrayList<>();

        formas.add(new Quadrado(5));
        formas.add(new Triangulo(5,3,6,5,7));
        formas.add(new Losango(6,9,5));
        formas.add(new Circulo(9.0));
    }
    double totalArea = 0;
    double totalPerimetro = 0;

        for(FiguraPlana formas; : formas) {
        System.out.println("Figuras:");
        System.out.println("Área: " + formas.getArea());
        System.out.println("Perímetro: " + formas.getPerimetro());
        totalArea += formas.getArea();
        totalPerimetro += formas.getPerimetro();
        System.out.println("Total de área: " + totalArea);
        System.out.println("Total de perímetro: " + totalPerimetro);
    }
}

