package Market;

import Market.Offers.BuyOffer;
import Market.Offers.SellOffer;
import java.util.SortedMap;

public class Market {

    SortedMap<Integer, BuyOffer> buyingOffers;
    SortedMap<Integer, SellOffer> sellingOffers;

}
