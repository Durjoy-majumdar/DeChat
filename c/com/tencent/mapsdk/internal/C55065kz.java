package com.tencent.mapsdk.internal;

import java.util.HashMap;

/* renamed from: com.tencent.mapsdk.internal.kz */
public final class C55065kz<T, K> {

    /* renamed from: a */
    private static final int f154612a = 1024;

    /* renamed from: b */
    private HashMap<T, K> f154613b;

    /* renamed from: c */
    private int f154614c = 0;

    /* renamed from: d */
    private int f154615d = 1024;

    /* renamed from: a */
    private void m62174a(int i) {
        this.f154615d = i;
    }

    /* renamed from: b */
    private synchronized void m62175b(T t) {
        HashMap<T, K> hashMap = this.f154613b;
        if (hashMap != null) {
            hashMap.remove(t);
        }
    }

    /* renamed from: a */
    public final synchronized void mo76185a(T t, K k) {
        if (this.f154613b == null) {
            this.f154613b = new HashMap<>();
        }
        this.f154613b.put(t, k);
    }

    /* renamed from: a */
    public final synchronized K mo76184a(T t) {
        HashMap<T, K> hashMap = this.f154613b;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(t);
    }
}
