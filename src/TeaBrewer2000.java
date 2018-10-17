
public class TeaBrewer2000 {
public static void main(String[] args) {
	TeaMaker teaDaFirst = new TeaMaker();
	
	Kettle kettle = new Kettle();
	kettle.boil();
	
	Cup chip = new Cup();
	
	TeaBag pFruit = new TeaBag(TeaBag.PASSION_FRUIT);
	
	chip.makeTea(pFruit, kettle.getWater());
}
	
}
