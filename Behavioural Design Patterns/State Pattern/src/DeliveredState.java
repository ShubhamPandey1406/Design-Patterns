public class DeliveredState implements OrderState{
    @Override
    public void next(OrderContext context) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Cannot cancel a delivered order.");
    }

    @Override
    public String getStateName() {
        return "DELIVERED";
    }
}
