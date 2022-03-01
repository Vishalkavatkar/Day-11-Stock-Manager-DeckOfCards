package stockManager;

public class StockManager {
	private String stockName;
	private String numberOfShare;
	private String sharePrice;

	// constructor
	public StockManager(String stockName, String numberOfShare, String sharePrice) {
		super();
		this.stockName = stockName;
		this.numberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
	}

	//Getter-Setter

	public String getStockName() {
		return stockName;
	}


	public void setStockName(String stockName) {
		this.stockName = stockName;
	}


	public String getNumberOfShare() {
		return numberOfShare;
	}


	public void setNumberOfShare(String numberOfShare) {
		this.numberOfShare = numberOfShare;
	}


	public String getSharePrice() {
		return sharePrice;
	}


	public void setSharePrice(String sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "StockManager [stockName=" + stockName + ", numberOfShare=" + numberOfShare + ", sharePrice="
				+ sharePrice + "]";
	}
}