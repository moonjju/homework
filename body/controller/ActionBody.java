package com.oop.body.controller;



import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {

	public static void main(String[] args) {
		ActionBody ab = new ActionBody();
		
		Body[] arr = new Body[5];
		
		arr[0] = new Head("파란");	
		arr[1] = new Arm();	
		arr[2] = new Leg();	
		arr[3] = new Arm();	
		arr[4] = new Leg();	
		
	
		for(Body bd :arr) {
		
			
			if(bd instanceof Head) {
				((Head)bd).headBang();
			}
			else if(bd instanceof Leg) {
				((Leg)bd).run();
			}
			else if(bd instanceof Arm) {
				((Arm)bd).armSwing();
			}
		}
	
	
	
	}

}
