package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.C17236k;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;

/* renamed from: com.tencent.liteav.videobase.frame.h */
public abstract class C17229h<T extends C17236k> {

    /* renamed from: a */
    public final Deque<T> f46577a = new LinkedList();

    /* renamed from: b */
    public final Semaphore f46578b = new Semaphore(1);

    /* renamed from: c */
    public volatile boolean f46579c = false;

    /* renamed from: d */
    private final C17228g<T> f46580d = new C17228g<T>() {
        /* renamed from: a */
        public final void mo20189a(T t) {
            C17229h.this.f46578b.release();
            synchronized (C17229h.this) {
                if (!C17229h.this.f46579c) {
                    C17229h.this.f46577a.addFirst(t);
                }
            }
        }
    };

    /* renamed from: a */
    public final T mo20203a() {
        T a;
        this.f46578b.acquire();
        synchronized (this) {
            a = !this.f46577a.isEmpty() ? (C17236k) this.f46577a.removeFirst() : mo20204a(this.f46580d);
        }
        if (a.retain() != 1) {
            LiteavLog.m16900e("LimitedFramePool", "invalid reference count for %s", a);
        }
        return a;
    }

    /* renamed from: a */
    public abstract T mo20204a(C17228g<T> gVar);

    /* renamed from: b */
    public final void mo20205b() {
        ArrayList arrayList;
        this.f46579c = true;
        synchronized (this) {
            arrayList = new ArrayList(this.f46577a);
            this.f46577a.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
