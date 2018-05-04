/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpdd;

/**
 *
 * @author German David
 */
public class ObserverB implements Observer{
    private Subject subject;

    public ObserverB(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("Observer B: sujeto ha cambiado: " + this.subject.getState());
    }
}
