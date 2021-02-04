package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int workersNumber = 3;

        while (workers.size() < workersNumber) {
            try {
                workers.add(createWorker(sc));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println("All workers created");

        workers.sort(Comparator.comparing(Worker::getName));

        System.out.println("Input work experience");
        int exp = sc.nextInt();
        findOldWorker(workers, exp);

    }

    private static void findOldWorker(List<Worker> workers, int exp) {

        for (Worker worker : workers) {
            if ((2021 - worker.getYear() >= exp)) {
                System.out.println(worker.getName());
            }

        }
    }

    private static Worker createWorker(Scanner scanner) {
        System.out.println("Input worker name:");
        String name = scanner.next();
        System.out.println("Input worker position:");
        String position = scanner.next();
        System.out.println("Input worker hire date:");
        int year = scanner.nextInt();
        if (year < 2000 || year > 2021) {
            throw new IllegalArgumentException("Incorrect year " + year);
        }
        System.out.println("Worker created");
        return new Worker(name, position, year);
    }

}
