import java.util.Arrays;
import java.util.Scanner;

public class StringArrayManipulatorApp {


    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        String[] stringArray = new String[5];
        StringArrayManipulator strArrManip = new StringArrayManipulator(stringArray);

        while (true){
            System.out.println("Введите 1 для добавления строки:");
            System.out.println("Введите 2 для вывода всех строк:");
            System.out.println("Введите 3 для получения самой короткой строки:");
            System.out.println("Введите 4 для получения самой длинной строки:");
            System.out.println("Введите 5 что бы перевернуть все строки в массиве:");
            int input = scanInt.nextInt();
            switch (input){
                case 1:{

                    System.out.println("Введите строку:");
                    String str = scanStr.nextLine();
                    strArrManip.addString(str);

                    break;

                }
                case 2:{
                    strArrManip.printArray();
                    break;
                }
                case 3:{
                    System.out.println(strArrManip.findShortestString());
                    break;
                }
                case 4:{
                    System.out.println(strArrManip.findLongestString());
                    break;

                }
                case 5:{
                    strArrManip.reverseAllStrings();
                    break;

                }
            }


        }






    }




}