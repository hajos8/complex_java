/*
* @author: cigany
*
*
*/

package org.example;

class Complex {
    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }


    public double getImag() {
        return imag;
    }
    public double getReal() {
        return real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setReal(double real) {
        this.real = real;
    }


    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }

    double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    double angle() {
        return Math.atan2(imag, real);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imag);
    }
}