package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceFactory {
	
	
	private InvoiceFactory(){};
	
	  protected static Invoice createInvoice(Id invoiceId, ClientData client){
	  return new Invoice(invoiceId, client);

}
}
