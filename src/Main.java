import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        final PetMachine petMachine = new PetMachine();
        var option = -1;
        do {
            System.out.println("====Escolha uma das opções===");
            System.out.println("1 - dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    petMachine.takeAShower();
                    break;
                case 2:
                    setWater(petMachine);
                    break;
                case 3:
                    setShampoo(petMachine);
                    break;
                case 4:
                    verifyWater(petMachine);
                case 5:
                    verifyShampoo(petMachine);
                case 6:
                    checkIfHasPetInMachine(petMachine);
                    break;
                case 7:
                    setPetInPetMachine(scanner,petMachine);
                    break;
                case 8:
                    petMachine.removePet();
                    break;
                case 9:
                    petMachine.wash();
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        } while (option != 0);
    }

    private static void setShampoo(PetMachine petMachine) {
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    private static void setWater(PetMachine petMachine) {
        System.out.println("Tentando colocar agua na máquina");
        petMachine.addWater();
    }

    private static void verifyWater(final PetMachine petMachine) {
        var amount = petMachine.getWater();
        System.out.println("Amáquina esta no momento com " + amount + " litro(s) de shampoo");
    }

    private static void verifyShampoo(final PetMachine petMachine) {
        var amount = petMachine.getShampoo();
        System.out.println("Amáquina esta no momento com " + amount + " litro(s) de shampoo");
    }


    private static void checkIfHasPetInMachine(PetMachine petMachine) {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina": "Não tem pet na máquinaf");
    
    }


    public static void setPetInPetMachine(Scanner scanner, PetMachine petMachine) {
        var name = "";
        while (name.equals(null)|| name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        Pet pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void getPetFromMachine(PetMachine petMachine) {
        petMachine.removePet();
    }
}