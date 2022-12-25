import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
//что пустые строки вводить нельзя.
public class z4 {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(System.in)
    );
    System.out.println("Введите текст: ");
    while (true) {
      try {
        String str = reader.readLine();
        if (str.equals("")) throw new RuntimeException(
          "пустые строки вводить нельзя"
        );
        System.out.println(str);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
