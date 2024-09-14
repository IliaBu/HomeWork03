import java.awt.*;

public class Harvester extends Car implements Refueling, Wiping {

    private Refueling refueling;

    private IWiping iWiping;

    public Harvester(String make, String model, Color color, int wheelsCount) {
        super(make, model, color, wheelsCount);
    }

    public void setRefueling(Refueling refueling) {
        this.refueling = refueling;
    }

    public void setIWiping(IWiping iWiping) {
        this.iWiping = iWiping;
    }

    @Override
    public boolean gearShifting() {
        return false;

    }

    /**
     * Заправить уборочную машину
     */
    @Override
    public void fuel(FuelType fuelType) {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void maintenance() {

    }

    @Override
    public void movement() {

    }

    @Override
    public boolean switchHeadLights() {
        return false;

    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Уборочная машина метёт улицу.");
    }

    @Override
    public void wipMirrors() {
        if (iWiping != null) {
            iWiping.wipMirrors();
        }
    }

    @Override
    public void wipWindshield() {
        if (iWiping != null) {
            iWiping.wipWindshield();
        }
    }

    @Override
    public void wipHeadlights() {
        if (iWiping != null) {
            iWiping.wipHeadlights();
        }
    }

}
