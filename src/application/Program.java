package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList();
	
	
		list.add(new BusinessAccount(1001, "Loira Safada", 2000, 0));
		list.add(new BusinessAccount(1002, "Morena Rabuda", 1500, 0));
		list.add(new BusinessAccount(1003, "Ruiva Vagabunda", 1800, 0));
		list.add(new BusinessAccount(1004, "Gostosa", 1200, 0));
		list.add(new BusinessAccount(1005, "Vagaba", 1500, 0));
		
		
		double soma = 0.0;
		for (Account list1:list) {
			soma += list1.getBalance();
		}
		System.out.printf("Total das Contas: %.2f", soma);
		
		for (Account acc:list) {
			acc.deposito(10000.0);
		}
		
		double soma2 = 0.0;
		for (Account acc: list) {
			soma2 += acc.getBalance();
		}
		
		System.out.printf("%nTotal das Contas %.2f", soma2);
		
		for (Account acc:list) {
			System.out.printf("%n" + acc.getHolder() + " - " + String.format("%.2f", acc.getBalance()));
		}
	}

}
