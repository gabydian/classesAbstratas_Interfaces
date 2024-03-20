public class Losango extends FiguraPlana{
    private double dimensaoMenor = 5;
    private double dimensaoMaior = 8;
    private double lado;

    public Losango(double dimensaoMenor, double dimensaoMaior, double lado) {
        this.dimensaoMenor = dimensaoMenor;
        this.dimensaoMaior = dimensaoMaior;
        this.lado = lado;
    }

    @Override
    double getArea() {
        return dimensaoMenor * dimensaoMaior/2;
    }

    @Override
    double getPerimetro() {
        return lado * 4;
    }
}
