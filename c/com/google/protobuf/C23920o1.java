package com.google.protobuf;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23825f;
import com.google.protobuf.C23897n;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24084z0;
import com.google.protobuf.C24087z2;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.o1 */
public final class C23920o1<T> implements C23828f2<T> {

    /* renamed from: r */
    public static final int[] f68510r = new int[0];

    /* renamed from: s */
    public static final Unsafe f68511s = C24065x2.m29989p();

    /* renamed from: a */
    public final int[] f68512a;

    /* renamed from: b */
    public final Object[] f68513b;

    /* renamed from: c */
    public final int f68514c;

    /* renamed from: d */
    public final int f68515d;

    /* renamed from: e */
    public final C23845j1 f68516e;

    /* renamed from: f */
    public final boolean f68517f;

    /* renamed from: g */
    public final boolean f68518g;

    /* renamed from: h */
    public final boolean f68519h;

    /* renamed from: i */
    public final boolean f68520i;

    /* renamed from: j */
    public final int[] f68521j;

    /* renamed from: k */
    public final int f68522k;

    /* renamed from: l */
    public final int f68523l;

    /* renamed from: m */
    public final C23936r1 f68524m;

    /* renamed from: n */
    public final C24054v0 f68525n;

    /* renamed from: o */
    public final C23937r2<?, ?> f68526o;

    /* renamed from: p */
    public final C23812b0<?> f68527p;

    /* renamed from: q */
    public final C23815c1 f68528q;

    public C23920o1(int[] iArr, Object[] objArr, int i, int i2, C23845j1 j1Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C23936r1 r1Var, C24054v0 v0Var, C23937r2<?, ?> r2Var, C23812b0<?> b0Var, C23815c1 c1Var) {
        this.f68512a = iArr;
        this.f68513b = objArr;
        this.f68514c = i;
        this.f68515d = i2;
        this.f68518g = j1Var instanceof C23861l0;
        this.f68519h = z;
        this.f68517f = b0Var != null && b0Var.mo37486e(j1Var);
        this.f68520i = z2;
        this.f68521j = iArr2;
        this.f68522k = i3;
        this.f68523l = i4;
        this.f68524m = r1Var;
        this.f68525n = v0Var;
        this.f68526o = r2Var;
        this.f68527p = b0Var;
        this.f68516e = j1Var;
        this.f68528q = c1Var;
    }

