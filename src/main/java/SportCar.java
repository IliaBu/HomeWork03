import java.awt.Color;

public class SportCar extends Car implements Refueling{

    private Refueling refueling;

    public SportCar(String make, String model, Color color, int wheelsCount) {
        super(make, model, color, wheelsCount);
        this.fuelType = FuelType.GaseLine;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel(FuelType fuelType) {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void movement() {
        System.out.println("движение");
    }

    @Override
    public void maintenance() {
        System.out.println("обслуживание");
    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

}
