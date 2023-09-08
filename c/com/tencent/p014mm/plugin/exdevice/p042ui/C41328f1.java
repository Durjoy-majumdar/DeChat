package com.tencent.p014mm.plugin.exdevice.p042ui;

import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.f1 */
public class C41328f1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI f111302d;

    public C41328f1(ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f111302d = exdeviceRankInfoUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c3, code lost:
        r12 = r1.f111230M;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMMMenuItemSelected(android.view.MenuItem r12, int r13) {
        /*
            r11 = this;
            java.lang.Class<h81.h> r13 = h81.C32735h.class
            java.lang.Class<kr0.x0> r0 = kr0.C76630x0.class
            int r12 = r12.getItemId()
            if (r12 == 0) goto L_0x0085
            r1 = 1
            if (r12 == r1) goto L_0x0078
            r1 = 2
            r2 = 1063(0x427, float:1.49E-42)
            if (r12 == r1) goto L_0x0036
            r13 = 3
            if (r12 == r13) goto L_0x0017
            goto L_0x00e0
        L_0x0017:
            r12 = 36
            tv2.C14096e.m13447a(r12)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r10 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r10.<init>()
            r10.f245533f = r2
            di3.d r12 = di3.C86312j.m106911c(r0)
            r3 = r12
            kr0.x0 r3 = (kr0.C76630x0) r3
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r5 = "gh_1f9ebf140e39@app"
            r3.Ko0(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00e0
        L_0x0036:
            r12 = 7
            tv2.C14096e.m13447a(r12)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI r12 = r11.f111302d
            int r1 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI.f111217R
            r12.getClass()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r10 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r10.<init>()
            r10.f245533f = r2
            di3.d r0 = di3.C86312j.m106911c(r0)
            r3 = r0
            kr0.x0 r3 = (kr0.C76630x0) r3
            androidx.appcompat.app.AppCompatActivity r4 = r12.getContext()
            di3.d r12 = di3.C86312j.m106911c(r13)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_wesports_appbrand_path_appid_and
            java.lang.String r1 = "wxff244f6b82a094d2"
            java.lang.String r6 = r12.Y60(r0, r1)
            di3.d r12 = di3.C86312j.m106911c(r13)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_wesports_appbrand_path_rank_and
            java.lang.String r0 = "pages/whole/match/main.html?spm=59.2486.2487"
            java.lang.String r9 = r12.Y60(r13, r0)
            r5 = 0
            r7 = 0
            r8 = 0
            r3.Ko0(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00e0
        L_0x0078:
            r12 = 16
            tv2.C14096e.m13447a(r12)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI r12 = r11.f111302d
            int r13 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI.f111217R
            r12.mo64377M7()
            goto L_0x00e0
        L_0x0085:
            r12 = 15
            tv2.C14096e.m13447a(r12)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI r1 = r11.f111302d
            java.lang.String r12 = r1.f111224G
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x00a4
            w71.b r12 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.vx0()
            java.lang.String r13 = r1.f111244q
            v71.a r12 = r12.mo61492jo(r13)
            if (r12 == 0) goto L_0x00a4
            java.lang.String r12 = r12.field_championUrl
            r1.f111224G = r12
        L_0x00a4:
            com.tencent.mm.plugin.exdevice.ui.s0 r12 = r1.f111235e
            java.lang.String r13 = r1.f111244q
            java.util.ArrayList<v71.d> r0 = r1.f111218A
            v71.d r12 = r12.mo64437b(r13, r0)
            java.lang.String r13 = "--"
            if (r12 == 0) goto L_0x00c1
            int r13 = r12.field_ranknum
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r12 = r12.field_score
            java.lang.String r12 = java.lang.String.valueOf(r12)
        L_0x00be:
            r3 = r12
            r2 = r13
            goto L_0x00d1
        L_0x00c1:
            if (r12 != 0) goto L_0x00ce
            te3.n85 r12 = r1.f111230M
            if (r12 == 0) goto L_0x00ce
            int r12 = r12.f138486e
            java.lang.String r12 = java.lang.String.valueOf(r12)
            goto L_0x00be
        L_0x00ce:
            java.lang.String r12 = "0"
            goto L_0x00be
        L_0x00d1:
            com.tencent.mm.plugin.exdevice.model.q1 r0 = new com.tencent.mm.plugin.exdevice.model.q1
            r0.<init>()
            java.lang.String r4 = r1.f111224G
            com.tencent.mm.plugin.exdevice.ui.y0 r5 = new com.tencent.mm.plugin.exdevice.ui.y0
            r5.<init>(r1)
            r0.mo64223b(r1, r2, r3, r4, r5)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.C41328f1.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
