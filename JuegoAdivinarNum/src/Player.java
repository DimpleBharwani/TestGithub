public class Player {
int number = 0; // el numero adivinado
public void adivinar() {
number = (int) (Math.random() * 10);
System.out.println("Estoy adivinando "
+ number);
}
}