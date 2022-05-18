package ru.stqa.parttwo.sandbox;

public class Point {
    public double p1;
    public double p2;
    public double p3;
    public double p4;
    public  Point  (double p1,double p2,double p3,double p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public  Point  (double x1,double y1,double x2,double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double distance(){
        return Math.sqrt((this.p3-this.p1)*(this.p3-this.p1)+(this.p4-this.p2)*(this.p4-this.p2));
        return Math.sqrt((this.x2-this.x1)*(this.x2-this.x1)+(this.y2-this.y1)*(this.y2-this.y1));
    }


}
