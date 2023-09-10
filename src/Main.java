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
            String str = in.readLine();
            int sum1 = 0;
            sum1+=Integer.parseInt(str);
            

       }catch(FileNotFoundException exc){
           System.err.println("Sorry but the file wasnt found");
       }catch(IOException exc){
           System.err.println("Input/Output ERROR");
       }
    }
}