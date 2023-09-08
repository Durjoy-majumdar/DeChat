package p268x1;

import android.graphics.Canvas;
import android.text.Layout;
import gy3.C87412m;
import rx3.C13601g;

/* renamed from: x1.q */
public final class C112010q {

    /* renamed from: a */
    public final boolean f335296a;

    /* renamed from: b */
    public final Layout f335297b;

    /* renamed from: c */
    public final int f335298c;

    /* renamed from: d */
    public final int f335299d;

    /* renamed from: e */
    public final int f335300e;

    /* renamed from: f */
    public final boolean f335301f;

    /* renamed from: g */
    public final C13601g f335302g;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: android.text.BoringLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02bc A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C112010q(java.lang.CharSequence r28, float r29, android.text.TextPaint r30, int r31, android.text.TextUtils.TruncateAt r32, int r33, float r34, float r35, boolean r36, boolean r37, int r38, int r39, int r40, int r41, int[] r42, int[] r43, p268x1.C111995c r44, int r45, gy3.C8480h r46) {
        /*
            r27 = this;
            r0 = r27
            r15 = r28
            r5 = r30
            r1 = r45
            r2 = r1 & 2
            r3 = 0
            if (r2 == 0) goto L_0x000f
            r2 = 0
            goto L_0x0011
        L_0x000f:
            r2 = r29
        L_0x0011:
            r4 = r1 & 8
            if (r4 == 0) goto L_0x0017
            r4 = 0
            goto L_0x0019
        L_0x0017:
            r4 = r31
        L_0x0019:
            r6 = r1 & 16
            r7 = 0
            if (r6 == 0) goto L_0x0020
            r10 = r7
            goto L_0x0022
        L_0x0020:
            r10 = r32
        L_0x0022:
            r6 = r1 & 32
            r8 = 2
            if (r6 == 0) goto L_0x0029
            r6 = 2
            goto L_0x002b
        L_0x0029:
            r6 = r33
        L_0x002b:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0034
            r9 = 1065353216(0x3f800000, float:1.0)
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0036
        L_0x0034:
            r12 = r34
        L_0x0036:
            r9 = r1 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r13 = 0
            goto L_0x003e
        L_0x003c:
            r13 = r35
        L_0x003e:
            r3 = r1 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0045
            r21 = 0
            goto L_0x0047
        L_0x0045:
            r21 = r36
        L_0x0047:
            r3 = r1 & 512(0x200, float:7.175E-43)
            r9 = 1
            if (r3 == 0) goto L_0x004f
            r22 = 1
            goto L_0x0051
        L_0x004f:
            r22 = r37
        L_0x0051:
            r3 = r1 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x005c
            r3 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x005e
        L_0x005c:
            r11 = r38
        L_0x005e:
            r3 = r1 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0065
            r17 = 0
            goto L_0x0067
        L_0x0065:
            r17 = r39
        L_0x0067:
            r3 = r1 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x006e
            r18 = 0
            goto L_0x0070
        L_0x006e:
            r18 = r40
        L_0x0070:
            r3 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0077
            r16 = 0
            goto L_0x0079
        L_0x0077:
            r16 = r41
        L_0x0079:
            r3 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0080
            r19 = r7
            goto L_0x0082
        L_0x0080:
            r19 = r42
        L_0x0082:
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r1
            if (r3 == 0) goto L_0x008b
            r20 = r7
            goto L_0x008d
        L_0x008b:
            r20 = r43
        L_0x008d:
            r3 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0098
            x1.c r1 = new x1.c
            r1.<init>(r15, r5, r6)
            goto L_0x009a
        L_0x0098:
            r1 = r44
        L_0x009a:
            java.lang.String r3 = "charSequence"
            gy3.C87412m.m108594g(r15, r3)
            java.lang.String r3 = "textPaint"
            gy3.C87412m.m108594g(r5, r3)
            java.lang.String r3 = "layoutIntrinsics"
            gy3.C87412m.m108594g(r1, r3)
            r27.<init>()
            int r3 = r28.length()
            android.text.TextDirectionHeuristic r7 = p268x1.C112011r.m152733a(r6)
            android.text.Layout$Alignment r6 = p268x1.C112008o.f335293a
            if (r4 == 0) goto L_0x00d1
            if (r4 == r9) goto L_0x00ce
            if (r4 == r8) goto L_0x00cb
            r6 = 3
            if (r4 == r6) goto L_0x00c8
            r6 = 4
            if (r4 == r6) goto L_0x00c5
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x00d3
        L_0x00c5:
            android.text.Layout$Alignment r4 = p268x1.C112008o.f335294b
            goto L_0x00d3
        L_0x00c8:
            android.text.Layout$Alignment r4 = p268x1.C112008o.f335293a
            goto L_0x00d3
        L_0x00cb:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x00d3
        L_0x00ce:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x00d3
        L_0x00d1:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x00d3:
            r8 = r4
            boolean r4 = r15 instanceof android.text.Spanned
            if (r4 == 0) goto L_0x00e6
            r4 = r15
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<z1.a> r6 = p925z1.C79298a.class
            r14 = -1
            int r4 = r4.nextSpanTransition(r14, r3, r6)
            if (r4 >= r3) goto L_0x00e6
            r3 = 1
            goto L_0x00e7
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            rx3.g r4 = r1.f335259a
            java.lang.Object r4 = r4.getValue()
            android.text.BoringLayout$Metrics r4 = (android.text.BoringLayout.Metrics) r4
            r46 = r10
            double r9 = (double) r2
            double r14 = java.lang.Math.ceil(r9)
            float r6 = (float) r14
            int r6 = (int) r6
            java.lang.String r14 = "alignment"
            if (r4 == 0) goto L_0x0176
            rx3.g r1 = r1.f335261c
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0176
            if (r3 != 0) goto L_0x0176
            r15 = 1
            r0.f335301f = r15
            gy3.C87412m.m108594g(r8, r14)
            if (r6 < 0) goto L_0x0118
            r1 = 1
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            java.lang.String r2 = "Failed requirement."
            if (r1 == 0) goto L_0x016c
            if (r6 < 0) goto L_0x0121
            r1 = 1
            goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            if (r1 == 0) goto L_0x0162
            if (r46 != 0) goto L_0x0141
            android.text.BoringLayout r1 = new android.text.BoringLayout
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r31 = r1
            r32 = r28
            r33 = r30
            r34 = r6
            r35 = r8
            r36 = r2
            r37 = r3
            r38 = r4
            r39 = r21
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x015f
        L_0x0141:
            android.text.BoringLayout r1 = new android.text.BoringLayout
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r31 = r1
            r32 = r28
            r33 = r30
            r34 = r6
            r35 = r8
            r36 = r2
            r37 = r3
            r38 = r4
            r39 = r21
            r40 = r46
            r41 = r6
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x015f:
            r24 = r11
            goto L_0x01b2
        L_0x0162:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x016c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0176:
            r15 = 1
            r2 = 0
            r0.f335301f = r2
            x1.l r1 = p268x1.C112004k.f335271a
            r3 = 0
            int r4 = r28.length()
            double r9 = java.lang.Math.ceil(r9)
            float r1 = (float) r9
            int r1 = (int) r1
            r10 = r11
            r11 = r1
            gy3.C87412m.m108594g(r8, r14)
            x1.l r14 = p268x1.C112004k.f335271a
            x1.n r9 = new x1.n
            r1 = r9
            r23 = 0
            r2 = r28
            r5 = r30
            r15 = r9
            r9 = r10
            r24 = r10
            r10 = r46
            r25 = r14
            r14 = r16
            r26 = r15
            r15 = r21
            r16 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r25
            r2 = r26
            android.text.StaticLayout r1 = r1.mo163665a(r2)
        L_0x01b2:
            r0.f335297b = r1
            int r2 = r1.getLineCount()
            r3 = r24
            int r2 = java.lang.Math.min(r2, r3)
            r0.f335298c = r2
            if (r2 >= r3) goto L_0x01c3
            goto L_0x01d6
        L_0x01c3:
            int r3 = r2 + -1
            int r4 = r1.getEllipsisCount(r3)
            if (r4 > 0) goto L_0x01d8
            int r3 = r1.getLineEnd(r3)
            int r4 = r28.length()
            if (r3 == r4) goto L_0x01d6
            goto L_0x01d8
        L_0x01d6:
            r14 = 0
            goto L_0x01d9
        L_0x01d8:
            r14 = 1
        L_0x01d9:
            r0.f335296a = r14
            if (r21 != 0) goto L_0x0259
            if (r22 == 0) goto L_0x01eb
            boolean r3 = r0.f335301f
            if (r3 != 0) goto L_0x01eb
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x01eb
            r14 = 1
            goto L_0x01ec
        L_0x01eb:
            r14 = 0
        L_0x01ec:
            if (r14 == 0) goto L_0x01ef
            goto L_0x0259
        L_0x01ef:
            android.text.TextPaint r3 = r1.getPaint()
            java.lang.CharSequence r4 = r1.getText()
            java.lang.String r5 = "paint"
            gy3.C87412m.m108593f(r3, r5)
            java.lang.String r5 = "text"
            gy3.C87412m.m108593f(r4, r5)
            r5 = 0
            int r6 = r1.getLineStart(r5)
            int r7 = r1.getLineEnd(r5)
            android.graphics.Rect r6 = p268x1.C112000f.m152721a(r3, r4, r6, r7)
            int r7 = r1.getLineAscent(r5)
            int r8 = r6.top
            if (r8 >= r7) goto L_0x0218
            int r7 = r7 - r8
            goto L_0x021c
        L_0x0218:
            int r7 = r1.getTopPadding()
        L_0x021c:
            r8 = 1
            if (r2 != r8) goto L_0x0220
            goto L_0x0231
        L_0x0220:
            int r2 = r1.getLineCount()
            int r2 = r2 - r8
            int r6 = r1.getLineStart(r2)
            int r2 = r1.getLineEnd(r2)
            android.graphics.Rect r6 = p268x1.C112000f.m152721a(r3, r4, r6, r2)
        L_0x0231:
            int r2 = r1.getLineCount()
            int r2 = r2 - r8
            int r2 = r1.getLineDescent(r2)
            int r3 = r6.bottom
            if (r3 <= r2) goto L_0x0240
            int r3 = r3 - r2
            goto L_0x0244
        L_0x0240:
            int r3 = r1.getBottomPadding()
        L_0x0244:
            if (r7 != 0) goto L_0x024b
            if (r3 != 0) goto L_0x024b
            rx3.l<java.lang.Integer, java.lang.Integer> r1 = p268x1.C112011r.f335303a
            goto L_0x0268
        L_0x024b:
            rx3.l r1 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.<init>(r2, r3)
            goto L_0x0268
        L_0x0259:
            r5 = 0
            r8 = 1
            rx3.l r1 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1.<init>(r2, r3)
        L_0x0268:
            java.lang.CharSequence r2 = r27.mo163670e()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L_0x0273
            z1.f[] r2 = new p925z1.C79300f[r5]
            goto L_0x0298
        L_0x0273:
            java.lang.CharSequence r2 = r27.mo163670e()
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r3 = r27.mo163670e()
            int r3 = r3.length()
            java.lang.Class<z1.f> r4 = p925z1.C79300f.class
            java.lang.Object[] r2 = r2.getSpans(r5, r3, r4)
            z1.f[] r2 = (p925z1.C79300f[]) r2
            java.lang.String r3 = "lineHeightStyleSpans"
            gy3.C87412m.m108593f(r2, r3)
            int r3 = r2.length
            if (r3 != 0) goto L_0x0293
            r14 = 1
            goto L_0x0294
        L_0x0293:
            r14 = 0
        L_0x0294:
            if (r14 == 0) goto L_0x0298
            z1.f[] r2 = new p925z1.C79300f[r5]
        L_0x0298:
            int r3 = r2.length
            r4 = 0
            r14 = 0
        L_0x029b:
            if (r14 >= r3) goto L_0x02ba
            r6 = r2[r14]
            int r7 = r6.f232803q
            if (r7 >= 0) goto L_0x02ab
            int r7 = java.lang.Math.abs(r7)
            int r5 = java.lang.Math.max(r5, r7)
        L_0x02ab:
            int r6 = r6.f232804r
            if (r6 >= 0) goto L_0x02b7
            int r4 = java.lang.Math.abs(r6)
            int r4 = java.lang.Math.max(r5, r4)
        L_0x02b7:
            int r14 = r14 + 1
            goto L_0x029b
        L_0x02ba:
            if (r5 != 0) goto L_0x02c1
            if (r4 != 0) goto L_0x02c1
            rx3.l<java.lang.Integer, java.lang.Integer> r2 = p268x1.C112011r.f335303a
            goto L_0x02ce
        L_0x02c1:
            rx3.l r2 = new rx3.l
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.<init>(r3, r4)
        L_0x02ce:
            A r3 = r1.f38555d
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            A r4 = r2.f38555d
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r3 = java.lang.Math.max(r3, r4)
            r0.f335299d = r3
            B r1 = r1.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            B r2 = r2.f38556e
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r1 = java.lang.Math.max(r1, r2)
            r0.f335300e = r1
            rx3.i r1 = rx3.C13602i.NONE
            x1.p r2 = new x1.p
            r2.<init>(r0)
            rx3.g r1 = rx3.C36568h.m40986b(r1, r2)
            r0.f335302g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p268x1.C112010q.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int[], int[], x1.c, int, gy3.h):void");
    }

    /* renamed from: d */
    public static float m152727d(C112010q qVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return ((C111994b) qVar.f335302g.getValue()).mo163664a(i, true, z);
    }

    /* renamed from: a */
    public final float mo163667a(int i) {
        return ((float) this.f335299d) + ((float) this.f335297b.getLineBaseline(i));
    }

    /* renamed from: b */
    public final float mo163668b(int i) {
        return ((float) this.f335299d) + ((float) this.f335297b.getLineBottom(i)) + ((float) (i == this.f335298c + -1 ? this.f335300e : 0));
    }

    /* renamed from: c */
    public final float mo163669c(int i) {
        return ((float) this.f335297b.getLineTop(i)) + ((float) (i == 0 ? 0 : this.f335299d));
    }

    /* renamed from: e */
    public final CharSequence mo163670e() {
        CharSequence text = this.f335297b.getText();
        C87412m.m108593f(text, "layout.text");
        return text;
    }

    /* renamed from: f */
    public final void mo163671f(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        int i = this.f335299d;
        if (i != 0) {
            canvas.translate(0.0f, (float) i);
        }
        this.f335297b.draw(canvas);
        int i2 = this.f335299d;
        if (i2 != 0) {
            canvas.translate(0.0f, ((float) -1) * ((float) i2));
        }
    }
}
