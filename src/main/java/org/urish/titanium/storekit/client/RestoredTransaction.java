package org.urish.titanium.storekit.client;

import java.util.Date;

import org.urish.gwtit.titanium.Blob;

import com.google.gwt.core.client.JavaScriptObject;

public class RestoredTransaction extends JavaScriptObject implements Transaction {
	protected RestoredTransaction() {
	}

	/**
	 * The current state of the transaction; most likely To.Storekit.RESTORED.
	 */
	@Override
	public PurchaseState getState() {
		return PurchaseState.fromNativeCode(getStateNative());
	}

	private final native int getStateNative()
	/*-{
		return this.state;
	}-*/;

	/**
	 * A string that uniquely identifies a successful payment transaction.
	 */
	@Override
	public final native String getIdentifier()
	/*-{
		return this.identifier;
	}-*/;

	/**
	 * A string used to identify a product that can be purchased from within
	 * your application.
	 */
	public final native String getProductIdentifier()
	/*-{
		return this.productIdentifier;
	}-*/;

	/**
	 * The number of items the user wants to purchase.
	 */
	public final native int getQuantity()
	/*-{
		return this.quantity;
	}-*/;

	/**
	 * The date the transaction was added to the App Store's payment queue.
	 */
	@Override
	public final native Date getDate()
	/*-{
	 	return this.date;
	}-*/;

	/**
	 * A blob of type "text/json" which contains the receipt information for the
	 * purchase.
	 */
	@Override
	public final native Blob getReceipt()
	/*-{
	 	return this.receipt;
	}-*/;
}
