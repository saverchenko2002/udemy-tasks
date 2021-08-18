package task_45;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        return branches.add(new Branch(name));
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) == null) {
            return false;
        }
        return findBranch(name).newCustomer(customerName, initialTransaction);
    }

    private Branch findBranch(String name) {
        return branches.stream()
                .filter(branch -> branch.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch currentBranch = findBranch(branchName);
        if (currentBranch == null) {
            return false;
        }
        return currentBranch.addCustomerTransaction(customerName, transaction);
    }
}
