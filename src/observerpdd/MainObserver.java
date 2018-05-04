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
public class MainObserver {
    private MainObserver(){        
    }
    public static void main(String[] args) {
        Subject sujeto = new Subject();
        new Observer_A(sujeto);
        new ObserverB(sujeto);
        System.out.println("Leo sujeto " + sujeto.getState());
        System.out.println("Se cambia sujeto");
        sujeto.setState(2);
        
    }
}
