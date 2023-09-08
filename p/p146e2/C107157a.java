package p146e2;

/* renamed from: e2.a */
public final class C107157a {
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableString m145000a(p735w1.C37958a r19, p560i2.C108322d r20, p451b2.C104014i.C104015a r21) {
        /*
            r0 = r19
            r1 = r21
            java.lang.String r2 = "<this>"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r3 = "density"
            r10 = r20
            gy3.C87412m.m108594g(r10, r3)
            java.lang.String r3 = "fontFamilyResolver"
            gy3.C87412m.m108594g(r1, r3)
            android.text.SpannableString r3 = new android.text.SpannableString
            java.lang.String r4 = r0.f100413d
            r3.<init>(r4)
            java.util.List<w1.a$b<w1.r>> r11 = r0.f100414e
            int r12 = r11.size()
            r14 = 0
        L_0x0023:
            r15 = 33
            r16 = 1
            if (r14 >= r12) goto L_0x00f7
            java.lang.Object r4 = r11.get(r14)
            w1.a$b r4 = (p735w1.C37958a.C37961b) r4
            T r5 = r4.f100426a
            r9 = r5
            w1.r r9 = (p735w1.C111699r) r9
            int r8 = r4.f100427b
            int r7 = r4.f100428c
            long r4 = r9.mo163354a()
            p515f2.C107448e.m145533c(r3, r4, r8, r7)
            long r5 = r9.f334342b
            r4 = r3
            r17 = r7
            r7 = r20
            r18 = r8
            r13 = r9
            r9 = r17
            p515f2.C107448e.m145534d(r4, r5, r7, r8, r9)
            b2.q r4 = r13.f334343c
            if (r4 != 0) goto L_0x005c
            b2.o r5 = r13.f334344d
            if (r5 == 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            r5 = r17
            r4 = r18
            goto L_0x0078
        L_0x005c:
            if (r4 != 0) goto L_0x0060
            b2.q r4 = p451b2.C104022q.f307654i
        L_0x0060:
            b2.o r5 = r13.f334344d
            if (r5 == 0) goto L_0x0067
            int r5 = r5.f307648a
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            int r4 = p451b2.C104009d.m138746a(r4, r5)
            r6.<init>(r4)
            r5 = r17
            r4 = r18
            r3.setSpan(r6, r4, r5, r15)
        L_0x0078:
            b2.i r6 = r13.f334346f
            if (r6 == 0) goto L_0x00b3
            boolean r7 = r6 instanceof p451b2.C104023r
            if (r7 == 0) goto L_0x008f
            android.text.style.TypefaceSpan r6 = new android.text.style.TypefaceSpan
            b2.i r7 = r13.f334346f
            b2.r r7 = (p451b2.C104023r) r7
            java.lang.String r7 = r7.f307658e
            r6.<init>(r7)
            r3.setSpan(r6, r4, r5, r15)
            goto L_0x00b3
        L_0x008f:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r7 < r8) goto L_0x00b3
            b2.p r7 = r13.f334345e
            if (r7 == 0) goto L_0x009c
            int r7 = r7.f307649a
            goto L_0x009d
        L_0x009c:
            r7 = 1
        L_0x009d:
            b2.q r8 = p451b2.C104022q.f307654i
            r9 = 0
            j0.k2 r6 = r1.mo145610a(r6, r8, r9, r7)
            java.lang.Object r6 = r6.getValue()
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            e2.f r7 = p146e2.C7585f.f25854a
            android.text.style.TypefaceSpan r6 = r7.mo8710a(r6)
            r3.setSpan(r6, r4, r5, r15)
        L_0x00b3:
            h2.f r6 = r13.f334353m
            if (r6 == 0) goto L_0x00d9
            h2.f r7 = p544h2.C108014f.f323458c
            boolean r6 = r6.mo158410a(r7)
            if (r6 == 0) goto L_0x00c7
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r3.setSpan(r6, r4, r5, r15)
        L_0x00c7:
            h2.f r6 = r13.f334353m
            h2.f r7 = p544h2.C108014f.f323459d
            boolean r6 = r6.mo158410a(r7)
            if (r6 == 0) goto L_0x00d9
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan
            r6.<init>()
            r3.setSpan(r6, r4, r5, r15)
        L_0x00d9:
            h2.i r6 = r13.f334350j
            if (r6 == 0) goto L_0x00e9
            android.text.style.ScaleXSpan r6 = new android.text.style.ScaleXSpan
            h2.i r7 = r13.f334350j
            float r7 = r7.f86673a
            r6.<init>(r7)
            r3.setSpan(r6, r4, r5, r15)
        L_0x00e9:
            d2.e r6 = r13.f334351k
            p515f2.C107448e.m145535e(r3, r6, r4, r5)
            long r6 = r13.f334352l
            p515f2.C107448e.m145532b(r3, r6, r4, r5)
            int r14 = r14 + 1
            goto L_0x0023
        L_0x00f7:
            int r1 = r19.length()
            java.util.List<w1.a$b<? extends java.lang.Object>> r0 = r0.f100416g
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r0.size()
            r4.<init>(r5)
            int r5 = r0.size()
            r9 = 0
        L_0x010b:
            if (r9 >= r5) goto L_0x0131
            java.lang.Object r6 = r0.get(r9)
            r7 = r6
            w1.a$b r7 = (p735w1.C37958a.C37961b) r7
            T r8 = r7.f100426a
            boolean r8 = r8 instanceof p735w1.C37963b0
            if (r8 == 0) goto L_0x0127
            int r8 = r7.f100427b
            int r7 = r7.f100428c
            r10 = 0
            boolean r7 = p735w1.C37962b.m41690b(r10, r1, r8, r7)
            if (r7 == 0) goto L_0x0128
            r7 = 1
            goto L_0x0129
        L_0x0127:
            r10 = 0
        L_0x0128:
            r7 = 0
        L_0x0129:
            if (r7 == 0) goto L_0x012e
            r4.add(r6)
        L_0x012e:
            int r9 = r9 + 1
            goto L_0x010b
        L_0x0131:
            r10 = 0
            int r0 = r4.size()
            r13 = 0
        L_0x0137:
            if (r13 >= r0) goto L_0x016c
            java.lang.Object r1 = r4.get(r13)
            w1.a$b r1 = (p735w1.C37958a.C37961b) r1
            T r5 = r1.f100426a
            w1.b0 r5 = (p735w1.C37963b0) r5
            int r6 = r1.f100427b
            int r1 = r1.f100428c
            gy3.C87412m.m108594g(r5, r2)
            boolean r7 = r5 instanceof p735w1.C37965c0
            if (r7 == 0) goto L_0x0166
            w1.c0 r5 = (p735w1.C37965c0) r5
            android.text.style.TtsSpan$VerbatimBuilder r7 = new android.text.style.TtsSpan$VerbatimBuilder
            java.lang.String r5 = r5.f100436a
            r7.<init>(r5)
            android.text.style.TtsSpan r5 = r7.build()
            java.lang.String r7 = "builder.build()"
            gy3.C87412m.m108593f(r5, r7)
            r3.setSpan(r5, r6, r1, r15)
            int r13 = r13 + 1
            goto L_0x0137
        L_0x0166:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x016c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p146e2.C107157a.m145000a(w1.a, i2.d, b2.i$a):android.text.SpannableString");
    }
}
