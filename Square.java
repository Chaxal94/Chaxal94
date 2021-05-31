public class Square extends Rectangle {
    public Square(){}
    public Square(double side){
        side = super.getWidth();
    }

    public Square(double side,String color,boolean filled){
        side = super.getWidth();
        color = super.getColor();
        filled = super.isFilled();
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
       side = getSide();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {

        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square["+super.toString()+"]";
    }
}
