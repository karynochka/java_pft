public class Point {
    public double x;
    public double y;

    public double distance(Point b){
        double katet1 = b.x - this.x;
        double katet2 = b.y - this.y;
        double gipotenuza = Math.sqrt((katet1*katet1)+(katet2*katet2));
        return gipotenuza;
    }
}
