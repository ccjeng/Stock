
package com.ccjeng.stock.model.quotes;

import java.util.ArrayList;
import java.util.List;

public class Results {

    private List<Quote> quote = new ArrayList<Quote>();

    /**
     * 
     * @return
     *     The quote
     */
    public List<Quote> getQuote() {
        return quote;
    }

    /**
     * 
     * @param quote
     *     The quote
     */
    public void setQuote(List<Quote> quote) {
        this.quote = quote;
    }

}
