// Интерфейс, описывающий поведение рынка.
public interface MarketBehaviour {
    void acceptToMarket(Actor actor);  
    void releaseFromQueue();          
    void update();                     
}

