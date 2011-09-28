package org.urish.titanium.storekit.client.events;

import com.google.gwt.core.client.JavaScriptObject;

public class VerifyReceiptResult extends JavaScriptObject {
	protected VerifyReceiptResult() {
	}

	/**
	 * Whether or not the request succeeded
	 */
	public final native boolean isSuccess()
	/*-{
		return this.success;
	}-*/;

	/**
	 * Whether or not the receipt is valid
	 */
	public final native boolean isValid()
	/*-{
		return this.valid;
	}-*/;

	/**
	 * The receipt identifier
	 */
	public final native String getReceipt()
	/*-{
		return this.receipt;
	}-*/;

	/**
	 * If success is false, the error message
	 */
	public final native String getMessage()
	/*-{
		return this.message;
	}-*/;
}
