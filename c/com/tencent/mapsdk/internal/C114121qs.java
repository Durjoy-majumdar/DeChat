package com.tencent.mapsdk.internal;

import android.content.Context;

/* renamed from: com.tencent.mapsdk.internal.qs */
public class C114121qs {

    /* renamed from: a */
    private static final int f341595a = 0;

    /* renamed from: b */
    private static int f341596b;

    /* renamed from: a */
    public static void m159236a(Context context) {
        synchronized (C114121qs.class) {
            f341596b = C113958mk.m157962a(context).mo172397b(C0939el.f2196z);
        }
    }

    /* renamed from: a */
    public static void m159237a(Context context, int i) {
        synchronized (C114121qs.class) {
            f341596b = i;
            C113958mk.m157962a(context).mo172393a(C0939el.f2196z, i);
        }
    }

    /* renamed from: a */
    public static int m159235a() {
        int i;
        synchronized (C114121qs.class) {
            i = f341596b;
        }
        return i;
    }
}
