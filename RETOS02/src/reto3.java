public class reto3{
    public static void main(String[] args) {
        char[][] calculadora = new char[5][4];

        calculadora[0] = new char[] {' ', ' ', ' ', ' '};
        calculadora[1] = new char[] {'7', '8', '9', '/'};
        calculadora[2] = new char[] {'4', '5', '6', '*'};
        calculadora[3] = new char[] {'1', '2', '3', '-'};
        calculadora[4] = new char[] {'0', 'C', '=', '+'};

        for (int i = 0; i < calculadora.length; i++) {
            for (int j = 0; j < calculadora[i].length; j++) {
                System.out.print(calculadora[i][j] + " ");
            }
            System.out.println();
        }
    }
}