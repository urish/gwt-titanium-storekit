package org.urish.titanium.storekit.client.events;

import java.util.Date;

import org.urish.gwtit.titanium.Blob;
import org.urish.titanium.storekit.client.Payment;
import org.urish.titanium.storekit.client.PurchaseState;

import com.google.gwt.core.client.JavaScriptObject;

public class PurchaseResult extends JavaScriptObject {
	protected PurchaseResult() {
	}

	/**
	 * The Ti.Storekit.Payment object associated with the purchase
	 */
	public final native Payment getPayment()
	/*-{
		return this.payment;
	}-*/;

	/**
	 * The Ti.Storekit.Payment object associated with the purchase
	 */
	public final PurchaseState getState() {
		return PurchaseState.fromNativeCode(getStateNative());
	}

	private final native int getStateNative()
	/*-{
		return this.state;
	}-*/;

	/**
	 * Whether the failure is due to cancellation of the request or not (only
	 * when state == PurchaseState.FAILED)
	 */
	public final native boolean isCancelled()
	/*-{
		return this.cancelled;
	}-*/;

	/**
	 * If not cancelled, what the error message is (only when state ==
	 * PurchaseState.FAILED)
	 */
	public final native String getMessage()
	/*-{
		return this.message;
	}-*/;

	/**
	 * Transaction date (only when state == PurchaseState.PURCHASED or
	 * PurchaseState.RESTORED)
	 */
	public final native Date getDate()
	/*-{
		return this.date;
	}-*/;

	/**
	 * The transaction identifier (only when state == PurchaseState.PURCHASED or
	 * PurchaseState.RESTORED)
	 */
	public final native String getIdentifier()
	/*-{
		return this.identifier;
	}-*/;

	/**
	 * A blob of type "text/json" which contains the receipt information for the
	 * purchase (only when state == PurchaseState.PURCHASED or
	 * PurchaseState.RESTORED)
	 */
	public final native Blob getReceipt()
	/*-{
		return this.receipt;
	}-*/;
}
