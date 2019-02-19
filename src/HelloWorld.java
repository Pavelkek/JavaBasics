import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)
    {
        while (true){
            System.out.println("Выбери как будет написано словосочетание Hello world \n1) Как обычная стока \n2) Из слешей \n3) Из звездочек \n4) Завершить программу");
            Scanner in = new Scanner(System.in);
            int strIn = in.nextInt();
            String strOut = "";
            switch (strIn) {
                case 1:
                    strOut = "Hello world";
                    break;
                case 2:
                    strOut ="|   |   - - -  |  |   -----     \\        /\\        /  -----    -    |   -     \n" +
                            "|   |  |       |  |  |     |     \\      /  \\      /  |     |  |  \\  |  |  \\ \n" +
                            "| - |  | - -   |  |  |     |      \\    /    \\    /   |     |  |  /  |  |   |  \n" +
                            "|   |  |       |  |  |     |       \\  /      \\  /    |     |  |  \\  |  |  /  \n" +
                            "|   |   - - -  |  |   -----         \\/        \\/      -----   |   \\ |   -    ";
                    break;
                case 3:
                    strOut ="*   *  ******  *  *  *******     *        *        *  *******  ***   *  ***     \n" +
                            "*   *  *       *  *  *     *      *      * *      *   *     *  *  *  *  *  *   \n" +
                            "* * *  ******  *  *  *     *       *    *   *    *    *     *  * *   *  *   *  \n" +
                            "*   *  *       *  *  *     *        *  *     *  *     *     *  *  *  *  *  *   \n" +
                            "*   *  ******  *  *  *******         *        *       *******  *   * *  ***    ";
                    break;
                case 4:
                    return;
                default: strOut = "Вы ввели не верное значение, попробуйте заново";
                    break;
            }
            System.out.println(strOut);
        }
    }
}
