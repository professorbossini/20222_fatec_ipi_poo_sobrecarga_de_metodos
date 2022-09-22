public class Calculadora{
  public float somar (int a, int b){
    return a + b;
  }

  public int somar (int a, int b){
    return a + b;
  }
}





  // public int somar (int a, int b){
  //   return a + b;
  // }

  // public int somar (int x, int y){
  //   return x + y;
  // }





















// //muitas vezes a sobrecarga de métodos é batizada de polimorfismo estático, sendo que estático significa feito pelo compilador, ou em tempo de compilação
// public class Calculadora{

//   public int somar (int a, int b, int c){
//     return a + b + c;
//   }

//   public int somar(int a, int b){
//     return a + b;
//   }

//   public float somar (float f1, float f2){
//     return f1 + f2;
//   }

//   public int somar(String s1, String s2){
//     return Integer.parseInt(s1) + Integer.parseInt(s2);
//   }

//   public int somar (String s, int i){
//     return Integer.parseInt(s) + i;
//   }

//   // 2.5 -> "2.5": toString
//   // "2.5" -> 2.5: parseFloat
//   public int somar (int i, String s){
//     return somar(i, Integer.parseInt(s), 0);
//     // return somar (i, Integer.parseInt(s));
//     // return (int)somar((float)i, Float.parseFloat(s));
//     // float f = (float)i;
//     // float f2 = Float.parseFloat(s);
//     // return somar (2.5f, 5.4f);
//     // return somar (s, i);
//     //return somar(Integer.toString(i), s);
//     // return somar((float)(i), (float)(Integer.parseInt(s)));
//   }
  
// }