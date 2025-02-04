
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		day = 1;
		month = 2;
		year = 2024;
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int newDay) {
		this.day = newDay;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int newMonth) {
		this.month = newMonth;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		this.year = newYear;
	}
	
	public void setDate(int newDay, int newMonth, int newYear) {
		this.day = newDay;
		this.month = newMonth;
		this.year = newYear;
	}
	
	public String toString() {
		return String.format("Date[Date = %d/%d/%d]", this.day, this.month, this.year);
	}
}
