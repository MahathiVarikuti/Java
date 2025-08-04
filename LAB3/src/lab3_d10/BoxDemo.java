package lab3_d10;
import java.util.*;
class Box {
	double width;
	double height;
	double depth;
	// compute and return volume
	double volume() {
	return width * height * depth;
	}
	// sets dimensions of box
	void setDim(double w, double h, double d) {
	width = w;
	height = h;
	depth = d;
	}
	}
public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1 = new Box(); //declare reference to an object
		Box mybox2 = new Box(); //allocate a Box object
		double vol;
		mybox1.setDim(10, 30, 20);
		mybox2.setDim(3, 6, 9);       //invoke
		vol = mybox1.volume();
		// initialize each box
		// get volume of first box
		System.out.println("Volume is " + vol);
		vol = mybox2.volume(); // get volume of second box
		System.out.println("Volume is " + vol);
	}

}




o/p:
Volume is 6000.0
Volume is 162.0
