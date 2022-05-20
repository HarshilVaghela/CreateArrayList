/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateArrayList;

/**
 *
 * @author harsh
 */
public interface List<E>{
int size( );
boolean isEmpty( );
E get(int i ) throws IndexOutOfBoundsException;
E set (int i, E element) throws IndexOutOfBoundsException;
void add (int i, E element) throws IndexOutOfBoundsException;
E remove(int i ) throws IndexOutOfBoundsException;
}
