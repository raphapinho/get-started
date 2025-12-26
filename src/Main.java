import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        GeometricForm geometricForm;

        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área");
            System.out.println("1 - quadrado");
            System.out.println("2 - triangulo");
            System.out.println("3 - circulo");
            System.out.println("4 - sair do programa");

            option = scanner.nextInt();

            if (option == 1) {
                geometricForm = createSquare(scanner);
            } else if (option == 2) {
                geometricForm = createRetangle(scanner);
            } else if (option == 3) {
                geometricForm = createCircle(scanner);
            } else if (option == 4) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }

            System.out.println("O resultado do cálculo da área foi de: " + geometricForm.getArea());
        }

        scanner.close();
    }

    private static GeometricForm createSquare(Scanner scanner) {
        System.out.println("Informe o tamanho dos lados");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRetangle(Scanner scanner) {
        System.out.println("Informe a base");
        double base = scanner.nextDouble();

        System.out.println("Informe a altura");
        double height = scanner.nextDouble();
        return new Rectangle(base, height);
    }

    private static GeometricForm createCircle(Scanner scanner) {
        System.out.println("Informe o raio");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
