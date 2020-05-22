package edu.umb.cs680.hw13.Multicast;

import org.junit.jupiter.api.Test;

class MulticastTest {
	PieChartObserver piechartObserver = new PieChartObserver();
	TableObserver tableObserver = new TableObserver();
	TableObserver threeDObserver = new TableObserver();
	StockQuoteObservable stockMulticast = new StockQuoteObservable();
	DJIAQuoteObservable djiaMulticast = new DJIAQuoteObservable();

	@Test
	public void DJIATest() {

		djiaMulticast.addObserver(piechartObserver);
		djiaMulticast.addObserver(tableObserver);
		djiaMulticast.addObserver(threeDObserver);
		djiaMulticast.changeQuote(100);
		djiaMulticast.changeQuote(200);
		
	}
	
	@Test
	void verifyStock() {
		
		stockMulticast.addObserver(piechartObserver);
		stockMulticast.addObserver(tableObserver);
		stockMulticast.addObserver(threeDObserver);
		stockMulticast.changeQuote("rtp", 10);
		stockMulticast.changeQuote("rtp1", 27);
	
	}
}
