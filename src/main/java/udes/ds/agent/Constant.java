/**
 * udes.ds.rmi
 * Constant.java
 * 3 sept. 08
 */
package udes.ds.agent;


/**
 * Stores a fix value for x or y
 * 
 * @author      Luc Bergevin
 * @version     1.0         
 */
public class Constant extends AbstractEquation {
	
	private static final long	 serialVersionUID	= 1L;
	private double _value;

	public Constant(double value) {
		super();
		_value = value;
	}

	public double getValue() {
		return _value;
	}

	/**
	 */
	public double getFunctionValue(double x) {
		return _value;
	}

	/**
	 */
	public String getUserReadableString() {
		return Double.toString(_value);
	}
	
}
