// Основной класс для запуска программы.
public class program {
    public static void main(String[] args) {
        Market market = new Market();  
        Human ivan = new Human("Иван"); 
        Human marina = new Human("Марина");  

        market.acceptToMarket(ivan);  
        ivan.makeOrder();             
        ivan.takeOrder();             

        market.acceptToMarket(marina);  
        marina.makeOrder();            
        marina.takeOrder();            

        market.update();              
    }
}

