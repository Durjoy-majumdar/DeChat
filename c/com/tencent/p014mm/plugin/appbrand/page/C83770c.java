package com.tencent.p014mm.plugin.appbrand.page;

import p1044ub.C90630c;
import rq0.C90088g;

/* renamed from: com.tencent.mm.plugin.appbrand.page.c */
public class C83770c extends C83916s3 {

    /* renamed from: d */
    public final /* synthetic */ C83745a f244514d;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.c$a */
    public class C83771a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f244515d;

        public C83771a(int i) {
            this.f244515d = i;
        }

        public void run() {
            if (!(C83770c.this.f244514d.mo124764Z() == null || ((C90630c) C83770c.this.f244514d.mo124764Z()).f244552D == null)) {
                ((C90630c) C83770c.this.f244514d.mo124764Z()).f244552D.setBackgroundColor(this.f244515d);
            }
            C83971x3 x3Var = C83770c.this.f244514d.f244461q;
            if (x3Var != null) {
                x3Var.setBackgroundColor(this.f244515d);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83770c(C83745a aVar, C83780d1 d1Var, C83763b2 b2Var) {
        super(d1Var, b2Var);
        this.f244514d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r0 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r0 != false) goto L_0x007c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116111a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.page.a r0 = r9.f244514d
            fc.g r0 = r0.mo116498d0()
            com.tencent.mm.plugin.appbrand.config.a r0 = r0.mo113008F()
            boolean r0 = r0.mo113988g()
            com.tencent.mm.plugin.appbrand.page.a r1 = r9.f244514d
            fc.g r1 = r1.mo116498d0()
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = r1.mo113036W()
            wi0.a0 r1 = r1.mo111304q()
            wi0.a0 r2 = wi0.C90973a0.TRANSPARENT
            r3 = 0
            if (r1 != r2) goto L_0x0023
            r1 = 0
            goto L_0x0042
        L_0x0023:
            com.tencent.mm.plugin.appbrand.page.a r1 = r9.f244514d
            fc.g r1 = r1.mo116498d0()
            android.content.Context r1 = r1.f238141d
            android.content.res.Resources r1 = r1.getResources()
            if (r0 == 0) goto L_0x0035
            r2 = 2131099650(0x7f060002, float:1.781166E38)
            goto L_0x0038
        L_0x0035:
            r2 = 2131099940(0x7f060124, float:1.7812247E38)
        L_0x0038:
            int r1 = r1.getColor(r2)
            int r1 = js0.C88020k.m109562m(r11)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            rq0.g$a r11 = rq0.C90088g.C90089a.LIGHT
            rq0.g$a r2 = rq0.C90088g.C90089a.DARK
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x007b
            goto L_0x007c
        L_0x004f:
            rq0.g$a[] r4 = rq0.C90088g.C90089a.values()
            int r5 = r4.length
            r6 = 0
        L_0x0055:
            if (r6 >= r5) goto L_0x006c
            r7 = r4[r6]
            java.lang.String r8 = r7.name()
            java.lang.String r8 = r8.toLowerCase()
            boolean r8 = u24.C90599h.m113510c(r8, r10)
            if (r8 == 0) goto L_0x0069
            r11 = r7
            goto L_0x007c
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0055
        L_0x006c:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r10
            java.lang.String r10 = "Luggage.AppBrandPageViewPullDownExtension.BackgroundTextStyle"
            java.lang.String r3 = "fromString(%s), unrecognized"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r3, r4)
            if (r0 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r11 = r2
        L_0x007c:
            r9.mo116112e(r11, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83770c.mo116111a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: e */
    public void mo116112e(C90088g.C90089a aVar, int i) {
        super.mo116112e(aVar, i);
        if (this.f244514d.mo124764Z() != null) {
            ((C90630c) this.f244514d.mo124764Z()).mo109673t(new C83771a(i));
        }
    }
}
