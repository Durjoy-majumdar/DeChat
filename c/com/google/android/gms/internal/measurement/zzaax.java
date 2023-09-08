package com.google.android.gms.internal.measurement;

import com.google.protobuf.C24059v2;

final class zzaax {
    private static final Class<?> zzbtt = zzuh();
    private static final zzabj<?, ?> zzbtu = zzu(false);
    private static final zzabj<?, ?> zzbtv = zzu(true);
    private static final zzabj<?, ?> zzbtw = new zzabl();

    public static void zzh(Class<?> cls) {
        Class<?> cls2;
        if (!zzzq.class.isAssignableFrom(cls) && (cls2 = zzbtt) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    private static zzabj<?, ?> zzu(boolean z) {
        try {
            Class<?> zzui = zzui();
            if (zzui == null) {
                return null;
            }
            return (zzabj) zzui.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static zzabj<?, ?> zzue() {
        return zzbtu;
    }

    public static zzabj<?, ?> zzuf() {
        return zzbtv;
    }

    public static zzabj<?, ?> zzug() {
        return zzbtw;
    }

    private static Class<?> zzuh() {
        try {
            return Class.forName("com.google.protobuf.j0");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzui() {
        return C24059v2.class;
    }
}
