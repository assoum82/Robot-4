/**
 * Created by BELBACHIR on 20/11/2016.
 */
public class Robot {
    private int x;
    private int y;
    private String nom;
    private String direction;


    public Robot(int x,int y,String direction){

        this.x=0;
        this.y=0;
        this.direction="Est";
    }
    public void setx(int x){
        this.x=x;
    }
    public void sety(int y){
        this.y=y;
    }
    public void setdirection(String direction){
        this.direction=direction;

    }

    public int getX(){

        return this.x;
    }
    public int getY(){

        return this.y;
    }
    public String getDIRECTION(){

        return this.direction;
    }

    public void avance(){
        if((this.direction).equals("Nord"))
            this.y=y++;

        else{
            if((this.direction).equals("Est"))
                this.x=x++;

            else{
                if((this.direction).equals("Sud"))
                    this.y=-(y++);
                else
                    this.x=-(x++);
            }
        }

    }
    public void droite(){
        if((this.direction).equals("Nord"))
            this.direction="Est";
        else{
            if((this.direction).equals("Est"))
                this.direction="Sud";
            else{
                if((this.direction).equals("Sud"))
                    this.direction="Ouest";
                else
                    this.direction="Nord";
            }

        }
    }
    public void afficher(){
        System.out.println(this.nom+","+"("+this.x+";"+this.y+")"+","+this.direction);
    }

}
