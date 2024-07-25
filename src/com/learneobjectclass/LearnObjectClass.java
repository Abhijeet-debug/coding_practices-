package com.learneobjectclass;

import java.util.Objects;

class Car {
    String model;

    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model);
    }

    //    @Override
//    public int hashCode() {
//        return Objects.hash(model, year);
//    }
    @Override
    public int hashCode() {
        int uniqueNumber = 31;
        uniqueNumber += year;
        uniqueNumber += model.hashCode();
        return uniqueNumber;

    }


//    @Override
//    public boolean equals(Object obj) {
//        Car that = (Car) obj;
//        if (this.model.equals(that.model) && this.year == that.year) {
//            return true;
//        }
//        return false;
//    }

//


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

public class LearnObjectClass {
    public static void main(String[] args) {

        Car obj1 = new Car("honda", 2022);
        Car obj2 = new Car("honda", 2023);

        System.out.println(obj1.toString());
        System.out.println(obj2);

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());


    }
}
