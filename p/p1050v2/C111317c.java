package p1050v2;

import android.util.TypedValue;

/* renamed from: v2.c */
public final class C111317c {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f333284a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m151800a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m151801b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1050v2.C111317c.m151800a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m151801b(android.content.res.Resources r36, org.xmlpull.v1.XmlPullParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
        /*
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0356
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x0020:
            int r9 = r37.next()
            if (r9 == r4) goto L_0x0345
            int r10 = r37.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x0345
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x0335
            if (r10 > r3) goto L_0x0335
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x0335
        L_0x0042:
            int[] r9 = p1146r2.C110495a.f330397a
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L_0x008f
            java.lang.ThreadLocal<android.util.TypedValue> r10 = f333284a
            java.lang.Object r15 = r10.get()
            android.util.TypedValue r15 = (android.util.TypedValue) r15
            if (r15 != 0) goto L_0x006b
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r10.set(r15)
        L_0x006b:
            r0.getValue(r13, r15, r4)
            int r10 = r15.type
            r15 = 28
            if (r10 < r15) goto L_0x007a
            r15 = 31
            if (r10 > r15) goto L_0x007a
            r10 = 1
            goto L_0x007b
        L_0x007a:
            r10 = 0
        L_0x007b:
            if (r10 != 0) goto L_0x008f
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008a }
            android.content.res.ColorStateList r10 = m151800a(r0, r10, r2)     // Catch:{ Exception -> 0x008a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008a }
            goto L_0x0093
        L_0x008a:
            int r10 = r9.getColor(r7, r14)
            goto L_0x0093
        L_0x008f:
            int r10 = r9.getColor(r7, r14)
        L_0x0093:
            boolean r13 = r9.hasValue(r4)
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x00a0
            float r11 = r9.getFloat(r4, r14)
            goto L_0x00ad
        L_0x00a0:
            boolean r13 = r9.hasValue(r11)
            if (r13 == 0) goto L_0x00ab
            float r11 = r9.getFloat(r11, r14)
            goto L_0x00ad
        L_0x00ab:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00ad:
            boolean r13 = p834a3.C103297a.m136810a()
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 4
            if (r13 == 0) goto L_0x00c1
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x00c1
            float r13 = r9.getFloat(r12, r15)
            goto L_0x00c5
        L_0x00c1:
            float r13 = r9.getFloat(r4, r15)
        L_0x00c5:
            r9.recycle()
            int r9 = r38.getAttributeCount()
            int[] r15 = new int[r9]
            r4 = 0
            r12 = 0
        L_0x00d0:
            if (r4 >= r9) goto L_0x0100
            int r14 = r1.getAttributeNameResource(r4)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r14 == r7) goto L_0x00f8
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r14 == r7) goto L_0x00f8
            r7 = 2130968656(0x7f040050, float:1.7545972E38)
            if (r14 == r7) goto L_0x00f8
            r7 = 2130969251(0x7f0402a3, float:1.7547179E38)
            if (r14 == r7) goto L_0x00f8
            int r7 = r12 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r4, r0)
            if (r19 == 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            int r14 = -r14
        L_0x00f5:
            r15[r12] = r14
            r12 = r7
        L_0x00f8:
            int r4 = r4 + 1
            r0 = r36
            r7 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00d0
        L_0x0100:
            int[] r0 = android.util.StateSet.trimStateSet(r15, r12)
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0111
            int r9 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0111
            r9 = 1
            goto L_0x0112
        L_0x0111:
            r9 = 0
        L_0x0112:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0121
            if (r9 != 0) goto L_0x0121
            r7 = r0
            r30 = r3
            r16 = 1
            goto L_0x02f0
        L_0x0121:
            int r12 = android.graphics.Color.alpha(r10)
            float r12 = (float) r12
            float r12 = r12 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r11 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = p282z2.C16095a.m14980b(r11, r14, r12)
            if (r9 == 0) goto L_0x02e3
            v2.a r9 = p1050v2.C111315a.m151794a(r10)
            float r10 = r9.f333274a
            float r9 = r9.f333275b
            v2.i r12 = p1050v2.C111332i.f333312k
            double r14 = (double) r9
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x02d9
            int r14 = java.lang.Math.round(r13)
            double r14 = (double) r14
            r19 = 0
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x02d9
            int r14 = java.lang.Math.round(r13)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x015e
            goto L_0x02d9
        L_0x015e:
            int r14 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x0164
            r10 = 0
            goto L_0x016a
        L_0x0164:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L_0x016a:
            r15 = r9
            r14 = 0
            r19 = 1
            r20 = 0
        L_0x0170:
            float r22 = r20 - r9
            float r22 = java.lang.Math.abs(r22)
            r23 = 1053609165(0x3ecccccd, float:0.4)
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 < 0) goto L_0x02c8
            r22 = 1148846080(0x447a0000, float:1000.0)
            r23 = 1148846080(0x447a0000, float:1000.0)
            r24 = 0
            r25 = 1120403456(0x42c80000, float:100.0)
            r26 = 0
        L_0x0187:
            float r27 = r24 - r25
            float r27 = java.lang.Math.abs(r27)
            r28 = 1008981770(0x3c23d70a, float:0.01)
            r29 = 1073741824(0x40000000, float:2.0)
            int r27 = (r27 > r28 ? 1 : (r27 == r28 ? 0 : -1))
            if (r27 <= 0) goto L_0x027e
            float r27 = r25 - r24
            float r27 = r27 / r29
            float r7 = r27 + r24
            v2.a r4 = p1050v2.C111315a.m151795b(r7, r15, r10)
            v2.i r1 = p1050v2.C111332i.f333312k
            int r1 = r4.mo163011c(r1)
            int r4 = android.graphics.Color.red(r1)
            float r4 = p1050v2.C111316b.m151798b(r4)
            int r30 = android.graphics.Color.green(r1)
            float r30 = p1050v2.C111316b.m151798b(r30)
            int r31 = android.graphics.Color.blue(r1)
            float r31 = p1050v2.C111316b.m151798b(r31)
            float[][] r32 = p1050v2.C111316b.f333283d
            r16 = 1
            r32 = r32[r16]
            r18 = 0
            r33 = r32[r18]
            float r4 = r4 * r33
            r33 = r32[r16]
            float r30 = r30 * r33
            float r4 = r4 + r30
            r17 = 2
            r30 = r32[r17]
            float r31 = r31 * r30
            float r4 = r4 + r31
            r27 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r27
            r30 = 1007753895(0x3c111aa7, float:0.008856452)
            int r30 = (r4 > r30 ? 1 : (r4 == r30 ? 0 : -1))
            if (r30 > 0) goto L_0x01eb
            r30 = 1147261687(0x4461d2f7, float:903.2963)
            float r4 = r4 * r30
            r30 = r3
            goto L_0x01fb
        L_0x01eb:
            r30 = r3
            double r2 = (double) r4
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r4 = r2 - r3
        L_0x01fb:
            float r2 = r13 - r4
            float r2 = java.lang.Math.abs(r2)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0256
            v2.a r1 = p1050v2.C111315a.m151794a(r1)
            float r3 = r1.f333276c
            r31 = r2
            float r2 = r1.f333275b
            v2.a r2 = p1050v2.C111315a.m151795b(r3, r2, r10)
            float r3 = r1.f333277d
            r32 = r7
            float r7 = r2.f333277d
            float r3 = r3 - r7
            float r7 = r1.f333278e
            r33 = r10
            float r10 = r2.f333278e
            float r7 = r7 - r10
            float r10 = r1.f333279f
            float r2 = r2.f333279f
            float r10 = r10 - r2
            float r3 = r3 * r3
            float r7 = r7 * r7
            float r3 = r3 + r7
            float r10 = r10 * r10
            float r3 = r3 + r10
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            r34 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r7 = r0
            r10 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r2, r0)
            double r0 = r0 * r34
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x025d
            r23 = r0
            r26 = r10
            r22 = r31
            goto L_0x025d
        L_0x0256:
            r32 = r7
            r33 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r7 = r0
        L_0x025d:
            r0 = 0
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0267
            int r2 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0267
            goto L_0x028c
        L_0x0267:
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x026e
            r24 = r32
            goto L_0x0270
        L_0x026e:
            r25 = r32
        L_0x0270:
            r1 = r38
            r2 = r39
            r0 = r7
            r3 = r30
            r10 = r33
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            goto L_0x0187
        L_0x027e:
            r7 = r0
            r30 = r3
            r33 = r10
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 2
            r27 = 1120403456(0x42c80000, float:100.0)
        L_0x028c:
            r2 = r26
            if (r19 == 0) goto L_0x02ad
            if (r2 == 0) goto L_0x0297
            int r10 = r2.mo163011c(r12)
            goto L_0x02e8
        L_0x0297:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r15 = r20 + r2
            r1 = r38
            r2 = r39
            r0 = r7
            r3 = r30
            r10 = r33
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            r19 = 0
            goto L_0x0170
        L_0x02ad:
            if (r2 != 0) goto L_0x02b1
            r9 = r15
            goto L_0x02b4
        L_0x02b1:
            r14 = r2
            r20 = r15
        L_0x02b4:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r15 = r20 + r2
            r1 = r38
            r2 = r39
            r0 = r7
            r3 = r30
            r10 = r33
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            goto L_0x0170
        L_0x02c8:
            r7 = r0
            r30 = r3
            r16 = 1
            if (r14 != 0) goto L_0x02d4
            int r10 = p1050v2.C111316b.m151797a(r13)
            goto L_0x02e8
        L_0x02d4:
            int r10 = r14.mo163011c(r12)
            goto L_0x02e8
        L_0x02d9:
            r7 = r0
            r30 = r3
            r16 = 1
            int r10 = p1050v2.C111316b.m151797a(r13)
            goto L_0x02e8
        L_0x02e3:
            r7 = r0
            r30 = r3
            r16 = 1
        L_0x02e8:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02f0:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            if (r0 <= r1) goto L_0x0306
            r1 = 4
            if (r8 > r1) goto L_0x02fd
            r1 = 8
            goto L_0x02ff
        L_0x02fd:
            int r1 = r8 * 2
        L_0x02ff:
            int[] r1 = new int[r1]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r3, r8)
            r5 = r1
        L_0x0306:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x0324
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r8 > r3) goto L_0x0317
            goto L_0x0319
        L_0x0317:
            int r2 = r8 * 2
        L_0x0319:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x0324:
            r6[r8] = r7
            int[][] r6 = (int[][]) r6
            r1 = r38
            r2 = r39
            r8 = r0
            r3 = r30
            r4 = 1
            r7 = 0
            r0 = r36
            goto L_0x0020
        L_0x0335:
            r30 = r3
            r16 = 1
            r0 = r36
            r1 = r38
            r2 = r39
            r3 = r30
            r4 = 1
            r7 = 0
            goto L_0x0020
        L_0x0345:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0356:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r37.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1050v2.C111317c.m151801b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
