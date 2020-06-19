package Demos;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(WeekDay.values()[0]);
		
		WeekDay dayOfWeek = WeekDay.Monday;
		System.out.println(dayOfWeek);
		
		dayOfWeek = WeekDay.values()[2];
		System.out.println(dayOfWeek);
		
		int numericDay = 4;
		dayOfWeek = WeekDay.values()[numericDay];
		System.out.println(dayOfWeek);
		dayOfWeek = WeekDay.values()[numericDay-1];
		System.out.println(dayOfWeek);
		
	}

}


enum WeekDay {
	Sunday,
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday
}