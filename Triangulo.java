public class Triangulo extends FiguraPlana{

    private float base = 5;
    private float altura = 5;
    private double ladoA = 5;
    private double ladoB = 5;
    private double ladoC = 5;

    public Triangulo(float base, float altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    double getArea() {
        return base * altura/2;
    }

    @Override
    double getPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
