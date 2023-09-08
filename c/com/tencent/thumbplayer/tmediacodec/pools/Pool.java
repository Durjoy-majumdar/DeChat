package com.tencent.thumbplayer.tmediacodec.pools;

public interface Pool<T, Y> {
    void clear();

    boolean isEmpty();

    boolean isFull();

    T obtain(Y y);

    void put(T t);

    void remove(T t);
}
