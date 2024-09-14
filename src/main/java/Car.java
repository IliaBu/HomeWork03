import java.awt.*;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Car(String make, String model, Color color, int wheelsCount) {
        this(make, model, color);
        this.wheelsCount = wheelsCount;
        if (wheelsCount < 3 || wheelsCount > 10) {
            throw new RuntimeException("Недопустимое кол-во колес.");
        }
    }

    //endregion

    //region Public Abstract Methods

    // Движение
    public abstract void movement();

    // Обслуживание
    public abstract void maintenance();

    // Переключение передач
    public abstract boolean gearShifting();

    // Включение фар
    public abstract boolean switchHeadLights();

    // Включение дворников
    public abstract boolean switchWipers();


    //endregion

    //region Public Methods

    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWipingStation(IWiping wipingStation) {
        this.wipingStation = wipingStation;
    }

    public void setServiceStation(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    /**
     * Заправить автомобиль
     */
    public void fuel() {
        if (refueling != null) {
            System.out.println(this.getClass().getSimpleName());
            refueling.fuel(fuelType);
        }
    }

    /**
     * Мойка автомобиля
     */
    public void wiping(int services) {
        if (wipingStation != null) {
            System.out.println(this.getClass().getSimpleName());
            switch (services) {
                case 1 -> wipingStation.wipHeadlights();
                case 2 -> wipingStation.wipMirrors();
                case 3 -> wipingStation.wipWindshield();
                default -> {
                    wipingStation.wipHeadlights();
                    wipingStation.wipMirrors();
                    wipingStation.wipWindshield();
                }
            }
        }
    }

    /**
     * Обслуживание автомобиля на сервисной станции
     */
    public void service(int services) {
        if (serviceStation != null) {
            System.out.println(this.getClass().getSimpleName());
            switch (services) {
                case 1 -> serviceStation.wipHeadlights();
                case 2 -> serviceStation.wipMirrors();
                case 3 -> serviceStation.wipWindshield();
                case 4 -> serviceStation.fuel(fuelType);
                case 5 -> serviceStation.repairCar();
                default -> {
                    serviceStation.wipHeadlights();
                    serviceStation.wipMirrors();
                    serviceStation.wipWindshield();
                    serviceStation.fuel(fuelType);
                    serviceStation.repairCar();
                }
            }
        }
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private final String make;

    // Модель автомобиля
    private final String model;

    // Цвет
    private final Color color;

    // Тип
    private CarType type;

    // Число колес
    private int wheelsCount;

    // Тип топлива
    protected FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights;

    private Refueling refueling;

    private IWiping wipingStation;

    private ServiceStation serviceStation;

    //endregion

}
