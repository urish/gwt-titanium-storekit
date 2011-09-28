package org.urish.titanium.storekit.client;

import java.sql.Blob;
import java.util.Date;

public interface Transaction {
	/**
	 * The current state of the transaction.
	 */
	public PurchaseState getState();

	/**
	 * The date the transaction was added to the App Store's payment queue.
	 */
	public Date getDate();

	/**
	 * A string that uniquely identifies a successful payment transaction.
	 */
	public String getIdentifier();

	/**
	 * A blob of type "text/json" which contains the receipt information for the
	 * purchase.
	 */
	public Blob getReceipt();
}
