package org.urish.titanium.storekit.client;

import java.sql.Blob;

import org.urish.titanium.storekit.client.events.PurchaseHandler;
import org.urish.titanium.storekit.client.events.RequestProductsHandler;
import org.urish.titanium.storekit.client.events.RestoredCompletedTransactionsHandler;

import com.google.gwt.core.client.JavaScriptObject;

class StoreKitImpl extends JavaScriptObject {
	protected StoreKitImpl() {
	}

	public static native final StoreKitImpl loadModule()
	/*-{
		var result = require("ti.storekit");
		return result;
	}-*/;
	
	public native final int getConst_PURCHASING() 
	/*-{
		return this.PURCHASING;
	}-*/;

	public native final int getConst_PURCHASED() 
	/*-{
		return this.PURCHASED;
	}-*/;

	public native final int getConst_FAILED() 
	/*-{
		return this.FAILED;
	}-*/;

	public native final int getConst_RESTORED() 
	/*-{
		return this.RESTORED;
	}-*/;

	public native final ProductRequest requestProducts(String[] ids, RequestProductsHandler callback)
	/*-{
		return this.requestProducts(ids, function(e) {
			callback.@org.urish.titanium.storekit.client.events.RequestProductsHandler::onRequestProductsResult(Lorg/urish/titanium/storekit/client/events/RequestProductsResult;)(e);
		});
	}-*/;

	public native final Payment purchase(Product product, PurchaseHandler callback)
	/*-{
		return this.purchase(product, function(e) {
			callback.@org.urish.titanium.storekit.client.events.PurchaseHandler::onPurchaseResult(Lorg/urish/titanium/storekit/client/events/PurchaseResult;)(e);
		});
	}-*/;

	public native final ReceiptRequest verifyReceipt(Blob receipt, Object callback, boolean sandbox, String sharedSecret) 
	/*-{
		return this.verifyReceipt({receipt: receipt, sandbox: sandbox, sharedSecret: sharedSecret, callback: function(e) {
			callback.@org.urish.titanium.storekit.client.events.VerifyReceiptHandler::onVerifyReceiptResult(Lorg/urish/titanium/storekit/client/events/VerifyReceiptResult;)(e);
		}});
	}-*/;

	public native final ReceiptRequest verifyReceipt(Blob receipt, Object callback) 
	/*-{
		return this.verifyReceipt({receipt: receipt, callback: function(e) {
			callback.@org.urish.titanium.storekit.client.events.VerifyReceiptHandler::onVerifyReceiptResult(Lorg/urish/titanium/storekit/client/events/VerifyReceiptResult;)(e);
		}});
	}-*/;

	public native final void restoreCompletedTransactions() 
	/*-{
		return this.restoreCompletedTransactions();
	}-*/;

	public native final boolean getCanMakePayments() 
	/*-{
		return this.canMakePayments;
	}-*/;

	public native final void addRestoredCompletedTransactionsHandler(
			RestoredCompletedTransactionsHandler restoredCompletedTransactionsHandler)
	/*-{
		this.addEventListener('restoredCompletedTransactions', function(e) {
			callback.@org.urish.titanium.storekit.client.events.RestoredCompletedTransactionsHandler::onRestoredCompletedTransactions(Lorg/urish/titanium/storekit/client/events/RestoredCompletedTransactionsEvent;)(e);
		});
	}-*/;
}
