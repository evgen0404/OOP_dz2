public abstract class Actor {
    protected String name;           
    protected boolean isMakeOrder;   
    protected boolean isTakeOrder;   

   
    public Actor(String name) {
        this.name = name;
    }

    public abstract void setMakeOrder(boolean status);

    public abstract void setTakeOrder(boolean status);

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

   
    public String getName() {
        return name;
    }
}