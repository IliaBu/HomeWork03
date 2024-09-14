public class ServiceStation implements Refueling, Service, Wiping {
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType) {
            case Diesel ->
                    System.out.println("Заправка дизельным топливом на сервисной станции");
            case GaseLine ->
                    System.out.println("Заправка бензином на сервисной станции");
        }
    }

    @Override
    public void wipMirrors() {
        System.out.println("Сервисная станция протирает зеркала");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Сервисная станция протирает лобовое стекло");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Сервисная станция протирает фары");
    }

    @Override
    public void repairCar() {
        System.out.println("Техническое обслуживание");
    }
}