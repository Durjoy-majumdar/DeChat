package p368o2;

/* renamed from: o2.k */
public class C21744k {

    /* renamed from: a */
    public static boolean[] f61649a = new boolean[3];

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24782a(p368o2.C21738f r5, int r6) {
        /*
            o2.f$a[] r0 = r5.f61553C
            r1 = r0[r6]
            o2.f$a r2 = p368o2.C21738f.C21739a.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.f61557G
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0019
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            return r3
        L_0x0019:
            if (r6 != 0) goto L_0x0029
            int r6 = r5.f61585e
            if (r6 == 0) goto L_0x0020
            return r3
        L_0x0020:
            int r6 = r5.f61591h
            if (r6 != 0) goto L_0x0028
            int r5 = r5.f61593i
            if (r5 == 0) goto L_0x0037
        L_0x0028:
            return r3
        L_0x0029:
            int r6 = r5.f61587f
            if (r6 == 0) goto L_0x002e
            return r3
        L_0x002e:
            int r6 = r5.f61595k
            if (r6 != 0) goto L_0x0038
            int r5 = r5.f61596l
            if (r5 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return r4
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21744k.m24782a(o2.f, int):boolean");
    }

    /* renamed from: b */
    public static void m24783b(C21738f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        C21735e[] eVarArr = fVar.f61551A;
        C21745l lVar = eVarArr[i3].f61530a;
        lVar.f61653f = fVar.f61554D.f61603s.f61530a;
        lVar.f61654g = (float) i2;
        lVar.f61662b = 1;
        C21745l lVar2 = eVarArr[i4].f61530a;
        lVar2.f61653f = lVar;
        lVar2.f61654g = (float) fVar.mo34044l(i);
        fVar.f61551A[i4].f61530a.f61662b = 1;
    }
}
