package Programa;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import classes.Motorista;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Motorista> pessoas = Arrays.asList(
        new Motorista(" Ariel","123456789",1,"B"), 
        new Motorista(" Robson","122345678",2,"B"),
        new Motorista(" Adalberto","123456749",3,"B"),
        new Motorista(" Jorge","123445789",4,"B"));

        System.out.println("Informe o CPF do motorisa: ");
        String cpf = sc.nextLine();

    for(Motorista pessoa : pessoas) {
            if(pessoa.getCpf().equals(cpf)){
            System.out.printf("motorista: %s - Matrícula %s - Habilitação %s", pessoa.getNome(), pessoa.getMatricula(), pessoa.getHabilitacao());
            }
        }      
        sc.close();
    }  
     
}
