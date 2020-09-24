public class Snake{
	public static void main(String [] args){
 	int player1=0;
	int player2=0;
	System.out.println("Both Players are  at starting point");
        
	
	//System.out.println("Player go forward by "+point+ " point" );
	int No_play=1;
	int ladder=2;
	int snake=3;
	int clock=0;
        int j=1;
	while(j==1){
                for(int i=0;i<2;i++){
		int point=getRandomInteger(6, 1);
		clock++;
		int action=getRandomInteger(3,1);
		if(i==1){
		
        		if(action==No_play)
				player1+=0;
			
		
        		else if(action==snake){
                		player1-=point;
				if(player1<0)
					player1=0;
				}
			else {

				player1+=point;
				if(player1>100)
 					player1-=point;
				else if(player1==100){
					System.out.println("Player1 Win");
					System.out.println("Numer of time dice was Rotated efore getting winning point "+ clock);
					break;
					}
				while(j==1){
                                
					point=getRandomInteger(6, 1);
					action=getRandomInteger(3,1);
					if(action==ladder){
						player1+=point;
						System.out.println("Position of Player1 " + player1);
						if(player1>100)
 							player1-=point;
						else if(player1==100){
							System.out.println("Player1 Win");
							System.out.println("Numer of time dice was Rotated efore getting winning point "+ clock);
							break;
							}
						
					}
					else
						break;
				}
			
                        
		}
			System.out.println("Position of Player1 " + player1);
		}
                else{
			if(action==No_play)
				player2+=0;
			
		
        		else if(action==snake){
                		player2-=point;
				if(player2<0)
				player2=0;
				}
			else {

				player2+=point;
				if(player2>100)
 					player2-=point;
				else if(player2==100){
					System.out.println("Player2 Win");
					System.out.println("Numer of time dice was Rotated efore getting winning point "+ clock);
					break;
					}
				while(j==1){
                                
					point=getRandomInteger(6, 1);
					action=getRandomInteger(3,1);
					if(action==ladder){
						player2+=point;
						System.out.println("Position of Player2 " + player2);
						if(player2>100)
 							player2-=point;
						else if(player2==100){
							System.out.println("Player2 Win");
							System.out.println("Numer of time dice was Rotated efore getting winning point "+ clock);
							break;
							}
						
					}
					else
						break;
				}
			
			
                        
				}
			System.out.println("Position of Player2 " + player2);
                }
	}
         	if(player1==100){
         		System.out.println("Player1 won the game");
	 		break;
			}
		else if(player2==100){
        		System.out.println("Player2 won the game");
			break;
			}
		
}
                
}
public static int getRandomInteger(int maximum, int minimum){
		 return ((int) (Math.random()*(maximum - minimum))) + minimum; 
	}
}