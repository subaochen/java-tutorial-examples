package cn.edu.sdut.softlab;

/**
 * Created by subaochen on 16-12-23.
 */
public class GenericBox<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
