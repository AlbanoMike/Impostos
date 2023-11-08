package Entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double Total= 0.0;
        List<Contribuinte> lista = new ArrayList<Contribuinte>();
        System.out.print("Number of tax payers: ");
        int payers = sc.nextInt();

        for (int i = 0; i < payers; i++) {
            System.out.print("Individual(1) or company(2) ? ");
            int type = sc.nextInt();
            System.out.print("name: ");
            String tempName = sc.next();
            System.out.print("Anual income: ");
            Double tempAnual = sc.nextDouble();
            if(type==1){
                System.out.println("health expenditures");
                Double temphealth = sc.nextDouble();
                lista.add(new PessoaFisica(tempName,tempAnual,temphealth));
            } else if (type == 2) {
                System.out.println("Number of employes");
                Integer employe = sc.nextInt();
                lista.add(new PessoaJuridica(tempName,tempAnual,employe));
            }
        }
        System.out.println("taxes paid:");
        for (int i = 0; i < payers; i++) {
            System.out.print(lista.get(i).getName() + ": $ ");
            System.out.printf("%.2f %n",lista.get(i).tax());
            Total += lista.get(i).tax();
        }
        System.out.printf("Total: $ %.2f %n ",Total);
        sc.close();
    }
}