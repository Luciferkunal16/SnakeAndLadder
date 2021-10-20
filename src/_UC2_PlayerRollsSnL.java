
public class _UC2_PlayerRollsSnL {
	int dice() {
		int dice=(int)(Math.random()*10%6+1);
		return dice;
	}
	
	
	
	
	public static void main(String[] args) {
		int position=0;
		_UC2_PlayerRollsSnL rv=new _UC2_PlayerRollsSnL();
		System.out.println("Welcome To Snake And Ladder Game");
		System.out.println("Player 1 is at position "+position);
		System.out.println("Player 1 rolls the dice and got");
		System.out.println(rv.dice());
			
		
	}