    /* renamed from: A */
    public static long m29429A(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: B */
    public static <T> int m29430B(T t, long j) {
        return ((Integer) C24065x2.m29988o(t, j)).intValue();
    }

    /* renamed from: C */
    public static <T> long m29431C(T t, long j) {
        return ((Long) C24065x2.m29988o(t, j)).longValue();
    }

    /* renamed from: M */
    public static Field m29432M(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: Q */
    public static int m29433Q(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: o */
    public static C24046t2 m29434o(Object obj) {
        C23861l0 l0Var = (C23861l0) obj;
        C24046t2 t2Var = l0Var.unknownFields;
        if (t2Var != C24046t2.f69159f) {
            return t2Var;
        }
        C24046t2 t2Var2 = new C24046t2();
        l0Var.unknownFields = t2Var2;
        return t2Var2;
    }

    /* renamed from: t */
    public static List<?> m29435t(Object obj, long j) {
        return (List) C24065x2.m29988o(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0169  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.protobuf.C23920o1<T> m29436y(java.lang.Class<T> r27, com.google.protobuf.C23841h1 r28, com.google.protobuf.C23936r1 r29, com.google.protobuf.C24054v0 r30, com.google.protobuf.C23937r2<?, ?> r31, com.google.protobuf.C23812b0<?> r32, com.google.protobuf.C23815c1 r33) {
        /*
            r0 = r28
            boolean r1 = r0 instanceof com.google.protobuf.C23816c2
            if (r1 == 0) goto L_0x0018
            r2 = r0
            com.google.protobuf.c2 r2 = (com.google.protobuf.C23816c2) r2
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            com.google.protobuf.o1 r0 = m29437z(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0018:
            com.google.protobuf.l2 r0 = (com.google.protobuf.C23869l2) r0
            com.google.protobuf.y1 r1 = r0.f68406a
            com.google.protobuf.y1 r2 = com.google.protobuf.C24078y1.PROTO3
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0024
            r11 = 1
            goto L_0x0025
        L_0x0024:
            r11 = 0
        L_0x0025:
            com.google.protobuf.f0[] r1 = r0.f68409d
            int r2 = r1.length
            if (r2 != 0) goto L_0x002d
            r8 = 0
            r9 = 0
            goto L_0x0039
        L_0x002d:
            r2 = r1[r4]
            int r2 = r2.f68242g
            int r5 = r1.length
            int r5 = r5 - r3
            r5 = r1[r5]
            int r5 = r5.f68242g
            r8 = r2
            r9 = r5
        L_0x0039:
            int r2 = r1.length
            int r5 = r2 * 3
            int[] r6 = new int[r5]
            int r2 = r2 * 2
            java.lang.Object[] r7 = new java.lang.Object[r2]
            int r2 = r1.length
            r5 = 0
            r10 = 0
            r12 = 0
        L_0x0046:
            r13 = 18
            r14 = 49
            if (r5 >= r2) goto L_0x0063
            r15 = r1[r5]
            com.google.protobuf.h0 r15 = r15.f68240e
            com.google.protobuf.h0 r4 = com.google.protobuf.C23839h0.MAP
            if (r15 != r4) goto L_0x0057
            int r10 = r10 + 1
            goto L_0x005f
        L_0x0057:
            int r4 = r15.f68323e
            if (r4 < r13) goto L_0x005f
            if (r4 > r14) goto L_0x005f
            int r12 = r12 + 1
        L_0x005f:
            int r5 = r5 + 1
            r4 = 0
            goto L_0x0046
        L_0x0063:
            if (r10 <= 0) goto L_0x0068
            int[] r4 = new int[r10]
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r12 <= 0) goto L_0x006e
            int[] r5 = new int[r12]
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            int[] r10 = r0.f68408c
            if (r10 != 0) goto L_0x0075
            int[] r10 = f68510r
        L_0x0075:
            r2 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x007c:
            int r13 = r1.length
            if (r12 >= r13) goto L_0x01c7
            r13 = r1[r12]
            int r3 = r13.f68242g
            com.google.protobuf.v1 r14 = r13.f68247o
            if (r14 == 0) goto L_0x00a6
            r21 = r1
            com.google.protobuf.h0 r1 = r13.f68240e
            int r1 = r1.f68323e
            int r1 = r1 + 51
            r22 = r1
            java.lang.reflect.Field r1 = r14.f69184b
            r23 = r8
            r24 = r9
            long r8 = com.google.protobuf.C24065x2.m29990q(r1)
            int r1 = (int) r8
            java.lang.reflect.Field r8 = r14.f69183a
            long r8 = com.google.protobuf.C24065x2.m29990q(r8)
            r14 = r1
        L_0x00a3:
            r1 = r22
            goto L_0x00f6
        L_0x00a6:
            r21 = r1
            r23 = r8
            r24 = r9
            com.google.protobuf.h0 r1 = r13.f68240e
            java.lang.reflect.Field r8 = r13.f68239d
            long r8 = com.google.protobuf.C24065x2.m29990q(r8)
            int r9 = (int) r8
            int r8 = r1.f68323e
            com.google.protobuf.h0$a r1 = r1.f68324f
            boolean r14 = r1.f68330d
            if (r14 != 0) goto L_0x00e5
            com.google.protobuf.h0$a r14 = com.google.protobuf.C23839h0.C23840a.MAP
            if (r1 != r14) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 != 0) goto L_0x00e5
            java.lang.reflect.Field r1 = r13.f68243h
            if (r1 != 0) goto L_0x00d1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r22 = r8
            r14 = r9
            goto L_0x00d9
        L_0x00d1:
            r22 = r8
            r14 = r9
            long r8 = com.google.protobuf.C24065x2.m29990q(r1)
            int r1 = (int) r8
        L_0x00d9:
            int r8 = r13.f68244i
            int r8 = java.lang.Integer.numberOfTrailingZeros(r8)
            r9 = r8
            r8 = r22
            r22 = r11
            goto L_0x00fe
        L_0x00e5:
            r22 = r8
            r14 = r9
            java.lang.reflect.Field r1 = r13.f68248p
            if (r1 != 0) goto L_0x00f1
            r9 = r14
            r8 = r22
            r1 = 0
            goto L_0x00fa
        L_0x00f1:
            long r8 = com.google.protobuf.C24065x2.m29990q(r1)
            goto L_0x00a3
        L_0x00f6:
            int r9 = (int) r8
            r8 = r1
            r1 = r9
            r9 = r14
        L_0x00fa:
            r14 = r9
            r22 = r11
            r9 = 0
        L_0x00fe:
            int r11 = r13.f68242g
            r6[r15] = r11
            int r11 = r15 + 1
            r25 = r0
            boolean r0 = r13.f68246n
            if (r0 == 0) goto L_0x010f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r26 = r12
            goto L_0x0112
        L_0x010f:
            r26 = r12
            r0 = 0
        L_0x0112:
            boolean r12 = r13.f68245j
            if (r12 == 0) goto L_0x0119
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x011a
        L_0x0119:
            r12 = 0
        L_0x011a:
            r0 = r0 | r12
            int r8 = r8 << 20
            r0 = r0 | r8
            r0 = r0 | r14
            r6[r11] = r0
            int r0 = r15 + 2
            int r8 = r9 << 20
            r1 = r1 | r8
            r6[r0] = r1
            com.google.protobuf.h0 r0 = r13.f68240e
            int r0 = r0.ordinal()
            r1 = 9
            if (r0 == r1) goto L_0x0143
            r1 = 17
            if (r0 == r1) goto L_0x0143
            r1 = 27
            if (r0 == r1) goto L_0x0140
            r1 = 49
            if (r0 == r1) goto L_0x0140
            r0 = 0
            goto L_0x014e
        L_0x0140:
            java.lang.Class<?> r0 = r13.f68241f
            goto L_0x014e
        L_0x0143:
            java.lang.reflect.Field r0 = r13.f68239d
            if (r0 == 0) goto L_0x014c
            java.lang.Class r0 = r0.getType()
            goto L_0x014e
        L_0x014c:
            java.lang.Class<?> r0 = r13.f68249q
        L_0x014e:
            java.lang.Object r1 = r13.f68250r
            if (r1 == 0) goto L_0x0169
            int r8 = r15 / 3
            int r8 = r8 * 2
            r7[r8] = r1
            if (r0 == 0) goto L_0x015f
            int r8 = r8 + 1
            r7[r8] = r0
            goto L_0x0167
        L_0x015f:
            com.google.protobuf.o0$e r0 = r13.f68251s
            if (r0 == 0) goto L_0x0167
            int r8 = r8 + 1
            r7[r8] = r0
        L_0x0167:
            r8 = 1
            goto L_0x0180
        L_0x0169:
            if (r0 == 0) goto L_0x0174
            int r1 = r15 / 3
            int r1 = r1 * 2
            r8 = 1
            int r1 = r1 + r8
            r7[r1] = r0
            goto L_0x0180
        L_0x0174:
            r8 = 1
            com.google.protobuf.o0$e r0 = r13.f68251s
            if (r0 == 0) goto L_0x0180
            int r1 = r15 / 3
            int r1 = r1 * 2
            int r1 = r1 + r8
            r7[r1] = r0
        L_0x0180:
            int r0 = r10.length
            if (r2 >= r0) goto L_0x018c
            r0 = r10[r2]
            if (r0 != r3) goto L_0x018c
            int r0 = r2 + 1
            r10[r2] = r15
            r2 = r0
        L_0x018c:
            com.google.protobuf.h0 r0 = r13.f68240e
            com.google.protobuf.h0 r1 = com.google.protobuf.C23839h0.MAP
            if (r0 != r1) goto L_0x019d
            int r0 = r16 + 1
            r4[r16] = r15
            r16 = r0
            r1 = 18
            r3 = 49
            goto L_0x01b4
        L_0x019d:
            int r0 = r0.f68323e
            r1 = 18
            r3 = 49
            if (r0 < r1) goto L_0x01b4
            if (r0 > r3) goto L_0x01b4
            int r0 = r17 + 1
            java.lang.reflect.Field r9 = r13.f68239d
            long r11 = com.google.protobuf.C24065x2.m29990q(r9)
            int r9 = (int) r11
            r5[r17] = r9
            r17 = r0
        L_0x01b4:
            int r12 = r26 + 1
            int r15 = r15 + 3
            r1 = r21
            r11 = r22
            r8 = r23
            r9 = r24
            r0 = r25
            r3 = 1
            r14 = 49
            goto L_0x007c
        L_0x01c7:
            r25 = r0
            r23 = r8
            r24 = r9
            r22 = r11
            if (r4 != 0) goto L_0x01d3
            int[] r4 = f68510r
        L_0x01d3:
            if (r5 != 0) goto L_0x01d7
            int[] r5 = f68510r
        L_0x01d7:
            int r0 = r10.length
            int r1 = r4.length
            int r0 = r0 + r1
            int r1 = r5.length
            int r0 = r0 + r1
            int[] r13 = new int[r0]
            int r0 = r10.length
            r1 = 0
            java.lang.System.arraycopy(r10, r1, r13, r1, r0)
            int r0 = r10.length
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r13, r0, r2)
            int r0 = r10.length
            int r2 = r4.length
            int r0 = r0 + r2
            int r2 = r5.length
            java.lang.System.arraycopy(r5, r1, r13, r0, r2)
            com.google.protobuf.o1 r0 = new com.google.protobuf.o1
            r1 = r25
            com.google.protobuf.j1 r1 = r1.f68410e
            r12 = 1
            int r14 = r10.length
            int r2 = r10.length
            int r3 = r4.length
            int r15 = r2 + r3
            r5 = r0
            r8 = r23
            r9 = r24
            r10 = r1
            r11 = r22
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r20 = r33
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.m29436y(java.lang.Class, com.google.protobuf.h1, com.google.protobuf.r1, com.google.protobuf.v0, com.google.protobuf.r2, com.google.protobuf.b0, com.google.protobuf.c1):com.google.protobuf.o1");
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036e  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.protobuf.C23920o1<T> m29437z(com.google.protobuf.C23816c2 r34, com.google.protobuf.C23936r1 r35, com.google.protobuf.C24054v0 r36, com.google.protobuf.C23937r2<?, ?> r37, com.google.protobuf.C23812b0<?> r38, com.google.protobuf.C23815c1 r39) {
        /*
            com.google.protobuf.y1 r0 = r34.mo37519c()
            com.google.protobuf.y1 r1 = com.google.protobuf.C24078y1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r34.mo37521e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f68510r
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0161
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0161:
            sun.misc.Unsafe r15 = f68511s
            java.lang.Object[] r17 = r34.mo37520d()
            com.google.protobuf.j1 r18 = r34.mo37518b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0180:
            if (r4 >= r1) goto L_0x03c0
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0190:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0190
        L_0x01a2:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01aa
        L_0x01a8:
            r3 = r24
        L_0x01aa:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b8:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d1
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b8
        L_0x01d1:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01db
        L_0x01d7:
            r28 = r1
            r1 = r24
        L_0x01db:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e8
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e8:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0217
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fd:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0212
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fd
        L_0x0212:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0217:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0237
            r14 = 17
            if (r12 != r14) goto L_0x0224
            goto L_0x0237
        L_0x0224:
            r14 = 12
            if (r12 != r14) goto L_0x0245
            if (r10 != 0) goto L_0x0245
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0243
        L_0x0237:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0243:
            r16 = r14
        L_0x0245:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0250
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0258
        L_0x0250:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m29432M(r2, r12)
            r17[r1] = r12
        L_0x0258:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r9 = (int) r8
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026b
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0273
        L_0x026b:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m29432M(r2, r8)
            r17[r1] = r8
        L_0x0273:
            r1 = r9
            long r8 = r15.objectFieldOffset(r8)
            int r9 = (int) r8
            r31 = r0
            r0 = r10
            r8 = r11
            r29 = r32
            r25 = 1
            r10 = r9
            r9 = r1
            r1 = 0
            goto L_0x0388
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m29432M(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r9 = (int) r8
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r8 != r12) goto L_0x031c
            r8 = 1
            goto L_0x031d
        L_0x031c:
            r8 = 0
        L_0x031d:
            if (r8 == 0) goto L_0x036e
            r8 = 17
            if (r5 > r8) goto L_0x036e
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r29 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r12) goto L_0x0344
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r1 = r1 | r8
            int r26 = r26 + 13
            r8 = r29
            goto L_0x0332
        L_0x0344:
            int r8 = r8 << r26
            r1 = r1 | r8
            goto L_0x034a
        L_0x0348:
            r29 = r8
        L_0x034a:
            int r8 = r6 * 2
            int r26 = r1 / 32
            int r8 = r8 + r26
            r12 = r17[r8]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035b
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0363
        L_0x035b:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m29432M(r2, r12)
            r17[r8] = r12
        L_0x0363:
            r0 = r10
            r8 = r11
            long r10 = r15.objectFieldOffset(r12)
            int r11 = (int) r10
            int r1 = r1 % 32
            r10 = r11
            goto L_0x0378
        L_0x036e:
            r31 = r0
            r0 = r10
            r8 = r11
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0378:
            r11 = 18
            if (r5 < r11) goto L_0x0386
            r11 = 49
            if (r5 > r11) goto L_0x0386
            int r11 = r23 + 1
            r13[r23] = r9
            r23 = r11
        L_0x0386:
            r16 = r27
        L_0x0388:
            int r11 = r21 + 1
            r7[r21] = r4
            int r4 = r11 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0395
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0396
        L_0x0395:
            r12 = 0
        L_0x0396:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039d
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039e
        L_0x039d:
            r3 = 0
        L_0x039e:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r9
            r7[r11] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r10
            r7[r4] = r1
            r10 = r0
            r11 = r8
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0180
        L_0x03c0:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            r8 = r11
            com.google.protobuf.o1 r1 = new com.google.protobuf.o1
            com.google.protobuf.j1 r9 = r34.mo37518b()
            r11 = 0
            r4 = r1
            r5 = r7
            r6 = r8
            r7 = r14
            r8 = r33
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.m29437z(com.google.protobuf.c2, com.google.protobuf.r1, com.google.protobuf.v0, com.google.protobuf.r2, com.google.protobuf.b0, com.google.protobuf.c1):com.google.protobuf.o1");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v8, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> int mo37983D(T r17, byte[] r18, int r19, int r20, int r21, long r22, com.google.protobuf.C23825f.C23826a r24) {
        /*
            r16 = this;
            r7 = r16
            r0 = r17
            r8 = r18
            r9 = r20
            r1 = r22
            r10 = r24
            sun.misc.Unsafe r3 = f68511s
            r4 = r21
            java.lang.Object r4 = r7.mo38003m(r4)
            java.lang.Object r5 = r3.getObject(r0, r1)
            com.google.protobuf.c1 r6 = r7.f68528q
            boolean r6 = r6.mo18732h(r5)
            if (r6 == 0) goto L_0x002f
            com.google.protobuf.c1 r6 = r7.f68528q
            java.lang.Object r6 = r6.mo18729e(r4)
            com.google.protobuf.c1 r11 = r7.f68528q
            r11.mo18725a(r6, r5)
            r3.putObject(r0, r1, r6)
            r5 = r6
        L_0x002f:
            com.google.protobuf.c1 r0 = r7.f68528q
            com.google.protobuf.z0$a r11 = r0.mo18726b(r4)
            com.google.protobuf.c1 r0 = r7.f68528q
            java.util.Map r12 = r0.mo18728d(r5)
            r0 = r19
            int r0 = com.google.protobuf.C23825f.m28727I(r8, r0, r10)
            int r1 = r10.f68235a
            if (r1 < 0) goto L_0x00af
            int r2 = r9 - r0
            if (r1 > r2) goto L_0x00af
            int r13 = r0 + r1
            K r1 = r11.f69222b
            V r2 = r11.f69224d
            r14 = r1
            r15 = r2
        L_0x0051:
            if (r0 >= r13) goto L_0x00a4
            int r1 = r0 + 1
            byte r0 = r8[r0]
            if (r0 >= 0) goto L_0x0062
            int r0 = com.google.protobuf.C23825f.m28726H(r0, r8, r1, r10)
            int r1 = r10.f68235a
            r2 = r0
            r0 = r1
            goto L_0x0063
        L_0x0062:
            r2 = r1
        L_0x0063:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0089
            r4 = 2
            if (r1 == r4) goto L_0x006e
            goto L_0x009f
        L_0x006e:
            com.google.protobuf.z2$b r4 = r11.f69223c
            int r1 = r4.f69234e
            if (r3 != r1) goto L_0x009f
            V r0 = r11.f69224d
            java.lang.Class r5 = r0.getClass()
            r0 = r16
            r1 = r18
            r3 = r20
            r6 = r24
            int r0 = r0.mo38000j(r1, r2, r3, r4, r5, r6)
            java.lang.Object r15 = r10.f68237c
            goto L_0x0051
        L_0x0089:
            com.google.protobuf.z2$b r4 = r11.f69221a
            int r1 = r4.f69234e
            if (r3 != r1) goto L_0x009f
            r5 = 0
            r0 = r16
            r1 = r18
            r3 = r20
            r6 = r24
            int r0 = r0.mo38000j(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r10.f68237c
            goto L_0x0051
        L_0x009f:
            int r0 = com.google.protobuf.C23825f.m28731M(r0, r8, r2, r9, r10)
            goto L_0x0051
        L_0x00a4:
            if (r0 != r13) goto L_0x00aa
            r12.put(r14, r15)
            return r13
        L_0x00aa:
            com.google.protobuf.p0 r0 = com.google.protobuf.C23922p0.m29482g()
            throw r0
        L_0x00af:
            com.google.protobuf.p0 r0 = com.google.protobuf.C23922p0.m29484i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo37983D(java.lang.Object, byte[], int, int, int, long, com.google.protobuf.f$a):int");
    }

    /* renamed from: E */
    public final int mo37984E(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C23825f.C23826a aVar) {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i15 = i3;
        int i16 = i4;
        int i17 = i5;
        long j2 = j;
        int i18 = i8;
        C23825f.C23826a aVar2 = aVar;
        Unsafe unsafe = f68511s;
        long j3 = (long) (this.f68512a[i18 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i17 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C23825f.m28735d(bArr, i)));
                    int i19 = i9 + 8;
                    unsafe.putInt(t2, j3, i16);
                    return i19;
                }
                break;
            case 52:
                if (i17 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C23825f.m28743l(bArr, i)));
                    int i25 = i9 + 4;
                    unsafe.putInt(t2, j3, i16);
                    return i25;
                }
                break;
            case 53:
            case 54:
                if (i17 == 0) {
                    int K = C23825f.m28729K(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(aVar2.f68236b));
                    unsafe.putInt(t2, j3, i16);
                    return K;
                }
                break;
            case 55:
            case 62:
                if (i17 == 0) {
                    int I = C23825f.m28727I(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(aVar2.f68235a));
                    unsafe.putInt(t2, j3, i16);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i17 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C23825f.m28741j(bArr, i)));
                    int i26 = i9 + 8;
                    unsafe.putInt(t2, j3, i16);
                    return i26;
                }
                break;
            case 57:
            case 64:
                if (i17 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C23825f.m28739h(bArr, i)));
                    int i27 = i9 + 4;
                    unsafe.putInt(t2, j3, i16);
                    return i27;
                }
                break;
            case 58:
                if (i17 == 0) {
                    int K2 = C23825f.m28729K(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(aVar2.f68236b != 0));
                    unsafe.putInt(t2, j3, i16);
                    return K2;
                }
                break;
            case 59:
                if (i17 == 2) {
                    int I2 = C23825f.m28727I(bArr2, i9, aVar2);
                    int i28 = aVar2.f68235a;
                    if (i28 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C24079y2.m30063e(bArr2, I2, I2 + i28)) {
                        unsafe.putObject(t2, j2, new String(bArr2, I2, i28, C23908o0.f68505a));
                        I2 += i28;
                    } else {
                        throw C23922p0.m29478c();
                    }
                    unsafe.putInt(t2, j3, i16);
                    return I2;
                }
                break;
            case 60:
                if (i17 == 2) {
                    int p = C23825f.m28747p(mo38004n(i18), bArr2, i9, i2, aVar2);
                    Object object = unsafe.getInt(t2, j3) == i16 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, aVar2.f68237c);
                    } else {
                        unsafe.putObject(t2, j2, C23908o0.m29425c(object, aVar2.f68237c));
                    }
                    unsafe.putInt(t2, j3, i16);
                    return p;
                }
                break;
            case 61:
                if (i17 == 2) {
                    int b = C23825f.m28733b(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, aVar2.f68237c);
                    unsafe.putInt(t2, j3, i16);
                    return b;
                }
                break;
            case 63:
                if (i17 == 0) {
                    int I3 = C23825f.m28727I(bArr2, i9, aVar2);
                    int i29 = aVar2.f68235a;
                    C23908o0.C23913e l = mo38002l(i18);
                    if (l == null || l.isInRange(i29)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i29));
                        unsafe.putInt(t2, j3, i16);
                    } else {
                        m29434o(t).mo38361d(i15, Long.valueOf((long) i29));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i17 == 0) {
                    int I4 = C23825f.m28727I(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C23856l.m28955b(aVar2.f68235a)));
                    unsafe.putInt(t2, j3, i16);
                    return I4;
                }
                break;
            case 67:
                if (i17 == 0) {
                    int K3 = C23825f.m28729K(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C23856l.m28956c(aVar2.f68236b)));
                    unsafe.putInt(t2, j3, i16);
                    return K3;
                }
                break;
            case 68:
                if (i17 == 3) {
                    int n = C23825f.m28745n(mo38004n(i18), bArr, i, i2, (i15 & -8) | 4, aVar);
                    Object object2 = unsafe.getInt(t2, j3) == i16 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, aVar2.f68237c);
                    } else {
                        unsafe.putObject(t2, j2, C23908o0.m29425c(object2, aVar2.f68237c));
                    }
                    unsafe.putInt(t2, j3, i16);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b6, code lost:
        r24 = r24 | r22;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ee, code lost:
        r0 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02f0, code lost:
        r24 = r24 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f2, code lost:
        r6 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02f4, code lost:
        r4 = r32;
        r1 = r34;
        r2 = r10;
        r3 = r13;
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fe, code lost:
        r8 = r34;
        r2 = r6;
        r26 = r9;
        r16 = r10;
        r20 = r13;
        r22 = r24;
        r9 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b3, code lost:
        if (r0 != r15) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03e4, code lost:
        if (r0 != r15) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0407, code lost:
        if (r0 != r15) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0423, code lost:
        r9 = r32;
        r8 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
        r19 = r6;
        r32 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01dd, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0209, code lost:
        r19 = r6;
        r32 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x024b, code lost:
        r32 = r1;
        r19 = r6;
        r6 = r24 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0277, code lost:
        r32 = r1;
        r19 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x027b, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0458  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo37985F(T r30, byte[] r31, int r32, int r33, int r34, com.google.protobuf.C23825f.C23826a r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = f68511s
            r0 = r32
            r1 = r34
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0471
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.protobuf.C23825f.m28726H(r0, r12, r4, r11)
            int r4 = r11.f68235a
            r27 = r4
            r4 = r0
            r0 = r27
        L_0x002a:
            int r10 = r0 >>> 3
            r8 = r0 & 7
            r7 = 3
            if (r10 <= r2) goto L_0x0042
            int r3 = r3 / r7
            int r2 = r15.f68514c
            if (r10 < r2) goto L_0x003f
            int r2 = r15.f68515d
            if (r10 > r2) goto L_0x003f
            int r2 = r15.mo37994P(r10, r3)
            goto L_0x0040
        L_0x003f:
            r2 = -1
        L_0x0040:
            r3 = 0
            goto L_0x0052
        L_0x0042:
            int r2 = r15.f68514c
            if (r10 < r2) goto L_0x0050
            int r2 = r15.f68515d
            if (r10 > r2) goto L_0x0050
            r3 = 0
            int r2 = r15.mo37994P(r10, r3)
            goto L_0x0052
        L_0x0050:
            r3 = 0
            r2 = -1
        L_0x0052:
            r7 = -1
            if (r2 != r7) goto L_0x0068
            r8 = r1
            r2 = r4
            r19 = r5
            r22 = r6
            r26 = r9
            r16 = r10
            r17 = -1
            r18 = 0
            r20 = 0
            r9 = r0
            goto L_0x0428
        L_0x0068:
            int[] r1 = r15.f68512a
            int r17 = r2 + 1
            r7 = r1[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r7 & r17
            int r3 = r17 >>> 20
            r17 = r0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r16
            long r12 = (long) r0
            r0 = 17
            r20 = r7
            if (r3 > r0) goto L_0x0311
            int r0 = r2 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r7 = 1
            int r22 = r7 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            if (r0 == r5) goto L_0x00a2
            r16 = r2
            if (r5 == r1) goto L_0x0099
            long r1 = (long) r5
            r9.putInt(r14, r1, r6)
        L_0x0099:
            long r1 = (long) r0
            int r6 = r9.getInt(r14, r1)
            r24 = r6
            r6 = r0
            goto L_0x00a7
        L_0x00a2:
            r16 = r2
            r24 = r6
            r6 = r5
        L_0x00a7:
            r0 = 5
            switch(r3) {
                case 0: goto L_0x02d5;
                case 1: goto L_0x02ba;
                case 2: goto L_0x0299;
                case 3: goto L_0x0299;
                case 4: goto L_0x027e;
                case 5: goto L_0x0254;
                case 6: goto L_0x0232;
                case 7: goto L_0x020f;
                case 8: goto L_0x01e3;
                case 9: goto L_0x01ad;
                case 10: goto L_0x018f;
                case 11: goto L_0x027e;
                case 12: goto L_0x0158;
                case 13: goto L_0x0232;
                case 14: goto L_0x0254;
                case 15: goto L_0x013c;
                case 16: goto L_0x0110;
                case 17: goto L_0x00ba;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r12 = r31
            r19 = r6
            r13 = r16
            r32 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            goto L_0x027b
        L_0x00ba:
            r1 = 3
            if (r8 != r1) goto L_0x00fe
            int r0 = r10 << 3
            r5 = r0 | 4
            r2 = r16
            com.google.protobuf.f2 r0 = r15.mo38004n(r2)
            r7 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r31
            r8 = r2
            r2 = r4
            r17 = 0
            r3 = r33
            r4 = r5
            r5 = r35
            int r0 = com.google.protobuf.C23825f.m28745n(r0, r1, r2, r3, r4, r5)
            r1 = r24 & r22
            if (r1 != 0) goto L_0x00e5
            java.lang.Object r1 = r11.f68237c
            r9.putObject(r14, r12, r1)
            goto L_0x00f2
        L_0x00e5:
            java.lang.Object r1 = r9.getObject(r14, r12)
            java.lang.Object r2 = r11.f68237c
            java.lang.Object r1 = com.google.protobuf.C23908o0.m29425c(r1, r2)
            r9.putObject(r14, r12, r1)
        L_0x00f2:
            r1 = r24 | r22
            r12 = r31
            r19 = r6
            r32 = r7
            r13 = r8
            r6 = r1
            goto L_0x02f4
        L_0x00fe:
            r8 = r16
            r7 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            r19 = r6
            r32 = r7
            r13 = r8
            goto L_0x027b
        L_0x0110:
            r5 = r16
            r7 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            if (r8 != 0) goto L_0x0137
            r2 = r12
            r12 = r31
            int r8 = com.google.protobuf.C23825f.m28729K(r12, r4, r11)
            long r0 = r11.f68236b
            long r19 = com.google.protobuf.C23856l.m28956c(r0)
            r0 = r9
            r1 = r30
            r13 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r19 = r6
            r32 = r7
            goto L_0x02b6
        L_0x0137:
            r12 = r31
            r13 = r5
            goto L_0x0209
        L_0x013c:
            r2 = r12
            r13 = r16
            r7 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            if (r8 != 0) goto L_0x0209
            int r0 = com.google.protobuf.C23825f.m28727I(r12, r4, r11)
            int r1 = r11.f68235a
            int r1 = com.google.protobuf.C23856l.m28955b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x01a7
        L_0x0158:
            r2 = r12
            r13 = r16
            r7 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            if (r8 != 0) goto L_0x0209
            int r0 = com.google.protobuf.C23825f.m28727I(r12, r4, r11)
            int r1 = r11.f68235a
            com.google.protobuf.o0$e r4 = r15.mo38002l(r13)
            if (r4 == 0) goto L_0x018b
            boolean r4 = r4.isInRange(r1)
            if (r4 == 0) goto L_0x0179
            goto L_0x018b
        L_0x0179:
            com.google.protobuf.t2 r2 = m29434o(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo38361d(r7, r1)
            r19 = r6
            r32 = r7
            goto L_0x02f2
        L_0x018b:
            r9.putInt(r14, r2, r1)
            goto L_0x01a7
        L_0x018f:
            r2 = r12
            r13 = r16
            r7 = r17
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            if (r8 != r0) goto L_0x0209
            int r0 = com.google.protobuf.C23825f.m28733b(r12, r4, r11)
            java.lang.Object r1 = r11.f68237c
            r9.putObject(r14, r2, r1)
        L_0x01a7:
            r19 = r6
            r32 = r7
            goto L_0x02f0
        L_0x01ad:
            r2 = r12
            r13 = r16
            r7 = r17
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            if (r8 != r0) goto L_0x01e0
            com.google.protobuf.f2 r0 = r15.mo38004n(r13)
            r5 = r33
            int r0 = com.google.protobuf.C23825f.m28747p(r0, r12, r4, r5, r11)
            r1 = r24 & r22
            if (r1 != 0) goto L_0x01d0
            java.lang.Object r1 = r11.f68237c
            r9.putObject(r14, r2, r1)
            goto L_0x01dd
        L_0x01d0:
            java.lang.Object r1 = r9.getObject(r14, r2)
            java.lang.Object r4 = r11.f68237c
            java.lang.Object r1 = com.google.protobuf.C23908o0.m29425c(r1, r4)
            r9.putObject(r14, r2, r1)
        L_0x01dd:
            r1 = r7
            goto L_0x024b
        L_0x01e0:
            r5 = r33
            goto L_0x0209
        L_0x01e3:
            r5 = r33
            r2 = r12
            r13 = r16
            r7 = r17
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            if (r8 != r0) goto L_0x0209
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01ff
            int r0 = com.google.protobuf.C23825f.m28721C(r12, r4, r11)
            goto L_0x0203
        L_0x01ff:
            int r0 = com.google.protobuf.C23825f.m28724F(r12, r4, r11)
        L_0x0203:
            java.lang.Object r1 = r11.f68237c
            r9.putObject(r14, r2, r1)
            goto L_0x01dd
        L_0x0209:
            r19 = r6
            r32 = r7
            goto L_0x027b
        L_0x020f:
            r5 = r33
            r2 = r12
            r13 = r16
            r1 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            if (r8 != 0) goto L_0x0277
            int r0 = com.google.protobuf.C23825f.m28729K(r12, r4, r11)
            long r7 = r11.f68236b
            r19 = 0
            int r4 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x022d
            r4 = 1
            goto L_0x022e
        L_0x022d:
            r4 = 0
        L_0x022e:
            com.google.protobuf.C24065x2.m29991r(r14, r2, r4)
            goto L_0x024b
        L_0x0232:
            r5 = r33
            r2 = r12
            r13 = r16
            r1 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            if (r8 != r0) goto L_0x0277
            int r0 = com.google.protobuf.C23825f.m28739h(r12, r4)
            r9.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x024b:
            r2 = r24 | r22
            r32 = r1
            r19 = r6
            r6 = r2
            goto L_0x02f4
        L_0x0254:
            r5 = r33
            r2 = r12
            r13 = r16
            r1 = r17
            r0 = 1
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            if (r8 != r0) goto L_0x0277
            long r7 = com.google.protobuf.C23825f.m28741j(r12, r4)
            r0 = r9
            r32 = r1
            r1 = r30
            r19 = r6
            r6 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x02ee
        L_0x0277:
            r32 = r1
            r19 = r6
        L_0x027b:
            r6 = r4
            goto L_0x02fe
        L_0x027e:
            r19 = r6
            r2 = r12
            r13 = r16
            r32 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            r6 = r4
            if (r8 != 0) goto L_0x02fe
            int r0 = com.google.protobuf.C23825f.m28727I(r12, r6, r11)
            int r1 = r11.f68235a
            r9.putInt(r14, r2, r1)
            goto L_0x02f0
        L_0x0299:
            r19 = r6
            r2 = r12
            r13 = r16
            r32 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            r6 = r4
            if (r8 != 0) goto L_0x02fe
            int r8 = com.google.protobuf.C23825f.m28729K(r12, r6, r11)
            long r4 = r11.f68236b
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
        L_0x02b6:
            r24 = r24 | r22
            r0 = r8
            goto L_0x02f2
        L_0x02ba:
            r19 = r6
            r2 = r12
            r13 = r16
            r32 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            r6 = r4
            if (r8 != r0) goto L_0x02fe
            float r0 = com.google.protobuf.C23825f.m28743l(r12, r6)
            com.google.protobuf.C24065x2.m29996w(r14, r2, r0)
            int r0 = r6 + 4
            goto L_0x02f0
        L_0x02d5:
            r19 = r6
            r2 = r12
            r13 = r16
            r32 = r17
            r0 = 1
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r12 = r31
            r6 = r4
            if (r8 != r0) goto L_0x02fe
            double r0 = com.google.protobuf.C23825f.m28735d(r12, r6)
            com.google.protobuf.C24065x2.m29995v(r14, r2, r0)
        L_0x02ee:
            int r0 = r6 + 8
        L_0x02f0:
            r24 = r24 | r22
        L_0x02f2:
            r6 = r24
        L_0x02f4:
            r4 = r32
            r1 = r34
            r2 = r10
            r3 = r13
            r5 = r19
            goto L_0x0367
        L_0x02fe:
            r8 = r34
            r2 = r6
            r26 = r9
            r16 = r10
            r20 = r13
            r22 = r24
            r17 = -1
            r18 = 0
            r9 = r32
            goto L_0x0428
        L_0x0311:
            r7 = r6
            r32 = r17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r6 = r4
            r27 = r12
            r12 = r31
            r13 = r2
            r1 = r27
            r0 = 27
            if (r3 != r0) goto L_0x037c
            r0 = 2
            if (r8 != r0) goto L_0x036b
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.protobuf.o0$j r0 = (com.google.protobuf.C23908o0.C23919j) r0
            boolean r3 = r0.mo37523Q()
            if (r3 != 0) goto L_0x0346
            int r3 = r0.size()
            if (r3 != 0) goto L_0x033d
            r3 = 10
            goto L_0x033f
        L_0x033d:
            int r3 = r3 * 2
        L_0x033f:
            com.google.protobuf.o0$j r0 = r0.mo37467E0(r3)
            r9.putObject(r14, r1, r0)
        L_0x0346:
            r8 = r0
            com.google.protobuf.f2 r0 = r15.mo38004n(r13)
            r1 = r32
            r2 = r31
            r3 = r6
            r4 = r33
            r19 = r5
            r5 = r8
            r22 = r7
            r6 = r35
            int r0 = com.google.protobuf.C23825f.m28748q(r0, r1, r2, r3, r4, r5, r6)
            r4 = r32
            r1 = r34
            r2 = r10
            r3 = r13
            r5 = r19
            r6 = r22
        L_0x0367:
            r13 = r33
            goto L_0x0017
        L_0x036b:
            r19 = r5
            r22 = r7
            r15 = r6
            r26 = r9
            r16 = r10
            r20 = r13
            r17 = -1
            r18 = 0
            goto L_0x03e7
        L_0x037c:
            r19 = r5
            r22 = r7
            r0 = 49
            if (r3 > r0) goto L_0x03b7
            r7 = r20
            long r4 = (long) r7
            r0 = r29
            r23 = r1
            r1 = r30
            r2 = r31
            r7 = r3
            r3 = r6
            r20 = r4
            r4 = r33
            r5 = r32
            r15 = r6
            r6 = r10
            r25 = r7
            r17 = -1
            r18 = 0
            r7 = r8
            r8 = r13
            r26 = r9
            r16 = r10
            r9 = r20
            r11 = r25
            r20 = r13
            r12 = r23
            r14 = r35
            int r0 = r0.mo37987H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0423
            goto L_0x0409
        L_0x03b7:
            r23 = r1
            r25 = r3
            r15 = r6
            r26 = r9
            r16 = r10
            r7 = r20
            r17 = -1
            r18 = 0
            r20 = r13
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x03ed
            r0 = 2
            if (r8 != r0) goto L_0x03e7
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r20
            r6 = r23
            r8 = r35
            int r0 = r0.mo37983D(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0423
            goto L_0x0409
        L_0x03e7:
            r9 = r32
            r8 = r34
            r2 = r15
            goto L_0x0428
        L_0x03ed:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r32
            r6 = r16
            r10 = r7
            r7 = r8
            r8 = r10
            r10 = r23
            r12 = r20
            r13 = r35
            int r0 = r0.mo37984E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0423
        L_0x0409:
            r15 = r29
            r14 = r30
            r12 = r31
            r4 = r32
            r13 = r33
            r1 = r34
            r11 = r35
        L_0x0417:
            r2 = r16
            r5 = r19
            r3 = r20
            r6 = r22
            r9 = r26
            goto L_0x0017
        L_0x0423:
            r9 = r32
            r8 = r34
            r2 = r0
        L_0x0428:
            if (r9 != r8) goto L_0x0436
            if (r8 == 0) goto L_0x0436
            r10 = r29
            r0 = r2
            r1 = r8
            r4 = r9
            r5 = r19
            r6 = r22
            goto L_0x0478
        L_0x0436:
            r10 = r29
            boolean r0 = r10.f68517f
            r11 = r35
            if (r0 == 0) goto L_0x0458
            com.google.protobuf.a0 r0 = r11.f68238d
            com.google.protobuf.a0 r1 = com.google.protobuf.C23806a0.m28602a()
            if (r0 == r1) goto L_0x0458
            com.google.protobuf.j1 r5 = r10.f68516e
            com.google.protobuf.r2<?, ?> r6 = r10.f68526o
            r0 = r9
            r1 = r31
            r3 = r33
            r4 = r30
            r7 = r35
            int r0 = com.google.protobuf.C23825f.m28738g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0467
        L_0x0458:
            com.google.protobuf.t2 r4 = m29434o(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.protobuf.C23825f.m28725G(r0, r1, r2, r3, r4, r5)
        L_0x0467:
            r14 = r30
            r12 = r31
            r13 = r33
            r1 = r8
            r4 = r9
            r15 = r10
            goto L_0x0417
        L_0x0471:
            r19 = r5
            r22 = r6
            r26 = r9
            r10 = r15
        L_0x0478:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x0486
            long r2 = (long) r5
            r5 = r30
            r7 = r26
            r7.putInt(r5, r2, r6)
            goto L_0x0488
        L_0x0486:
            r5 = r30
        L_0x0488:
            r2 = 0
            int r3 = r10.f68522k
        L_0x048b:
            int r6 = r10.f68523l
            if (r3 >= r6) goto L_0x049e
            int[] r6 = r10.f68521j
            r6 = r6[r3]
            com.google.protobuf.r2<?, ?> r7 = r10.f68526o
            java.lang.Object r2 = r10.mo38001k(r5, r6, r2, r7)
            com.google.protobuf.t2 r2 = (com.google.protobuf.C24046t2) r2
            int r3 = r3 + 1
            goto L_0x048b
        L_0x049e:
            if (r2 == 0) goto L_0x04a5
            com.google.protobuf.r2<?, ?> r3 = r10.f68526o
            r3.mo38040n(r5, r2)
        L_0x04a5:
            if (r1 != 0) goto L_0x04b1
            r2 = r33
            if (r0 != r2) goto L_0x04ac
            goto L_0x04b7
        L_0x04ac:
            com.google.protobuf.p0 r0 = com.google.protobuf.C23922p0.m29482g()
            throw r0
        L_0x04b1:
            r2 = r33
            if (r0 > r2) goto L_0x04b8
            if (r4 != r1) goto L_0x04b8
        L_0x04b7:
            return r0
        L_0x04b8:
            com.google.protobuf.p0 r0 = com.google.protobuf.C23922p0.m29482g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo37985F(java.lang.Object, byte[], int, int, int, com.google.protobuf.f$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f7, code lost:
        if (r0 != r15) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0329, code lost:
        if (r0 != r15) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0345, code lost:
        if (r0 != r15) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0347, code lost:
        r5 = r21;
        r2 = r22;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b0, code lost:
        r1 = r10 | r22;
        r2 = r6;
        r5 = r17;
        r7 = 0;
        r8 = -1;
        r10 = 1048575;
        r6 = r1;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01dc, code lost:
        r13 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0214, code lost:
        r0 = r10 | r22;
        r22 = r6;
        r5 = r17;
        r6 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x024f, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0251, code lost:
        r1 = r10 | r22;
        r22 = r6;
        r5 = r17;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0259, code lost:
        r7 = r6;
        r27 = r9;
        r6 = r10;
        r2 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo37986G(T r30, byte[] r31, int r32, int r33, com.google.protobuf.C23825f.C23826a r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f68511s
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r8 = -1
            r7 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x0019:
            if (r0 >= r13) goto L_0x037d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.protobuf.C23825f.m28726H(r0, r12, r3, r11)
            int r3 = r11.f68235a
            r4 = r0
            r16 = r3
            goto L_0x002e
        L_0x002b:
            r16 = r0
            r4 = r3
        L_0x002e:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0043
            int r2 = r2 / 3
            int r1 = r15.f68514c
            if (r3 < r1) goto L_0x0050
            int r1 = r15.f68515d
            if (r3 > r1) goto L_0x0050
            int r1 = r15.mo37994P(r3, r2)
            goto L_0x0051
        L_0x0043:
            int r1 = r15.f68514c
            if (r3 < r1) goto L_0x0050
            int r1 = r15.f68515d
            if (r3 > r1) goto L_0x0050
            int r1 = r15.mo37994P(r3, r7)
            goto L_0x0051
        L_0x0050:
            r1 = -1
        L_0x0051:
            r2 = r1
            if (r2 != r8) goto L_0x0061
            r20 = r3
            r2 = r4
            r17 = r5
            r27 = r9
        L_0x005b:
            r18 = -1
            r19 = 0
            goto L_0x0355
        L_0x0061:
            int[] r1 = r15.f68512a
            int r17 = r2 + 1
            r8 = r1[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r8 & r17
            int r7 = r17 >>> 20
            r32 = r3
            r3 = r8 & r10
            long r10 = (long) r3
            r3 = 17
            r20 = r10
            if (r7 > r3) goto L_0x0260
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r11 = 1
            int r22 = r11 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            if (r1 == r5) goto L_0x0097
            if (r5 == r3) goto L_0x008d
            long r10 = (long) r5
            r9.putInt(r14, r10, r6)
        L_0x008d:
            if (r1 == r3) goto L_0x0094
            long r5 = (long) r1
            int r6 = r9.getInt(r14, r5)
        L_0x0094:
            r10 = r6
            r6 = r1
            goto L_0x0099
        L_0x0097:
            r10 = r6
            r6 = r5
        L_0x0099:
            r1 = 5
            switch(r7) {
                case 0: goto L_0x0238;
                case 1: goto L_0x021f;
                case 2: goto L_0x01f9;
                case 3: goto L_0x01f9;
                case 4: goto L_0x01df;
                case 5: goto L_0x01bf;
                case 6: goto L_0x0199;
                case 7: goto L_0x0178;
                case 8: goto L_0x0155;
                case 9: goto L_0x0127;
                case 10: goto L_0x010d;
                case 11: goto L_0x01df;
                case 12: goto L_0x00f4;
                case 13: goto L_0x0199;
                case 14: goto L_0x01bf;
                case 15: goto L_0x00d7;
                case 16: goto L_0x00aa;
                default: goto L_0x009d;
            }
        L_0x009d:
            r20 = r32
            r11 = r34
            r13 = r4
            r17 = r6
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            goto L_0x0259
        L_0x00aa:
            if (r0 != 0) goto L_0x00cb
            r11 = r34
            r7 = r20
            int r16 = com.google.protobuf.C23825f.m28729K(r12, r4, r11)
            long r0 = r11.f68236b
            long r4 = com.google.protobuf.C23856l.m28956c(r0)
            r0 = r9
            r1 = r30
            r20 = r32
            r17 = r6
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            r2 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x0214
        L_0x00cb:
            r20 = r32
            r11 = r34
            r17 = r6
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            goto L_0x01dc
        L_0x00d7:
            r11 = r34
            r17 = r6
            r7 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            r6 = r2
            if (r0 != 0) goto L_0x01dc
            int r0 = com.google.protobuf.C23825f.m28727I(r12, r4, r11)
            int r1 = r11.f68235a
            int r1 = com.google.protobuf.C23856l.m28955b(r1)
            r9.putInt(r14, r7, r1)
            goto L_0x0251
        L_0x00f4:
            r11 = r34
            r17 = r6
            r7 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            r6 = r2
            if (r0 != 0) goto L_0x01dc
            int r0 = com.google.protobuf.C23825f.m28727I(r12, r4, r11)
            int r1 = r11.f68235a
            r9.putInt(r14, r7, r1)
            goto L_0x0251
        L_0x010d:
            r11 = r34
            r17 = r6
            r7 = r20
            r1 = 2
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            r6 = r2
            if (r0 != r1) goto L_0x01dc
            int r0 = com.google.protobuf.C23825f.m28733b(r12, r4, r11)
            java.lang.Object r1 = r11.f68237c
            r9.putObject(r14, r7, r1)
            goto L_0x0251
        L_0x0127:
            r11 = r34
            r17 = r6
            r7 = r20
            r1 = 2
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            r6 = r2
            if (r0 != r1) goto L_0x01dc
            com.google.protobuf.f2 r0 = r15.mo38004n(r6)
            int r0 = com.google.protobuf.C23825f.m28747p(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r7)
            if (r1 != 0) goto L_0x014b
            java.lang.Object r1 = r11.f68237c
            r9.putObject(r14, r7, r1)
            goto L_0x01b0
        L_0x014b:
            java.lang.Object r2 = r11.f68237c
            java.lang.Object r1 = com.google.protobuf.C23908o0.m29425c(r1, r2)
            r9.putObject(r14, r7, r1)
            goto L_0x01b0
        L_0x0155:
            r11 = r34
            r17 = r6
            r1 = 2
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            if (r0 != r1) goto L_0x01dc
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x016e
            int r0 = com.google.protobuf.C23825f.m28721C(r12, r4, r11)
            goto L_0x0172
        L_0x016e:
            int r0 = com.google.protobuf.C23825f.m28724F(r12, r4, r11)
        L_0x0172:
            java.lang.Object r1 = r11.f68237c
            r9.putObject(r14, r2, r1)
            goto L_0x01b0
        L_0x0178:
            r11 = r34
            r17 = r6
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            if (r0 != 0) goto L_0x01dc
            int r0 = com.google.protobuf.C23825f.m28729K(r12, r4, r11)
            long r4 = r11.f68236b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0194
            r1 = 1
            goto L_0x0195
        L_0x0194:
            r1 = 0
        L_0x0195:
            com.google.protobuf.C24065x2.m29991r(r14, r2, r1)
            goto L_0x01b0
        L_0x0199:
            r11 = r34
            r17 = r6
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            if (r0 != r1) goto L_0x01dc
            int r0 = com.google.protobuf.C23825f.m28739h(r12, r4)
            r9.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x01b0:
            r1 = r10 | r22
            r2 = r6
            r5 = r17
            r7 = 0
            r8 = -1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r1
            r1 = r20
            goto L_0x0019
        L_0x01bf:
            r11 = r34
            r17 = r6
            r1 = 1
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            if (r0 != r1) goto L_0x01dc
            long r7 = com.google.protobuf.C23825f.m28741j(r12, r4)
            r0 = r9
            r1 = r30
            r13 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x024f
        L_0x01dc:
            r13 = r4
            goto L_0x0259
        L_0x01df:
            r11 = r34
            r13 = r4
            r17 = r6
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            if (r0 != 0) goto L_0x0259
            int r0 = com.google.protobuf.C23825f.m28727I(r12, r13, r11)
            int r1 = r11.f68235a
            r9.putInt(r14, r2, r1)
            goto L_0x0251
        L_0x01f9:
            r11 = r34
            r13 = r4
            r17 = r6
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            if (r0 != 0) goto L_0x0259
            int r16 = com.google.protobuf.C23825f.m28729K(r12, r13, r11)
            long r4 = r11.f68236b
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
        L_0x0214:
            r0 = r10 | r22
            r22 = r6
            r5 = r17
            r6 = r0
            r0 = r16
            goto L_0x02a9
        L_0x021f:
            r11 = r34
            r13 = r4
            r17 = r6
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            if (r0 != r1) goto L_0x0259
            float r0 = com.google.protobuf.C23825f.m28743l(r12, r13)
            com.google.protobuf.C24065x2.m29996w(r14, r2, r0)
            int r0 = r13 + 4
            goto L_0x0251
        L_0x0238:
            r11 = r34
            r13 = r4
            r17 = r6
            r1 = 1
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            if (r0 != r1) goto L_0x0259
            double r0 = com.google.protobuf.C23825f.m28735d(r12, r13)
            com.google.protobuf.C24065x2.m29995v(r14, r2, r0)
        L_0x024f:
            int r0 = r13 + 8
        L_0x0251:
            r1 = r10 | r22
            r22 = r6
            r5 = r17
            r6 = r1
            goto L_0x02a9
        L_0x0259:
            r7 = r6
            r27 = r9
            r6 = r10
            r2 = r13
            goto L_0x005b
        L_0x0260:
            r11 = r34
            r13 = r4
            r10 = r6
            r6 = r2
            r2 = r20
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r32
            r1 = 27
            if (r7 != r1) goto L_0x02c0
            r1 = 2
            if (r0 != r1) goto L_0x02b1
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.protobuf.o0$j r0 = (com.google.protobuf.C23908o0.C23919j) r0
            boolean r1 = r0.mo37523Q()
            if (r1 != 0) goto L_0x0291
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0288
            r1 = 10
            goto L_0x028a
        L_0x0288:
            int r1 = r1 * 2
        L_0x028a:
            com.google.protobuf.o0$j r0 = r0.mo37467E0(r1)
            r9.putObject(r14, r2, r0)
        L_0x0291:
            r7 = r0
            com.google.protobuf.f2 r0 = r15.mo38004n(r6)
            r1 = r16
            r2 = r31
            r3 = r13
            r4 = r33
            r8 = r5
            r5 = r7
            r22 = r6
            r6 = r34
            int r0 = com.google.protobuf.C23825f.m28748q(r0, r1, r2, r3, r4, r5, r6)
            r5 = r8
            r6 = r10
        L_0x02a9:
            r13 = r33
            r1 = r20
            r2 = r22
            goto L_0x0376
        L_0x02b1:
            r22 = r6
            r21 = r5
            r27 = r9
            r28 = r10
            r15 = r13
            r18 = -1
            r19 = 0
            goto L_0x032c
        L_0x02c0:
            r22 = r6
            r6 = r5
            r1 = 49
            if (r7 > r1) goto L_0x02fd
            long r4 = (long) r8
            r8 = r0
            r0 = r29
            r1 = r30
            r23 = r2
            r2 = r31
            r3 = r13
            r25 = r4
            r4 = r33
            r5 = r16
            r15 = r6
            r6 = r20
            r32 = r7
            r19 = 0
            r7 = r8
            r18 = -1
            r8 = r22
            r27 = r9
            r28 = r10
            r9 = r25
            r11 = r32
            r21 = r15
            r15 = r13
            r12 = r23
            r14 = r34
            int r0 = r0.mo37987H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02fa
            goto L_0x0347
        L_0x02fa:
            r4 = r0
            goto L_0x034e
        L_0x02fd:
            r23 = r2
            r21 = r6
            r32 = r7
            r27 = r9
            r28 = r10
            r15 = r13
            r18 = -1
            r19 = 0
            r7 = r0
            r0 = 50
            r9 = r32
            if (r9 != r0) goto L_0x032e
            r0 = 2
            if (r7 != r0) goto L_0x032c
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r22
            r6 = r23
            r8 = r34
            int r0 = r0.mo37983D(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02fa
            goto L_0x0347
        L_0x032c:
            r4 = r15
            goto L_0x034e
        L_0x032e:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r16
            r6 = r20
            r10 = r23
            r12 = r22
            r13 = r34
            int r0 = r0.mo37984E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02fa
        L_0x0347:
            r5 = r21
            r2 = r22
            r6 = r28
            goto L_0x0368
        L_0x034e:
            r2 = r4
            r17 = r21
            r7 = r22
            r6 = r28
        L_0x0355:
            com.google.protobuf.t2 r4 = m29434o(r30)
            r0 = r16
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.protobuf.C23825f.m28725G(r0, r1, r2, r3, r4, r5)
            r2 = r7
            r5 = r17
        L_0x0368:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r20
            r9 = r27
        L_0x0376:
            r7 = 0
            r8 = -1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x037d:
            r28 = r6
            r27 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r1) goto L_0x0390
            long r1 = (long) r5
            r3 = r30
            r4 = r27
            r6 = r28
            r4.putInt(r3, r1, r6)
        L_0x0390:
            r1 = r33
            if (r0 != r1) goto L_0x0395
            return r0
        L_0x0395:
            com.google.protobuf.p0 r0 = com.google.protobuf.C23922p0.m29482g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo37986G(java.lang.Object, byte[], int, int, com.google.protobuf.f$a):int");
    }

    /* renamed from: H */
    public final int mo37987H(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C23825f.C23826a aVar) {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i15 = i5;
        int i16 = i6;
        long j3 = j2;
        C23825f.C23826a aVar2 = aVar;
        Unsafe unsafe = f68511s;
        C23908o0.C23919j jVar = (C23908o0.C23919j) unsafe.getObject(t, j3);
        if (!jVar.mo37523Q()) {
            int size = jVar.size();
            jVar = jVar.mo37467E0(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, jVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i15 == 2) {
                    return C23825f.m28750s(bArr, i9, jVar, aVar2);
                }
                if (i15 == 1) {
                    return C23825f.m28736e(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    return C23825f.m28753v(bArr, i9, jVar, aVar2);
                }
                if (i15 == 5) {
                    return C23825f.m28744m(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    return C23825f.m28757z(bArr, i9, jVar, aVar2);
                }
                if (i15 == 0) {
                    return C23825f.m28730L(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return C23825f.m28756y(bArr, i9, jVar, aVar2);
                }
                if (i15 == 0) {
                    return C23825f.m28728J(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    return C23825f.m28752u(bArr, i9, jVar, aVar2);
                }
                if (i15 == 1) {
                    return C23825f.m28742k(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i15 == 2) {
                    return C23825f.m28751t(bArr, i9, jVar, aVar2);
                }
                if (i15 == 5) {
                    return C23825f.m28740i(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    return C23825f.m28749r(bArr, i9, jVar, aVar2);
                }
                if (i15 == 0) {
                    return C23825f.m28732a(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 26:
                if (i15 == 2) {
                    return (j & 536870912) == 0 ? C23825f.m28722D(i3, bArr, i, i2, jVar, aVar) : C23825f.m28723E(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 27:
                if (i15 == 2) {
                    return C23825f.m28748q(mo38004n(i16), i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 28:
                if (i15 == 2) {
                    return C23825f.m28734c(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i15 == 2) {
                    i8 = C23825f.m28756y(bArr, i9, jVar, aVar2);
                } else if (i15 == 0) {
                    i8 = C23825f.m28728J(i3, bArr, i, i2, jVar, aVar);
                }
                C23861l0 l0Var = (C23861l0) t2;
                C24046t2 t2Var = l0Var.unknownFields;
                if (t2Var == C24046t2.f69159f) {
                    t2Var = null;
                }
                C24046t2 t2Var2 = (C24046t2) C23842h2.m28881A(i4, jVar, mo38002l(i16), t2Var, this.f68526o);
                if (t2Var2 != null) {
                    l0Var.unknownFields = t2Var2;
                }
                return i8;
            case 33:
            case 47:
                if (i15 == 2) {
                    return C23825f.m28754w(bArr, i9, jVar, aVar2);
                }
                if (i15 == 0) {
                    return C23825f.m28719A(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    return C23825f.m28755x(bArr, i9, jVar, aVar2);
                }
                if (i15 == 0) {
                    return C23825f.m28720B(i3, bArr, i, i2, jVar, aVar);
                }
                break;
            case 49:
                if (i15 == 3) {
                    return C23825f.m28746o(mo38004n(i16), i3, bArr, i, i2, jVar, aVar);
                }
                break;
        }
        return i9;
    }

    /* renamed from: I */
    public final <E> void mo37988I(Object obj, long j, C23819d2 d2Var, C23828f2<E> f2Var, C23806a0 a0Var) {
        d2Var.mo37542J(this.f68525n.mo38388c(obj, j), f2Var, a0Var);
    }

    /* renamed from: J */
    public final <E> void mo37989J(Object obj, int i, C23819d2 d2Var, C23828f2<E> f2Var, C23806a0 a0Var) {
        d2Var.mo37561l(this.f68525n.mo38388c(obj, (long) (i & 1048575)), f2Var, a0Var);
    }

    /* renamed from: K */
    public final void mo37990K(Object obj, int i, C23819d2 d2Var) {
        if ((536870912 & i) != 0) {
            C24065x2.m29999z(obj, (long) (i & 1048575), d2Var.mo37548P());
        } else if (this.f68518g) {
            C24065x2.m29999z(obj, (long) (i & 1048575), d2Var.mo37571t());
        } else {
            C24065x2.m29999z(obj, (long) (i & 1048575), d2Var.mo37577z());
        }
    }

    /* renamed from: L */
    public final void mo37991L(Object obj, int i, C23819d2 d2Var) {
        if ((536870912 & i) != 0) {
            d2Var.mo37564o(this.f68525n.mo38388c(obj, (long) (i & 1048575)));
        } else {
            d2Var.mo37536D(this.f68525n.mo38388c(obj, (long) (i & 1048575)));
        }
    }

    /* renamed from: N */
    public final void mo37992N(T t, int i) {
        int i2 = this.f68512a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C24065x2.m29997x(t, j, (1 << (i2 >>> 20)) | C24065x2.m29986m(t, j));
        }
    }

    /* renamed from: O */
    public final void mo37993O(T t, int i, int i2) {
        C24065x2.m29997x(t, (long) (this.f68512a[i2 + 2] & 1048575), i);
    }

    /* renamed from: P */
    public final int mo37994P(int i, int i2) {
        int length = (this.f68512a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f68512a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: R */
    public final int mo37995R(int i) {
        return this.f68512a[i + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37996S(T r18, com.google.protobuf.C23809a3 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f68517f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.b0<?> r3 = r0.f68527p
            com.google.protobuf.g0 r3 = r3.mo37484c(r1)
            boolean r5 = r3.mo37648p()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo37650t()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f68512a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f68511s
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002d:
            if (r10 >= r6) goto L_0x050b
            int r13 = r0.mo37995R(r10)
            int[] r14 = r0.f68512a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            boolean r9 = r0.f68519h
            if (r9 != 0) goto L_0x005c
            r9 = 17
            if (r4 > r9) goto L_0x005c
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0056
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0056:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x005d
        L_0x005c:
            r8 = 0
        L_0x005d:
            if (r5 == 0) goto L_0x007b
            com.google.protobuf.b0<?> r9 = r0.f68527p
            int r9 = r9.mo37482a(r5)
            if (r9 > r15) goto L_0x007b
            com.google.protobuf.b0<?> r9 = r0.f68527p
            r9.mo37491j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005d
        L_0x0079:
            r5 = 0
            goto L_0x005d
        L_0x007b:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x04f9;
                case 1: goto L_0x04ea;
                case 2: goto L_0x04db;
                case 3: goto L_0x04cc;
                case 4: goto L_0x04bd;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049f;
                case 7: goto L_0x0490;
                case 8: goto L_0x0483;
                case 9: goto L_0x046f;
                case 10: goto L_0x045d;
                case 11: goto L_0x044d;
                case 12: goto L_0x043d;
                case 13: goto L_0x042d;
                case 14: goto L_0x041d;
                case 15: goto L_0x040d;
                case 16: goto L_0x03fd;
                case 17: goto L_0x03e9;
                case 18: goto L_0x03d9;
                case 19: goto L_0x03c9;
                case 20: goto L_0x03b9;
                case 21: goto L_0x03a9;
                case 22: goto L_0x0399;
                case 23: goto L_0x0389;
                case 24: goto L_0x0379;
                case 25: goto L_0x0369;
                case 26: goto L_0x035a;
                case 27: goto L_0x0347;
                case 28: goto L_0x0338;
                case 29: goto L_0x0328;
                case 30: goto L_0x0318;
                case 31: goto L_0x0308;
                case 32: goto L_0x02f8;
                case 33: goto L_0x02e8;
                case 34: goto L_0x02d8;
                case 35: goto L_0x02c8;
                case 36: goto L_0x02b8;
                case 37: goto L_0x02a8;
                case 38: goto L_0x0298;
                case 39: goto L_0x0288;
                case 40: goto L_0x0278;
                case 41: goto L_0x0268;
                case 42: goto L_0x0258;
                case 43: goto L_0x0248;
                case 44: goto L_0x0238;
                case 45: goto L_0x0228;
                case 46: goto L_0x0218;
                case 47: goto L_0x0208;
                case 48: goto L_0x01f8;
                case 49: goto L_0x01e5;
                case 50: goto L_0x01dc;
                case 51: goto L_0x01c4;
                case 52: goto L_0x01ac;
                case 53: goto L_0x019a;
                case 54: goto L_0x0188;
                case 55: goto L_0x0176;
                case 56: goto L_0x0164;
                case 57: goto L_0x0152;
                case 58: goto L_0x013a;
                case 59: goto L_0x012b;
                case 60: goto L_0x0115;
                case 61: goto L_0x0101;
                case 62: goto L_0x00f0;
                case 63: goto L_0x00df;
                case 64: goto L_0x00ce;
                case 65: goto L_0x00bd;
                case 66: goto L_0x00ac;
                case 67: goto L_0x009b;
                case 68: goto L_0x0086;
                default: goto L_0x0083;
            }
        L_0x0083:
            r4 = 0
            goto L_0x0507
        L_0x0086:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.f2 r8 = r0.mo38004n(r10)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37964l(r15, r4, r8)
            goto L_0x0083
        L_0x009b:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            long r13 = m29431C(r1, r13)
            r4 = r2
            com.google.protobuf.o r4 = (com.google.protobuf.C23907o) r4
            r4.mo37973u(r15, r13)
            goto L_0x0083
        L_0x00ac:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            int r4 = m29430B(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37972t(r15, r4)
            goto L_0x0083
        L_0x00bd:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            long r13 = m29431C(r1, r13)
            r4 = r2
            com.google.protobuf.o r4 = (com.google.protobuf.C23907o) r4
            r4.mo37971s(r15, r13)
            goto L_0x0083
        L_0x00ce:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            int r4 = m29430B(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37970r(r15, r4)
            goto L_0x0083
        L_0x00df:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            int r4 = m29430B(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37958f(r15, r4)
            goto L_0x0083
        L_0x00f0:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            int r4 = m29430B(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37975w(r15, r4)
            goto L_0x0083
        L_0x0101:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.k r4 = (com.google.protobuf.C16994k) r4
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37954b(r15, r4)
            goto L_0x0083
        L_0x0115:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.f2 r8 = r0.mo38004n(r10)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37968p(r15, r4, r8)
            goto L_0x0083
        L_0x012b:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.mo37998U(r15, r4, r2)
            goto L_0x0083
        L_0x013a:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r1, r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37953a(r15, r4)
            goto L_0x0083
        L_0x0152:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            int r4 = m29430B(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37959g(r15, r4)
            goto L_0x0083
        L_0x0164:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            long r13 = m29431C(r1, r13)
            r4 = r2
            com.google.protobuf.o r4 = (com.google.protobuf.C23907o) r4
            r4.mo37961i(r15, r13)
            goto L_0x0083
        L_0x0176:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            int r4 = m29430B(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37965m(r15, r4)
            goto L_0x0083
        L_0x0188:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            long r13 = m29431C(r1, r13)
            r4 = r2
            com.google.protobuf.o r4 = (com.google.protobuf.C23907o) r4
            r4.mo37976x(r15, r13)
            goto L_0x0083
        L_0x019a:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            long r13 = m29431C(r1, r13)
            r4 = r2
            com.google.protobuf.o r4 = (com.google.protobuf.C23907o) r4
            r4.mo37966n(r15, r13)
            goto L_0x0083
        L_0x01ac:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r1, r13)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37963k(r15, r4)
            goto L_0x0083
        L_0x01c4:
            boolean r4 = r0.mo38008s(r1, r15, r10)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r1, r13)
            java.lang.Double r4 = (java.lang.Double) r4
            double r13 = r4.doubleValue()
            r4 = r2
            com.google.protobuf.o r4 = (com.google.protobuf.C23907o) r4
            r4.mo37956d(r15, r13)
            goto L_0x0083
        L_0x01dc:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.mo37997T(r2, r15, r4, r10)
            goto L_0x0083
        L_0x01e5:
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.f2 r13 = r0.mo38004n(r10)
            com.google.protobuf.C23842h2.m28893M(r4, r8, r2, r13)
            goto L_0x0083
        L_0x01f8:
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.protobuf.C23842h2.m28900T(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0208:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28899S(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0218:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28898R(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0228:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28897Q(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0238:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28889I(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0248:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28902V(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0258:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28886F(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0268:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28890J(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0278:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28891K(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0288:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28894N(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0298:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28903W(r4, r8, r2, r15)
            goto L_0x0083
        L_0x02a8:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28895O(r4, r8, r2, r15)
            goto L_0x0083
        L_0x02b8:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28892L(r4, r8, r2, r15)
            goto L_0x0083
        L_0x02c8:
            r15 = 1
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28888H(r4, r8, r2, r15)
            goto L_0x0083
        L_0x02d8:
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.C23842h2.m28900T(r4, r8, r2, r15)
            goto L_0x0083
        L_0x02e8:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28899S(r4, r8, r2, r15)
            goto L_0x0083
        L_0x02f8:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28898R(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0308:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28897Q(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0318:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28889I(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0328:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28902V(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0338:
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28887G(r4, r8, r2)
            goto L_0x0083
        L_0x0347:
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.f2 r13 = r0.mo38004n(r10)
            com.google.protobuf.C23842h2.m28896P(r4, r8, r2, r13)
            goto L_0x0083
        L_0x035a:
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28901U(r4, r8, r2)
            goto L_0x0083
        L_0x0369:
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.C23842h2.m28886F(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0379:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28890J(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0389:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28891K(r4, r8, r2, r15)
            goto L_0x0083
        L_0x0399:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28894N(r4, r8, r2, r15)
            goto L_0x0083
        L_0x03a9:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28903W(r4, r8, r2, r15)
            goto L_0x0083
        L_0x03b9:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28895O(r4, r8, r2, r15)
            goto L_0x0083
        L_0x03c9:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28892L(r4, r8, r2, r15)
            goto L_0x0083
        L_0x03d9:
            r15 = 0
            int[] r4 = r0.f68512a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C23842h2.m28888H(r4, r8, r2, r15)
            goto L_0x0083
        L_0x03e9:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.f2 r13 = r0.mo38004n(r10)
            r14 = r2
            com.google.protobuf.o r14 = (com.google.protobuf.C23907o) r14
            r14.mo37964l(r15, r8, r13)
            goto L_0x0507
        L_0x03fd:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37973u(r15, r13)
            goto L_0x0507
        L_0x040d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37972t(r15, r8)
            goto L_0x0507
        L_0x041d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37971s(r15, r13)
            goto L_0x0507
        L_0x042d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37970r(r15, r8)
            goto L_0x0507
        L_0x043d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37958f(r15, r8)
            goto L_0x0507
        L_0x044d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37975w(r15, r8)
            goto L_0x0507
        L_0x045d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.k r8 = (com.google.protobuf.C16994k) r8
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37954b(r15, r8)
            goto L_0x0507
        L_0x046f:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.f2 r13 = r0.mo38004n(r10)
            r14 = r2
            com.google.protobuf.o r14 = (com.google.protobuf.C23907o) r14
            r14.mo37968p(r15, r8, r13)
            goto L_0x0507
        L_0x0483:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            java.lang.Object r8 = r7.getObject(r1, r13)
            r0.mo37998U(r15, r8, r2)
            goto L_0x0507
        L_0x0490:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            boolean r8 = com.google.protobuf.C24065x2.m29979f(r1, r13)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37953a(r15, r8)
            goto L_0x0507
        L_0x049f:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37959g(r15, r8)
            goto L_0x0507
        L_0x04ae:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37961i(r15, r13)
            goto L_0x0507
        L_0x04bd:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37965m(r15, r8)
            goto L_0x0507
        L_0x04cc:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37976x(r15, r13)
            goto L_0x0507
        L_0x04db:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37966n(r15, r13)
            goto L_0x0507
        L_0x04ea:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            float r8 = com.google.protobuf.C24065x2.m29985l(r1, r13)
            r13 = r2
            com.google.protobuf.o r13 = (com.google.protobuf.C23907o) r13
            r13.mo37963k(r15, r8)
            goto L_0x0507
        L_0x04f9:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0507
            double r13 = com.google.protobuf.C24065x2.m29984k(r1, r13)
            r8 = r2
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37956d(r15, r13)
        L_0x0507:
            int r10 = r10 + 3
            goto L_0x002d
        L_0x050b:
            if (r5 == 0) goto L_0x0522
            com.google.protobuf.b0<?> r4 = r0.f68527p
            r4.mo37491j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0520
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x050b
        L_0x0520:
            r5 = 0
            goto L_0x050b
        L_0x0522:
            com.google.protobuf.r2<?, ?> r3 = r0.f68526o
            java.lang.Object r1 = r3.mo38033g(r1)
            r3.mo38045s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo37996S(java.lang.Object, com.google.protobuf.a3):void");
    }

    /* renamed from: T */
    public final <K, V> void mo37997T(C23809a3 a3Var, int i, Object obj, int i2) {
        if (obj != null) {
            C24084z0.C24085a<?, ?> b = this.f68528q.mo18726b(mo38003m(i2));
            Map<?, ?> f = this.f68528q.mo18730f(obj);
            C23907o oVar = (C23907o) a3Var;
            oVar.f68504a.getClass();
            for (Map.Entry next : f.entrySet()) {
                oVar.f68504a.mo37916W(i, 2);
                oVar.f68504a.mo37918Y(C24084z0.m30082a(b, next.getKey(), next.getValue()));
                C24084z0.m30085d(oVar.f68504a, b, next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: U */
    public final void mo37998U(int i, Object obj, C23809a3 a3Var) {
        if (obj instanceof String) {
            ((C23907o) a3Var).f68504a.mo37914U(i, (String) obj);
            return;
        }
        ((C23907o) a3Var).mo37954b(i, (C16994k) obj);
    }

    /* renamed from: a */
    public void mo37609a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f68512a.length; i += 3) {
            int R = mo37995R(i);
            long j = (long) (1048575 & R);
            int i2 = this.f68512a[i];
            switch ((R & 267386880) >>> 20) {
                case 0:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29995v(t, j, C24065x2.m29984k(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 1:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29996w(t, j, C24065x2.m29985l(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 2:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29998y(t, j, C24065x2.m29987n(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 3:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29998y(t, j, C24065x2.m29987n(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 4:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29997x(t, j, C24065x2.m29986m(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 5:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29998y(t, j, C24065x2.m29987n(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 6:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29997x(t, j, C24065x2.m29986m(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 7:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29991r(t, j, C24065x2.m29979f(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 8:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29999z(t, j, C24065x2.m29988o(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 9:
                    mo38011w(t, t2, i);
                    break;
                case 10:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29999z(t, j, C24065x2.m29988o(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 11:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29997x(t, j, C24065x2.m29986m(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 12:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29997x(t, j, C24065x2.m29986m(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 13:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29997x(t, j, C24065x2.m29986m(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 14:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29998y(t, j, C24065x2.m29987n(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 15:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29997x(t, j, C24065x2.m29986m(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 16:
                    if (!mo38007r(t2, i)) {
                        break;
                    } else {
                        C24065x2.m29998y(t, j, C24065x2.m29987n(t2, j));
                        mo37992N(t, i);
                        break;
                    }
                case 17:
                    mo38011w(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f68525n.mo38387b(t, t2, j);
                    break;
                case 50:
                    C23815c1 c1Var = this.f68528q;
                    Class<?> cls = C23842h2.f68331a;
                    C24065x2.m29999z(t, j, c1Var.mo18725a(C24065x2.m29988o(t, j), C24065x2.m29988o(t2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!mo38008s(t2, i2, i)) {
                        break;
                    } else {
                        C24065x2.m29999z(t, j, C24065x2.m29988o(t2, j));
                        mo37993O(t, i2, i);
                        break;
                    }
                case 60:
                    mo38012x(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo38008s(t2, i2, i)) {
                        break;
                    } else {
                        C24065x2.m29999z(t, j, C24065x2.m29988o(t2, j));
                        mo37993O(t, i2, i);
                        break;
                    }
                case 68:
                    mo38012x(t, t2, i);
                    break;
            }
        }
        C23937r2<?, ?> r2Var = this.f68526o;
        Class<?> cls2 = C23842h2.f68331a;
        r2Var.mo38041o(t, r2Var.mo38037k(r2Var.mo38033g(t), r2Var.mo38033g(t2)));
        if (this.f68517f) {
            C23812b0<?> b0Var = this.f68527p;
            C23832g0<?> c = b0Var.mo37484c(t2);
            if (!c.mo37648p()) {
                b0Var.mo37485d(t).mo37652v(c);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo37610b(T t) {
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f68522k) {
                return !this.f68517f || this.f68527p.mo37484c(t).mo37649q();
            }
            int i4 = this.f68521j[i];
            int i5 = this.f68512a[i4];
            int R = mo37995R(i4);
            int i6 = this.f68512a[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i2) {
                if (i7 != 1048575) {
                    i3 = f68511s.getInt(t, (long) i7);
                }
                i2 = i7;
            }
            if ((268435456 & R) != 0) {
                if (!(i2 == 1048575 ? mo38007r(t, i4) : (i3 & i8) != 0)) {
                    return false;
                }
            }
            int i9 = (267386880 & R) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (i2 == 1048575) {
                    z = mo38007r(t, i4);
                } else if ((i3 & i8) == 0) {
                    z = false;
                }
                if (z && !mo38004n(i4).mo37610b(C24065x2.m29988o(t, (long) (R & 1048575)))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (mo38008s(t, i5, i4) && !mo38004n(i4).mo37610b(C24065x2.m29988o(t, (long) (R & 1048575)))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> f = this.f68528q.mo18730f(C24065x2.m29988o(t, (long) (R & 1048575)));
                            if (!f.isEmpty()) {
                                if (this.f68528q.mo18726b(mo38003m(i4)).f69223c.f69233d == C24087z2.C24094c.MESSAGE) {
                                    C23828f2<?> f2Var = null;
                                    Iterator<?> it = f.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (f2Var == null) {
                                            f2Var = C24086z1.f69225c.mo38436a(next.getClass());
                                        }
                                        if (!f2Var.mo37610b(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) C24065x2.m29988o(t, (long) (R & 1048575));
                if (!list.isEmpty()) {
                    C23828f2 n = mo38004n(i4);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= list.size()) {
                            break;
                        } else if (!n.mo37610b(list.get(i15))) {
                            z = false;
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0582  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37611c(T r13, com.google.protobuf.C23809a3 r14) {
        /*
            r12 = this;
            r14.getClass()
            boolean r0 = r12.f68519h
            if (r0 == 0) goto L_0x05a0
            boolean r0 = r12.f68517f
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.google.protobuf.b0<?> r0 = r12.f68527p
            com.google.protobuf.g0 r0 = r0.mo37484c(r13)
            boolean r2 = r0.mo37648p()
            if (r2 != 0) goto L_0x0023
            java.util.Iterator r0 = r0.mo37650t()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0025
        L_0x0023:
            r0 = r1
            r2 = r0
        L_0x0025:
            int[] r3 = r12.f68512a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x002a:
            if (r5 >= r3) goto L_0x0580
            int r6 = r12.mo37995R(r5)
            int[] r7 = r12.f68512a
            r7 = r7[r5]
        L_0x0034:
            if (r2 == 0) goto L_0x0052
            com.google.protobuf.b0<?> r8 = r12.f68527p
            int r8 = r8.mo37482a(r2)
            if (r8 > r7) goto L_0x0052
            com.google.protobuf.b0<?> r8 = r12.f68527p
            r8.mo37491j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0034
        L_0x0050:
            r2 = r1
            goto L_0x0034
        L_0x0052:
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r8 = r8 & r6
            int r8 = r8 >>> 20
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x056a;
                case 1: goto L_0x0557;
                case 2: goto L_0x0544;
                case 3: goto L_0x0531;
                case 4: goto L_0x051e;
                case 5: goto L_0x050b;
                case 6: goto L_0x04f7;
                case 7: goto L_0x04e3;
                case 8: goto L_0x04d2;
                case 9: goto L_0x04ba;
                case 10: goto L_0x04a4;
                case 11: goto L_0x0490;
                case 12: goto L_0x047c;
                case 13: goto L_0x0468;
                case 14: goto L_0x0454;
                case 15: goto L_0x0440;
                case 16: goto L_0x042c;
                case 17: goto L_0x0414;
                case 18: goto L_0x0403;
                case 19: goto L_0x03f2;
                case 20: goto L_0x03e1;
                case 21: goto L_0x03d0;
                case 22: goto L_0x03bf;
                case 23: goto L_0x03ae;
                case 24: goto L_0x039d;
                case 25: goto L_0x038c;
                case 26: goto L_0x037b;
                case 27: goto L_0x0366;
                case 28: goto L_0x0355;
                case 29: goto L_0x0344;
                case 30: goto L_0x0333;
                case 31: goto L_0x0322;
                case 32: goto L_0x0311;
                case 33: goto L_0x0300;
                case 34: goto L_0x02ef;
                case 35: goto L_0x02de;
                case 36: goto L_0x02cd;
                case 37: goto L_0x02bc;
                case 38: goto L_0x02ab;
                case 39: goto L_0x029a;
                case 40: goto L_0x0289;
                case 41: goto L_0x0278;
                case 42: goto L_0x0267;
                case 43: goto L_0x0256;
                case 44: goto L_0x0245;
                case 45: goto L_0x0234;
                case 46: goto L_0x0223;
                case 47: goto L_0x0212;
                case 48: goto L_0x0201;
                case 49: goto L_0x01ec;
                case 50: goto L_0x01e1;
                case 51: goto L_0x01c7;
                case 52: goto L_0x01ad;
                case 53: goto L_0x0199;
                case 54: goto L_0x0185;
                case 55: goto L_0x0171;
                case 56: goto L_0x015d;
                case 57: goto L_0x0149;
                case 58: goto L_0x012f;
                case 59: goto L_0x011e;
                case 60: goto L_0x0106;
                case 61: goto L_0x00f0;
                case 62: goto L_0x00dc;
                case 63: goto L_0x00c8;
                case 64: goto L_0x00b4;
                case 65: goto L_0x00a0;
                case 66: goto L_0x008c;
                case 67: goto L_0x0078;
                case 68: goto L_0x0060;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x057c
        L_0x0060:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            com.google.protobuf.f2 r8 = r12.mo38004n(r5)
            r9 = r14
            com.google.protobuf.o r9 = (com.google.protobuf.C23907o) r9
            r9.mo37964l(r7, r6, r8)
            goto L_0x057c
        L_0x0078:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m29431C(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37973u(r7, r8)
            goto L_0x057c
        L_0x008c:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m29430B(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37972t(r7, r6)
            goto L_0x057c
        L_0x00a0:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m29431C(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37971s(r7, r8)
            goto L_0x057c
        L_0x00b4:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m29430B(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37970r(r7, r6)
            goto L_0x057c
        L_0x00c8:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m29430B(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37958f(r7, r6)
            goto L_0x057c
        L_0x00dc:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m29430B(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37975w(r7, r6)
            goto L_0x057c
        L_0x00f0:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            com.google.protobuf.k r6 = (com.google.protobuf.C16994k) r6
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37954b(r7, r6)
            goto L_0x057c
        L_0x0106:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            com.google.protobuf.f2 r8 = r12.mo38004n(r5)
            r9 = r14
            com.google.protobuf.o r9 = (com.google.protobuf.C23907o) r9
            r9.mo37968p(r7, r6, r8)
            goto L_0x057c
        L_0x011e:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            r12.mo37998U(r7, r6, r14)
            goto L_0x057c
        L_0x012f:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37953a(r7, r6)
            goto L_0x057c
        L_0x0149:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m29430B(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37959g(r7, r6)
            goto L_0x057c
        L_0x015d:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m29431C(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37961i(r7, r8)
            goto L_0x057c
        L_0x0171:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = m29430B(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37965m(r7, r6)
            goto L_0x057c
        L_0x0185:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m29431C(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37976x(r7, r8)
            goto L_0x057c
        L_0x0199:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = m29431C(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37966n(r7, r8)
            goto L_0x057c
        L_0x01ad:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37963k(r7, r6)
            goto L_0x057c
        L_0x01c7:
            boolean r8 = r12.mo38008s(r13, r7, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37956d(r7, r8)
            goto L_0x057c
        L_0x01e1:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            r12.mo37997T(r14, r7, r6, r5)
            goto L_0x057c
        L_0x01ec:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.f2 r8 = r12.mo38004n(r5)
            com.google.protobuf.C23842h2.m28893M(r7, r6, r14, r8)
            goto L_0x057c
        L_0x0201:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28900T(r7, r6, r14, r9)
            goto L_0x057c
        L_0x0212:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28899S(r7, r6, r14, r9)
            goto L_0x057c
        L_0x0223:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28898R(r7, r6, r14, r9)
            goto L_0x057c
        L_0x0234:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28897Q(r7, r6, r14, r9)
            goto L_0x057c
        L_0x0245:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28889I(r7, r6, r14, r9)
            goto L_0x057c
        L_0x0256:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28902V(r7, r6, r14, r9)
            goto L_0x057c
        L_0x0267:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28886F(r7, r6, r14, r9)
            goto L_0x057c
        L_0x0278:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28890J(r7, r6, r14, r9)
            goto L_0x057c
        L_0x0289:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28891K(r7, r6, r14, r9)
            goto L_0x057c
        L_0x029a:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28894N(r7, r6, r14, r9)
            goto L_0x057c
        L_0x02ab:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28903W(r7, r6, r14, r9)
            goto L_0x057c
        L_0x02bc:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28895O(r7, r6, r14, r9)
            goto L_0x057c
        L_0x02cd:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28892L(r7, r6, r14, r9)
            goto L_0x057c
        L_0x02de:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28888H(r7, r6, r14, r9)
            goto L_0x057c
        L_0x02ef:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28900T(r7, r6, r14, r4)
            goto L_0x057c
        L_0x0300:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28899S(r7, r6, r14, r4)
            goto L_0x057c
        L_0x0311:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28898R(r7, r6, r14, r4)
            goto L_0x057c
        L_0x0322:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28897Q(r7, r6, r14, r4)
            goto L_0x057c
        L_0x0333:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28889I(r7, r6, r14, r4)
            goto L_0x057c
        L_0x0344:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28902V(r7, r6, r14, r4)
            goto L_0x057c
        L_0x0355:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28887G(r7, r6, r14)
            goto L_0x057c
        L_0x0366:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.f2 r8 = r12.mo38004n(r5)
            com.google.protobuf.C23842h2.m28896P(r7, r6, r14, r8)
            goto L_0x057c
        L_0x037b:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28901U(r7, r6, r14)
            goto L_0x057c
        L_0x038c:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28886F(r7, r6, r14, r4)
            goto L_0x057c
        L_0x039d:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28890J(r7, r6, r14, r4)
            goto L_0x057c
        L_0x03ae:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28891K(r7, r6, r14, r4)
            goto L_0x057c
        L_0x03bf:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28894N(r7, r6, r14, r4)
            goto L_0x057c
        L_0x03d0:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28903W(r7, r6, r14, r4)
            goto L_0x057c
        L_0x03e1:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28895O(r7, r6, r14, r4)
            goto L_0x057c
        L_0x03f2:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28892L(r7, r6, r14, r4)
            goto L_0x057c
        L_0x0403:
            int[] r7 = r12.f68512a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C23842h2.m28888H(r7, r6, r14, r4)
            goto L_0x057c
        L_0x0414:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            com.google.protobuf.f2 r8 = r12.mo38004n(r5)
            r9 = r14
            com.google.protobuf.o r9 = (com.google.protobuf.C23907o) r9
            r9.mo37964l(r7, r6, r8)
            goto L_0x057c
        L_0x042c:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.protobuf.C24065x2.m29987n(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37973u(r7, r8)
            goto L_0x057c
        L_0x0440:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.protobuf.C24065x2.m29986m(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37972t(r7, r6)
            goto L_0x057c
        L_0x0454:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.protobuf.C24065x2.m29987n(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37971s(r7, r8)
            goto L_0x057c
        L_0x0468:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.protobuf.C24065x2.m29986m(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37970r(r7, r6)
            goto L_0x057c
        L_0x047c:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.protobuf.C24065x2.m29986m(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37958f(r7, r6)
            goto L_0x057c
        L_0x0490:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.protobuf.C24065x2.m29986m(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37975w(r7, r6)
            goto L_0x057c
        L_0x04a4:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            com.google.protobuf.k r6 = (com.google.protobuf.C16994k) r6
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37954b(r7, r6)
            goto L_0x057c
        L_0x04ba:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            com.google.protobuf.f2 r8 = r12.mo38004n(r5)
            r9 = r14
            com.google.protobuf.o r9 = (com.google.protobuf.C23907o) r9
            r9.mo37968p(r7, r6, r8)
            goto L_0x057c
        L_0x04d2:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r13, r8)
            r12.mo37998U(r7, r6, r14)
            goto L_0x057c
        L_0x04e3:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = com.google.protobuf.C24065x2.m29979f(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37953a(r7, r6)
            goto L_0x057c
        L_0x04f7:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.protobuf.C24065x2.m29986m(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37959g(r7, r6)
            goto L_0x057c
        L_0x050b:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.protobuf.C24065x2.m29987n(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37961i(r7, r8)
            goto L_0x057c
        L_0x051e:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.protobuf.C24065x2.m29986m(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37965m(r7, r6)
            goto L_0x057c
        L_0x0531:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.protobuf.C24065x2.m29987n(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37976x(r7, r8)
            goto L_0x057c
        L_0x0544:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.protobuf.C24065x2.m29987n(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37966n(r7, r8)
            goto L_0x057c
        L_0x0557:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = com.google.protobuf.C24065x2.m29985l(r13, r8)
            r8 = r14
            com.google.protobuf.o r8 = (com.google.protobuf.C23907o) r8
            r8.mo37963k(r7, r6)
            goto L_0x057c
        L_0x056a:
            boolean r8 = r12.mo38007r(r13, r5)
            if (r8 == 0) goto L_0x057c
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = com.google.protobuf.C24065x2.m29984k(r13, r8)
            r6 = r14
            com.google.protobuf.o r6 = (com.google.protobuf.C23907o) r6
            r6.mo37956d(r7, r8)
        L_0x057c:
            int r5 = r5 + 3
            goto L_0x002a
        L_0x0580:
            if (r2 == 0) goto L_0x0596
            com.google.protobuf.b0<?> r3 = r12.f68527p
            r3.mo37491j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0594
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0580
        L_0x0594:
            r2 = r1
            goto L_0x0580
        L_0x0596:
            com.google.protobuf.r2<?, ?> r0 = r12.f68526o
            java.lang.Object r13 = r0.mo38033g(r13)
            r0.mo38045s(r13, r14)
            goto L_0x05a3
        L_0x05a0:
            r12.mo37996S(r13, r14)
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo37611c(java.lang.Object, com.google.protobuf.a3):void");
    }

    /* renamed from: d */
    public void mo37612d(T t, byte[] bArr, int i, int i2, C23825f.C23826a aVar) {
        if (this.f68519h) {
            mo37986G(t, bArr, i, i2, aVar);
        } else {
            mo37985F(t, bArr, i, i2, 0, aVar);
        }
    }

    /* renamed from: e */
    public void mo37613e(T t) {
        int i;
        int i2 = this.f68522k;
        while (true) {
            i = this.f68523l;
            if (i2 >= i) {
                break;
            }
            long R = (long) (mo37995R(this.f68521j[i2]) & 1048575);
            Object o = C24065x2.m29988o(t, R);
            if (o != null) {
                C24065x2.m29999z(t, R, this.f68528q.mo18727c(o));
            }
            i2++;
        }
        int length = this.f68521j.length;
        while (i < length) {
            this.f68525n.mo38386a(t, (long) this.f68521j[i]);
            i++;
        }
        this.f68526o.mo38036j(t);
        if (this.f68517f) {
            this.f68527p.mo37487f(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (com.google.protobuf.C23842h2.m28884D(com.google.protobuf.C24065x2.m29988o(r10, r6), com.google.protobuf.C24065x2.m29988o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (com.google.protobuf.C23842h2.m28884D(com.google.protobuf.C24065x2.m29988o(r10, r6), com.google.protobuf.C24065x2.m29988o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (com.google.protobuf.C24065x2.m29987n(r10, r6) == com.google.protobuf.C24065x2.m29987n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (com.google.protobuf.C24065x2.m29986m(r10, r6) == com.google.protobuf.C24065x2.m29986m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (com.google.protobuf.C24065x2.m29987n(r10, r6) == com.google.protobuf.C24065x2.m29987n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (com.google.protobuf.C24065x2.m29986m(r10, r6) == com.google.protobuf.C24065x2.m29986m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (com.google.protobuf.C24065x2.m29986m(r10, r6) == com.google.protobuf.C24065x2.m29986m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (com.google.protobuf.C24065x2.m29986m(r10, r6) == com.google.protobuf.C24065x2.m29986m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (com.google.protobuf.C23842h2.m28884D(com.google.protobuf.C24065x2.m29988o(r10, r6), com.google.protobuf.C24065x2.m29988o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (com.google.protobuf.C23842h2.m28884D(com.google.protobuf.C24065x2.m29988o(r10, r6), com.google.protobuf.C24065x2.m29988o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (com.google.protobuf.C23842h2.m28884D(com.google.protobuf.C24065x2.m29988o(r10, r6), com.google.protobuf.C24065x2.m29988o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        if (com.google.protobuf.C24065x2.m29979f(r10, r6) == com.google.protobuf.C24065x2.m29979f(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        if (com.google.protobuf.C24065x2.m29986m(r10, r6) == com.google.protobuf.C24065x2.m29986m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (com.google.protobuf.C24065x2.m29987n(r10, r6) == com.google.protobuf.C24065x2.m29987n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        if (com.google.protobuf.C24065x2.m29986m(r10, r6) == com.google.protobuf.C24065x2.m29986m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (com.google.protobuf.C24065x2.m29987n(r10, r6) == com.google.protobuf.C24065x2.m29987n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (com.google.protobuf.C24065x2.m29987n(r10, r6) == com.google.protobuf.C24065x2.m29987n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(com.google.protobuf.C24065x2.m29985l(r10, r6)) == java.lang.Float.floatToIntBits(com.google.protobuf.C24065x2.m29985l(r11, r6))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.protobuf.C24065x2.m29984k(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.protobuf.C24065x2.m29984k(r11, r6))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f68512a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d2
            int r4 = r9.mo37995R(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01af;
                case 1: goto L_0x0196;
                case 2: goto L_0x0183;
                case 3: goto L_0x0170;
                case 4: goto L_0x015f;
                case 5: goto L_0x014b;
                case 6: goto L_0x0139;
                case 7: goto L_0x0127;
                case 8: goto L_0x0111;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00d3;
                case 12: goto L_0x00c1;
                case 13: goto L_0x00af;
                case 14: goto L_0x009b;
                case 15: goto L_0x0089;
                case 16: goto L_0x0075;
                case 17: goto L_0x005f;
                case 18: goto L_0x0051;
                case 19: goto L_0x0051;
                case 20: goto L_0x0051;
                case 21: goto L_0x0051;
                case 22: goto L_0x0051;
                case 23: goto L_0x0051;
                case 24: goto L_0x0051;
                case 25: goto L_0x0051;
                case 26: goto L_0x0051;
                case 27: goto L_0x0051;
                case 28: goto L_0x0051;
                case 29: goto L_0x0051;
                case 30: goto L_0x0051;
                case 31: goto L_0x0051;
                case 32: goto L_0x0051;
                case 33: goto L_0x0051;
                case 34: goto L_0x0051;
                case 35: goto L_0x0051;
                case 36: goto L_0x0051;
                case 37: goto L_0x0051;
                case 38: goto L_0x0051;
                case 39: goto L_0x0051;
                case 40: goto L_0x0051;
                case 41: goto L_0x0051;
                case 42: goto L_0x0051;
                case 43: goto L_0x0051;
                case 44: goto L_0x0051;
                case 45: goto L_0x0051;
                case 46: goto L_0x0051;
                case 47: goto L_0x0051;
                case 48: goto L_0x0051;
                case 49: goto L_0x0051;
                case 50: goto L_0x0043;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01cb
        L_0x001c:
            int[] r4 = r9.f68512a
            int r8 = r2 + 2
            r4 = r4[r8]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.protobuf.C24065x2.m29986m(r10, r4)
            int r4 = com.google.protobuf.C24065x2.m29986m(r11, r4)
            if (r8 != r4) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r10, r6)
            java.lang.Object r5 = com.google.protobuf.C24065x2.m29988o(r11, r6)
            boolean r4 = com.google.protobuf.C23842h2.m28884D(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0043:
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r10, r6)
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r11, r6)
            boolean r3 = com.google.protobuf.C23842h2.m28884D(r3, r4)
            goto L_0x01cb
        L_0x0051:
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r10, r6)
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r11, r6)
            boolean r3 = com.google.protobuf.C23842h2.m28884D(r3, r4)
            goto L_0x01cb
        L_0x005f:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r10, r6)
            java.lang.Object r5 = com.google.protobuf.C24065x2.m29988o(r11, r6)
            boolean r4 = com.google.protobuf.C23842h2.m28884D(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0075:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C24065x2.m29987n(r10, r6)
            long r6 = com.google.protobuf.C24065x2.m29987n(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0089:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C24065x2.m29986m(r10, r6)
            int r5 = com.google.protobuf.C24065x2.m29986m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x009b:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C24065x2.m29987n(r10, r6)
            long r6 = com.google.protobuf.C24065x2.m29987n(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00af:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C24065x2.m29986m(r10, r6)
            int r5 = com.google.protobuf.C24065x2.m29986m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00c1:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C24065x2.m29986m(r10, r6)
            int r5 = com.google.protobuf.C24065x2.m29986m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00d3:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C24065x2.m29986m(r10, r6)
            int r5 = com.google.protobuf.C24065x2.m29986m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00e5:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r10, r6)
            java.lang.Object r5 = com.google.protobuf.C24065x2.m29988o(r11, r6)
            boolean r4 = com.google.protobuf.C23842h2.m28884D(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00fb:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r10, r6)
            java.lang.Object r5 = com.google.protobuf.C24065x2.m29988o(r11, r6)
            boolean r4 = com.google.protobuf.C23842h2.m28884D(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0111:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = com.google.protobuf.C24065x2.m29988o(r10, r6)
            java.lang.Object r5 = com.google.protobuf.C24065x2.m29988o(r11, r6)
            boolean r4 = com.google.protobuf.C23842h2.m28884D(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0127:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            boolean r4 = com.google.protobuf.C24065x2.m29979f(r10, r6)
            boolean r5 = com.google.protobuf.C24065x2.m29979f(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0139:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C24065x2.m29986m(r10, r6)
            int r5 = com.google.protobuf.C24065x2.m29986m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x014b:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C24065x2.m29987n(r10, r6)
            long r6 = com.google.protobuf.C24065x2.m29987n(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x015f:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            int r4 = com.google.protobuf.C24065x2.m29986m(r10, r6)
            int r5 = com.google.protobuf.C24065x2.m29986m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0170:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C24065x2.m29987n(r10, r6)
            long r6 = com.google.protobuf.C24065x2.m29987n(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0183:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            long r4 = com.google.protobuf.C24065x2.m29987n(r10, r6)
            long r6 = com.google.protobuf.C24065x2.m29987n(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0196:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            float r4 = com.google.protobuf.C24065x2.m29985l(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.protobuf.C24065x2.m29985l(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x01af:
            boolean r4 = r9.mo37999i(r10, r11, r2)
            if (r4 == 0) goto L_0x01ca
            double r4 = com.google.protobuf.C24065x2.m29984k(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.protobuf.C24065x2.m29984k(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r3 = 0
        L_0x01cb:
            if (r3 != 0) goto L_0x01ce
            return r1
        L_0x01ce:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01d2:
            com.google.protobuf.r2<?, ?> r0 = r9.f68526o
            java.lang.Object r0 = r0.mo38033g(r10)
            com.google.protobuf.r2<?, ?> r2 = r9.f68526o
            java.lang.Object r2 = r2.mo38033g(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e5
            return r1
        L_0x01e5:
            boolean r0 = r9.f68517f
            if (r0 == 0) goto L_0x01fa
            com.google.protobuf.b0<?> r0 = r9.f68527p
            com.google.protobuf.g0 r10 = r0.mo37484c(r10)
            com.google.protobuf.b0<?> r0 = r9.f68527p
            com.google.protobuf.g0 r11 = r0.mo37484c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo37615f(T t) {
        return this.f68519h ? mo38006q(t) : mo38005p(t);
    }

    /* renamed from: g */
    public T mo37616g() {
        return this.f68524m.mo38026a(this.f68516e);
    }

    /* renamed from: h */
    public void mo37617h(T t, C23819d2 d2Var, C23806a0 a0Var) {
        a0Var.getClass();
        mo38009u(this.f68526o, this.f68527p, t, d2Var, a0Var);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d5, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0239, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x023a, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int hashCode(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f68512a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x023e
            int r3 = r8.mo37995R(r1)
            int[] r4 = r8.f68512a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x022b;
                case 1: goto L_0x0220;
                case 2: goto L_0x0215;
                case 3: goto L_0x020a;
                case 4: goto L_0x0203;
                case 5: goto L_0x01f8;
                case 6: goto L_0x01f1;
                case 7: goto L_0x01e6;
                case 8: goto L_0x01d9;
                case 9: goto L_0x01cb;
                case 10: goto L_0x01bf;
                case 11: goto L_0x01b7;
                case 12: goto L_0x01af;
                case 13: goto L_0x01a7;
                case 14: goto L_0x019b;
                case 15: goto L_0x0193;
                case 16: goto L_0x0187;
                case 17: goto L_0x017c;
                case 18: goto L_0x0170;
                case 19: goto L_0x0170;
                case 20: goto L_0x0170;
                case 21: goto L_0x0170;
                case 22: goto L_0x0170;
                case 23: goto L_0x0170;
                case 24: goto L_0x0170;
                case 25: goto L_0x0170;
                case 26: goto L_0x0170;
                case 27: goto L_0x0170;
                case 28: goto L_0x0170;
                case 29: goto L_0x0170;
                case 30: goto L_0x0170;
                case 31: goto L_0x0170;
                case 32: goto L_0x0170;
                case 33: goto L_0x0170;
                case 34: goto L_0x0170;
                case 35: goto L_0x0170;
                case 36: goto L_0x0170;
                case 37: goto L_0x0170;
                case 38: goto L_0x0170;
                case 39: goto L_0x0170;
                case 40: goto L_0x0170;
                case 41: goto L_0x0170;
                case 42: goto L_0x0170;
                case 43: goto L_0x0170;
                case 44: goto L_0x0170;
                case 45: goto L_0x0170;
                case 46: goto L_0x0170;
                case 47: goto L_0x0170;
                case 48: goto L_0x0170;
                case 49: goto L_0x0170;
                case 50: goto L_0x0164;
                case 51: goto L_0x0148;
                case 52: goto L_0x0130;
                case 53: goto L_0x011e;
                case 54: goto L_0x010c;
                case 55: goto L_0x00fe;
                case 56: goto L_0x00ec;
                case 57: goto L_0x00de;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x023a
        L_0x0020:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0239
        L_0x0032:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            long r3 = m29431C(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x0044:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            int r3 = m29430B(r9, r5)
            goto L_0x0239
        L_0x0052:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            long r3 = m29431C(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x0064:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            int r3 = m29430B(r9, r5)
            goto L_0x0239
        L_0x0072:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            int r3 = m29430B(r9, r5)
            goto L_0x0239
        L_0x0080:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            int r3 = m29430B(r9, r5)
            goto L_0x0239
        L_0x008e:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0239
        L_0x00a0:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0239
        L_0x00b2:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0239
        L_0x00c6:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            int r3 = com.google.protobuf.C23908o0.m29423a(r3)
            goto L_0x0239
        L_0x00de:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            int r3 = m29430B(r9, r5)
            goto L_0x0239
        L_0x00ec:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            long r3 = m29431C(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x00fe:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            int r3 = m29430B(r9, r5)
            goto L_0x0239
        L_0x010c:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            long r3 = m29431C(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x011e:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            long r3 = m29431C(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x0130:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0239
        L_0x0148:
            boolean r3 = r8.mo38008s(r9, r4, r1)
            if (r3 == 0) goto L_0x023a
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x0164:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0239
        L_0x0170:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0239
        L_0x017c:
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            if (r3 == 0) goto L_0x01d5
            int r7 = r3.hashCode()
            goto L_0x01d5
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C24065x2.m29987n(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C24065x2.m29986m(r9, r5)
            goto L_0x0239
        L_0x019b:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C24065x2.m29987n(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x01a7:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C24065x2.m29986m(r9, r5)
            goto L_0x0239
        L_0x01af:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C24065x2.m29986m(r9, r5)
            goto L_0x0239
        L_0x01b7:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C24065x2.m29986m(r9, r5)
            goto L_0x0239
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0239
        L_0x01cb:
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            if (r3 == 0) goto L_0x01d5
            int r7 = r3.hashCode()
        L_0x01d5:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x023a
        L_0x01d9:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C24065x2.m29988o(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0239
        L_0x01e6:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.C24065x2.m29979f(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29423a(r3)
            goto L_0x0239
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C24065x2.m29986m(r9, r5)
            goto L_0x0239
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C24065x2.m29987n(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x0203:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C24065x2.m29986m(r9, r5)
            goto L_0x0239
        L_0x020a:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C24065x2.m29987n(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x0215:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C24065x2.m29987n(r9, r5)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
            goto L_0x0239
        L_0x0220:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.C24065x2.m29985l(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0239
        L_0x022b:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.C24065x2.m29984k(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C23908o0.m29424b(r3)
        L_0x0239:
            int r2 = r2 + r3
        L_0x023a:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x023e:
            int r2 = r2 * 53
            com.google.protobuf.r2<?, ?> r0 = r8.f68526o
            java.lang.Object r0 = r0.mo38033g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f68517f
            if (r0 == 0) goto L_0x025c
            int r2 = r2 * 53
            com.google.protobuf.b0<?> r0 = r8.f68527p
            com.google.protobuf.g0 r9 = r0.mo37484c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x025c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.hashCode(java.lang.Object):int");
    }

    /* renamed from: i */
    public final boolean mo37999i(T t, T t2, int i) {
        return mo38007r(t, i) == mo38007r(t2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r3 + 8;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo38000j(byte[] r2, int r3, int r4, com.google.protobuf.C24087z2.C24089b r5, java.lang.Class<?> r6, com.google.protobuf.C23825f.C23826a r7) {
        /*
            r1 = this;
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L_0x0086;
                case 1: goto L_0x005f;
                case 2: goto L_0x0045;
                case 3: goto L_0x0045;
                case 4: goto L_0x0052;
                case 5: goto L_0x006e;
                case 6: goto L_0x0079;
                case 7: goto L_0x009c;
                case 8: goto L_0x000f;
                case 9: goto L_0x0007;
                case 10: goto L_0x0039;
                case 11: goto L_0x0097;
                case 12: goto L_0x0052;
                case 13: goto L_0x0052;
                case 14: goto L_0x0079;
                case 15: goto L_0x006e;
                case 16: goto L_0x0027;
                case 17: goto L_0x0015;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x000f:
            int r2 = com.google.protobuf.C23825f.m28724F(r2, r3, r7)
            goto L_0x00b1
        L_0x0015:
            int r2 = com.google.protobuf.C23825f.m28729K(r2, r3, r7)
            long r3 = r7.f68236b
            long r3 = com.google.protobuf.C23856l.m28956c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f68237c = r3
            goto L_0x00b1
        L_0x0027:
            int r2 = com.google.protobuf.C23825f.m28727I(r2, r3, r7)
            int r3 = r7.f68235a
            int r3 = com.google.protobuf.C23856l.m28955b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f68237c = r3
            goto L_0x00b1
        L_0x0039:
            com.google.protobuf.z1 r5 = com.google.protobuf.C24086z1.f69225c
            com.google.protobuf.f2 r5 = r5.mo38436a(r6)
            int r2 = com.google.protobuf.C23825f.m28747p(r5, r2, r3, r4, r7)
            goto L_0x00b1
        L_0x0045:
            int r2 = com.google.protobuf.C23825f.m28729K(r2, r3, r7)
            long r3 = r7.f68236b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f68237c = r3
            goto L_0x00b1
        L_0x0052:
            int r2 = com.google.protobuf.C23825f.m28727I(r2, r3, r7)
            int r3 = r7.f68235a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f68237c = r3
            goto L_0x00b1
        L_0x005f:
            int r2 = com.google.protobuf.C23825f.m28739h(r2, r3)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.f68237c = r2
            goto L_0x0083
        L_0x006e:
            long r4 = com.google.protobuf.C23825f.m28741j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.f68237c = r2
            goto L_0x0094
        L_0x0079:
            int r2 = com.google.protobuf.C23825f.m28739h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.f68237c = r2
        L_0x0083:
            int r2 = r3 + 4
            goto L_0x00b1
        L_0x0086:
            long r4 = com.google.protobuf.C23825f.m28741j(r2, r3)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.f68237c = r2
        L_0x0094:
            int r2 = r3 + 8
            goto L_0x00b1
        L_0x0097:
            int r2 = com.google.protobuf.C23825f.m28733b(r2, r3, r7)
            goto L_0x00b1
        L_0x009c:
            int r2 = com.google.protobuf.C23825f.m28729K(r2, r3, r7)
            long r3 = r7.f68236b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            r3 = 1
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.f68237c = r3
        L_0x00b1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo38000j(byte[], int, int, com.google.protobuf.z2$b, java.lang.Class, com.google.protobuf.f$a):int");
    }

    /* renamed from: k */
    public final <UT, UB> UB mo38001k(Object obj, int i, UB ub, C23937r2<UT, UB> r2Var) {
        C23908o0.C23913e l;
        int i2 = this.f68512a[i];
        Object o = C24065x2.m29988o(obj, (long) (mo37995R(i) & 1048575));
        if (o == null || (l = mo38002l(i)) == null) {
            return ub;
        }
        Map<?, ?> d = this.f68528q.mo18728d(o);
        C24084z0.C24085a<?, ?> b = this.f68528q.mo18726b(mo38003m(i));
        Iterator<Map.Entry<?, ?>> it = d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!l.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = r2Var.mo38039m();
                }
                int a = C24084z0.m30082a(b, next.getKey(), next.getValue());
                byte[] bArr = new byte[a];
                Logger logger = C23897n.f68486b;
                C23897n.C23899b bVar = new C23897n.C23899b(bArr, 0, a);
                try {
                    C24084z0.m30085d(bVar, b, next.getKey(), next.getValue());
                    if (bVar.mo37895B() == 0) {
                        r2Var.mo38030d(ub, i2, new C16994k.C17000f(bArr));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: l */
    public final C23908o0.C23913e mo38002l(int i) {
        return (C23908o0.C23913e) this.f68513b[((i / 3) * 2) + 1];
    }

    /* renamed from: m */
    public final Object mo38003m(int i) {
        return this.f68513b[(i / 3) * 2];
    }

    /* renamed from: n */
    public final C23828f2 mo38004n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f68513b;
        C23828f2 f2Var = (C23828f2) objArr[i2];
        if (f2Var != null) {
            return f2Var;
        }
        C23828f2 a = C24086z1.f69225c.mo38436a((Class) objArr[i2 + 1]);
        this.f68513b[i2] = a;
        return a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0363, code lost:
        r6 = r6 + ((r4 + r9) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x047e, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0534, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo38005p(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            sun.misc.Unsafe r2 = f68511s
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.f68512a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x053b
            int r9 = r0.mo37995R(r5)
            int[] r10 = r0.f68512a
            r11 = r10[r5]
            r12 = 267386880(0xff00000, float:2.3665827E-29)
            r12 = r12 & r9
            int r12 = r12 >>> 20
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0039
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r15 = r10 >>> 20
            int r15 = r14 << r15
            if (r13 == r7) goto L_0x0057
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
            goto L_0x0057
        L_0x0039:
            boolean r10 = r0.f68520i
            if (r10 == 0) goto L_0x0055
            com.google.protobuf.h0 r10 = com.google.protobuf.C23839h0.DOUBLE_LIST_PACKED
            int r10 = r10.mo37690a()
            if (r12 < r10) goto L_0x0055
            com.google.protobuf.h0 r10 = com.google.protobuf.C23839h0.SINT64_LIST_PACKED
            int r10 = r10.mo37690a()
            if (r12 > r10) goto L_0x0055
            int[] r10 = r0.f68512a
            int r13 = r5 + 2
            r10 = r10[r13]
            r10 = r10 & r3
            goto L_0x0056
        L_0x0055:
            r10 = 0
        L_0x0056:
            r15 = 0
        L_0x0057:
            r9 = r9 & r3
            r16 = r15
            long r14 = (long) r9
            r3 = 0
            r17 = r10
            r9 = 0
            switch(r12) {
                case 0: goto L_0x052a;
                case 1: goto L_0x051f;
                case 2: goto L_0x0511;
                case 3: goto L_0x0503;
                case 4: goto L_0x04f5;
                case 5: goto L_0x04eb;
                case 6: goto L_0x04e1;
                case 7: goto L_0x04d6;
                case 8: goto L_0x04ba;
                case 9: goto L_0x04a9;
                case 10: goto L_0x049a;
                case 11: goto L_0x048d;
                case 12: goto L_0x0480;
                case 13: goto L_0x0475;
                case 14: goto L_0x046c;
                case 15: goto L_0x045f;
                case 16: goto L_0x0452;
                case 17: goto L_0x043f;
                case 18: goto L_0x0431;
                case 19: goto L_0x0425;
                case 20: goto L_0x0419;
                case 21: goto L_0x040d;
                case 22: goto L_0x0401;
                case 23: goto L_0x03f5;
                case 24: goto L_0x03e9;
                case 25: goto L_0x03dd;
                case 26: goto L_0x03d2;
                case 27: goto L_0x03c3;
                case 28: goto L_0x03b7;
                case 29: goto L_0x03aa;
                case 30: goto L_0x039d;
                case 31: goto L_0x0390;
                case 32: goto L_0x0383;
                case 33: goto L_0x0376;
                case 34: goto L_0x0369;
                case 35: goto L_0x0345;
                case 36: goto L_0x0326;
                case 37: goto L_0x0307;
                case 38: goto L_0x02e8;
                case 39: goto L_0x02c8;
                case 40: goto L_0x02a8;
                case 41: goto L_0x0288;
                case 42: goto L_0x0268;
                case 43: goto L_0x0248;
                case 44: goto L_0x0228;
                case 45: goto L_0x0208;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01c8;
                case 48: goto L_0x01a8;
                case 49: goto L_0x0198;
                case 50: goto L_0x0188;
                case 51: goto L_0x017c;
                case 52: goto L_0x016f;
                case 53: goto L_0x015f;
                case 54: goto L_0x014f;
                case 55: goto L_0x013f;
                case 56: goto L_0x0133;
                case 57: goto L_0x0126;
                case 58: goto L_0x0119;
                case 59: goto L_0x00fb;
                case 60: goto L_0x00e7;
                case 61: goto L_0x00d5;
                case 62: goto L_0x00c5;
                case 63: goto L_0x00b5;
                case 64: goto L_0x00a8;
                case 65: goto L_0x009c;
                case 66: goto L_0x008c;
                case 67: goto L_0x007c;
                case 68: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x0366
        L_0x0066:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r2.getObject(r1, r14)
            com.google.protobuf.j1 r3 = (com.google.protobuf.C23845j1) r3
            com.google.protobuf.f2 r4 = r0.mo38004n(r5)
            int r3 = com.google.protobuf.C23897n.m29265j(r11, r3, r4)
            goto L_0x043c
        L_0x007c:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            long r3 = m29431C(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29274s(r11, r3)
            goto L_0x043c
        L_0x008c:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            int r3 = m29430B(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29273r(r11, r3)
            goto L_0x043c
        L_0x009c:
            boolean r9 = r0.mo38008s(r1, r11, r5)
            if (r9 == 0) goto L_0x0366
            int r3 = com.google.protobuf.C23897n.m29272q(r11, r3)
            goto L_0x043c
        L_0x00a8:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            r3 = 0
            int r4 = com.google.protobuf.C23897n.m29271p(r11, r3)
            goto L_0x047e
        L_0x00b5:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            int r3 = m29430B(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29261f(r11, r3)
            goto L_0x043c
        L_0x00c5:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            int r3 = m29430B(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29278w(r11, r3)
            goto L_0x043c
        L_0x00d5:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r2.getObject(r1, r14)
            com.google.protobuf.k r3 = (com.google.protobuf.C16994k) r3
            int r3 = com.google.protobuf.C23897n.m29258c(r11, r3)
            goto L_0x043c
        L_0x00e7:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r2.getObject(r1, r14)
            com.google.protobuf.f2 r4 = r0.mo38004n(r5)
            int r3 = com.google.protobuf.C23842h2.m28918o(r11, r3, r4)
            goto L_0x043c
        L_0x00fb:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r2.getObject(r1, r14)
            boolean r4 = r3 instanceof com.google.protobuf.C16994k
            if (r4 == 0) goto L_0x0111
            com.google.protobuf.k r3 = (com.google.protobuf.C16994k) r3
            int r3 = com.google.protobuf.C23897n.m29258c(r11, r3)
            goto L_0x043c
        L_0x0111:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.C23897n.m29275t(r11, r3)
            goto L_0x043c
        L_0x0119:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            r3 = 1
            int r3 = com.google.protobuf.C23897n.m29257b(r11, r3)
            goto L_0x043c
        L_0x0126:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            r3 = 0
            int r4 = com.google.protobuf.C23897n.m29262g(r11, r3)
            goto L_0x047e
        L_0x0133:
            boolean r9 = r0.mo38008s(r1, r11, r5)
            if (r9 == 0) goto L_0x0366
            int r3 = com.google.protobuf.C23897n.m29263h(r11, r3)
            goto L_0x043c
        L_0x013f:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            int r3 = m29430B(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29266k(r11, r3)
            goto L_0x043c
        L_0x014f:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            long r3 = m29431C(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29280y(r11, r3)
            goto L_0x043c
        L_0x015f:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            long r3 = m29431C(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29268m(r11, r3)
            goto L_0x043c
        L_0x016f:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            r3 = 0
            int r3 = com.google.protobuf.C23897n.m29264i(r11, r3)
            goto L_0x043c
        L_0x017c:
            boolean r3 = r0.mo38008s(r1, r11, r5)
            if (r3 == 0) goto L_0x0366
            int r3 = com.google.protobuf.C23897n.m29260e(r11, r9)
            goto L_0x043c
        L_0x0188:
            com.google.protobuf.c1 r3 = r0.f68528q
            java.lang.Object r4 = r2.getObject(r1, r14)
            java.lang.Object r9 = r0.mo38003m(r5)
            int r3 = r3.mo18731g(r11, r4, r9)
            goto L_0x043c
        L_0x0198:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.f2 r4 = r0.mo38004n(r5)
            int r3 = com.google.protobuf.C23842h2.m28913j(r11, r3, r4)
            goto L_0x043c
        L_0x01a8:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28923t(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x01be
            r10 = r17
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01be:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x01c8:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28921r(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x01de
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01de:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x01e8:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28912i(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x01fe
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01fe:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x0208:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28910g(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x021e
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x021e:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x0228:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28908e(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x023e
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x023e:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x0248:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28926w(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x025e
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x025e:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x0268:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28905b(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x027e
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x027e:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x0288:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28910g(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x029e
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x029e:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x02a8:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28912i(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x02be
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02be:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x02c8:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28915l(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x02de
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02de:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x02e8:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28928y(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x02fe
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02fe:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x0307:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28917n(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x031d
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x031d:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x0326:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28910g(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x033c
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x033c:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
            goto L_0x0363
        L_0x0345:
            r10 = r17
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28912i(r3)
            if (r3 <= 0) goto L_0x0366
            boolean r4 = r0.f68520i
            if (r4 == 0) goto L_0x035b
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x035b:
            int r4 = com.google.protobuf.C23897n.m29277v(r11)
            int r9 = com.google.protobuf.C23897n.m29279x(r3)
        L_0x0363:
            int r4 = r4 + r9
            int r4 = r4 + r3
            int r6 = r6 + r4
        L_0x0366:
            r12 = 0
            goto L_0x0534
        L_0x0369:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C23842h2.m28922s(r11, r3, r4)
            goto L_0x043c
        L_0x0376:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28920q(r11, r3, r4)
            goto L_0x043c
        L_0x0383:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28911h(r11, r3, r4)
            goto L_0x043c
        L_0x0390:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28909f(r11, r3, r4)
            goto L_0x043c
        L_0x039d:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28907d(r11, r3, r4)
            goto L_0x043c
        L_0x03aa:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28925v(r11, r3, r4)
            goto L_0x043c
        L_0x03b7:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28906c(r11, r3)
            goto L_0x043c
        L_0x03c3:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.f2 r4 = r0.mo38004n(r5)
            int r3 = com.google.protobuf.C23842h2.m28919p(r11, r3, r4)
            goto L_0x043c
        L_0x03d2:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28924u(r11, r3)
            goto L_0x043c
        L_0x03dd:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C23842h2.m28904a(r11, r3, r4)
            goto L_0x043c
        L_0x03e9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28909f(r11, r3, r4)
            goto L_0x043c
        L_0x03f5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28911h(r11, r3, r4)
            goto L_0x043c
        L_0x0401:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28914k(r11, r3, r4)
            goto L_0x043c
        L_0x040d:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28927x(r11, r3, r4)
            goto L_0x043c
        L_0x0419:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28916m(r11, r3, r4)
            goto L_0x043c
        L_0x0425:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28909f(r11, r3, r4)
            goto L_0x043c
        L_0x0431:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C23842h2.m28911h(r11, r3, r4)
        L_0x043c:
            r12 = 0
            goto L_0x0533
        L_0x043f:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r2.getObject(r1, r14)
            com.google.protobuf.j1 r3 = (com.google.protobuf.C23845j1) r3
            com.google.protobuf.f2 r4 = r0.mo38004n(r5)
            int r3 = com.google.protobuf.C23897n.m29265j(r11, r3, r4)
            goto L_0x043c
        L_0x0452:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            long r3 = r2.getLong(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29274s(r11, r3)
            goto L_0x043c
        L_0x045f:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            int r3 = r2.getInt(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29273r(r11, r3)
            goto L_0x043c
        L_0x046c:
            r9 = r8 & r16
            if (r9 == 0) goto L_0x0366
            int r3 = com.google.protobuf.C23897n.m29272q(r11, r3)
            goto L_0x043c
        L_0x0475:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            r3 = 0
            int r4 = com.google.protobuf.C23897n.m29271p(r11, r3)
        L_0x047e:
            r3 = r4
            goto L_0x043c
        L_0x0480:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            int r3 = r2.getInt(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29261f(r11, r3)
            goto L_0x043c
        L_0x048d:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            int r3 = r2.getInt(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29278w(r11, r3)
            goto L_0x043c
        L_0x049a:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r2.getObject(r1, r14)
            com.google.protobuf.k r3 = (com.google.protobuf.C16994k) r3
            int r3 = com.google.protobuf.C23897n.m29258c(r11, r3)
            goto L_0x043c
        L_0x04a9:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r2.getObject(r1, r14)
            com.google.protobuf.f2 r4 = r0.mo38004n(r5)
            int r3 = com.google.protobuf.C23842h2.m28918o(r11, r3, r4)
            goto L_0x043c
        L_0x04ba:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            java.lang.Object r3 = r2.getObject(r1, r14)
            boolean r4 = r3 instanceof com.google.protobuf.C16994k
            if (r4 == 0) goto L_0x04ce
            com.google.protobuf.k r3 = (com.google.protobuf.C16994k) r3
            int r3 = com.google.protobuf.C23897n.m29258c(r11, r3)
            goto L_0x043c
        L_0x04ce:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.C23897n.m29275t(r11, r3)
            goto L_0x043c
        L_0x04d6:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            r3 = 1
            int r3 = com.google.protobuf.C23897n.m29257b(r11, r3)
            goto L_0x043c
        L_0x04e1:
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0366
            r12 = 0
            int r3 = com.google.protobuf.C23897n.m29262g(r11, r12)
            goto L_0x0533
        L_0x04eb:
            r12 = 0
            r9 = r8 & r16
            if (r9 == 0) goto L_0x0534
            int r3 = com.google.protobuf.C23897n.m29263h(r11, r3)
            goto L_0x0533
        L_0x04f5:
            r12 = 0
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0534
            int r3 = r2.getInt(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29266k(r11, r3)
            goto L_0x0533
        L_0x0503:
            r12 = 0
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0534
            long r3 = r2.getLong(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29280y(r11, r3)
            goto L_0x0533
        L_0x0511:
            r12 = 0
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0534
            long r3 = r2.getLong(r1, r14)
            int r3 = com.google.protobuf.C23897n.m29268m(r11, r3)
            goto L_0x0533
        L_0x051f:
            r12 = 0
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0534
            r3 = 0
            int r3 = com.google.protobuf.C23897n.m29264i(r11, r3)
            goto L_0x0533
        L_0x052a:
            r12 = 0
            r3 = r8 & r16
            if (r3 == 0) goto L_0x0534
            int r3 = com.google.protobuf.C23897n.m29260e(r11, r9)
        L_0x0533:
            int r6 = r6 + r3
        L_0x0534:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x053b:
            com.google.protobuf.r2<?, ?> r2 = r0.f68526o
            java.lang.Object r3 = r2.mo38033g(r1)
            int r2 = r2.mo38034h(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f68517f
            if (r2 == 0) goto L_0x0555
            com.google.protobuf.b0<?> r2 = r0.f68527p
            com.google.protobuf.g0 r1 = r2.mo37484c(r1)
            int r1 = r1.mo37646n()
            int r6 = r6 + r1
        L_0x0555:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo38005p(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo38006q(T r15) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            sun.misc.Unsafe r2 = f68511s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0007:
            int[] r6 = r0.f68512a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04ef
            int r6 = r14.mo37995R(r4)
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r7 = r7 & r6
            int r7 = r7 >>> 20
            int[] r8 = r0.f68512a
            r8 = r8[r4]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r9
            long r10 = (long) r6
            com.google.protobuf.h0 r6 = com.google.protobuf.C23839h0.DOUBLE_LIST_PACKED
            int r6 = r6.mo37690a()
            if (r7 < r6) goto L_0x0036
            com.google.protobuf.h0 r6 = com.google.protobuf.C23839h0.SINT64_LIST_PACKED
            int r6 = r6.mo37690a()
            if (r7 > r6) goto L_0x0036
            int[] r6 = r0.f68512a
            int r12 = r4 + 2
            r6 = r6[r12]
            r6 = r6 & r9
            goto L_0x0037
        L_0x0036:
            r6 = 0
        L_0x0037:
            r9 = 1
            r12 = 0
            switch(r7) {
                case 0: goto L_0x04e0;
                case 1: goto L_0x04d4;
                case 2: goto L_0x04c5;
                case 3: goto L_0x04b6;
                case 4: goto L_0x04a7;
                case 5: goto L_0x049a;
                case 6: goto L_0x048f;
                case 7: goto L_0x0484;
                case 8: goto L_0x0467;
                case 9: goto L_0x0453;
                case 10: goto L_0x0441;
                case 11: goto L_0x0431;
                case 12: goto L_0x0421;
                case 13: goto L_0x0415;
                case 14: goto L_0x0407;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03d1;
                case 18: goto L_0x03c7;
                case 19: goto L_0x03bd;
                case 20: goto L_0x03b3;
                case 21: goto L_0x03a9;
                case 22: goto L_0x039f;
                case 23: goto L_0x0395;
                case 24: goto L_0x038b;
                case 25: goto L_0x0381;
                case 26: goto L_0x0377;
                case 27: goto L_0x0369;
                case 28: goto L_0x035f;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0156;
                case 52: goto L_0x0149;
                case 53: goto L_0x0139;
                case 54: goto L_0x0129;
                case 55: goto L_0x0119;
                case 56: goto L_0x010b;
                case 57: goto L_0x00ff;
                case 58: goto L_0x00f3;
                case 59: goto L_0x00d5;
                case 60: goto L_0x00c1;
                case 61: goto L_0x00af;
                case 62: goto L_0x009f;
                case 63: goto L_0x008f;
                case 64: goto L_0x0083;
                case 65: goto L_0x0075;
                case 66: goto L_0x0065;
                case 67: goto L_0x0055;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x04eb
        L_0x003f:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            com.google.protobuf.j1 r6 = (com.google.protobuf.C23845j1) r6
            com.google.protobuf.f2 r7 = r14.mo38004n(r4)
            int r6 = com.google.protobuf.C23897n.m29265j(r8, r6, r7)
            goto L_0x04ea
        L_0x0055:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            long r6 = m29431C(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29274s(r8, r6)
            goto L_0x04ea
        L_0x0065:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = m29430B(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29273r(r8, r6)
            goto L_0x04ea
        L_0x0075:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            r6 = 0
            int r6 = com.google.protobuf.C23897n.m29272q(r8, r6)
            goto L_0x04ea
        L_0x0083:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C23897n.m29271p(r8, r3)
            goto L_0x04ea
        L_0x008f:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = m29430B(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29261f(r8, r6)
            goto L_0x04ea
        L_0x009f:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = m29430B(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29278w(r8, r6)
            goto L_0x04ea
        L_0x00af:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            com.google.protobuf.k r6 = (com.google.protobuf.C16994k) r6
            int r6 = com.google.protobuf.C23897n.m29258c(r8, r6)
            goto L_0x04ea
        L_0x00c1:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            com.google.protobuf.f2 r7 = r14.mo38004n(r4)
            int r6 = com.google.protobuf.C23842h2.m28918o(r8, r6, r7)
            goto L_0x04ea
        L_0x00d5:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            boolean r7 = r6 instanceof com.google.protobuf.C16994k
            if (r7 == 0) goto L_0x00eb
            com.google.protobuf.k r6 = (com.google.protobuf.C16994k) r6
            int r6 = com.google.protobuf.C23897n.m29258c(r8, r6)
            goto L_0x04ea
        L_0x00eb:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.C23897n.m29275t(r8, r6)
            goto L_0x04ea
        L_0x00f3:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C23897n.m29257b(r8, r9)
            goto L_0x04ea
        L_0x00ff:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C23897n.m29262g(r8, r3)
            goto L_0x04ea
        L_0x010b:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            r6 = 0
            int r6 = com.google.protobuf.C23897n.m29263h(r8, r6)
            goto L_0x04ea
        L_0x0119:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = m29430B(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29266k(r8, r6)
            goto L_0x04ea
        L_0x0129:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            long r6 = m29431C(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29280y(r8, r6)
            goto L_0x04ea
        L_0x0139:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            long r6 = m29431C(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29268m(r8, r6)
            goto L_0x04ea
        L_0x0149:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            r6 = 0
            int r6 = com.google.protobuf.C23897n.m29264i(r8, r6)
            goto L_0x04ea
        L_0x0156:
            boolean r6 = r14.mo38008s(r15, r8, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C23897n.m29260e(r8, r12)
            goto L_0x04ea
        L_0x0162:
            com.google.protobuf.c1 r6 = r0.f68528q
            java.lang.Object r7 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            java.lang.Object r9 = r14.mo38003m(r4)
            int r6 = r6.mo18731g(r8, r7, r9)
            goto L_0x04ea
        L_0x0172:
            java.util.List r6 = m29435t(r15, r10)
            com.google.protobuf.f2 r7 = r14.mo38004n(r4)
            int r6 = com.google.protobuf.C23842h2.m28913j(r8, r6, r7)
            goto L_0x04ea
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28923t(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x0194:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28921r(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x01b2:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28912i(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x01d0:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28910g(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x01ee:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28908e(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x020c:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28926w(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x022a:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28905b(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x0248:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28910g(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x0266:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28912i(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x0284:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28915l(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x02a2:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28928y(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x02c0:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28917n(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x02dd:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28910g(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x02fa:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r15, r10)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C23842h2.m28912i(r7)
            if (r7 <= 0) goto L_0x04eb
            boolean r9 = r0.f68520i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r15, r9, r7)
        L_0x0317:
            int r6 = com.google.protobuf.C23897n.m29277v(r8)
            int r8 = com.google.protobuf.C23897n.m29279x(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x04ea
        L_0x0323:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28922s(r8, r6, r3)
            goto L_0x04ea
        L_0x032d:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28920q(r8, r6, r3)
            goto L_0x04ea
        L_0x0337:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28911h(r8, r6, r3)
            goto L_0x04ea
        L_0x0341:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28909f(r8, r6, r3)
            goto L_0x04ea
        L_0x034b:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28907d(r8, r6, r3)
            goto L_0x04ea
        L_0x0355:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28925v(r8, r6, r3)
            goto L_0x04ea
        L_0x035f:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28906c(r8, r6)
            goto L_0x04ea
        L_0x0369:
            java.util.List r6 = m29435t(r15, r10)
            com.google.protobuf.f2 r7 = r14.mo38004n(r4)
            int r6 = com.google.protobuf.C23842h2.m28919p(r8, r6, r7)
            goto L_0x04ea
        L_0x0377:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28924u(r8, r6)
            goto L_0x04ea
        L_0x0381:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28904a(r8, r6, r3)
            goto L_0x04ea
        L_0x038b:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28909f(r8, r6, r3)
            goto L_0x04ea
        L_0x0395:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28911h(r8, r6, r3)
            goto L_0x04ea
        L_0x039f:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28914k(r8, r6, r3)
            goto L_0x04ea
        L_0x03a9:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28927x(r8, r6, r3)
            goto L_0x04ea
        L_0x03b3:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28916m(r8, r6, r3)
            goto L_0x04ea
        L_0x03bd:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28909f(r8, r6, r3)
            goto L_0x04ea
        L_0x03c7:
            java.util.List r6 = m29435t(r15, r10)
            int r6 = com.google.protobuf.C23842h2.m28911h(r8, r6, r3)
            goto L_0x04ea
        L_0x03d1:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            com.google.protobuf.j1 r6 = (com.google.protobuf.C23845j1) r6
            com.google.protobuf.f2 r7 = r14.mo38004n(r4)
            int r6 = com.google.protobuf.C23897n.m29265j(r8, r6, r7)
            goto L_0x04ea
        L_0x03e7:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            long r6 = com.google.protobuf.C24065x2.m29987n(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29274s(r8, r6)
            goto L_0x04ea
        L_0x03f7:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C24065x2.m29986m(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29273r(r8, r6)
            goto L_0x04ea
        L_0x0407:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            r6 = 0
            int r6 = com.google.protobuf.C23897n.m29272q(r8, r6)
            goto L_0x04ea
        L_0x0415:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C23897n.m29271p(r8, r3)
            goto L_0x04ea
        L_0x0421:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C24065x2.m29986m(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29261f(r8, r6)
            goto L_0x04ea
        L_0x0431:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C24065x2.m29986m(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29278w(r8, r6)
            goto L_0x04ea
        L_0x0441:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            com.google.protobuf.k r6 = (com.google.protobuf.C16994k) r6
            int r6 = com.google.protobuf.C23897n.m29258c(r8, r6)
            goto L_0x04ea
        L_0x0453:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            com.google.protobuf.f2 r7 = r14.mo38004n(r4)
            int r6 = com.google.protobuf.C23842h2.m28918o(r8, r6, r7)
            goto L_0x04ea
        L_0x0467:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            java.lang.Object r6 = com.google.protobuf.C24065x2.m29988o(r15, r10)
            boolean r7 = r6 instanceof com.google.protobuf.C16994k
            if (r7 == 0) goto L_0x047d
            com.google.protobuf.k r6 = (com.google.protobuf.C16994k) r6
            int r6 = com.google.protobuf.C23897n.m29258c(r8, r6)
            goto L_0x04ea
        L_0x047d:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.C23897n.m29275t(r8, r6)
            goto L_0x04ea
        L_0x0484:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C23897n.m29257b(r8, r9)
            goto L_0x04ea
        L_0x048f:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C23897n.m29262g(r8, r3)
            goto L_0x04ea
        L_0x049a:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            r6 = 0
            int r6 = com.google.protobuf.C23897n.m29263h(r8, r6)
            goto L_0x04ea
        L_0x04a7:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C24065x2.m29986m(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29266k(r8, r6)
            goto L_0x04ea
        L_0x04b6:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            long r6 = com.google.protobuf.C24065x2.m29987n(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29280y(r8, r6)
            goto L_0x04ea
        L_0x04c5:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            long r6 = com.google.protobuf.C24065x2.m29987n(r15, r10)
            int r6 = com.google.protobuf.C23897n.m29268m(r8, r6)
            goto L_0x04ea
        L_0x04d4:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            r6 = 0
            int r6 = com.google.protobuf.C23897n.m29264i(r8, r6)
            goto L_0x04ea
        L_0x04e0:
            boolean r6 = r14.mo38007r(r15, r4)
            if (r6 == 0) goto L_0x04eb
            int r6 = com.google.protobuf.C23897n.m29260e(r8, r12)
        L_0x04ea:
            int r5 = r5 + r6
        L_0x04eb:
            int r4 = r4 + 3
            goto L_0x0007
        L_0x04ef:
            com.google.protobuf.r2<?, ?> r2 = r0.f68526o
            java.lang.Object r1 = r2.mo38033g(r15)
            int r1 = r2.mo38034h(r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo38006q(java.lang.Object):int");
    }

    /* renamed from: r */
    public final boolean mo38007r(T t, int i) {
        boolean equals;
        int i2 = this.f68512a[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int R = mo37995R(i);
            long j2 = (long) (R & 1048575);
            switch ((R & 267386880) >>> 20) {
                case 0:
                    return C24065x2.m29984k(t, j2) != 0.0d;
                case 1:
                    return C24065x2.m29985l(t, j2) != 0.0f;
                case 2:
                    return C24065x2.m29987n(t, j2) != 0;
                case 3:
                    return C24065x2.m29987n(t, j2) != 0;
                case 4:
                    return C24065x2.m29986m(t, j2) != 0;
                case 5:
                    return C24065x2.m29987n(t, j2) != 0;
                case 6:
                    return C24065x2.m29986m(t, j2) != 0;
                case 7:
                    return C24065x2.m29979f(t, j2);
                case 8:
                    Object o = C24065x2.m29988o(t, j2);
                    if (o instanceof String) {
                        equals = ((String) o).isEmpty();
                        break;
                    } else if (o instanceof C16994k) {
                        equals = C16994k.f46000e.equals(o);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return C24065x2.m29988o(t, j2) != null;
                case 10:
                    equals = C16994k.f46000e.equals(C24065x2.m29988o(t, j2));
                    break;
                case 11:
                    return C24065x2.m29986m(t, j2) != 0;
                case 12:
                    return C24065x2.m29986m(t, j2) != 0;
                case 13:
                    return C24065x2.m29986m(t, j2) != 0;
                case 14:
                    return C24065x2.m29987n(t, j2) != 0;
                case 15:
                    return C24065x2.m29986m(t, j2) != 0;
                case 16:
                    return C24065x2.m29987n(t, j2) != 0;
                case 17:
                    return C24065x2.m29988o(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        return (C24065x2.m29986m(t, j) & (1 << (i2 >>> 20))) != 0;
    }

    /* renamed from: s */
    public final boolean mo38008s(T t, int i, int i2) {
        return C24065x2.m29986m(t, (long) (this.f68512a[i2 + 2] & 1048575)) == i;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: u */
    public final <UT, UB, ET extends com.google.protobuf.C23832g0.C23835c<ET>> void mo38009u(com.google.protobuf.C23937r2<UT, UB> r17, com.google.protobuf.C23812b0<ET> r18, T r19, com.google.protobuf.C23819d2 r20, com.google.protobuf.C23806a0 r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo37535C()     // Catch:{ all -> 0x061f }
            int r2 = r8.f68514c     // Catch:{ all -> 0x061f }
            if (r1 < r2) goto L_0x0020
            int r2 = r8.f68515d     // Catch:{ all -> 0x061f }
            if (r1 > r2) goto L_0x0020
            r2 = 0
            int r2 = r8.mo37994P(r1, r2)     // Catch:{ all -> 0x061f }
            r3 = r2
            goto L_0x0022
        L_0x0020:
            r2 = -1
            r3 = -1
        L_0x0022:
            if (r3 >= 0) goto L_0x009b
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0040
            int r0 = r8.f68522k
        L_0x002b:
            int r1 = r8.f68523l
            if (r0 >= r1) goto L_0x003a
            int[] r1 = r8.f68521j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo38001k(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x002b
        L_0x003a:
            if (r13 == 0) goto L_0x003f
            r9.mo38040n(r10, r13)
        L_0x003f:
            return
        L_0x0040:
            boolean r2 = r8.f68517f     // Catch:{ all -> 0x061f }
            if (r2 != 0) goto L_0x0048
            r15 = r18
            r3 = r12
            goto L_0x0051
        L_0x0048:
            com.google.protobuf.j1 r2 = r8.f68516e     // Catch:{ all -> 0x061f }
            r15 = r18
            java.lang.Object r1 = r15.mo37483b(r11, r2, r1)     // Catch:{ all -> 0x061f }
            r3 = r1
        L_0x0051:
            if (r3 == 0) goto L_0x0069
            if (r14 != 0) goto L_0x005a
            com.google.protobuf.g0 r1 = r18.mo37485d(r19)     // Catch:{ all -> 0x061f }
            r14 = r1
        L_0x005a:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo37488g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x061f }
            goto L_0x000d
        L_0x0069:
            boolean r1 = r9.mo38042p(r0)     // Catch:{ all -> 0x061f }
            if (r1 == 0) goto L_0x0076
            boolean r1 = r20.mo37558i()     // Catch:{ all -> 0x061f }
            if (r1 == 0) goto L_0x0084
            goto L_0x000d
        L_0x0076:
            if (r13 != 0) goto L_0x007d
            java.lang.Object r1 = r9.mo38032f(r10)     // Catch:{ all -> 0x061f }
            r13 = r1
        L_0x007d:
            boolean r1 = r9.mo38038l(r13, r0)     // Catch:{ all -> 0x061f }
            if (r1 == 0) goto L_0x0084
            goto L_0x000d
        L_0x0084:
            int r0 = r8.f68522k
        L_0x0086:
            int r1 = r8.f68523l
            if (r0 >= r1) goto L_0x0095
            int[] r1 = r8.f68521j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo38001k(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0086
        L_0x0095:
            if (r13 == 0) goto L_0x009a
            r9.mo38040n(r10, r13)
        L_0x009a:
            return
        L_0x009b:
            r15 = r18
            int r4 = r8.mo37995R(r3)     // Catch:{ all -> 0x061f }
            int r2 = m29433Q(r4)     // Catch:{ a -> 0x05d8 }
            switch(r2) {
                case 0: goto L_0x05aa;
                case 1: goto L_0x059a;
                case 2: goto L_0x058a;
                case 3: goto L_0x057a;
                case 4: goto L_0x056a;
                case 5: goto L_0x055a;
                case 6: goto L_0x054a;
                case 7: goto L_0x053a;
                case 8: goto L_0x0532;
                case 9: goto L_0x04fb;
                case 10: goto L_0x04eb;
                case 11: goto L_0x04db;
                case 12: goto L_0x04b8;
                case 13: goto L_0x04a8;
                case 14: goto L_0x0498;
                case 15: goto L_0x0488;
                case 16: goto L_0x0478;
                case 17: goto L_0x0441;
                case 18: goto L_0x0432;
                case 19: goto L_0x0423;
                case 20: goto L_0x0414;
                case 21: goto L_0x0405;
                case 22: goto L_0x03f6;
                case 23: goto L_0x03e7;
                case 24: goto L_0x03d8;
                case 25: goto L_0x03c9;
                case 26: goto L_0x03c4;
                case 27: goto L_0x03b2;
                case 28: goto L_0x03a3;
                case 29: goto L_0x0394;
                case 30: goto L_0x037d;
                case 31: goto L_0x036e;
                case 32: goto L_0x035f;
                case 33: goto L_0x0350;
                case 34: goto L_0x0341;
                case 35: goto L_0x0332;
                case 36: goto L_0x0323;
                case 37: goto L_0x0314;
                case 38: goto L_0x0305;
                case 39: goto L_0x02f6;
                case 40: goto L_0x02e7;
                case 41: goto L_0x02d8;
                case 42: goto L_0x02c9;
                case 43: goto L_0x02ba;
                case 44: goto L_0x02a3;
                case 45: goto L_0x0294;
                case 46: goto L_0x0285;
                case 47: goto L_0x0276;
                case 48: goto L_0x0267;
                case 49: goto L_0x0251;
                case 50: goto L_0x0240;
                case 51: goto L_0x022c;
                case 52: goto L_0x0218;
                case 53: goto L_0x0204;
                case 54: goto L_0x01f0;
                case 55: goto L_0x01dc;
                case 56: goto L_0x01c8;
                case 57: goto L_0x01b4;
                case 58: goto L_0x01a0;
                case 59: goto L_0x0198;
                case 60: goto L_0x015f;
                case 61: goto L_0x014f;
                case 62: goto L_0x013b;
                case 63: goto L_0x0114;
                case 64: goto L_0x0100;
                case 65: goto L_0x00ec;
                case 66: goto L_0x00d8;
                case 67: goto L_0x00c4;
                case 68: goto L_0x00b0;
                default: goto L_0x00a8;
            }     // Catch:{ a -> 0x05d8 }
        L_0x00a8:
            if (r13 != 0) goto L_0x05bb
            java.lang.Object r1 = r17.mo38039m()     // Catch:{ a -> 0x05d8 }
            goto L_0x05ba
        L_0x00b0:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.f2 r2 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r2 = r0.mo37553e(r2, r11)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x00c4:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r6 = r20.mo37546N()     // Catch:{ a -> 0x05d8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x00d8:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r2 = r20.mo37575x()     // Catch:{ a -> 0x05d8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x00ec:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r6 = r20.mo37574w()     // Catch:{ a -> 0x05d8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0100:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r2 = r20.mo37547O()     // Catch:{ a -> 0x05d8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0114:
            int r2 = r20.mo37550b()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.o0$e r5 = r8.mo38002l(r3)     // Catch:{ a -> 0x05d8 }
            if (r5 == 0) goto L_0x012b
            boolean r5 = r5.isInRange(r2)     // Catch:{ a -> 0x05d8 }
            if (r5 == 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            java.lang.Object r13 = com.google.protobuf.C23842h2.m28885E(r1, r2, r13, r9)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x012b:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x013b:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r2 = r20.mo37549a()     // Catch:{ a -> 0x05d8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x014f:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.k r2 = r20.mo37577z()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x015f:
            boolean r2 = r8.mo38008s(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            if (r2 == 0) goto L_0x0181
            long r5 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r2 = com.google.protobuf.C24065x2.m29988o(r10, r5)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.f2 r5 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r5 = r0.mo37572u(r5, r11)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r2 = com.google.protobuf.C23908o0.m29425c(r2, r5)     // Catch:{ a -> 0x05d8 }
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            goto L_0x0193
        L_0x0181:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.f2 r2 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r2 = r0.mo37572u(r2, r11)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
        L_0x0193:
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0198:
            r8.mo37990K(r10, r4, r0)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x01a0:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            boolean r2 = r20.mo37560k()     // Catch:{ a -> 0x05d8 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x01b4:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r2 = r20.mo37570s()     // Catch:{ a -> 0x05d8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x01c8:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r6 = r20.mo37540H()     // Catch:{ a -> 0x05d8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x01dc:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r2 = r20.mo37565p()     // Catch:{ a -> 0x05d8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x01f0:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r6 = r20.mo37533A()     // Catch:{ a -> 0x05d8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0204:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r6 = r20.mo37559j()     // Catch:{ a -> 0x05d8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0218:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            float r2 = r20.readFloat()     // Catch:{ a -> 0x05d8 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x022c:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            double r6 = r20.readDouble()     // Catch:{ a -> 0x05d8 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37993O(r10, r1, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0240:
            java.lang.Object r4 = r8.mo38003m(r3)     // Catch:{ a -> 0x05d8 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo38010v(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0251:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.f2 r6 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo37988I(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0267:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37573v(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0276:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37552d(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0285:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37554f(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0294:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37541I(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x02a3:
            com.google.protobuf.v0 r2 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r2 = r2.mo38388c(r10, r4)     // Catch:{ a -> 0x05d8 }
            r0.mo37544L(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.o0$e r3 = r8.mo38002l(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r13 = com.google.protobuf.C23842h2.m28881A(r1, r2, r3, r13, r9)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x02ba:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37545M(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x02c9:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37551c(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x02d8:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37534B(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x02e7:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37566q(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x02f6:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37555g(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0305:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37562m(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0314:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37543K(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0323:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37537E(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0332:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37539G(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0341:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37573v(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0350:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37552d(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x035f:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37554f(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x036e:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37541I(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x037d:
            com.google.protobuf.v0 r2 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r2 = r2.mo38388c(r10, r4)     // Catch:{ a -> 0x05d8 }
            r0.mo37544L(r2)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.o0$e r3 = r8.mo38002l(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r13 = com.google.protobuf.C23842h2.m28881A(r1, r2, r3, r13, r9)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0394:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37545M(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x03a3:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37538F(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x03b2:
            com.google.protobuf.f2 r5 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo37989J(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x03c4:
            r8.mo37991L(r10, r4, r0)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x03c9:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37551c(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x03d8:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37534B(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x03e7:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37566q(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x03f6:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37555g(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0405:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37562m(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0414:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37543K(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0423:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37537E(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0432:
            com.google.protobuf.v0 r1 = r8.f68525n     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.util.List r1 = r1.mo38388c(r10, r2)     // Catch:{ a -> 0x05d8 }
            r0.mo37539G(r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0441:
            boolean r1 = r8.mo38007r(r10, r3)     // Catch:{ a -> 0x05d8 }
            if (r1 == 0) goto L_0x0464
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r1 = com.google.protobuf.C24065x2.m29988o(r10, r1)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.f2 r2 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r2 = r0.mo37553e(r2, r11)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r1 = com.google.protobuf.C23908o0.m29425c(r1, r2)     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r2, r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0464:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.f2 r4 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r4 = r0.mo37553e(r4, r11)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0478:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r4 = r20.mo37546N()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29998y(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0488:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r4 = r20.mo37575x()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29997x(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0498:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r4 = r20.mo37574w()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29998y(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x04a8:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r4 = r20.mo37547O()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29997x(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x04b8:
            int r2 = r20.mo37550b()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.o0$e r5 = r8.mo38002l(r3)     // Catch:{ a -> 0x05d8 }
            if (r5 == 0) goto L_0x04cf
            boolean r5 = r5.isInRange(r2)     // Catch:{ a -> 0x05d8 }
            if (r5 == 0) goto L_0x04c9
            goto L_0x04cf
        L_0x04c9:
            java.lang.Object r13 = com.google.protobuf.C23842h2.m28885E(r1, r2, r13, r9)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x04cf:
            long r4 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29997x(r10, r4, r2)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x04db:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r4 = r20.mo37549a()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29997x(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x04eb:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.k r4 = r20.mo37577z()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x04fb:
            boolean r1 = r8.mo38007r(r10, r3)     // Catch:{ a -> 0x05d8 }
            if (r1 == 0) goto L_0x051e
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r1 = com.google.protobuf.C24065x2.m29988o(r10, r1)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.f2 r2 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r2 = r0.mo37572u(r2, r11)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r1 = com.google.protobuf.C23908o0.m29425c(r1, r2)     // Catch:{ a -> 0x05d8 }
            long r2 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r2, r1)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x051e:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.f2 r4 = r8.mo38004n(r3)     // Catch:{ a -> 0x05d8 }
            java.lang.Object r4 = r0.mo37572u(r4, r11)     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29999z(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x0532:
            r8.mo37990K(r10, r4, r0)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x053a:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            boolean r4 = r20.mo37560k()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29991r(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x054a:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r4 = r20.mo37570s()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29997x(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x055a:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r4 = r20.mo37540H()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29998y(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x056a:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            int r4 = r20.mo37565p()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29997x(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x057a:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r4 = r20.mo37533A()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29998y(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x058a:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            long r4 = r20.mo37559j()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29998y(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x059a:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            float r4 = r20.readFloat()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29996w(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x05aa:
            long r1 = m29429A(r4)     // Catch:{ a -> 0x05d8 }
            double r4 = r20.readDouble()     // Catch:{ a -> 0x05d8 }
            com.google.protobuf.C24065x2.m29995v(r10, r1, r4)     // Catch:{ a -> 0x05d8 }
            r8.mo37992N(r10, r3)     // Catch:{ a -> 0x05d8 }
            goto L_0x000d
        L_0x05ba:
            r13 = r1
        L_0x05bb:
            boolean r1 = r9.mo38038l(r13, r0)     // Catch:{ a -> 0x05d8 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f68522k
        L_0x05c3:
            int r1 = r8.f68523l
            if (r0 >= r1) goto L_0x05d2
            int[] r1 = r8.f68521j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo38001k(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05c3
        L_0x05d2:
            if (r13 == 0) goto L_0x05d7
            r9.mo38040n(r10, r13)
        L_0x05d7:
            return
        L_0x05d8:
            boolean r1 = r9.mo38042p(r0)     // Catch:{ all -> 0x061f }
            if (r1 == 0) goto L_0x05fb
            boolean r1 = r20.mo37558i()     // Catch:{ all -> 0x061f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f68522k
        L_0x05e6:
            int r1 = r8.f68523l
            if (r0 >= r1) goto L_0x05f5
            int[] r1 = r8.f68521j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo38001k(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05e6
        L_0x05f5:
            if (r13 == 0) goto L_0x05fa
            r9.mo38040n(r10, r13)
        L_0x05fa:
            return
        L_0x05fb:
            if (r13 != 0) goto L_0x0602
            java.lang.Object r1 = r9.mo38032f(r10)     // Catch:{ all -> 0x061f }
            r13 = r1
        L_0x0602:
            boolean r1 = r9.mo38038l(r13, r0)     // Catch:{ all -> 0x061f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f68522k
        L_0x060a:
            int r1 = r8.f68523l
            if (r0 >= r1) goto L_0x0619
            int[] r1 = r8.f68521j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo38001k(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x060a
        L_0x0619:
            if (r13 == 0) goto L_0x061e
            r9.mo38040n(r10, r13)
        L_0x061e:
            return
        L_0x061f:
            r0 = move-exception
            int r1 = r8.f68522k
        L_0x0622:
            int r2 = r8.f68523l
            if (r1 >= r2) goto L_0x0631
            int[] r2 = r8.f68521j
            r2 = r2[r1]
            java.lang.Object r13 = r8.mo38001k(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0622
        L_0x0631:
            if (r13 == 0) goto L_0x0636
            r9.mo38040n(r10, r13)
        L_0x0636:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23920o1.mo38009u(com.google.protobuf.r2, com.google.protobuf.b0, java.lang.Object, com.google.protobuf.d2, com.google.protobuf.a0):void");
    }

    /* renamed from: v */
    public final <K, V> void mo38010v(Object obj, int i, Object obj2, C23806a0 a0Var, C23819d2 d2Var) {
        long R = (long) (mo37995R(i) & 1048575);
        Object o = C24065x2.m29988o(obj, R);
        if (o == null) {
            o = this.f68528q.mo18729e(obj2);
            C24065x2.m29999z(obj, R, o);
        } else if (this.f68528q.mo18732h(o)) {
            Object e = this.f68528q.mo18729e(obj2);
            this.f68528q.mo18725a(e, o);
            C24065x2.m29999z(obj, R, e);
            o = e;
        }
        d2Var.mo37576y(this.f68528q.mo18728d(o), this.f68528q.mo18726b(obj2), a0Var);
    }

    /* renamed from: w */
    public final void mo38011w(T t, T t2, int i) {
        long R = (long) (mo37995R(i) & 1048575);
        if (mo38007r(t2, i)) {
            Object o = C24065x2.m29988o(t, R);
            Object o2 = C24065x2.m29988o(t2, R);
            if (o != null && o2 != null) {
                C24065x2.m29999z(t, R, C23908o0.m29425c(o, o2));
                mo37992N(t, i);
            } else if (o2 != null) {
                C24065x2.m29999z(t, R, o2);
                mo37992N(t, i);
            }
        }
    }

    /* renamed from: x */
    public final void mo38012x(T t, T t2, int i) {
        int R = mo37995R(i);
        int i2 = this.f68512a[i];
        long j = (long) (R & 1048575);
        if (mo38008s(t2, i2, i)) {
            Object o = C24065x2.m29988o(t, j);
            Object o2 = C24065x2.m29988o(t2, j);
            if (o != null && o2 != null) {
                C24065x2.m29999z(t, j, C23908o0.m29425c(o, o2));
                mo37993O(t, i2, i);
            } else if (o2 != null) {
                C24065x2.m29999z(t, j, o2);
                mo37993O(t, i2, i);
            }
        }
    }
}
