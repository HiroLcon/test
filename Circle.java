package leiDeJiCheng;
import java.math.*;
public class Circle {
	public double x;
	public double y;
	public double r;
	
	//�յĹ�����
	public Circle(){
		
	}
	//�������в����Ĺ�����
	public Circle(double x,double y,double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	//���úͻ�ȡ���Եķ���
	public void setX(double newx){
		this.x = newx;
	}
	public double getx(){
		return x;
	}
	public void setY(double newy){
		this.y = newy;
	}
	public double getY(){
		return y;
	}
	public void setR(double newr){
		this.r = newr;
	}
	public double getR(){
		return r;
	}
	//�����ܳ��ķ���Perimeter
	public double Perimeter(double per){
		per = 2*Math.PI*this.getR();
		return per; 
	}
	//��������ķ���area
	public double Area(double area){
		area = Math.PI*this.getR()*this.getR();
		return area;
	}

}
class Cylinder extends Circle{
	public double h;
	
	public Cylinder(){
		
	}
	
	public Cylinder(double x,double y,double r,double h ){
		this.h = h;
		this.r = r;
		this.x = x;
		this.y = y;
	}
	public void setH(double newh){
		this.h = newh;
	}
	public double getH(){
		return h;
	}
	//���������ķ���area
	public double Area(double area){
		
		return area;
	}
	//��������ķ���volume
	public double Voloume(double voloume){
		
		return voloume;
	}
}
