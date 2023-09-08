package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import u73.C22611g1;

/* renamed from: com.tencent.mm.ui.f0 */
public class C19794f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IconPreference f56320d;

    /* renamed from: e */
    public final /* synthetic */ C22611g1.C22612a f56321e;

    /* renamed from: f */
    public final /* synthetic */ FindMoreFriendsUI f56322f;

    public C19794f0(FindMoreFriendsUI findMoreFriendsUI, IconPreference iconPreference, C22611g1.C22612a aVar) {
        this.f56322f = findMoreFriendsUI;
        this.f56320d = iconPreference;
        this.f56321e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r5 = r13.f56321e.f65031f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            java.lang.Class<gt.w> r0 = p158gt.C76057w.class
            java.lang.Class<gt.i> r1 = p158gt.C8451i.class
            com.tencent.mm.ui.base.preference.IconPreference r2 = r13.f56320d
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            com.tencent.mm.ui.FindMoreFriendsUI r2 = r13.f56322f
            java.lang.String r3 = "find_friends_by_search"
            r4 = 0
            r2.mo25923t0(r3, r4)
            com.tencent.mm.ui.base.preference.IconPreference r2 = r13.f56320d
            com.tencent.mm.plugin.newtips.model.a r2 = (com.tencent.p014mm.plugin.newtips.model.C115619a) r2
            u73.g1$a r5 = r13.f56321e
            r6 = 4
            r7 = 1
            if (r5 == 0) goto L_0x002b
            boolean r5 = r5.mo35735a()
            if (r5 == 0) goto L_0x002b
            u73.g1$a r5 = r13.f56321e
            int r5 = r5.f65031f
            if (r5 < r7) goto L_0x002b
            if (r5 > r6) goto L_0x002b
            r5 = 1
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            boolean r5 = r2.mo64138m(r5)
            if (r5 == 0) goto L_0x0033
            return
        L_0x0033:
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r8 = 8
            r5.mo101936T(r8)
            u73.g1$a r5 = r13.f56321e
            if (r5 != 0) goto L_0x0044
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo96250V(r8)
            return
        L_0x0044:
            boolean r5 = r5.mo35735a()
            java.lang.String r9 = "MicroMsg.FindMoreFriendsUI"
            if (r5 == 0) goto L_0x0160
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.tencent.mm.ui.base.preference.IconPreference r10 = r13.f56320d
            java.lang.CharSequence r10 = r10.f121279i
            r5[r4] = r10
            java.lang.String r10 = "show red %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r5)
            u73.g1$a r5 = r13.f56321e
            int r5 = r5.f65031f
            if (r5 == r7) goto L_0x0150
            r10 = 2
            java.lang.String r11 = "#8c8c8c"
            r12 = -1
            if (r5 == r10) goto L_0x0129
            r8 = 3
            r10 = 0
            if (r5 == r8) goto L_0x00dc
            if (r5 == r6) goto L_0x007c
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0[r4] = r1
            java.lang.String r1 = "search unknown red type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r1, r0)
            goto L_0x018c
        L_0x007c:
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101934R(r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101932N(r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101933P(r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101937U(r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101940Z(r4)
            com.tencent.mm.ui.base.preference.IconPreference r4 = r13.f56320d
            u73.g1$a r5 = r13.f56321e
            java.lang.String r5 = r5.f65032g
            int r6 = android.graphics.Color.parseColor(r11)
            r4.mo101939Y(r5, r12, r6)
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.i r1 = (p158gt.C8451i) r1
            u73.g1$a r4 = r13.f56321e
            java.lang.String r4 = r4.f65033h
            android.graphics.Bitmap r1 = r1.get(r4)
            if (r1 == 0) goto L_0x00bc
            com.tencent.mm.ui.FindMoreFriendsUI r0 = r13.f56322f
            r0.f55710z = r10
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo101930L(r1)
            goto L_0x00d5
        L_0x00bc:
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.w r0 = (p158gt.C76057w) r0
            u73.g1$a r1 = r13.f56321e
            java.lang.String r1 = r1.f65033h
            com.tencent.mm.ui.FindMoreFriendsUI r4 = r13.f56322f
            gt.w$a r4 = r4.f55682Q0
            r0.h60(r1, r4)
            com.tencent.mm.ui.FindMoreFriendsUI r0 = r13.f56322f
            u73.g1$a r1 = r13.f56321e
            java.lang.String r1 = r1.f65033h
            r0.f55710z = r1
        L_0x00d5:
            com.tencent.mm.plugin.newtips.model.n r0 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON
            r2.mo64136k(r0, r7)
            goto L_0x018c
        L_0x00dc:
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101934R(r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101932N(r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101933P(r4)
            com.tencent.mm.ui.base.preference.IconPreference r5 = r13.f56320d
            r5.mo101940Z(r4)
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.i r1 = (p158gt.C8451i) r1
            u73.g1$a r4 = r13.f56321e
            java.lang.String r4 = r4.f65033h
            android.graphics.Bitmap r1 = r1.get(r4)
            if (r1 == 0) goto L_0x010a
            com.tencent.mm.ui.FindMoreFriendsUI r0 = r13.f56322f
            r0.f55710z = r10
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo101930L(r1)
            goto L_0x0123
        L_0x010a:
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.w r0 = (p158gt.C76057w) r0
            u73.g1$a r1 = r13.f56321e
            java.lang.String r1 = r1.f65033h
            com.tencent.mm.ui.FindMoreFriendsUI r4 = r13.f56322f
            gt.w$a r4 = r4.f55682Q0
            r0.h60(r1, r4)
            com.tencent.mm.ui.FindMoreFriendsUI r0 = r13.f56322f
            u73.g1$a r1 = r13.f56321e
            java.lang.String r1 = r1.f65033h
            r0.f55710z = r1
        L_0x0123:
            com.tencent.mm.plugin.newtips.model.n r0 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON
            r2.mo64136k(r0, r7)
            goto L_0x018c
        L_0x0129:
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo96250V(r8)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo101937U(r4)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            u73.g1$a r1 = r13.f56321e
            java.lang.String r1 = r1.f65032g
            int r4 = android.graphics.Color.parseColor(r11)
            r0.mo101939Y(r1, r12, r4)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo101940Z(r7)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo101934R(r8)
            com.tencent.mm.plugin.newtips.model.n r0 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE
            r2.mo64136k(r0, r7)
            goto L_0x018c
        L_0x0150:
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo96250V(r4)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo101937U(r8)
            com.tencent.mm.plugin.newtips.model.n r0 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT
            r2.mo64136k(r0, r7)
            goto L_0x018c
        L_0x0160:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.tencent.mm.ui.base.preference.IconPreference r1 = r13.f56320d
            java.lang.CharSequence r1 = r1.f121279i
            r0[r4] = r1
            java.lang.String r1 = "hide red %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo96250V(r8)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo101937U(r8)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo101934R(r8)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            r0.mo69921C(r4)
            com.tencent.mm.ui.base.preference.IconPreference r0 = r13.f56320d
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference
            if (r1 == 0) goto L_0x018c
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference r0 = (com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference) r0
            r0.mo96252c0()
        L_0x018c:
            com.tencent.mm.ui.FindMoreFriendsUI r0 = r13.f56322f
            u73.g1$a r1 = r13.f56321e
            boolean r1 = r1.mo35735a()
            r0.mo25923t0(r3, r1)
            com.tencent.mm.ui.FindMoreFriendsUI r0 = r13.f56322f
            com.tencent.mm.ui.base.preference.a r0 = r0.f55702t
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C19794f0.run():void");
    }
}
