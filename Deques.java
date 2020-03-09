/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uady.estructuras.lineales.Deques;

import java.util.NoSuchElementException;
import mx.uady.estructuras.lineales.Nodo;
import mx.uady.estructuras.lineales.NodoDoble;
import mx.uady.estructuras.lineales.NodoGenerico;

/**
 *
 * @author jorge canche
 */
public class Deques<T> {
    
     private int size;
    private NodoDoble<T> nfrente;
    private NodoDoble<T>nfinal;
    
    
    public Deques(){
    
    this.size=0;
    this.nfinal=null;
    this.nfrente=null;
    
    }
    
    
    public void addFirst(T valor){
    

        if(nfrente==null){
        nfrente = new NodoDoble(valor,nfrente,null);
        nfinal = nfrente;
        
        }
        
        
        NodoDoble<T> temp = new NodoDoble(valor, nfrente, null);
        
        nfrente.setPrevious(temp);
        nfrente = temp;
        size++;
    
    }
    
    public void addLast(T valor){
        
        if (nfinal==null) {
            nfinal = new NodoDoble(valor, null, null);
            nfrente = nfinal;
            
        }
    
        NodoDoble<T> temp = new NodoDoble(valor,null,nfinal);
        nfinal.setNext(temp);
        nfinal = temp;
        size++;
    }
    
    
    public T popFirst(){
    
        if (nfrente==null) {
            
            throw new NoSuchElementException("No hay elementos en la pila");
            
        }
        
        NodoDoble<T> temp = nfrente;
        nfrente = nfrente.getNext();
        size--;
        return temp.getValor();
    
    
    }
    
    public T popLast(){
    
        if (nfinal==null) {
            
            throw new NoSuchElementException("No hay elementos en la pila");
            
        }
        
        NodoDoble<T> temp = nfinal;
        nfinal = nfinal.getPrevious();
        size--;
        return temp.getValor();
    
    
    
    
    }
    
   
    public T peekFirst(){
    
         if (this.nfrente==null) {
            
            throw new NoSuchElementException("No hay elementos en la pila");
        }
    
        return nfrente.getValor();
        
    
    }
    
    public T peekLast(){
    
         if (this.nfinal==null) {
            
            throw new NoSuchElementException("No hay elementos en la pila");
        }
    
        return nfinal.getValor();
        
    
    
    }
    
    public int  Size(){
    
        return size;
    
    }
    
    public void imprimirInicio(){
    
         if (nfrente==null) {
            
            return; 
            
        }
        
        NodoDoble<T> temp = nfrente;
        while(temp!= null){
            System.out.println(temp);
            temp= temp.getNext();
        
        }
    
    
    }
    
    
    public static void main(String[] args) {
        
        Deques<Integer> tabla = new Deques();
        
        tabla.addFirst(7);
        tabla.addFirst(12);
        tabla.addLast(5);
        
        
        tabla.imprimirInicio();
        System.out.println(tabla.Size());
        System.out.println(tabla.peekLast());
        tabla.popLast();
        tabla.popLast();
        tabla.popLast();
        System.out.println(tabla.Size());
        
        
        
        
    }
    
}
