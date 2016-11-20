/**
 * Created by BELBACHIR on 20/11/2016.
 */
public class RobotNG extends Robot {

    private String Turbo;

    public RobotNG(int x, int y, String direction,String Turbo) {
        super(x, y, direction);
        this.Turbo="on";
    }

    public void avancer(int n){
        for(int i=0;i<n;i++)
            avance();
    }

    //gauche methode n1
    public void gauche(){
        for(int i=0;i<3;i++)
            droite();
    }
    public void demiTour(){
        for(int i=0;i<2;i++)
            droite();
    }
}