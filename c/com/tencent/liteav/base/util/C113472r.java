package com.tencent.liteav.base.util;

import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.base.util.r */
public final class C113472r<T> {

    /* renamed from: a */
    private T f339535a;

    /* renamed from: b */
    private Callable<T> f339536b;

    public C113472r(Callable<T> callable) {
        this.f339536b = callable;
    }

    /* renamed from: a */
    public final void mo169972a(T t) {
        synchronized (this) {
            this.f339535a = t;
        }
    }

    /* renamed from: a */
    public final T mo169971a() {
        T t = this.f339535a;
        if (t instanceof String) {
            if (!TextUtils.isEmpty((CharSequence) t)) {
                return this.f339535a;
            }
        } else if (t != null) {
            return t;
        }
        synchronized (this) {
            T t2 = this.f339535a;
            if (t2 instanceof String) {
                if (!TextUtils.isEmpty((CharSequence) t2)) {
                    T t3 = this.f339535a;
                    return t3;
                }
            } else if (t2 != null) {
                return t2;
            }
            try {
                this.f339535a = this.f339536b.call();
            } catch (Exception e) {
                LiteavLog.m16898e("Stash", "Get value failed. msg:" + e.getMessage());
            }
            T t4 = this.f339535a;
            return t4;
        }
    }
}
