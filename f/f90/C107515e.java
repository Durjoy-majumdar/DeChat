package f90;

import gy3.C8480h;
import p80.C110194c;
import s80.C110780c;
import u80.C111139a;
import u80.C111141c;
import u80.C111144f;
import y80.C38978c;

/* renamed from: f90.e */
public final class C107515e extends C110780c {

    /* renamed from: t */
    public final boolean f321680t;

    /* renamed from: u */
    public C111141c f321681u;

    /* renamed from: v */
    public final boolean f321682v = C38978c.f105018a.mo61859a();

    /* renamed from: w */
    public int f321683w = -1;

    /* renamed from: x */
    public int f321684x = -1;

    /* renamed from: y */
    public boolean f321685y;

    public C107515e(boolean z) {
        super(1, 0, 2, (C8480h) null);
        this.f321680t = z;
    }

    /* renamed from: f */
    public C111139a mo157952f() {
        return this.f321680t ? new C111144f(this.f331376a, this.f331377b, this.f331378c, this.f331379d, this.f331380e, this.f331381f) : new C111141c(this.f331376a, this.f331377b, this.f331378c, this.f331379d, this.f331380e, this.f331381f);
    }

    /* renamed from: g */
    public C110194c mo157953g() {
        if (!this.f321682v) {
            return this.f331385j;
        }
        C111141c cVar = this.f321681u;
        if (cVar != null) {
            return cVar.f332754i;
        }
        return null;
    }

    /* renamed from: j */
    public C110194c mo157954j() {
        if (!this.f321682v) {
            return this.f331385j;
        }
        C111141c cVar = this.f321681u;
        if (cVar != null) {
            return cVar.f332754i;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
        r0 = r0.f332754i;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo157955k(boolean r8) {
        /*
            r7 = this;
            super.mo157955k(r8)
            boolean r8 = r7.f321682v
            if (r8 == 0) goto L_0x003d
            int r3 = r7.f331376a
            int r4 = r7.f331377b
            u80.c r8 = new u80.c
            r5 = 2
            r6 = 2
            r0 = r8
            r1 = r3
            r2 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f321681u = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "prepareOutputTexture:"
            r8.append(r0)
            u80.c r0 = r7.f321681u
            if (r0 == 0) goto L_0x0030
            p80.c r0 = r0.f332754i
            if (r0 == 0) goto L_0x0030
            int r0 = r0.f329652e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "MicroMsg.Media.AbsSurfaceRenderer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f90.C107515e.mo157955k(boolean):void");
    }

    /* renamed from: n */
    public void mo157956n(boolean z) {
        super.mo157956n(z);
        C111141c cVar = this.f321681u;
        if (cVar != null) {
            cVar.mo158471l();
        }
    }

    /* renamed from: p */
    public void mo157957p() {
        C110194c cVar;
        C111141c cVar2;
        int i;
        super.mo157957p();
        if (this.f321682v && (cVar = this.f331385j) != null) {
            int i2 = cVar.f329652e;
            C111141c cVar3 = this.f321681u;
            if (cVar3 != null) {
                cVar3.mo143263u(this.f331376a, this.f331377b);
            }
            int i3 = this.f321683w;
            if (i3 <= 0 || (i = this.f321684x) <= 0) {
                C111141c cVar4 = this.f321681u;
                if (cVar4 != null) {
                    cVar4.mo158522s(this.f331376a, this.f331377b);
                }
            } else {
                C111141c cVar5 = this.f321681u;
                if (cVar5 != null) {
                    cVar5.mo158522s(i3, i);
                }
            }
            int i4 = this.f331389n;
            if (i4 >= 0 && (cVar2 = this.f321681u) != null) {
                cVar2.f332758m = i4;
            }
            C111141c cVar6 = this.f321681u;
            if (cVar6 != null) {
                cVar6.f332760o = this.f331390o && this.f321685y;
            }
            if (cVar6 != null) {
                cVar6.f332759n = true;
            }
            if (cVar6 != null) {
                cVar6.f332801G = i2;
            }
            if (cVar6 != null) {
                cVar6.mo162879m();
            }
        }
    }
}
