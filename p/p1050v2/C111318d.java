package p1050v2;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: v2.d */
public final class C111318d {

    /* renamed from: a */
    public final Shader f333285a;

    /* renamed from: b */
    public final ColorStateList f333286b;

    /* renamed from: c */
    public int f333287c;

    public C111318d(Shader shader, ColorStateList colorStateList, int i) {
        this.f333285a = shader;
        this.f333286b = colorStateList;
        this.f333287c = i;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r16v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        if (r8.size() <= 0) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0180, code lost:
        r0 = new p1050v2.C111324f((java.util.List<java.lang.Integer>) r8, (java.util.List<java.lang.Float>) r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0186, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0187, code lost:
        if (r0 == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018a, code lost:
        if (r19 == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018c, code lost:
        r0 = new p1050v2.C111324f(r5, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0192, code lost:
        r0 = new p1050v2.C111324f(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0198, code lost:
        if (r11 == 1) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019b, code lost:
        if (r11 == 2) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019d, code lost:
        r4 = r0.f333299a;
        r0 = r0.f333300b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a3, code lost:
        if (r7 == 1) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a5, code lost:
        if (r7 == 2) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a7, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01aa, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ad, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01af, code lost:
        r11 = new android.graphics.LinearGradient(r12, r26, r25, r23, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c0, code lost:
        r3 = new android.graphics.SweepGradient(r21, r22, r0.f333299a, r0.f333300b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ce, code lost:
        r2 = r21;
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d5, code lost:
        if (r24 <= 0.0f) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d7, code lost:
        r1 = r0.f333299a;
        r0 = r0.f333300b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01de, code lost:
        if (r7 == 1) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e1, code lost:
        if (r7 == 2) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e3, code lost:
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e6, code lost:
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e9, code lost:
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01eb, code lost:
        r16 = new android.graphics.RadialGradient(r2, r4, r24, r1, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0203, code lost:
        return new p1050v2.C111318d(r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x020b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1050v2.C111318d m151802a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            r0 = r29
            r1 = r31
            android.content.res.XmlResourceParser r2 = r29.getXml(r30)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        L_0x000c:
            int r4 = r2.next()
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L_0x0017
            if (r4 == r6) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r4 != r5) goto L_0x022a
            java.lang.String r4 = r2.getName()
            r4.getClass()
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L_0x005d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = p1050v2.C111317c.m151801b(r0, r2, r3, r1)
            v2.d r1 = new v2.d
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x020c
            int[] r4 = p1146r2.C110495a.f330400d
            android.content.res.TypedArray r4 = p1050v2.C111331h.m151821h(r0, r1, r3, r4)
            r7 = 8
            java.lang.String r8 = "startX"
            r10 = 0
            float r12 = p1050v2.C111331h.m151816c(r4, r2, r8, r7, r10)
            r7 = 9
            java.lang.String r8 = "startY"
            float r13 = p1050v2.C111331h.m151816c(r4, r2, r8, r7, r10)
            r7 = 10
            java.lang.String r8 = "endX"
            float r14 = p1050v2.C111331h.m151816c(r4, r2, r8, r7, r10)
            r7 = 11
            java.lang.String r8 = "endY"
            float r15 = p1050v2.C111331h.m151816c(r4, r2, r8, r7, r10)
            java.lang.String r7 = "centerX"
            r8 = 3
            float r7 = p1050v2.C111331h.m151816c(r4, r2, r7, r8, r10)
            r11 = 4
            java.lang.String r9 = "centerY"
            float r9 = p1050v2.C111331h.m151816c(r4, r2, r9, r11, r10)
            java.lang.String r11 = "type"
            r8 = 0
            int r11 = p1050v2.C111331h.m151817d(r4, r2, r11, r5, r8)
            java.lang.String r5 = "startColor"
            boolean r5 = p1050v2.C111331h.m151820g(r2, r5)
            if (r5 != 0) goto L_0x00ad
            r5 = 0
            goto L_0x00b1
        L_0x00ad:
            int r5 = r4.getColor(r8, r8)
        L_0x00b1:
            java.lang.String r10 = "centerColor"
            boolean r19 = p1050v2.C111331h.m151820g(r2, r10)
            r6 = 7
            boolean r10 = p1050v2.C111331h.m151820g(r2, r10)
            if (r10 != 0) goto L_0x00c0
            r6 = 0
            goto L_0x00c4
        L_0x00c0:
            int r6 = r4.getColor(r6, r8)
        L_0x00c4:
            java.lang.String r10 = "endColor"
            boolean r10 = p1050v2.C111331h.m151820g(r2, r10)
            if (r10 != 0) goto L_0x00ce
            r10 = 0
            goto L_0x00d5
        L_0x00ce:
            r10 = 1
            int r21 = r4.getColor(r10, r8)
            r10 = r21
        L_0x00d5:
            r21 = r7
            r7 = 6
            r22 = r9
            java.lang.String r9 = "tileMode"
            int r7 = p1050v2.C111331h.m151817d(r4, r2, r9, r7, r8)
            r9 = 5
            java.lang.String r8 = "gradientRadius"
            r23 = r15
            r15 = 0
            float r8 = p1050v2.C111331h.m151816c(r4, r2, r8, r9, r15)
            r4.recycle()
            int r4 = r2.getDepth()
            r9 = 1
            int r4 = r4 + r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r9 = 20
            r15.<init>(r9)
            r24 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r9)
        L_0x0101:
            int r9 = r2.next()
            r25 = r14
            r14 = 1
            if (r9 == r14) goto L_0x0178
            int r14 = r2.getDepth()
            r26 = r13
            if (r14 >= r4) goto L_0x0115
            r13 = 3
            if (r9 == r13) goto L_0x017a
        L_0x0115:
            r13 = 2
            if (r9 == r13) goto L_0x0119
            goto L_0x0173
        L_0x0119:
            if (r14 > r4) goto L_0x0173
            java.lang.String r9 = r2.getName()
            java.lang.String r13 = "item"
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x0128
            goto L_0x0173
        L_0x0128:
            int[] r9 = p1146r2.C110495a.f330401e
            android.content.res.TypedArray r9 = p1050v2.C111331h.m151821h(r0, r1, r3, r9)
            r13 = 0
            boolean r14 = r9.hasValue(r13)
            r13 = 1
            boolean r20 = r9.hasValue(r13)
            if (r14 == 0) goto L_0x0158
            if (r20 == 0) goto L_0x0158
            r14 = 0
            int r27 = r9.getColor(r14, r14)
            r14 = 0
            float r28 = r9.getFloat(r13, r14)
            r9.recycle()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r27)
            r8.add(r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r28)
            r15.add(r9)
            goto L_0x0173
        L_0x0158:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0173:
            r14 = r25
            r13 = r26
            goto L_0x0101
        L_0x0178:
            r26 = r13
        L_0x017a:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0186
            v2.f r0 = new v2.f
            r0.<init>((java.util.List<java.lang.Integer>) r8, (java.util.List<java.lang.Float>) r15)
            goto L_0x0187
        L_0x0186:
            r0 = 0
        L_0x0187:
            if (r0 == 0) goto L_0x018a
            goto L_0x0197
        L_0x018a:
            if (r19 == 0) goto L_0x0192
            v2.f r0 = new v2.f
            r0.<init>(r5, r6, r10)
            goto L_0x0197
        L_0x0192:
            v2.f r0 = new v2.f
            r0.<init>((int) r5, (int) r10)
        L_0x0197:
            r1 = 1
            if (r11 == r1) goto L_0x01ce
            r2 = 2
            if (r11 == r2) goto L_0x01c0
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            int[] r4 = r0.f333299a
            float[] r0 = r0.f333300b
            if (r7 == r1) goto L_0x01ad
            if (r7 == r2) goto L_0x01aa
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x01af
        L_0x01aa:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01af
        L_0x01ad:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
        L_0x01af:
            r18 = r1
            r11 = r3
            r13 = r26
            r14 = r25
            r15 = r23
            r16 = r4
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x01fc
        L_0x01c0:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            int[] r1 = r0.f333299a
            float[] r0 = r0.f333300b
            r2 = r21
            r4 = r22
            r3.<init>(r2, r4, r1, r0)
            goto L_0x01fc
        L_0x01ce:
            r2 = r21
            r4 = r22
            r1 = 0
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0204
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            int[] r1 = r0.f333299a
            float[] r0 = r0.f333300b
            r5 = 1
            if (r7 == r5) goto L_0x01e9
            r5 = 2
            if (r7 == r5) goto L_0x01e6
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x01eb
        L_0x01e6:
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01eb
        L_0x01e9:
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.REPEAT
        L_0x01eb:
            r22 = r5
            r16 = r3
            r17 = r2
            r18 = r4
            r19 = r24
            r20 = r1
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x01fc:
            v2.d r0 = new v2.d
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0204:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x020c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x022a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1050v2.C111318d.m151802a(android.content.res.Resources, int, android.content.res.Resources$Theme):v2.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f333286b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo163012b() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f333285a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f333286b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1050v2.C111318d.mo163012b():boolean");
    }
}
