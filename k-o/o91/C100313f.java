package o91;

import te3.e74;

/* renamed from: o91.f */
public final class C100313f {

    /* renamed from: a */
    public e74 f293867a;

    /* renamed from: b */
    public int f293868b;

    /* renamed from: c */
    public String f293869c;

    /* renamed from: d */
    public int f293870d;

    /* renamed from: e */
    public String f293871e;

    /* renamed from: f */
    public String f293872f = "";

    /* renamed from: g */
    public String f293873g = "";

    /* renamed from: h */
    public String f293874h = "";

    /* renamed from: i */
    public String f293875i = "";

    /* renamed from: j */
    public String f293876j = "";

    /* renamed from: a */
    public boolean mo139595a(int i) {
        e74 e74 = this.f293867a;
        int i2 = e74.f298184i + e74.f298185j;
        if (i != 0 && e74.f298180e == 0 && this.f293868b == 0) {
            i2 = 0;
        }
        int i3 = e74.f298182g - e74.f298183h;
        int max = Math.max(e74.f298180e, i2);
        e74 e742 = this.f293867a;
        int i4 = e742.f298180e + e742.f298181f;
        int min = Math.min(i4, i3);
        e74 e743 = this.f293867a;
        int i5 = e743.f298180e;
        if (i5 >= i3 || i4 <= i2) {
            return false;
        }
        if (i5 >= i2 && i4 <= i3) {
            return true;
        }
        float f = (float) (min - max);
        return f / ((float) e743.f298181f) >= 0.9f || f / ((float) (i3 - i2)) >= 0.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.f298179d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            te3.e74 r0 = r2.f293867a
            java.lang.String r1 = "NULL"
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.String r0 = r0.f298179d
            if (r0 != 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o91.C100313f.toString():java.lang.String");
    }
}
