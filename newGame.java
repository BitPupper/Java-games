public class newGame {
	private int[][] board;
	
	public newGame(){
		board = new int[3][3];
		int[] n = new int[8];
		n=newGame.generateRandom();
		
		int a=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(!(i==2&&j==2)) {
				board[i][j]=n[a];
				a++;
				}
			}
		}
	
	}
	
	// print matrix of random numbers
	public String display() {
		String s="";
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j]!=0) {
					s+=(" | "+board[i][j]);
				}else{
					s+=(" | -");
				}
			}
			if(i!=2)
				s+=" |\n -------------\n";
			else
				s+=" |\n";
		}
		return(s);
	}
	
	// generate some random numbers here
	static public int[] generateRandom() {
		int[] n = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] rem = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i=0; i<8; i++) {
			do {
				n[i] = rem[(int)(Math.random() * 8)]; // here generated random value using Math library
			}while(n[i]==0);
			rem[n[i]-1]=0;
		}
		return n;
	}
	
	public static void main(String[] args) {
		newGame game1 = new newGame();
		System.out.println(game1.display());
	}
	
}
