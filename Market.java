import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> queue;  

   
    public Market() {
        this.queue = new ArrayList<>();
    }

   
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " вошёл в магазин.");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " находится в очереди.");
    }

   
    @Override
    public void releaseFromQueue() {
        Actor actor = this.queue.remove(0);
        System.out.println(actor.getName() + " выходит из очереди.");
    }

  
    @Override
    public void update() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && actor.isTakeOrder()) {
                releaseFromQueue();
                System.out.println(actor.getName() + " получил заказ.");
            }
        }
    }
}
