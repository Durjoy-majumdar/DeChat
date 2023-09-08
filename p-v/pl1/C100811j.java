package pl1;

import gy3.C87412m;

/* renamed from: pl1.j */
public final class C100811j extends C100802b<C100810g0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100811j(C62371w0 w0Var) {
        super(w0Var.f177262d);
        C87412m.m108594g(w0Var, "maxSize");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w60.C65941g<android.graphics.Bitmap> mo126884a(x60.C102564a<pl1.C100810g0> r4, s60.C101535a<android.graphics.Bitmap> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r4, r0)
            o90.b<android.graphics.Bitmap> r0 = r3.f295280b
            java.lang.String r1 = r3.mo126887b(r4, r5)
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1 = 0
            if (r0 == 0) goto L_0x001b
            w60.g r2 = new w60.g
            r2.<init>(r0)
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x001f
            return r2
        L_0x001f:
            T r4 = r4.f301995a
            r0 = r4
            pl1.g0 r0 = (pl1.C100810g0) r0
            boolean r0 = r0 instanceof pl1.C62345f
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r4 = r1
        L_0x002a:
            pl1.g0 r4 = (pl1.C100810g0) r4
            if (r4 == 0) goto L_0x0069
            pl1.f r4 = (pl1.C62345f) r4
            java.lang.String r0 = r4.f177199e
            java.lang.String r2 = r4.f177200f
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0069
            if (r5 == 0) goto L_0x004e
            rx3.g r0 = r4.f177202h
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = r5.mo139548b(r0)
            if (r5 != 0) goto L_0x0059
        L_0x004e:
            rx3.g r4 = r4.f177202h
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x0059:
            o90.b<android.graphics.Bitmap> r4 = r3.f295280b
            java.lang.Object r4 = r4.get(r5)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 == 0) goto L_0x0069
            w60.g r5 = new w60.g
            r5.<init>(r4)
            return r5
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C100811j.mo126884a(x60.a, s60.a):w60.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r5 = (pl1.C100810g0) r5.f301995a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo126887b(x60.C102564a<pl1.C100810g0> r5, s60.C101535a<android.graphics.Bitmap> r6) {
        /*
            r4 = this;
            java.lang.String r6 = super.mo126887b(r5, r6)
            if (r5 == 0) goto L_0x0011
            T r5 = r5.f301995a
            pl1.g0 r5 = (pl1.C100810g0) r5
            if (r5 == 0) goto L_0x0011
            n60.f r5 = r5.getOptions()
            goto L_0x0012
        L_0x0011:
            r5 = 0
        L_0x0012:
            if (r5 == 0) goto L_0x003c
            int r0 = r5.f293168f
            int r5 = r5.f293169g
            int r0 = r0 + r5
            int r0 = r0 / 2
            r5 = 1000(0x3e8, float:1.401E-42)
            r1 = 0
            r2 = 1
            if (r2 > r0) goto L_0x0025
            if (r0 >= r5) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 == 0) goto L_0x002b
            java.lang.String r5 = "SMALL"
            goto L_0x003e
        L_0x002b:
            r3 = 2000(0x7d0, float:2.803E-42)
            if (r5 > r0) goto L_0x0032
            if (r0 >= r3) goto L_0x0032
            r1 = 1
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            java.lang.String r5 = "MEDIUM"
            goto L_0x003e
        L_0x0037:
            if (r0 <= r3) goto L_0x003c
            java.lang.String r5 = "LARGE"
            goto L_0x003e
        L_0x003c:
            java.lang.String r5 = ""
        L_0x003e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r6 = 95
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pl1.C100811j.mo126887b(x60.a, s60.a):java.lang.String");
    }
}
