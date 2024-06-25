// Класс, представляющий обычного человека.
public class Human extends Actor implements ActorBehaviour {
    // Конструктор для инициализации имени человека.
    public Human(String name) {
        super(name);
    }

    // Реализация метода для установки статуса выполнения заказа.
    @Override
    public void setMakeOrder(boolean status) {
        this.isMakeOrder = status;
    }

    // Реализация метода для установки статуса принятия заказа.
    @Override
    public void setTakeOrder(boolean status) {
        this.isTakeOrder = status;
    }

    // Реализация метода для выполнения заказа.
    @Override
    public void makeOrder() {
        System.out.println(this.name + " сделал заказ.");
        setMakeOrder(true);
    }

    // Реализация метода для принятия заказа.
    @Override
    public void takeOrder() {
        System.out.println(this.name + " принял заказ.");
        setTakeOrder(true);
    }
}

