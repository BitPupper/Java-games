
public class DrawingBoard{
	
	public static double calcSpeed(double xi, double yi, double xf, double yf) {
		return(Math.sqrt(Math.pow((xf-xi), 2)+Math.pow((yf-yi), 2)));
	}

	public static void main(String[] args) {
		StdDraw.setCanvasSize(1000,1000);
		double xi, xf, yf, yi;
			while(!StdDraw.mousePressed()) {/*
				xi=StdDraw.mouseX();
				yi=StdDraw.mouseY();
				xf=StdDraw.mouseX();
				yf=StdDraw.mouseY();*/
				StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), 0.02); /*(0.02+calcSpeed(xi,yi,xf,yf)*/
			}
	}

}
