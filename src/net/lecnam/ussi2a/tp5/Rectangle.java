package net.lecnam.ussi2a.tp5;


public class Rectangle {

    protected double longueur;
    protected double largeur;
    protected Point point;
    private static int nbrInstances = 0;


    public Rectangle(double longueur, double largeur, Point point) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.point = point;
        nbrInstances++;
    }

    public Rectangle(double longueur, double largeur, double x, double y) {
        this(longueur, largeur, new Point(x, y));
    }

    public double retourneSurface(){
        return this.longueur *this.largeur;
    }

    public void translate(double x, double y){
        this.point.translate(x,y);
    }

    public boolean contient(Point point){
        return point.x >= this.point.x
                && point.x <= this.point.x+ longueur
                && point.y >= this.point.y
                && point.y <= this.point.y+largeur;
    }

    @Override
    public boolean equals(Object obkect){
        Rectangle rectangle = (Rectangle) obkect;
        return this.point.equals(rectangle.point)
                && this.longueur == rectangle.longueur
                && this.largeur == rectangle.largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longeur=" + longueur +
                ", largeur=" + largeur +
                ", point=" + point +
                ", surface=" + this.retourneSurface() +
                '}';
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
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
