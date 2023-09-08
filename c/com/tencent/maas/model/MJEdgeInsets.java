package com.tencent.maas.model;

public class MJEdgeInsets {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public MJEdgeInsets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public int getBottom() {
        return this.bottom;
    }

    public int getLeft() {
        return this.left;
    }

    public int getRight() {
        return this.right;
    }

    public int getTop() {
        return this.top;
    }

    public String toString() {
        return "MJEdgeInsets{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }
}
