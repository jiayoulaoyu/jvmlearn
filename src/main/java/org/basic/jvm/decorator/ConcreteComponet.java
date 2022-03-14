package org.basic.jvm.decorator;

/**
 * @Description:
 * @author: yqg
 * @date: 2022.03.11
 */
public class ConcreteComponet implements Componet{
    @Override
    public void display() {
        System.err.println("具体展示");
    }
}
