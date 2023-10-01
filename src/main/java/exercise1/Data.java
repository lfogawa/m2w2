package exercise1;

public class Data {
    private Integer month;

    private Integer day;

    private Integer year;

    public Data(Integer month, Integer day, Integer year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    
    public void exibirData(){
        System.out.printf("The date is %d/%d/%d, in brazilian date format.", day, month, year);
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
