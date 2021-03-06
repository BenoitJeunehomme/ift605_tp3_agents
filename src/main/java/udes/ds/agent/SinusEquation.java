/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udes.ds.agent;

import udes.ds.agent.AbstractEquation;
import udes.ds.agent.CosinusEquation;

/**
 *
 * @author Bruno-Pier
 */
public class SinusEquation extends AbstractEquation{
    
    private static final long serialVersionUID = 1L;
    private AbstractEquation _inside;
    
    public SinusEquation(AbstractEquation inside){
        super();
        _inside = inside;
    }
    
    public AbstractEquation getInside() {
        return _inside;
    }
    
    public double getFunctionValue(double x) {
        return Math.sin(_inside.getFunctionValue(x));
    }    
    
    public String getUserReadableString() {
        return new String("sin(" + _inside.getUserReadableString() + ")");
    }
}
