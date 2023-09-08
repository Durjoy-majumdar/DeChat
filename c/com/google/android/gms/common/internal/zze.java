package com.google.android.gms.common.internal;

import p1042u.C111058g;

final class zze extends C111058g {
    private final /* synthetic */ ExpirableLruCache zzss;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zze(ExpirableLruCache expirableLruCache, int i) {
        super(i);
        this.zzss = expirableLruCache;
    }

    public final Object create(Object obj) {
        return this.zzss.create(obj);
    }

    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        this.zzss.entryRemoved(z, obj, obj2, obj3);
        synchronized (this.zzss.mLock) {
            if (obj3 == null) {
                try {
                    if (this.zzss.zzct()) {
                        this.zzss.zzsq.remove(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (obj3 == null && this.zzss.zzcu()) {
                this.zzss.zzsr.remove(obj);
            }
        }
    }

    public final int sizeOf(Object obj, Object obj2) {
        return this.zzss.sizeOf(obj, obj2);
    }
}
