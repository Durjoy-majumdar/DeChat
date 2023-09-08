package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.util.SparseArray;
import jk0.C87975a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.c */
public enum C82077c {
    INSTANCE;
    

    /* renamed from: d */
    public final SparseArray<C87975a> f240690d;

    /* renamed from: a */
    public C87975a mo114530a(String str) {
        int hashCode = str.hashCode();
        synchronized (this.f240690d) {
            int indexOfKey = this.f240690d.indexOfKey(hashCode);
            if (indexOfKey >= 0) {
                C87975a valueAt = this.f240690d.valueAt(indexOfKey);
                return valueAt;
            }
            C87975a aVar = new C87975a();
            this.f240690d.put(hashCode, aVar);
            return aVar;
        }
    }
}
