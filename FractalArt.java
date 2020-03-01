
public class FractalArt {
	public static final int DEPTH = 7;
	public static double startRadius=10;
	
	/****************************************
	 *   This program recursively draws     *
	 *   four smaller circles on a circle   *
	 *   from a previous step.              *
	 ****************************************/
	
	public void draw(int steps, double x, double y, double r) {
		if(steps>0) {
			draw(steps-1, x+r, y, r/2);
			draw(steps-1, x-r, y, r/2);
			draw(steps-1, x, y+r, r/2);
			draw(steps-1, x, y-r, r/2);
		}
		switch(steps%4) {
		case 0: StdDraw.setPenColor(StdDraw.BOOK_BLUE);
			break;
		case 1: StdDraw.setPenColor(StdDraw.CYAN);
			break;
		case 2: StdDraw.setPenColor(StdDraw.MAGENTA);
			break;
		case 3: StdDraw.setPenColor(StdDraw.ORANGE);
		}
		StdDraw.filledCircle(x, y, r);
	}
	
	public static void main(String[] args) {
		FractalArt fractal = new FractalArt();
		StdDraw.setCanvasSize(1000,1000);
		fractal.draw(DEPTH, 0.5, 0.5, 0.25);
	}

}
