package net.lecnam.ussi2a.tp5;

public class Dessin {

    Rectangle[] tableauRectangle;
    int nbRectangle = 0;

    public Dessin() {
        tableauRectangle = new Rectangle[100];
    }

    public void ajout(Rectangle rectangle){
        tableauRectangle[nbRectangle]=rectangle;
        nbRectangle++;
    }

    public double retourneSurface(){
        double total = 0;
        for (Rectangle rectangle: tableauRectangle) {
            if (rectangle == null) {
                continue;
            }
            total += rectangle.retourneSurface();
        }
        return total;
    }

    public void translate(double x, double y){

        for (Rectangle rectangle : tableauRectangle) {
            if (rectangle == null) {
                continue;
            }
            rectangle.translate(x, y);
        }

    }

    public Rectangle retournePlusGrandRectangle(){
        Rectangle plusGrand = null;
        for (Rectangle rectangle : tableauRectangle){
            if (rectangle == null) {
                continue;
            }
            if(plusGrand == null || plusGrand .retourneSurface() < rectangle.retourneSurface()){
                plusGrand = rectangle;
            }
        }
        return plusGrand;
    }


}
