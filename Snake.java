public class Snake{
	public static void main(String [] args){
 	int player=0;
	System.out.println("Player is at starting point");
	int point=getRandomInteger(6, 1);
	System.out.println("Player go forward by "+point+ " point" );
}
public static int getRandomInteger(int maximum, int minimum){
		 return ((int) (Math.random()*(maximum - minimum))) + minimum; 
	}
}