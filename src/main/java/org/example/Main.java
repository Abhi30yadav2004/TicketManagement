package org.example;

import java.util.Scanner;


class train {
    String name;
    String coach;
    long mobileNo;
    int basicAmount;
    int totalAmount;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        this.name = sc.nextLine();
        System.out.println("Enter coach : 1AC : 2AC : 3A : Sleeper ");
        this.coach = sc.nextLine();
        System.out.println("Enter mobile number : ");
        this.mobileNo = sc.nextLong();
        System.out.println("Enter BasicAmount : ");
        this.basicAmount = sc.nextInt();
    }

    void update() {
        if (coach.equals("1AC")) {
            totalAmount = basicAmount + 700;
        } else if (coach.equals("2AC")) {
            totalAmount = basicAmount + 500;
        } else if (coach.equals("3AC")) {
            totalAmount = basicAmount + 250;
        } else if (coach.equals("S")) {
            totalAmount = basicAmount;
        }
    }

    void display() {
        System.out.println("Enter name :" + name);
        System.out.println("Enter coach :" + coach);
        System.out.println("Enter mobile number :" + mobileNo);
        System.out.println("Enter BasicAmount :" + basicAmount);
        System.out.println("Including " + coach + " charge totalBill : " + totalAmount);
    }

    public static void main(String[] args) {
       train obj = new train();
        obj.accept();
        obj.update();
        obj.display();

        DatabaseManager.saveTrainData(obj.name, obj.coach, obj.mobileNo, obj.basicAmount, obj.totalAmount);
      //  TicketFetcher.fetchAllTickets();

    }
}