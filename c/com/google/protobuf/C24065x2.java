package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.x2 */
public final class C24065x2 {

    /* renamed from: a */
    public static final Logger f69188a = Logger.getLogger(C24065x2.class.getName());

    /* renamed from: b */
    public static final Unsafe f69189b;

    /* renamed from: c */
    public static final Class<?> f69190c = C16987e.f45993a;

    /* renamed from: d */
    public static final C24069e f69191d;

    /* renamed from: e */
    public static final boolean f69192e;

    /* renamed from: f */
    public static final boolean f69193f;

    /* renamed from: g */
    public static final long f69194g = ((long) m29975b(byte[].class));

    /* renamed from: h */
    public static final long f69195h;

    /* renamed from: i */
    public static final boolean f69196i;

    /* renamed from: com.google.protobuf.x2$b */
    public static final class C24066b extends C24069e {
        public C24066b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo38402c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo38403d(Object obj, long j) {
            return C24065x2.f69196i ? C24065x2.m29982i(obj, j) != 0 : C24065x2.m29983j(obj, j) != 0;
        }

        /* renamed from: e */
        public byte mo38404e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo38405f(Object obj, long j) {
            return C24065x2.f69196i ? C24065x2.m29982i(obj, j) : C24065x2.m29983j(obj, j);
        }

        /* renamed from: g */
        public double mo38406g(Object obj, long j) {
            return Double.longBitsToDouble(mo38416j(obj, j));
        }

        /* renamed from: h */
        public float mo38407h(Object obj, long j) {
            return Float.intBitsToFloat(mo38415i(obj, j));
        }

