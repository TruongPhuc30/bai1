package baivehicle;

import java.util.Calendar;

public class Motorcycle extends Vehicle {
    protected int engineSize;

    public Motorcycle(){
        super();
        this.engineSize = 50;
    }

    public Motorcycle(String brand, String model, int year, int engineSize){
        super(brand,model,year);
        this.engineSize = engineSize;
    }

    @Override
    public String getInfo() {
        return String.format("Motorcycle(%s %s %d) - %dcc", brand, model, year, engineSize);
    }

    @Override
    public double calculateValue() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;
        double baseValue = 20000;
        if(age >= 3 && age <=7){
            baseValue *= 0.5;
        }
        else if(age > 7){
            baseValue *= 0.25;
        }
        return baseValue + (engineSize * 10);
    }

    @Override
    public String toString(){
        return String.format("Motorcycle[brand=%s,model=%s,year=%d,engineSize=%d]",brand, model, year, engineSize);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Motorcycle other = (Motorcycle) obj;
        return brand.equals(other.brand) &&
                model.equals(other.model) &&
                year == other.year &&
                engineSize == other.engineSize;
    }
}
