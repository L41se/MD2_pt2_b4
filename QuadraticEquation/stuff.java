package QuadraticEquation;

public class stuff {
    private double a, b, c;
    public stuff(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    double getDiscriminant(double a, double b, double c){
        return Math.pow(b, 2) - 4 * a * c;
    }
    public double getRootPlus(double a, double b, double c){
        return (-b + Math.sqrt(getDiscriminant(a, b, c))) / (2 * a);
    }
    public double getRootMinus(double a, double b, double c){
        return (-b - Math.sqrt(getDiscriminant(a, b, c))) / (2 * a);
    }
    public String checkDelta(double a, double b, double c){
        double n = getDiscriminant(a, b, c);
        if (n>= 0){
            return "This equation have 2 possible roots: \n" + "Root 1 = " +
                    getRootPlus(a, b, c) + "\n" + "Root 2 = " + getRootMinus(a, b, c);
        } else if (n == 0){
            return "This equation have 1 possible root: \n" + "Root 1 = " + getRootPlus(a, b, c);
        }
        return "This equation has no roots";
    }
}
