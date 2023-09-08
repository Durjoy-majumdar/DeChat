package p363n2;

import p363n2.C21589e;

/* renamed from: n2.b */
public class C21586b implements C21589e.C21590a {

    /* renamed from: a */
    public C21593h f61127a = null;

    /* renamed from: b */
    public float f61128b = 0.0f;

    /* renamed from: c */
    public final C21585a f61129c;

    /* renamed from: d */
    public boolean f61130d = false;

    public C21586b(C21587c cVar) {
        this.f61129c = new C21585a(this, cVar);
    }

    /* renamed from: a */
    public C21586b mo33828a(C21589e eVar, int i) {
        this.f61129c.mo33825f(eVar.mo33842i(i, "ep"), 1.0f);
        this.f61129c.mo33825f(eVar.mo33842i(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: b */
    public C21586b mo33829b(C21593h hVar, C21593h hVar2, C21593h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f61128b = (float) i;
        }
        if (!z) {
            this.f61129c.mo33825f(hVar, -1.0f);
            this.f61129c.mo33825f(hVar2, 1.0f);
            this.f61129c.mo33825f(hVar3, 1.0f);
        } else {
            this.f61129c.mo33825f(hVar, 1.0f);
            this.f61129c.mo33825f(hVar2, -1.0f);
            this.f61129c.mo33825f(hVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: c */
    public C21586b mo33830c(C21593h hVar, C21593h hVar2, C21593h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f61128b = (float) i;
        }
        if (!z) {
            this.f61129c.mo33825f(hVar, -1.0f);
            this.f61129c.mo33825f(hVar2, 1.0f);
            this.f61129c.mo33825f(hVar3, -1.0f);
        } else {
            this.f61129c.mo33825f(hVar, 1.0f);
            this.f61129c.mo33825f(hVar2, -1.0f);
            this.f61129c.mo33825f(hVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: d */
    public void mo33831d(C21593h hVar) {
        C21593h hVar2 = this.f61127a;
        if (hVar2 != null) {
            this.f61129c.mo33825f(hVar2, -1.0f);
            this.f61127a = null;
        }
        float g = this.f61129c.mo33826g(hVar, true) * -1.0f;
        this.f61127a = hVar;
        if (g != 1.0f) {
            this.f61128b /= g;
            C21585a aVar = this.f61129c;
            int i = aVar.f61124h;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f61117a) {
                float[] fArr = aVar.f61123g;
                fArr[i] = fArr[i] / g;
                i = aVar.f61122f[i];
                i2++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            n2.h r0 = r11.f61127a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x001a
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            n2.h r1 = r11.f61127a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r11.f61128b
            r2 = 0
            r3 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0047
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r11.f61128b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            n2.a r5 = r11.f61129c
            int r5 = r5.f61117a
            r6 = 0
        L_0x004d:
            if (r6 >= r5) goto L_0x00ee
            n2.a r7 = r11.f61129c
            n2.h r7 = r7.mo33824e(r6)
            if (r7 != 0) goto L_0x0059
            goto L_0x00ea
        L_0x0059:
            n2.a r7 = r11.f61129c
            int r8 = r7.f61124h
            r9 = 0
        L_0x005e:
            r10 = -1
            if (r8 == r10) goto L_0x0073
            int r10 = r7.f61117a
            if (r9 >= r10) goto L_0x0073
            if (r9 != r6) goto L_0x006c
            float[] r7 = r7.f61123g
            r7 = r7[r8]
            goto L_0x0074
        L_0x006c:
            int[] r10 = r7.f61122f
            r8 = r10[r8]
            int r9 = r9 + 1
            goto L_0x005e
        L_0x0073:
            r7 = 0
        L_0x0074:
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0079
            goto L_0x00ea
        L_0x0079:
            java.lang.String r9 = "null"
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0095
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x0095:
            if (r8 <= 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00bc
        L_0x00a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ba:
            float r7 = r7 * r10
        L_0x00bc:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            goto L_0x00e9
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
        L_0x00e9:
            r1 = 1
        L_0x00ea:
            int r6 = r6 + 1
            goto L_0x004d
        L_0x00ee:
            if (r1 != 0) goto L_0x0101
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0101:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p363n2.C21586b.toString():java.lang.String");
    }
}
