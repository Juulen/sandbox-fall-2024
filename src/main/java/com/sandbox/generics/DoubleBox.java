package com.sandbox.generics;

public class DoubleBox {

    private double contents;

    public DoubleBox(){

    }

    public double getContents() {
        return contents;
    }

    public void setContents(double contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DoubleBox{");
        sb.append("contents=").append(contents);
        sb.append('}');
        return sb.toString();
    }
}
