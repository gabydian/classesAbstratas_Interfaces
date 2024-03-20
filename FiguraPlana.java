import java.lang.reflect.Array;
import java.util.ArrayList;

//Implementar a classe abstrata FiguraPlana, contendo os métodos abstratos area() e perimetro() , e as subclasses
//Quadrado, Triangulo, Losango e Circulo.
//• Testar as novas classes usando um ArrayList.
//• Criar instancias variadas de figuras, adicionar ao arraylist, listar as figuras incluídas no arraylist e totalizar a área e o
//perímetro delas.
abstract class FiguraPlana {

    abstract double getArea();
    abstract double getPerimetro();

}
