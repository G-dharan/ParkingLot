package models;

import java.util.List;

public class Payment extends BaseModel {
	private int paymentId;
	private List<PaymentMode> mode;
	private PaymentStatus paymentStatus;
	private int amount;
	private int referenceId;
	
}
