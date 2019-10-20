package net.lecnam.ussi2a.tp4;


public class Rectangle {

    private double longeur;
    private double largeur;
    private Point point;
    private static int nbrInstances = 0;


    public Rectangle(double longeur, double largeur, Point point) {
        this.longeur = longeur;
        this.largeur = largeur;
        this.point = point;
        nbrInstances++;
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.point = new Point(x1, y1);
        this.longeur = x2-x1;
        this.largeur = y2-y1;
        nbrInstances++;
    }

    public double retourneSurface(){
        return this.longeur*this.largeur;
    }

    public void translate(double x, double y){
        this.point.translate(x,y);
    }

    public boolean contient(Point point){
        return point.x >= this.point.x
                && point.x <= this.point.x+longeur
                && point.y >= this.point.y
                && point.y <= this.point.y+largeur;
    }

    @Override
    public boolean equals(Object obkect){
        Rectangle rectangle = (Rectangle) obkect;
        return this.point.equals(rectangle.point)
                && this.longeur == rectangle.longeur
                && this.largeur == rectangle.largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longeur=" + longeur +
                ", largeur=" + largeur +
                ", point=" + point +
                ", surface=" + this.retourneSurface() +
                '}';
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public static int getNbrInstances() {
        return nbrInstances;
    }

    public static void setNbrInstances(int nbrInstances) {
        Rectangle.nbrInstances = nbrInstances;
    }
}
