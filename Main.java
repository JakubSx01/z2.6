import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Wprowadź 5 liczb:");
    ArrayList<Double> liczby = new ArrayList<Double>();
    double suma = 0;
    for(int i = 0; i < 5; i++){
      double liczba = scan.nextDouble();
      liczby.add(liczba);
      if(liczba % 3 == 0) {
        suma += liczba;
      }
    }
    System.out.println("Liczby podane: " + liczby);
    System.out.println("Suma liczb podzielnych przez 3: " + suma);
  }
}
