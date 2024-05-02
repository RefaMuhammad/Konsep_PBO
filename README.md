# Ujian Tengah Semester 
<br>Mata Kuliah 	: Praktikum Pemrograman Berorientasi Objek
<br> Nama		      : Refa Muhammad
<br>NIM	    :	1227050113
<br>Jurusan		    :[Teknik Informatika](http://if.uinsgd.ac.id/) [UIN Sunan Gunung Djati Bandung](https://uinsgd.ac.id/) 

## Deskripsi Umum
For the final exam of the fourth semester of the Object-Oriented Programming Practicum course, you were asked to create a program that included all the PBO concepts that had been studied, including: 
1. Encapsulation
2. Inheritance
3. Polymorphism
4. Interface or Abstract
Made according to the criteria above and there are at least three classes in it

## Source Code
```
interface Shape {
    double calculateArea();
}

abstract class Polygon implements Shape {
    private int sides;

    public Polygon(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public abstract String getType();
}

class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}

class Square extends Polygon {
    private double side;

    public Square(double side) {
        super(4);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getType() {
        return "Square";
    }
}

public class Main {
    public static void main(String[] args) {
        Polygon triangle = new Triangle(3, 4);
        Polygon square = new Square(5);

        System.out.println(triangle.getType() + " Area: " + triangle.calculateArea());
        System.out.println(square.getType() + " Area: " + square.calculateArea());
    }
}

```

## Output
<img src="Output1.png"/>
