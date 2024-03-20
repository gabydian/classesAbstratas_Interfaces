public class Quadrado extends FiguraPlana implements FormaGeometrica {
    private int lado = 5;

    public Quadrado(int lado) {

    }

    @Override
   public double getArea() {
        return lado * lado;
    }

    @Override
   public double getPerimetro() {
        return lado + lado + lado + lado;
    }
}
