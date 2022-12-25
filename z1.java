import java.io.IOException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class z1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      try {
        System.out.println(Double.parseDouble(sc.next()));
        break;
      } catch (NumberFormatException e) {
        System.out.println("Введена строка!");
        System.out.println("Ведите новое число: ");
      }
    }
  }
}
