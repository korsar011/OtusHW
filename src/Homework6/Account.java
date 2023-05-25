package Homework6;

import java.util.Objects;

public class Account {
    private Integer accNumber;
    private Integer accBalance;

    public Account(Integer accNumber, Integer accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accNumber, account.accNumber) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accNumber);
    }

    @Override
    public String toString() {
        return "Данные счета: (" +
                "Номер счета: " + accNumber +
                ", Баланс: " + accBalance +
                ')';
    }
}
