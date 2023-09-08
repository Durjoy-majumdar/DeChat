package com.google.android.gms.internal.measurement;

import com.google.protobuf.C24071y;

final class zzzh {
    private static final Class<?> zzbrl = zztb();

    private static final zzzi zzfj(String str) {
        return (zzzi) zzbrl.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    private static Class<?> zztb() {
        Class<C24071y> cls = C24071y.class;
        try {
            C24071y yVar = C24071y.f69198h;
            return cls;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzzi zztc() {
        if (zzbrl != null) {
            try {
                return zzfj("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzzi.zzbro;
    }
}
