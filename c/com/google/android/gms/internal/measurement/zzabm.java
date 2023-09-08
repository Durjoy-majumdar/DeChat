package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzabm {
    private static final Logger logger = Logger.getLogger(zzabm.class.getName());
    private static final Class<?> zzbqv = zzyv.zzsw();
    private static final Unsafe zzbtj;
    private static final boolean zzbun;
    private static final boolean zzbuo;
    private static final zzd zzbup;
    private static final boolean zzbuq = zzut();
    private static final boolean zzbur = zzus();
    private static final long zzbus = ((long) zzi(byte[].class));
    private static final long zzbut;
    private static final long zzbuu;
    private static final long zzbuv;
    private static final long zzbuw;
    private static final long zzbux;
    private static final long zzbuy;
    private static final long zzbuz;
    private static final long zzbva;
    private static final long zzbvb;
    private static final long zzbvc;
    private static final long zzbvd;
    private static final long zzbve;
    private static final long zzbvf = zza(zzuu());
    private static final long zzbvg;
    private static final boolean zzbvh = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    public static final class zza extends zzd {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }
    }

    public static final class zzb extends zzd {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }
    }

    public static final class zzc extends zzd {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }
    }

    public static abstract class zzd {
        public Unsafe zzbvi;

        public zzd(Unsafe unsafe) {
            this.zzbvi = unsafe;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ec  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.measurement.zzabm> r6 = com.google.android.gms.internal.measurement.zzabm.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            logger = r6
            sun.misc.Unsafe r6 = zzur()
            zzbtj = r6
            java.lang.Class r7 = com.google.android.gms.internal.measurement.zzyv.zzsw()
            zzbqv = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = zzk(r7)
            zzbun = r7
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = zzk(r8)
            zzbuo = r8
            r9 = 0
            if (r6 != 0) goto L_0x0039
        L_0x0037:
            r7 = r9
            goto L_0x0054
        L_0x0039:
            boolean r10 = com.google.android.gms.internal.measurement.zzyv.zzsv()
            if (r10 == 0) goto L_0x004f
            if (r7 == 0) goto L_0x0047
            com.google.android.gms.internal.measurement.zzabm$zzb r7 = new com.google.android.gms.internal.measurement.zzabm$zzb
            r7.<init>(r6)
            goto L_0x0054
        L_0x0047:
            if (r8 == 0) goto L_0x0037
            com.google.android.gms.internal.measurement.zzabm$zza r7 = new com.google.android.gms.internal.measurement.zzabm$zza
            r7.<init>(r6)
            goto L_0x0054
        L_0x004f:
            com.google.android.gms.internal.measurement.zzabm$zzc r7 = new com.google.android.gms.internal.measurement.zzabm$zzc
            r7.<init>(r6)
        L_0x0054:
            zzbup = r7
            boolean r6 = zzut()
            zzbuq = r6
            boolean r6 = zzus()
            zzbur = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = zzi(r6)
            long r6 = (long) r6
            zzbus = r6
            int r6 = zzi(r5)
            long r6 = (long) r6
            zzbut = r6
            int r5 = zzj(r5)
            long r5 = (long) r5
            zzbuu = r5
            int r5 = zzi(r4)
            long r5 = (long) r5
            zzbuv = r5
            int r4 = zzj(r4)
            long r4 = (long) r4
            zzbuw = r4
            int r4 = zzi(r3)
            long r4 = (long) r4
            zzbux = r4
            int r3 = zzj(r3)
            long r3 = (long) r3
            zzbuy = r3
            int r3 = zzi(r2)
            long r3 = (long) r3
            zzbuz = r3
            int r2 = zzj(r2)
            long r2 = (long) r2
            zzbva = r2
            int r2 = zzi(r1)
            long r2 = (long) r2
            zzbvb = r2
            int r1 = zzj(r1)
            long r1 = (long) r1
            zzbvc = r1
            int r1 = zzi(r0)
            long r1 = (long) r1
            zzbvd = r1
            int r0 = zzj(r0)
            long r0 = (long) r0
            zzbve = r0
            java.lang.reflect.Field r0 = zzuu()
            long r0 = zza(r0)
            zzbvf = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = zza(r0, r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.Class r1 = r0.getType()
            java.lang.Class<char[]> r2 = char[].class
            if (r1 != r2) goto L_0x00dc
            r9 = r0
        L_0x00dc:
            long r0 = zza(r9)
            zzbvg = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            zzbvh = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzabm.<clinit>():void");
    }

    private zzabm() {
    }

    private static long zza(Field field) {
        zzd zzd2;
        if (field == null || (zzd2 = zzbup) == null) {
            return -1;
        }
        return zzd2.zzbvi.objectFieldOffset(field);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static int zzi(Class<?> cls) {
        if (zzbur) {
            return zzbup.zzbvi.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        if (zzbur) {
            return zzbup.zzbvi.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean zzk(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzyv.zzsv()) {
            return false;
        }
        try {
            Class<?> cls3 = zzbqv;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe zzur() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzabn());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzus() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = zzbtj;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getInt", new Class[]{cls, cls3});
            cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
            cls2.getMethod("getObject", new Class[]{cls, cls3});
            cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
            if (zzyv.zzsv()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzut() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = zzbtj;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (zzuu() == null) {
                return false;
            }
            if (zzyv.zzsv()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field zzuu() {
        Field zza2;
        if (zzyv.zzsv() && (zza2 = zza(Buffer.class, "effectiveDirectAddress")) != null) {
            return zza2;
        }
        Field zza3 = zza(Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }
}
