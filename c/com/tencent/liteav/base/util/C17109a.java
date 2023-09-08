package com.tencent.liteav.base.util;

import java.lang.ref.WeakReference;

/* renamed from: com.tencent.liteav.base.util.a */
public final class C17109a<T> {

    /* renamed from: a */
    private final ThreadLocal<T> f46150a = new ThreadLocal<>();

    /* renamed from: b */
    private final C17110a<T> f46151b;

    /* renamed from: c */
    private WeakReference<T> f46152c = new WeakReference<>((Object) null);

    /* renamed from: com.tencent.liteav.base.util.a$a */
    public interface C17110a<T> {
        /* renamed from: a */
        T mo19359a();
    }

    public C17109a(C17110a<T> aVar) {
        this.f46151b = aVar;
    }

    /* renamed from: b */
    private T m16910b() {
        T t = this.f46152c.get();
        if (t == null) {
            synchronized (this) {
                t = this.f46152c.get();
                if (t == null) {
                    t = this.f46151b.mo19359a();
                    this.f46152c = new WeakReference<>(t);
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public final T mo19358a() {
        T t = this.f46150a.get();
        if (t != null) {
            return t;
        }
        T b = m16910b();
        this.f46150a.set(b);
        return b;
    }
}
