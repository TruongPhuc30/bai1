package baivehicle;

import java.util.Calendar;

public class Car extends Vehicle{
    protected int seats;

    public Car(){
        super();
        this.seats = 1;
    }

    public Car(String brand, String model, int year, int seats){
        super(brand, model, year);
        this.seats = seats;
    }

    @Override
    public String getInfo() {
        return String.format("Car(%s %s %d) - %d seats", brand, model, year, seats);
    }

    @Override
    public double calculateValue() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;
        double baseValue = 50000;
        if(age >= 3 && age <=7){
            baseValue *= 0.6;
        }
        else if(age > 7){
            baseValue *= 0.3;
        }
        return baseValue + (seats * 1000);
    }

    @Override
    public String toString(){
        return String.format("Car[brand=%s,model=%s,year=%d,seats=%d]",brand, model, year, seats);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car other = (Car) obj;
        return brand.equals(other.brand) &&
                model.equals(other.model) &&
                year == other.year &&
                seats == other.seats;
    }
}
