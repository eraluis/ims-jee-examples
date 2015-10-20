package edu.fup.ims.bo;

import edu.fup.ims.model.CreditCard;
import edu.fup.ims.model.Transaction;
import javax.ejb.Local;

/**
 *
 * @author Luis Eraso
 */
@Local
public interface TransactionLBO extends CrudBO<Transaction> {

	public String createTransaction(CreditCard creditCard, double value);

}
