package org.urish.titanium.storekit.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Ti.Storekit module object which represents an asynchronous request to the
 * in-app purchase store for an ongoing purchase, which produces a receipt.
 */
public class ReceiptRequest extends JavaScriptObject {
	protected ReceiptRequest() {
	}

	/**
	 * Cancels an active request to the store.
	 */
	public native final void cancel()
	/*-{
		return this.cancel();
	}-*/;
}
