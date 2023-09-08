package com.tencent.mapsdk.internal;

import android.content.Context;
import android.util.Log;

/* renamed from: com.tencent.mapsdk.internal.kj */
public final class C80345kj {

    /* renamed from: a */
    public static final String[] f235205a = {C114207sl.f341929a, "txnavengine"};

    /* renamed from: b */
    private static final String f235206b = "LibraryLoader";

    /* renamed from: a */
    private static void m97852a(Context context) {
        for (String a : f235205a) {
            m97853a(context, a);
        }
    }

    /* renamed from: a */
    public static void m97853a(Context context, String str) {
        try {
            System.loadLibrary(str);
            Log.isLoggable(f235206b, 4);
        } catch (UnsatisfiedLinkError unused) {
            C80346kk.m97857a(context, str);
            Log.isLoggable(f235206b, 4);
        }
    }
}
