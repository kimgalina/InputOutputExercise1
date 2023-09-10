/*
Вход: число n на первой строке, на второй строке n чисел и на третьей строке произвольное количество чисел

Выход: сумма n чисел в первой строке, сумма чисел с третьей строки во второй строке вывода, в третьей строке
 вывести “Ответ: A B”, где A - первоя строка вывода, B - вторая строка вывода
 */

import java.io.*;
public class Main {
    public static void main(String[] args) {
        // открываем потоки для чтения и записи
        // используем try с ресурсами чтобы автоматически у нас закрывались потоки
        // классы BufferedReader , PrintWriter предоставляют возможность строкового ввода вывода
       try( BufferedReader in = new BufferedReader( new FileReader("input.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("output.txt"))){
           // читаем первую строку
            String str = in.readLine();
            int sum1 = 0, sum2=0;
            int firstNum = Integer.parseInt(str);
            sum1+=firstNum;
           // читаем вторую строку
           str = in.readLine();
           String[] numbersStr = str.split(" ");
          for(int i = 0; i < numbersStr.length - 1;i++){
              sum1+= Integer.parseInt(numbersStr[i]);
          }
          // читаем третью строку
           str = in.readLine();
           numbersStr = str.split(" ");
           for(int i = 0; i < numbersStr.length ;i++){
               sum2+= Integer.parseInt(numbersStr[i]);
           }
           out.println(sum1);
           out.println(sum2);
       }catch(FileNotFoundException exc){
           System.err.println("Sorry but the file wasnt found");
       }catch(IOException exc){
           System.err.println("Input/Output ERROR");
       }
    }
}