package task_51;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {


        Class<?> immutabilityCheck = Class.forName("task_51.Location");

        System.out.println("\nTo ensure class immutability we have to follow 4 steps: ");
        System.out.println("Step 1: Don't provide setters");
        Method[] methods = immutabilityCheck.getDeclaredMethods();
        Arrays.stream(methods)
                .filter(method -> !method.getName().contains("java"))
                .forEach(System.out::println);
        System.out.println("************************************************************");
        System.out.println("Step 2: Make all fields final and private");
        Field[] fields = immutabilityCheck.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);
        System.out.println("************************************************************");
        System.out.println("Step 3: Don't allow subclasses to override methods:" +
                " Simplest way - declare the class ass final");
        System.out.println("Is class final?\n" + Modifier.isFinal(immutabilityCheck.getModifiers()));
        System.out.println("************************************************************");
        System.out.println("Step 4: Create copies of your internal mutable objects when necessary " +
                "to avoid returning the originals in your methods, for example getExits() method");
    }
}
