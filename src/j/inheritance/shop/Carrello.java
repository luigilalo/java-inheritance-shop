package j.inheritance.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quale prodotto vuoi valorizzare? (1: Smartphone; 2: TV; 3: Cuffie)");
        int choose = scanner.nextInt();

        System.out.print("Name: ");
        String nameInput = scanner.next();

        System.out.print("Description: ");
        String descriptionInput = scanner.next();

        BigDecimal price = null;
        while (price == null) {
            System.out.print("Price: ");
            String priceInput = scanner.next();
            try {
                price = new BigDecimal(priceInput);
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }

        BigDecimal vat = null;
        while (vat == null){
            System.out.print("Vat: ");
            String vatInput = scanner.next();
            try{
                vat = new BigDecimal(vatInput);
            } catch(NumberFormatException e){
                System.out.println("Invalid number");
            }
        }

        try {
            Product product = new Product(nameInput, descriptionInput, price , vat);
        } catch(NumberFormatException numberFormatException){
            System.out.println("The price or vat is not a number");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Sorry invalid parameters: " + illegalArgumentException.getMessage());
        }

        switch (choose) {
            case 1:
                System.out.println("Inserisci il codice IMEI");
                String codeIMEI = scanner.next();
                System.out.println("Quanta memoria ha?");
                int quantitaMemoria = scanner.nextInt();
                Smartphones smartphone = new Smartphones( nameInput, descriptionInput, price, vat, codeIMEI, quantitaMemoria);
                System.out.println(smartphone);
                break;
            case 2:
                System.out.println("Inserisci le dimensioni della TV");
                String dimensions = scanner.next();
                System.out.println("E' una TV smart? s/n");
                String choiceTvSmart = scanner.next();
                boolean isSmart = false;
                if (choiceTvSmart.equalsIgnoreCase("s")) {
                    isSmart = true;
                    System.out.println("La tv è smart");
                }
                Tv tv1 = new Tv(nameInput, descriptionInput, price, vat, dimensions, isSmart);
                System.out.println(tv1);
                break;
            case 3:
                System.out.println("Di che colore sono le cuffie?");
                String headphonesColor = scanner.next();
                System.out.println("Le cuffie sono wireless o cablate?");
                String wirelssOrCablate = scanner.next();
                Headphones headphones1 = new Headphones(nameInput, descriptionInput, price, vat, headphonesColor, wirelssOrCablate);
                System.out.println(headphones1);
        }

        scanner.close();
    }
}
