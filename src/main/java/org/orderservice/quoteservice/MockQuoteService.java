package org.orderservice.quoteservice;

import java.util.HashMap;
import java.util.Map;

public class MockQuoteService implements QuoteService {
    private Map<String, QuoteServiceProvision> provisions = new HashMap<String, QuoteServiceProvision>();

    @Override
    public double getPrice(String symbol) {
        if (provisions.containsKey(symbol)) {
            return provisions.get(symbol).getPrice();
        } else {
            return 200.;
        }
    }

    public void addQuoteProvision(QuoteServiceProvision provision) {
        provisions.put(provision.getSymbol(), provision);
    }

    public void clear() {
        provisions.clear();
    }
}
