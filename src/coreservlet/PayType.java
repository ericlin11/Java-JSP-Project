package coreservlet;

public class PayType {
	int PayTypeID;
	String PayType;
	double PayAmount;
	
	
	public PayType(){
        this.PayTypeID = 0;
        this.PayType = "";
        this.PayAmount = 0;
        
    }

    public int getPayTypeID() {
        return PayTypeID;
    }
    
    public void setPayTypeID(int payTypeID) {
    	this.PayTypeID = payTypeID;
    }
    
    public String getPayType() {
    	return PayType;
    }
    public void setPayType(String paytype) {
        this.PayType = paytype;
    }
    
    public double getPayAmount() {
    	return PayAmount;
    }
    public void setPayAmount(double payAmount) {
    	this.PayAmount = payAmount;
    }

}
