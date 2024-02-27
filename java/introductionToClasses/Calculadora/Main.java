public class Main {
  int x;
  int y;
  float r;

  public Main(){
    x = 0;
    y = 0;
    r = 0;
  }
  public float suma(int w, int z){
    x = w;
    y = z; 
    return r=x+y;
  }
  
  public float resta(int w, int z){
    x = w;
    y = z;
    return r=x-y;
  }

  public float multi(int w, int z){
    x = w;
    y = z; 
    return r=x*y;
  }
  
  public float div(int w, int z){
    x = w;
    y = z; 
    return r=x/y;
  }

  public float expo(int w){
    x = w;
    return r=x*x;
  }

  public float expo2(int z){
    y = z;
    return r=y*y;
  }

  public void imprimir(){
    System.out.println("El resultado es: " + r);
  }

  public static void main(String[] args) {
    Main myObj = new Main();
  
    System.out.println(myObj.suma(2,5));
    myObj.imprimir();
    System.out.println(myObj.resta(2,5));
    myObj.imprimir();
    System.out.println(myObj.multi(2,5));
    myObj.imprimir();
    System.out.println(myObj.div(5,2)); // y debe ser diferente de 0
    myObj.imprimir();
    System.out.println(myObj.expo(2));
    myObj.imprimir();
    System.out.println(myObj.expo2(5));
    myObj.imprimir();
    
  }

 
}