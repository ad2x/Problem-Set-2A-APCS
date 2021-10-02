import java.util.Scanner;

class Calculator {
    //== Quadratic Formula ==
    public double qdrformp(double a, double b, double c) {        
        return (Math.sqrt(Math.pow(b, 2) - 4*a*c) - b)/(2*a);
    }
    
    public double qdrformn(double a, double b, double c) {
        return (-Math.sqrt(Math.pow(b, 2) - 4*a*c) - b)/(2*a);
    }
    
    //== Slope ==
    public double slope(double x1, double x2, double y1, double y2) {
        return (y2 - y1)/(x2 - x1); 
    }
    
    //== Midpoint ==
    public double midpointx(double x1, double x2) {
        return (x1 + x2)/2;
    }
    
    public double midpointy(double y1, double y2) {
        return (y1 + y2)/2;
    }
    
    //== Arithmetic Series ==
    public double arithser(double noterms, double nthterm, double fterm) {
        return noterms/2*(nthterm + fterm);
    }
    
    //=== Finite Gemetric Series
    public double fgeoser(double noterms, double fterm, double coratio) {
        return fterm*(1 - Math.pow(coratio, noterms))/(1 - coratio);
    }
}