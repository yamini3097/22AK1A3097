public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to multiply two complex numbers
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Method to find the conjugate of a complex number
    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.imaginary);
    }

    // Method to display the complex number
    public void display() {
        System.out.printf("%.2f + %.2fi\n", real, imaginary);
    }

    // Main method to test the ComplexNumber class
    public static void main(String[] args) {
        // Create two complex numbers
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(1, 2);

        // Display the complex numbers
        System.out.print("Complex Number 1: ");
        c1.display();
        System.out.print("Complex Number 2: ");
        c2.display();

        // Perform addition
        ComplexNumber sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        // Perform subtraction
        ComplexNumber difference = c1.subtract(c2);
        System.out.print("Difference: ");
        difference.display();

        // Perform multiplication
        ComplexNumber product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();

        // Perform conjugation
        ComplexNumber conjugateC1 = c1.conjugate();
        System.out.print("Conjugate of Complex Number 1: ");
        conjugateC1.display();
    }
}