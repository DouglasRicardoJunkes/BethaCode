package exemplo_interface;

public class FiguraMain {
    public static void main (String[] args){
        Quadrado quadrado = new Quadrado(2);

        System.out.println(quadrado.getNomeFigura()+" área: "+quadrado.getArea()+" perímetro: "+quadrado.getPerimetro());

        Triangulo trilegal = new Triangulo(10,2,10,10,10);

        System.out.println(trilegal.getNomeFigura()+" área: "+trilegal.getArea()+" perímetro: "+trilegal.getPerimetro());

    }
}
