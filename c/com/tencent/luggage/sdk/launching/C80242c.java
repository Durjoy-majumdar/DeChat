package com.tencent.luggage.sdk.launching;

import android.os.Parcelable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.tencent.luggage.sdk.launching.c */
public abstract class C80242c<R extends Parcelable> {

    /* renamed from: a */
    public final Queue<Runnable> f234922a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public abstract void mo111345a(R r);

    public void finalize() {
        while (!((ConcurrentLinkedQueue) this.f234922a).isEmpty()) {
            try {
                ((Runnable) ((ConcurrentLinkedQueue) this.f234922a).poll()).run();
            } finally {
                super.finalize();
            }
        }
    }
}
