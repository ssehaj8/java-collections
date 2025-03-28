package com.bridgelabz.queueInterface;
import java.util.*;

// Class representing a patient
class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PriorityQueue with custom comparator (higher severity treated first)
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.severity, a.severity));

        // Take user input for patients
        System.out.println("Enter patient details (name severity). Type 'done' to stop:");
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equalsIgnoreCase("done")) break;

            try {
                int severity = sc.nextInt();
                pq.add(new Patient(s, severity));
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter name and severity (integer). Enter again.");
                sc.nextLine();
            }
        }

        // Treat patients based on severity
        System.out.print("Order: ");
        List<String> l=new ArrayList<>();
        while (!pq.isEmpty()) {
            l.add(pq.poll().name);
        }
        System.out.println(String.join(", ", l));

    }
}

/*
Enter patient details (name severity). Type 'done' to stop:
Sehaj 8
Sanya 26
Bhawishya 21
done
Order: Sanya, Bhawishya, Sehaj
 */