        /* renamed from: l */
        public Object mo38408l(Field field) {
            try {
                return field.get((Object) null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        /* renamed from: n */
        public void mo38409n(Object obj, long j, boolean z) {
            if (C24065x2.f69196i) {
                C24065x2.m29993t(obj, j, z ? (byte) 1 : 0);
            } else {
                C24065x2.m29994u(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: o */
        public void mo38410o(Object obj, long j, byte b) {
            if (C24065x2.f69196i) {
                C24065x2.m29993t(obj, j, b);
            } else {
                C24065x2.m29994u(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo38411p(Object obj, long j, double d) {
            mo38420s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo38412q(Object obj, long j, float f) {
            mo38419r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: com.google.protobuf.x2$c */
    public static final class C24067c extends C24069e {
        public C24067c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo38402c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo38403d(Object obj, long j) {
            return C24065x2.f69196i ? C24065x2.m29982i(obj, j) != 0 : C24065x2.m29983j(obj, j) != 0;
        }

        /* renamed from: e */
        public byte mo38404e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo38405f(Object obj, long j) {
            return C24065x2.f69196i ? C24065x2.m29982i(obj, j) : C24065x2.m29983j(obj, j);
        }

        /* renamed from: g */
        public double mo38406g(Object obj, long j) {
            return Double.longBitsToDouble(mo38416j(obj, j));
        }

        /* renamed from: h */
        public float mo38407h(Object obj, long j) {
            return Float.intBitsToFloat(mo38415i(obj, j));
        }

        /* renamed from: l */
        public Object mo38408l(Field field) {
            try {
                return field.get((Object) null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        /* renamed from: n */
        public void mo38409n(Object obj, long j, boolean z) {
            if (C24065x2.f69196i) {
                C24065x2.m29993t(obj, j, z ? (byte) 1 : 0);
            } else {
                C24065x2.m29994u(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: o */
        public void mo38410o(Object obj, long j, byte b) {
            if (C24065x2.f69196i) {
                C24065x2.m29993t(obj, j, b);
            } else {
                C24065x2.m29994u(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo38411p(Object obj, long j, double d) {
            mo38420s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo38412q(Object obj, long j, float f) {
            mo38419r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: com.google.protobuf.x2$d */
    public static final class C24068d extends C24069e {
        public C24068d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo38402c(long j, byte[] bArr, long j2, long j3) {
            this.f69197a.copyMemory((Object) null, j, bArr, C24065x2.f69194g + j2, j3);
        }

        /* renamed from: d */
        public boolean mo38403d(Object obj, long j) {
            return this.f69197a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public byte mo38404e(long j) {
            return this.f69197a.getByte(j);
        }

        /* renamed from: f */
        public byte mo38405f(Object obj, long j) {
            return this.f69197a.getByte(obj, j);
        }

        /* renamed from: g */
        public double mo38406g(Object obj, long j) {
            return this.f69197a.getDouble(obj, j);
        }

        /* renamed from: h */
        public float mo38407h(Object obj, long j) {
            return this.f69197a.getFloat(obj, j);
        }

        /* renamed from: l */
        public Object mo38408l(Field field) {
            return mo38417k(this.f69197a.staticFieldBase(field), this.f69197a.staticFieldOffset(field));
        }

        /* renamed from: n */
        public void mo38409n(Object obj, long j, boolean z) {
            this.f69197a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public void mo38410o(Object obj, long j, byte b) {
            this.f69197a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public void mo38411p(Object obj, long j, double d) {
            this.f69197a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public void mo38412q(Object obj, long j, float f) {
            this.f69197a.putFloat(obj, j, f);
        }
    }

    /* renamed from: com.google.protobuf.x2$e */
    public static abstract class C24069e {

        /* renamed from: a */
        public Unsafe f69197a;

        public C24069e(Unsafe unsafe) {
            this.f69197a = unsafe;
        }

        /* renamed from: a */
        public final int mo38413a(Class<?> cls) {
            return this.f69197a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo38414b(Class<?> cls) {
            return this.f69197a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo38402c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract boolean mo38403d(Object obj, long j);

        /* renamed from: e */
        public abstract byte mo38404e(long j);

        /* renamed from: f */
        public abstract byte mo38405f(Object obj, long j);

        /* renamed from: g */
        public abstract double mo38406g(Object obj, long j);

        /* renamed from: h */
        public abstract float mo38407h(Object obj, long j);

        /* renamed from: i */
        public final int mo38415i(Object obj, long j) {
            return this.f69197a.getInt(obj, j);
        }

        /* renamed from: j */
        public final long mo38416j(Object obj, long j) {
            return this.f69197a.getLong(obj, j);
        }

        /* renamed from: k */
        public final Object mo38417k(Object obj, long j) {
            return this.f69197a.getObject(obj, j);
        }

        /* renamed from: l */
        public abstract Object mo38408l(Field field);

        /* renamed from: m */
        public final long mo38418m(Field field) {
            return this.f69197a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo38409n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo38410o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo38411p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo38412q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo38419r(Object obj, long j, int i) {
            this.f69197a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo38420s(Object obj, long j, long j2) {
            this.f69197a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo38421t(Object obj, long j, Object obj2) {
            this.f69197a.putObject(obj, j, obj2);
        }
    }

    /* renamed from: com.google.protobuf.x2$a */
    public class C24070a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0277, code lost:
        r1 = f69191d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074 A[SYNTHETIC, Splitter:B:13:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0131 A[SYNTHETIC, Splitter:B:38:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x028d  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<com.google.protobuf.x2> r0 = com.google.protobuf.C24065x2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f69188a = r0
            sun.misc.Unsafe r0 = m29989p()
            f69189b = r0
            java.lang.Class<?> r8 = com.google.protobuf.C16987e.f45993a
            f69190c = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m29978e(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r11 = m29978e(r10)
            if (r0 != 0) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            boolean r12 = com.google.protobuf.C16987e.m16777a()
            if (r12 == 0) goto L_0x004b
            if (r9 == 0) goto L_0x0041
            com.google.protobuf.x2$c r9 = new com.google.protobuf.x2$c
            r9.<init>(r0)
            goto L_0x0050
        L_0x0041:
            if (r11 == 0) goto L_0x0049
            com.google.protobuf.x2$b r9 = new com.google.protobuf.x2$b
            r9.<init>(r0)
            goto L_0x0050
        L_0x0049:
            r9 = 0
            goto L_0x0050
        L_0x004b:
            com.google.protobuf.x2$d r9 = new com.google.protobuf.x2$d
            r9.<init>(r0)
        L_0x0050:
            f69191d = r9
            java.lang.String r9 = "copyMemory"
            java.lang.String r11 = "putLong"
            java.lang.String r12 = "putInt"
            java.lang.String r13 = "getInt"
            java.lang.String r14 = "putByte"
            java.lang.String r15 = "getByte"
            r16 = r1
            java.lang.String r1 = "platform method missing - proto runtime falling back to safer methods: "
            r17 = r2
            java.lang.String r2 = "objectFieldOffset"
            r18 = r3
            java.lang.String r3 = "getLong"
            r19 = 0
            r20 = r4
            r4 = 1
            if (r0 != 0) goto L_0x0074
            r21 = r5
            goto L_0x0094
        L_0x0074:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0103 }
            r21 = r5
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            java.lang.Class<java.lang.reflect.Field> r22 = java.lang.reflect.Field.class
            r5[r19] = r22     // Catch:{ all -> 0x00ff }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x00ff }
            r5 = 2
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x00ff }
            r4[r19] = r7     // Catch:{ all -> 0x00ff }
            r5 = 1
            r4[r5] = r8     // Catch:{ all -> 0x00ff }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x00ff }
            java.lang.reflect.Field r4 = m29977d()     // Catch:{ all -> 0x00ff }
            if (r4 != 0) goto L_0x0098
        L_0x0094:
            r23 = r6
            goto L_0x0127
        L_0x0098:
            boolean r4 = com.google.protobuf.C16987e.m16777a()     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x00a1
            r23 = r6
            goto L_0x00fb
        L_0x00a1:
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            r5[r19] = r8     // Catch:{ all -> 0x00ff }
            r0.getMethod(r15, r5)     // Catch:{ all -> 0x00ff }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            r5[r19] = r8     // Catch:{ all -> 0x00ff }
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00ff }
            r23 = r6
            r6 = 1
            r5[r6] = r4     // Catch:{ all -> 0x00fd }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fd }
            r4[r19] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r13, r4)     // Catch:{ all -> 0x00fd }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r10     // Catch:{ all -> 0x00fd }
            r0.getMethod(r12, r5)     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fd }
            r4[r19] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x00fd }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r11, r5)     // Catch:{ all -> 0x00fd }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r8     // Catch:{ all -> 0x00fd }
            r4 = 2
            r5[r4] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r9, r5)     // Catch:{ all -> 0x00fd }
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r4[r19] = r7     // Catch:{ all -> 0x00fd }
            r5 = 1
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r5 = 2
            r4[r5] = r7     // Catch:{ all -> 0x00fd }
            r5 = 3
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r5 = 4
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r9, r4)     // Catch:{ all -> 0x00fd }
        L_0x00fb:
            r0 = 1
            goto L_0x0128
        L_0x00fd:
            r0 = move-exception
            goto L_0x0107
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            r23 = r6
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            r21 = r5
            goto L_0x0100
        L_0x0107:
            java.util.logging.Logger r4 = f69188a
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            int r6 = r6 + 71
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r4.log(r5, r0)
        L_0x0127:
            r0 = 0
        L_0x0128:
            f69192e = r0
            sun.misc.Unsafe r0 = f69189b
            if (r0 != 0) goto L_0x0131
            r5 = 1
            goto L_0x0241
        L_0x0131:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x021f }
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.reflect.Field> r6 = java.lang.reflect.Field.class
            r5[r19] = r6     // Catch:{ all -> 0x021f }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r2 = "arrayBaseOffset"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r19] = r6     // Catch:{ all -> 0x021f }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r2 = "arrayIndexScale"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r5[r19] = r4     // Catch:{ all -> 0x021f }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x021f }
            r2 = 2
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x021f }
            r4[r19] = r7     // Catch:{ all -> 0x021f }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x021f }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r13, r4)     // Catch:{ all -> 0x021d }
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r6[r19] = r7     // Catch:{ all -> 0x021d }
            r6[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x021f }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x021f }
            r0.getMethod(r12, r6)     // Catch:{ all -> 0x021f }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x021f }
            r4[r19] = r7     // Catch:{ all -> 0x021f }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x021d }
            r4[r19] = r7     // Catch:{ all -> 0x021d }
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r3 = 2
            r4[r3] = r2     // Catch:{ all -> 0x021f }
            r0.getMethod(r11, r4)     // Catch:{ all -> 0x021f }
            java.lang.String r4 = "getObject"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x021f }
            r5[r19] = r7     // Catch:{ all -> 0x021f }
            r3 = 1
            r5[r3] = r2     // Catch:{ all -> 0x021f }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r4 = "putObject"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x021f }
            r6[r19] = r7     // Catch:{ all -> 0x021f }
            r6[r3] = r2     // Catch:{ all -> 0x021f }
            r3 = 2
            r6[r3] = r7     // Catch:{ all -> 0x021f }
            r0.getMethod(r4, r6)     // Catch:{ all -> 0x021f }
            boolean r4 = com.google.protobuf.C16987e.m16777a()     // Catch:{ all -> 0x021f }
            if (r4 == 0) goto L_0x01ab
            r5 = 1
            goto L_0x021b
        L_0x01ab:
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x021f }
            r4[r19] = r7     // Catch:{ all -> 0x021f }
            r3 = 1
            r4[r3] = r2     // Catch:{ all -> 0x021f }
            r0.getMethod(r15, r4)     // Catch:{ all -> 0x021f }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            r5[r19] = r7     // Catch:{ all -> 0x021f }
            r5[r3] = r2     // Catch:{ all -> 0x021f }
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ all -> 0x021f }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x021f }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r3 = "getBoolean"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            r5[r19] = r7     // Catch:{ all -> 0x021f }
            r4 = 1
            r5[r4] = r2     // Catch:{ all -> 0x021f }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r3 = "putBoolean"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x021f }
            r6[r19] = r7     // Catch:{ all -> 0x021f }
            r6[r4] = r2     // Catch:{ all -> 0x021f }
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x021f }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x021f }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x021f }
            java.lang.String r3 = "getFloat"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x021f }
            r4[r19] = r7     // Catch:{ all -> 0x021f }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "putFloat"
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r6[r19] = r7     // Catch:{ all -> 0x021d }
            r6[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ all -> 0x021f }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x021f }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x021f }
            java.lang.String r3 = "getDouble"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x021f }
            r4[r19] = r7     // Catch:{ all -> 0x021f }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "putDouble"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r4[r19] = r7     // Catch:{ all -> 0x021d }
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x021d }
            r6 = 2
            r4[r6] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
        L_0x021b:
            r0 = 1
            goto L_0x0242
        L_0x021d:
            r0 = move-exception
            goto L_0x0221
        L_0x021f:
            r0 = move-exception
            r5 = 1
        L_0x0221:
            java.util.logging.Logger r2 = f69188a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            int r4 = r4 + 71
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.log(r3, r0)
        L_0x0241:
            r0 = 0
        L_0x0242:
            f69193f = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m29975b(r0)
            long r0 = (long) r0
            f69194g = r0
            m29975b(r23)
            m29976c(r23)
            m29975b(r21)
            m29976c(r21)
            m29975b(r20)
            m29976c(r20)
            m29975b(r18)
            m29976c(r18)
            m29975b(r17)
            m29976c(r17)
            m29975b(r16)
            m29976c(r16)
            java.lang.reflect.Field r0 = m29977d()
            if (r0 == 0) goto L_0x0281
            com.google.protobuf.x2$e r1 = f69191d
            if (r1 != 0) goto L_0x027c
            goto L_0x0281
        L_0x027c:
            long r0 = r1.mo38418m(r0)
            goto L_0x0283
        L_0x0281:
            r0 = -1
        L_0x0283:
            f69195h = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x028f
            r19 = 1
        L_0x028f:
            f69196i = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24065x2.<clinit>():void");
    }

    /* renamed from: a */
    public static <T> T m29974a(Class<T> cls) {
        try {
            return f69189b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static int m29975b(Class<?> cls) {
        if (f69193f) {
            return f69191d.mo38413a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static int m29976c(Class<?> cls) {
        if (f69193f) {
            return f69191d.mo38414b(cls);
        }
        return -1;
    }

    /* renamed from: d */
    public static Field m29977d() {
        Field field;
        Field field2;
        if (C16987e.m16777a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: e */
    public static boolean m29978e(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C16987e.m16777a()) {
            return false;
        }
        try {
            Class<?> cls3 = f69190c;
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

    /* renamed from: f */
    public static boolean m29979f(Object obj, long j) {
        return f69191d.mo38403d(obj, j);
    }

    /* renamed from: g */
    public static byte m29980g(long j) {
        return f69191d.mo38404e(j);
    }

    /* renamed from: h */
    public static byte m29981h(byte[] bArr, long j) {
        return f69191d.mo38405f(bArr, f69194g + j);
    }

    /* renamed from: i */
    public static byte m29982i(Object obj, long j) {
        return (byte) ((m29986m(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: j */
    public static byte m29983j(Object obj, long j) {
        return (byte) ((m29986m(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: k */
    public static double m29984k(Object obj, long j) {
        return f69191d.mo38406g(obj, j);
    }

    /* renamed from: l */
    public static float m29985l(Object obj, long j) {
        return f69191d.mo38407h(obj, j);
    }

    /* renamed from: m */
    public static int m29986m(Object obj, long j) {
        return f69191d.mo38415i(obj, j);
    }

    /* renamed from: n */
    public static long m29987n(Object obj, long j) {
        return f69191d.mo38416j(obj, j);
    }

    /* renamed from: o */
    public static Object m29988o(Object obj, long j) {
        return f69191d.mo38417k(obj, j);
    }

    /* renamed from: p */
    public static Unsafe m29989p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C24070a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static long m29990q(Field field) {
        return f69191d.mo38418m(field);
    }

    /* renamed from: r */
    public static void m29991r(Object obj, long j, boolean z) {
        f69191d.mo38409n(obj, j, z);
    }

    /* renamed from: s */
    public static void m29992s(byte[] bArr, long j, byte b) {
        f69191d.mo38410o(bArr, f69194g + j, b);
    }

    /* renamed from: t */
    public static void m29993t(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int m = m29986m(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m29997x(obj, j2, ((255 & b) << i) | (m & (~(255 << i))));
    }

    /* renamed from: u */
    public static void m29994u(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m29997x(obj, j2, ((255 & b) << i) | (m29986m(obj, j2) & (~(255 << i))));
    }

    /* renamed from: v */
    public static void m29995v(Object obj, long j, double d) {
        f69191d.mo38411p(obj, j, d);
    }

    /* renamed from: w */
    public static void m29996w(Object obj, long j, float f) {
        f69191d.mo38412q(obj, j, f);
    }

    /* renamed from: x */
    public static void m29997x(Object obj, long j, int i) {
        f69191d.mo38419r(obj, j, i);
    }

    /* renamed from: y */
    public static void m29998y(Object obj, long j, long j2) {
        f69191d.mo38420s(obj, j, j2);
    }

    /* renamed from: z */
    public static void m29999z(Object obj, long j, Object obj2) {
        f69191d.mo38421t(obj, j, obj2);
    }
}
