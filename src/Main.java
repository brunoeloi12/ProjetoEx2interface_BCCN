public class Main {
    public static void main(String args[]){
        Quadrado q1 = new Quadrado(10);
        System.out.println(q1.calcArea());
        System.out.println(q1.calcPerimetro());


        Circulo c1 = new Circulo(5);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimetro());

        Retangulo r1 = new Retangulo(5,5);
        System.out.println(r1.calcArea());
        System.out.println(r1.calcPerimetro());

        ICalcGeometria i1 = new Quadrado(10);
        i1.calcArea();
        i1.calcPerimetro();

        ICalcGeometria i2 = new Circulo(5);
        i2.calcArea();
        i2.calcPerimetro();

        ICalcGeometria i3 = new Retangulo(5,5);
        i3.calcArea();
        i3.calcPerimetro();
    }
}
