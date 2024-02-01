package Components;
public class Equation2{
	private int a,b,c;
	private double delta,x1,x2;
	private String results="";
	public Equation2(){
	}
	public String getResults(){
		return this.results;
	}
	public void setA(int a){
		this.a=a;
	}
	public int getA(){
		return this.a;
	}
	public void setB(int b){
		this.b=b;
	}
	public int getB(){
		return this.b;
	}
	public void setC(int c){
		this.c=c;
	}
	public int getC(){
		return this.c;
	}
	public void calcDelta(){
		this.delta=((this.b)*(this.b))-(4*(this.a)*(this.c));
	}
	public void resolve(){
		this.results+=("le delta est "+this.delta+" et les coefficients sont "+this.a+" "+this.b+" "+this.c+"\\n");
		
		if(this.delta==0){
			this.x1=(-this.b)/(2*(this.a));
			this.results+=("Unique solution "+this.x1);
		}
		else{
			if(this.delta<0){
				this.results+=("Aucune solution");
			}
			if(this.delta>0){
				this.x1=(-(this.b)-Math.sqrt(this.delta))/(2*(this.a));
				this.x2=(-(this.b)+Math.sqrt(this.delta))/(2*(this.a));
				this.results+=("Les solutions sont "+this.x1+" "+this.x2);
			}
		}
	}
	
}
