package kadai_014;

public class Car_Chapter14 {
	private int gear = 1;
	
	
	public void gearChange( int afterGear){
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
	

		if (afterGear == 1) {
			System.out.println("速度は時速10㎞です");
		}else if (afterGear == 2){
			System.out.println("速度は時速20㎞です");
		}else if (afterGear == 3) {
			System.out.println("速度は時速30㎞です");
		}else if (afterGear == 4) {
			System.out.println("速度は時速40㎞です");
		}else if (afterGear == 5) {
			System.out.println("速度は時速50㎞です");
		}else {
			System.out.println("速度は時速10㎞です");
		}
	}}
