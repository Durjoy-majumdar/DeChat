package com.google.android.gms.internal.measurement;

import com.google.protobuf.C23814c0;

final class zzzl {
    private static final zzzj<?> zzbrq = new zzzk();
    private static final zzzj<?> zzbrr = zztf();

    private static zzzj<?> zztf() {
        Class<C23814c0> cls = C23814c0.class;
        try {
            int i = C23814c0.f68216b;
            return (zzzj) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static zzzj<?> zztg() {
        return zzbrq;
    }

    public static zzzj<?> zzth() {
        zzzj<?> zzzj = zzbrr;
        if (zzzj != null) {
            return zzzj;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
