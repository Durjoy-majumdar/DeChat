package com.tencent.p014mm.plugin.finder.live.view;

import cc0.C92411b;

/* renamed from: com.tencent.mm.plugin.finder.live.view.r0 */
public final class C3229r0 implements C92411b.C92412a {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveLocationView f15354d;

    public C3229r0(FinderLiveLocationView finderLiveLocationView) {
        this.f15354d = finderLiveLocationView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r4 != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGetLocation(boolean r1, float r2, float r3, int r4, double r5, double r7, double r9) {
        /*
            r0 = this;
            r4 = 1
            if (r1 != 0) goto L_0x0004
            return r4
        L_0x0004:
            com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView r1 = r0.f15354d
            java.lang.String r1 = r1.getTAG()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            r7 = 0
            r5[r7] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r2)
            r5[r4] = r6
            java.lang.String r6 = "get location %f %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r5)
            java.lang.Class<ru.l> r1 = p680ru.C101464l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ru.l r1 = (p680ru.C101464l) r1
            r5 = 2015(0x7df, float:2.824E-42)
            r1.mo140963f9(r5, r2, r3, r7)
            com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView r1 = r0.f15354d
            float r1 = r1.getLatitude()
            r5 = -1029046272(0xffffffffc2aa0000, float:-85.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 != 0) goto L_0x004d
            com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView r1 = r0.f15354d
            float r1 = r1.getLongitude()
            r5 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            if (r4 == 0) goto L_0x0057
        L_0x004d:
            com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView r1 = r0.f15354d
            r1.setLatitude(r3)
            com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView r1 = r0.f15354d
            r1.setLongitude(r2)
        L_0x0057:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C3229r0.onGetLocation(boolean, float, float, int, double, double, double):boolean");
    }
}
