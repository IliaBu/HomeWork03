public class WipingStation implements IWiping {

    @Override
    public void wipMirrors() {
        System.out.println("Очистка зеркал.\n");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Очистка стёкол.\n");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Очистка фар.\n");
    }

}
