package com.chrisvasconi.zookeeper2;

public class Bat {
		public String Name = "Covid Bat";
		public int energyLevel = (300);


public void fly() {
	System.out.println(Name + "Energy is a" + " " +  energyLevel + " " + "Because it has flown and needs to rest its weary wings!");
	energyLevel -= 50;
}

public void eatHumans() {
	System.out.println(Name + " " + "So- well, nevermind.." + " " + "Energy is up to" + " " + energyLevel);
	energyLevel += 25;
}

public void attackTown() {
	System.out.println("Sounds like a towns on fire from a single bat..." + " " + "A" + " " + Name + " " + "Energy is at" + " " + energyLevel);
	energyLevel -= 100;
}
}