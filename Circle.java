package leiDeJiCheng;
import java.math.*;
public class Circle {
	public double x;
	public double y;
	public double r;
	
	//空的构造器
	public Circle(){
		
	}
	//包含所有参数的构造器
	public Circle(double x,double y,double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	//设置和获取属性的方法
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
	//计算周长的方法Perimeter
	public double Perimeter(double per){
		per = 2*Math.PI*this.getR();
		return per; 
	}
	//计算面积的方法area
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
	//计算表面积的方法area
	public double Area(double area){
		
		return area;
	}
	//计算体积的方法volume
	public double Voloume(double voloume){
		
		return voloume;
	}
}
