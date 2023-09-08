package com.tencent.p014mm.memory;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.tencent.mm.memory.d */
public abstract class C92705d<T, S> {

    /* renamed from: a */
    public Queue<T> f266810a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public S f266811b;

    public C92705d(S s) {
        this.f266811b = s;
    }
}
