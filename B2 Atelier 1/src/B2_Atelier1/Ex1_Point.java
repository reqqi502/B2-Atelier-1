package B2_Atelier1;

public class Ex1_Point extends Ex1_TestPoint{

	// TODO Auto-generated method stub
    int x ;
    int y;
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@SuppressWarnings("unused")
	public static void calcul(int x , int y) {
    	int z = (int)(Math.sqrt(x+y));
}

}
