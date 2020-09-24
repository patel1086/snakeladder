public class Snake{
	public static void main(String [] args){
 	int player=0;
	System.out.println("Player is at starting point");
	int point=getRandomInteger(6, 1);
	//System.out.println("Player go forward by "+point+ " point" );
	int No_play=1;
	int ladder=2;
	int snake=3;
        int action=getRandomInteger(3,1);
        if(action==No_play)
		player+=0;
        else if(action==ladder)
                player+=point;
	else 
		player-=point;
                
}
public static int getRandomInteger(int maximum, int minimum){
		 return ((int) (Math.random()*(maximum - minimum))) + minimum; 
	}
}