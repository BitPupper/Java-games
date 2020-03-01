
public class Map {
	public char[][] chunk = new char[9][9]; //main array to hold map ascii
	private char grass, path, stone, water, cave, loot, NPC, sign, player, bush;
	private boolean showCompass=false;
	
	public Map() {
		grass = 'v';
		path = '.';
		stone = 'O';
		water = '~';
		cave = '@';
		loot = 'x';
		NPC = 'Y';
		sign = '?';
		bush = '#';
		player = '&';
		//createRandom();
		createInitialized();
	}
	
	public void createInitialized() {
		char[][] a = 
				   {{'#', '#', '#', '#', 'O', 'O', 'O', 'O', 'O'},
					{'#', '#', 'v', 'v', '.', '.', '.', '@', 'O'},
					{'#', '#', 'Y', 'x', '.', 'v', 'v', 'O', 'O'},
					{'v', 'v', 'v', '.', '.', '?', 'v', 'O', 'O'},
					{'.', '.', '.', '.', '&', '.', 'v', 'v', 'O'},
					{'v', 'v', 'v', '.', '.', '.', 'v', 'v', 'O'},
					{'#', '#', 'v', 'v', '.', 'v', 'v', 'v', 'O'},
					{'#', '#', '~', '~', '~', '~', '~', '~', '~'},
					{'#', '#', '~', '~', '~', '~', '~', '~', '~'}};
		char[][][] maps = 
			{
				{{'#', '#', '#', '#', 'O', 'O', 'O', 'O', 'O'},
					{'#', '#', 'v', 'v', '.', '.', '.', '@', 'O'},
					{'#', '#', 'Y', 'x', '.', 'v', 'v', 'O', 'O'},
					{'v', 'v', 'v', '.', '.', '?', 'v', 'O', 'O'},
					{'.', '.', '.', '.', '&', '.', 'v', 'v', 'O'},
					{'v', 'v', 'v', '.', '.', '.', 'v', 'v', 'O'},
					{'#', '#', 'v', 'v', '.', 'v', 'v', 'v', 'O'},
					{'#', '#', '~', '~', '~', '~', '~', '~', '~'},
					{'#', '#', '~', '~', '~', '~', '~', '~', '~'}},
					   {{'#', '#', '#', '#', 'O', '~', '~', '~', '~'},
						{'#', '#', 'v', 'v', '.', '~', '~', '~', '~'},
						{'#', '#', 'Y', 'x', '.', '~', '~', '~', '~'},
						{'v', 'v', 'v', '.', '.', '~', '~', '~', '~'},
						{'.', '.', '.', '.', '.', '~', '~', '~', '~'},
						{'v', 'v', 'v', '.', '.', '~', '~', '~', '~'},
						{'#', '#', 'v', 'v', '.', '~', '~', '~', '~'},
						{'#', '#', '~', '~', '~', '~', '~', '~', '~'},
						{'#', '#', '~', '~', '~', '~', '~', '~', '~'}}
			};
		chunk = a;
	}
	
	
	public void createRandom() {
		int n=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				n=(int)(Math.random()*9);
				switch(n) {
				case 1: chunk[i][j]=grass;
						break;
				case 2: chunk[i][j]=stone;
						break;
				case 3: chunk[i][j]=water;
						break;
				case 4: chunk[i][j]=cave;
						break;
				case 5: chunk[i][j]=loot;
						break;
				case 6: chunk[i][j]=NPC;
						break;
				case 7: chunk[i][j]=sign;
						break;
				case 8: chunk[i][j]=path;
						break;
				case 9: chunk[i][j]=bush;
						break;
				//default: System.out.print("Error, random generator");
				}
			}
		}
	}
	
	public void printBoard() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(chunk[i][j]+" ");
			}
			System.out.print("\n");
		}
		if(showCompass) {
			System.out.print("   n\n   ^\nw< o >e\n   v\n   s");
		}
		System.out.print("If this is your first time playing, press T and type \'help\' for more info");
	}
	
	public void toggleCompass() {
		if(showCompass) {
			showCompass=false;
		}else {
			showCompass=true;
		}
	}
	
	public String returnBoard() {
		String s = "";
		return s;
	}
	
	public static void main(String[] args) {
		Map area1 = new Map();
		area1.printBoard();
	}
	
	
}
