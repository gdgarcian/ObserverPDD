/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpdd;

import java.util.*;
/**
 *
 * @author German David
 */
public class Observable {
    private final Set<Observer> observers = new HashSet<Observer>();
    
    public void addObserver(Observer observador){
        this.observers.add(observador);
    }
    public void removeObserver(Observer observador){
        this.observers.remove(observador);
    }
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
