class Point{
    private double x;
    private double y;
    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y=y;
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }
    public double distance(Point p){
        return Math.sqrt(((this.x-p.getX())*(this.x-p.getX()))+((this.y-p.getY())*(this.y-p.getY())));
    }
    public static void main(String args[]){
        Point a=new Point(1,1);
        Point b=new Point(2,2);
        System.out.println("Distance from origin: "+a.distance());
        System.out.println("Distance from (1,2) and (2,3): "+a.distance(b));
    }
}