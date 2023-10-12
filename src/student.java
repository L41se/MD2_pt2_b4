package src;

public class student {
        String name;
        int age;
        double scoreT;
        double scoreL;
        double scoreH;
    public student(){}
    public student(String name, int age, double scoreT, double scoreL, double scoreH) {
        this.name = name;
        this.age = age;
        this.scoreT = scoreT;
        this.scoreL = scoreL;
        this.scoreH = scoreH;
    }
    public String getInfo(){
        return "Student information: " + this.name + " " + this.age + " year old";
    }
    public String getRank(){
        double midScore = getMidScore();
        if(midScore > 8) {
            return "very gud";
        }
        if (midScore >= 6.5){
            return "kinda good";
        }
        else return "bad";
    }
    double getMidScore(){
        return (this.scoreT + this.scoreL + this.scoreH) /3;
    }

}
