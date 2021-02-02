package org.basic.datastructure.array;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 定义一个数组
 * 支持元素的新增修改删除
 *      1.数组元素满了，进行扩容
 *      2.删除数组数据时,将大于删除下标的数据整体往左移,并且将最后一个置空
 *
 *
 */
public class MyArray {
    private Integer[] array;
    private int size;

    public MyArray(int capacity) {
        this.array = new Integer[capacity];
        this.size = 0;
    }

    public void insert(int index,int value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("插入失败");
        }

        if (size >= array.length) {
            resize();
        }
        for (int i = size-1; i >=index ; i--) {
            array[i+1] = array[i];
        }
        array[index] = value;
        size++;
    }

    /**
     * 从index下标以后的数据往前挪
     */
    public void remove(int index){
        if (index >= size) {
            throw new IndexOutOfBoundsException("delete failed!");
        }
        for (int i = index; i < size -1; i++) {
            array[i ] = array[i+1];
        }
        array[size - 1] = null;
        size--;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.err.println(array[i]);
        }
    }

    public void resize() {
        Integer[] newArray = new Integer[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(4);
        myArray.insert(0,3);
        myArray.insert(1,7);
        myArray.insert(2,9);
        myArray.insert(3,5);
        myArray.insert(1,6);
        myArray.remove(1);
        myArray.print();
    }

}
