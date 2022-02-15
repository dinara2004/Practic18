package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    Vehicle motorcycle = new Motorcycle();
    Vehicle car = new Car();
    Vehicle bus = new Bus();
    Vehicle trolleybus = new Trolleybus();

    Aqueous ship = new Ship();
    Aqueous boat = new Boat();
    Aqueous outboardMotor = new OutboardMotor();
    Aqueous liner = new Liner();

    Air plane = new Plane();
    Air glider = new Glider();
    Air rocket = new Rocket();
    Air helicopter = new Helicopter();

    Vehicle[] vehicles = {motorcycle, car, bus, trolleybus, ship, boat, outboardMotor, liner, plane,
            glider, rocket, helicopter};

        for (Vehicle s: vehicles) {

            if (s instanceof Motorcycle) {
                System.out.println("Motorcycle:");
                ((Motorcycle) s).az();
                ((Motorcycle) s).fast();
            }
            if (s instanceof Car) {
                System.out.println("Car:");
                ((Car) s).dostavka();
                ((Car) s).juruu();
            }
            if (s instanceof Bus ){
                System.out.println("Bus:");
                ((Bus) s).jurot();
                ((Bus) s).tashyit();
            }
            if (s instanceof Trolleybus){
                System.out.println("Trolleybus:");
                ((Trolleybus) s).jurot();
                ((Trolleybus) s).tashuu();
            }
            if (s instanceof Ship){
                System.out.println("Ship:");
                ((Ship) s).byWater();
                ((Ship) s).tashuu();
            }
            if (s instanceof Boat){
                System.out.println("Boat:");
                ((Boat) s).suudaJuruu();
                ((Boat) s).voennyi();
            }
            if (s instanceof OutboardMotor){
                System.out.println("OutboardMotor:");
                ((OutboardMotor) s).odin();
                ((OutboardMotor) s).suudaJurot();
            if (s instanceof Liner){
                System.out.println("Liner:");
                ((Liner) s).passenger();
                ((Liner) s).gruz();
            }
            if (s instanceof Plane){
                System.out.println("Plane:");
                ((Plane) s).dostavka();
                ((Plane) s).passengerTransportation();
            }
            if (s instanceof Glider){
                System.out.println("Glider:");
                ((Glider) s).theFastest();
                ((Glider) s).bezMotor();
            }
            if (s instanceof Rocket){
                System.out.println("Rocket:");
                ((Rocket) s).uchat();
                ((Rocket) s).vakuum();
            }
            if (s instanceof Helicopter){
                System.out.println("Helicopter:");
                ((Helicopter) s).uchuuu();
                ((Helicopter) s).vertical();
            }


        }










    }
}}
