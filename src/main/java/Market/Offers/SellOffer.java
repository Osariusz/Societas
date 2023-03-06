package Market.Offers;

import Agent.Pop;

public class SellOffer{
    int amount;
    String resource;
    int priceForOne;

    Pop seller;

    public void transferResources(Pop buyer, int sold){
        buyer.addResources(resource,sold);
        seller.addResources(resource,-sold);
    }
}
