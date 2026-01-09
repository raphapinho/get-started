import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.Scanner;

import br.com.dio.calc.Operation;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a ooperação que deseja realizar(1 - sum, 2- subtraction)");
        var operationOption = scanner.nextInt();
        while (operationOption > 2 || operationOption < 1) {
            System.out.println("Escolha uma opção valida(1 - sum, 2- subtraction)");
            operationOption = scanner.nextInt();
        }
        var selectedOperation = Operation.values()[operationOption - 1];
        System.out.println("Informe os números que serão usados separados por vírgula (ex: 1,2,3,4)");
        var number = scanner.next();
        var numberArray = Arrays.stream(number.split(","))
                                .mapToLong(s -> Long.parseLong(s))
                                .toArray();
        var result = selectedOperation.getOperationCallback().exec(numberArray);
        var operationToShow = number.replaceAll(",", " " + selectedOperation.getSignal() + " ");
        System.out.printf("O resultado da operação é %s = %s1\n", operationToShow,result);
    }
}
