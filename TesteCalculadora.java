public class TesteCalculadora{
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    float f1 = calc.somar(1, 2);

    int i1 = calc.somar(1, 2);

    System.out.println(calc.somar(1, 2));

    calc.somar(1, 2);


  }
}





























// public class TesteCalculadora {
//   public static void main (String [] args) {
//     //a partir da versão 10 do Java
//     Calculadora calc = new Calculadora();
//     int x = 2, y = 3;
//     float f1 = 2.5F, f2 = 5.6f;
//     int r = calc.somar(2, 3);  
//     System.out.println(r);
//     float rF = calc.somar (f1, f2);
//     System.out.print(rF);
//     String s1 = "2", s2 = "5";
//     int rS = calc.somar(s1, s2);
//     System.out.print(rS);
//     System.out.println(calc.somar(1, 2, 3));

//     System.out.println(calc.somar("2", 3));
//   }
// }