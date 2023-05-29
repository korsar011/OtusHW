package Homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork6 {
    static Map<Client, List<Account>> map = new HashMap<>();
    static Map<Account, Client> map1 = new HashMap<>();

    public static void main(String[] args) {

        Client client1 = new Client(1, "Александр", 25);
        Client client2 = new Client(2, "Петр", 15);
        Client client3 = new Client(3, "Николай", 31);
        Client client4 = new Client(4, "Сергей", 23);
        Client client5 = new Client(5, "Юлия", 19);

        Account account1 = new Account(31567, 135);
        Account account2 = new Account(1537, 1);
        Account account3 = new Account(9975, 15);
        Account account4 = new Account(3459, 199);
        Account account5 = new Account(2345, 4537);
        Account account6 = new Account(638, 324689);
        Account account7 = new Account(3, 23);
        Account account8 = new Account(4356, 56789);

        addAccount(client1, account3);
        addAccount(client2, account1);
        addAccount(client3, account5);
        addAccount(client4, account2);
        addAccount(client5, account4);
        addAccount(client3, account8);
        addAccount(client5, account6);
        addAccount(client1, account7);

        System.out.println("Счета клиента 1: " + getAccounts(client1));
        System.out.println("Клиент для счета 3459: " + findClient(account4));
    }

    public static void addAccount(Client client, Account account) {
        map1.put(account,client);
        if (map.containsKey(client)){
            map.get(client).add(account);
        }
        else {List<Account> accounts = new ArrayList<>();
            accounts.add(account);
            map.put(client, accounts);
        }

    }

    public static List<Account> getAccounts(Client client) {
        return map.get(client);
    }

    public static Client findClient(Account account) {
        return map1.get(account);
    }
}