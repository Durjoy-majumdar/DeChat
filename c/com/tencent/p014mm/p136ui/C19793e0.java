package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.p136ui.base.preference.IconPreference;

/* renamed from: com.tencent.mm.ui.e0 */
public class C19793e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IconPreference f56318d;

    /* renamed from: e */
    public final /* synthetic */ FindMoreFriendsUI f56319e;

    public C19793e0(FindMoreFriendsUI findMoreFriendsUI, IconPreference iconPreference) {
        this.f56319e = findMoreFriendsUI;
        this.f56318d = iconPreference;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019f, code lost:
        if (r8 <= 4) goto L_0x01b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x049c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r23 = this;
            r0 = r23
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON
            com.tencent.mm.plugin.newtips.model.n r2 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON
            com.tencent.mm.plugin.newtips.model.n r3 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE
            java.lang.Class<gt.w> r4 = p158gt.C76057w.class
            java.lang.Class<gt.i> r5 = p158gt.C8451i.class
            com.tencent.mm.plugin.newtips.model.n r6 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT
            java.lang.Class<p03.d> r7 = p03.C21912d.class
            com.tencent.mm.ui.base.preference.IconPreference r8 = r0.f56318d
            if (r8 != 0) goto L_0x0015
            return
        L_0x0015:
            com.tencent.mm.ui.FindMoreFriendsUI r8 = r0.f56319e
            java.lang.String r9 = "find_friends_by_look"
            r10 = 0
            r8.mo25923t0(r9, r10)
            java.lang.Class<xx.g> r8 = p274xx.C66446g.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            xx.g r8 = (p274xx.C66446g) r8
            boolean r8 = r8.mo61607Td()
            java.lang.String r11 = "MicroMsg.FindMoreFriendsUI"
            if (r8 != 0) goto L_0x0033
            java.lang.String r1 = "TopStoryRedDot dont show reddot! ReddotService interrupt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            return
        L_0x0033:
            di3.d r8 = di3.C86312j.m106911c(r7)
            p03.d r8 = (p03.C21912d) r8
            hz.k r8 = r8.mo34966t4()
            o03.h r8 = (o03.C21723h) r8
            boolean r8 = r8.mo33990a()
            di3.d r12 = di3.C86312j.m106911c(r7)
            p03.d r12 = (p03.C21912d) r12
            hz.k r12 = r12.mo34966t4()
            o03.h r12 = (o03.C21723h) r12
            boolean r12 = r12.mo33991b()
            if (r12 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0059
            r8 = 1
            goto L_0x005a
        L_0x0059:
            r8 = 0
        L_0x005a:
            di3.d r12 = di3.C86312j.m106911c(r7)
            p03.d r12 = (p03.C21912d) r12
            hz.k r12 = r12.mo34966t4()
            o03.h r12 = (o03.C21723h) r12
            r12.getClass()
            f40.o r14 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r14 = r14.mo121142i()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TOP_STORY_FIND_MORE_CLICK_TIMESTAMP_LONG
            r16 = r11
            r10 = 0
            long r17 = r14.mo119673G(r15, r10)
            te3.rh4 r12 = r12.f61497a
            long r13 = r12.f64544r
            java.lang.String r12 = "canShowHomeFindMoreEntryRedDot already click find more entry"
            java.lang.String r10 = "MicroMsg.TopStory.TopStoryRedDotImpl"
            int r11 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r11 >= 0) goto L_0x008c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            r11 = 0
            goto L_0x008d
        L_0x008c:
            r11 = 1
        L_0x008d:
            di3.d r13 = di3.C86312j.m106911c(r7)
            p03.d r13 = (p03.C21912d) r13
            hz.k r13 = r13.mo34966t4()
            o03.h r13 = (o03.C21723h) r13
            boolean r13 = r13.mo33992c()
            if (r13 == 0) goto L_0x00a3
            if (r11 == 0) goto L_0x00a3
            r11 = 1
            goto L_0x00a4
        L_0x00a3:
            r11 = 0
        L_0x00a4:
            di3.d r13 = di3.C86312j.m106911c(r7)
            p03.d r13 = (p03.C21912d) r13
            hz.k r13 = r13.mo34966t4()
            o03.h r13 = (o03.C21723h) r13
            r13.getClass()
            f40.o r14 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r14 = r14.mo121142i()
            r17 = r2
            r18 = r3
            r2 = 0
            long r2 = r14.mo119673G(r15, r2)
            te3.rh4 r13 = r13.f61499c
            long r13 = r13.f64544r
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 >= 0) goto L_0x00d2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
            r2 = 0
            goto L_0x00d3
        L_0x00d2:
            r2 = 1
        L_0x00d3:
            di3.d r3 = di3.C86312j.m106911c(r7)
            p03.d r3 = (p03.C21912d) r3
            hz.k r3 = r3.mo34966t4()
            o03.h r3 = (o03.C21723h) r3
            boolean r3 = r3.mo33993d()
            if (r3 == 0) goto L_0x00e9
            if (r2 == 0) goto L_0x00e9
            r2 = 1
            goto L_0x00ea
        L_0x00e9:
            r2 = 0
        L_0x00ea:
            di3.d r3 = di3.C86312j.m106911c(r7)
            p03.d r3 = (p03.C21912d) r3
            hz.k r3 = r3.mo34966t4()
            o03.h r3 = (o03.C21723h) r3
            int r3 = r3.mo34005p()
            if (r3 <= 0) goto L_0x0119
            di3.d r10 = di3.C86312j.m106911c(r7)
            p03.d r10 = (p03.C21912d) r10
            hz.k r10 = r10.mo34966t4()
            o03.h r10 = (o03.C21723h) r10
            java.util.LinkedList<te3.rh4> r10 = r10.f61500d
            java.lang.Object r10 = r10.getLast()
            te3.rh4 r10 = (te3.rh4) r10
            if (r10 != 0) goto L_0x0114
            r10 = 0
            goto L_0x0115
        L_0x0114:
            r10 = 1
        L_0x0115:
            if (r10 == 0) goto L_0x0119
            r10 = 1
            goto L_0x011a
        L_0x0119:
            r10 = 0
        L_0x011a:
            r12 = 2
            if (r10 != 0) goto L_0x011f
            if (r11 != 0) goto L_0x0123
        L_0x011f:
            if (r10 != 0) goto L_0x0138
            if (r11 == 0) goto L_0x0138
        L_0x0123:
            int r13 = com.tencent.p014mm.p136ui.LauncherUI.getCurrentTabIndex()
            if (r13 != r12) goto L_0x0138
            di3.d r13 = di3.C86312j.m106911c(r7)
            p03.d r13 = (p03.C21912d) r13
            hz.k r13 = r13.mo34966t4()
            o03.h r13 = (o03.C21723h) r13
            r13.mo33985E()
        L_0x0138:
            if (r10 != 0) goto L_0x014b
            if (r8 == 0) goto L_0x014b
            di3.d r14 = di3.C86312j.m106911c(r7)
            p03.d r14 = (p03.C21912d) r14
            hz.k r14 = r14.mo34966t4()
            o03.h r14 = (o03.C21723h) r14
            te3.rh4 r14 = r14.f61498b
            goto L_0x014c
        L_0x014b:
            r14 = 0
        L_0x014c:
            if (r10 != 0) goto L_0x015f
            if (r11 == 0) goto L_0x015f
            di3.d r15 = di3.C86312j.m106911c(r7)
            p03.d r15 = (p03.C21912d) r15
            hz.k r15 = r15.mo34966t4()
            o03.h r15 = (o03.C21723h) r15
            te3.rh4 r15 = r15.f61497a
            goto L_0x0160
        L_0x015f:
            r15 = 0
        L_0x0160:
            if (r10 != 0) goto L_0x0188
            if (r2 == 0) goto L_0x0188
            int r13 = com.tencent.p014mm.p136ui.LauncherUI.getCurrentTabIndex()
            if (r13 != r12) goto L_0x0179
            di3.d r13 = di3.C86312j.m106911c(r7)
            p03.d r13 = (p03.C21912d) r13
            hz.k r13 = r13.mo34966t4()
            o03.h r13 = (o03.C21723h) r13
            r13.mo33985E()
        L_0x0179:
            di3.d r13 = di3.C86312j.m106911c(r7)
            p03.d r13 = (p03.C21912d) r13
            hz.k r13 = r13.mo34966t4()
            o03.h r13 = (o03.C21723h) r13
            te3.rh4 r13 = r13.f61499c
            goto L_0x0189
        L_0x0188:
            r13 = 0
        L_0x0189:
            com.tencent.mm.ui.base.preference.IconPreference r12 = r0.f56318d
            com.tencent.mm.plugin.newtips.model.a r12 = (com.tencent.p014mm.plugin.newtips.model.C115619a) r12
            r20 = r9
            r9 = 4
            if (r10 != 0) goto L_0x01ad
            if (r8 == 0) goto L_0x01a2
            if (r14 == 0) goto L_0x01ad
            r21 = r8
            int r8 = r14.f64538i
            r22 = r6
            r6 = 1
            if (r8 < r6) goto L_0x01a6
            if (r8 > r9) goto L_0x01a6
            goto L_0x01b1
        L_0x01a2:
            r22 = r6
            r21 = r8
        L_0x01a6:
            if (r11 != 0) goto L_0x01b1
            if (r2 == 0) goto L_0x01ab
            goto L_0x01b1
        L_0x01ab:
            r6 = 0
            goto L_0x01b2
        L_0x01ad:
            r22 = r6
            r21 = r8
        L_0x01b1:
            r6 = 1
        L_0x01b2:
            boolean r6 = r12.mo64138m(r6)
            if (r6 == 0) goto L_0x01b9
            return
        L_0x01b9:
            int r6 = t03.C22426h.m26101c()
            if (r14 == 0) goto L_0x01c7
            boolean r8 = p03.C21914h.m25162j(r6)
            if (r8 == 0) goto L_0x01c7
            r2 = 0
            r11 = 0
        L_0x01c7:
            if (r15 == 0) goto L_0x01d2
            boolean r8 = p03.C21914h.m25163k(r6)
            if (r8 == 0) goto L_0x01d2
            r2 = 0
            r8 = 0
            goto L_0x01d4
        L_0x01d2:
            r8 = r21
        L_0x01d4:
            if (r13 == 0) goto L_0x01de
            boolean r6 = p03.C21914h.m25164l(r6)
            if (r6 == 0) goto L_0x01de
            r8 = 0
            r11 = 0
        L_0x01de:
            com.tencent.mm.ui.base.preference.IconPreference r6 = r0.f56318d
            r9 = 8
            r6.mo96250V(r9)
            com.tencent.mm.ui.base.preference.IconPreference r6 = r0.f56318d
            r6.mo101937U(r9)
            com.tencent.mm.ui.base.preference.IconPreference r6 = r0.f56318d
            r6.mo101934R(r9)
            com.tencent.mm.ui.base.preference.IconPreference r6 = r0.f56318d
            r6.mo101936T(r9)
            if (r10 == 0) goto L_0x023a
            com.tencent.mm.ui.base.preference.IconPreference r1 = r0.f56318d
            r4 = 0
            r1.mo101936T(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r4 = ""
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r4 = 99
            if (r3 <= r4) goto L_0x0213
            java.lang.String r1 = "99+"
        L_0x0213:
            com.tencent.mm.ui.base.preference.IconPreference r4 = r0.f56318d
            com.tencent.mm.ui.FindMoreFriendsUI r5 = r0.f56319e
            android.app.Activity r5 = r5.getContext()
            int r3 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r5, r3)
            r4.f215054P = r1
            r4.f215055Q = r3
            di3.d r1 = di3.C86312j.m106911c(r7)
            p03.d r1 = (p03.C21912d) r1
            hz.k r1 = r1.mo34966t4()
            o03.h r1 = (o03.C21723h) r1
            r1.mo33985E()
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_COUNTER
            r3 = 1
            r12.mo64136k(r1, r3)
            goto L_0x03fa
        L_0x023a:
            r3 = 1
            java.lang.String r6 = "#8c8c8c"
            if (r8 == 0) goto L_0x0364
            if (r14 == 0) goto L_0x0364
            int r9 = r14.f64538i
            if (r9 == r3) goto L_0x034f
            r3 = 2
            if (r9 == r3) goto L_0x031c
            r3 = 3
            if (r9 == r3) goto L_0x02c7
            r3 = 4
            if (r9 == r3) goto L_0x0262
            r3 = 1
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r9 = 0
            r14[r9] = r3
            java.lang.String r3 = "search unknown red type %d"
            r9 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r3, r14)
            goto L_0x0364
        L_0x0262:
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r9 = 8
            r3.mo96250V(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r9 = 0
            r3.mo101934R(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101932N(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101933P(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101937U(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101940Z(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            java.lang.String r9 = r14.f64539j
            r16 = r13
            int r13 = android.graphics.Color.parseColor(r6)
            r19 = r15
            r15 = -1
            r3.mo101939Y(r9, r15, r13)
            di3.d r3 = di3.C86312j.m106911c(r5)
            gt.i r3 = (p158gt.C8451i) r3
            java.lang.String r9 = r14.f64540n
            android.graphics.Bitmap r3 = r3.get(r9)
            if (r3 == 0) goto L_0x02ac
            com.tencent.mm.ui.FindMoreFriendsUI r9 = r0.f56319e
            r13 = 0
            r9.f55708y = r13
            com.tencent.mm.ui.base.preference.IconPreference r9 = r0.f56318d
            r9.mo101930L(r3)
            goto L_0x02c1
        L_0x02ac:
            di3.d r3 = di3.C86312j.m106911c(r4)
            gt.w r3 = (p158gt.C76057w) r3
            java.lang.String r9 = r14.f64540n
            com.tencent.mm.ui.FindMoreFriendsUI r13 = r0.f56319e
            gt.w$a r13 = r13.f55682Q0
            r3.h60(r9, r13)
            com.tencent.mm.ui.FindMoreFriendsUI r3 = r0.f56319e
            java.lang.String r9 = r14.f64540n
            r3.f55708y = r9
        L_0x02c1:
            r3 = 1
            r12.mo64136k(r1, r3)
            goto L_0x0368
        L_0x02c7:
            r16 = r13
            r19 = r15
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r9 = 8
            r3.mo96250V(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r9 = 0
            r3.mo101934R(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101932N(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101933P(r9)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101940Z(r9)
            di3.d r3 = di3.C86312j.m106911c(r5)
            gt.i r3 = (p158gt.C8451i) r3
            java.lang.String r9 = r14.f64540n
            android.graphics.Bitmap r3 = r3.get(r9)
            if (r3 == 0) goto L_0x0300
            com.tencent.mm.ui.FindMoreFriendsUI r9 = r0.f56319e
            r13 = 0
            r9.f55708y = r13
            com.tencent.mm.ui.base.preference.IconPreference r9 = r0.f56318d
            r9.mo101930L(r3)
            goto L_0x0315
        L_0x0300:
            di3.d r3 = di3.C86312j.m106911c(r4)
            gt.w r3 = (p158gt.C76057w) r3
            java.lang.String r9 = r14.f64540n
            com.tencent.mm.ui.FindMoreFriendsUI r13 = r0.f56319e
            gt.w$a r13 = r13.f55682Q0
            r3.h60(r9, r13)
            com.tencent.mm.ui.FindMoreFriendsUI r3 = r0.f56319e
            java.lang.String r9 = r14.f64540n
            r3.f55708y = r9
        L_0x0315:
            r3 = r17
            r9 = 1
            r12.mo64136k(r3, r9)
            goto L_0x036a
        L_0x031c:
            r16 = r13
            r19 = r15
            r3 = r17
            r9 = 1
            com.tencent.mm.ui.base.preference.IconPreference r13 = r0.f56318d
            r15 = 8
            r13.mo96250V(r15)
            com.tencent.mm.ui.base.preference.IconPreference r13 = r0.f56318d
            r15 = 0
            r13.mo101937U(r15)
            com.tencent.mm.ui.base.preference.IconPreference r13 = r0.f56318d
            java.lang.String r14 = r14.f64539j
            int r15 = android.graphics.Color.parseColor(r6)
            r9 = -1
            r13.mo101939Y(r14, r9, r15)
            com.tencent.mm.ui.base.preference.IconPreference r9 = r0.f56318d
            r13 = 1
            r9.mo101940Z(r13)
            com.tencent.mm.ui.base.preference.IconPreference r9 = r0.f56318d
            r14 = 8
            r9.mo101934R(r14)
            r9 = r18
            r12.mo64136k(r9, r13)
            goto L_0x036c
        L_0x034f:
            r16 = r13
            r19 = r15
            r3 = r17
            r9 = r18
            r13 = 1
            com.tencent.mm.ui.base.preference.IconPreference r14 = r0.f56318d
            r15 = 0
            r14.mo96250V(r15)
            r14 = r22
            r12.mo64136k(r14, r13)
            goto L_0x036e
        L_0x0364:
            r16 = r13
            r19 = r15
        L_0x0368:
            r3 = r17
        L_0x036a:
            r9 = r18
        L_0x036c:
            r14 = r22
        L_0x036e:
            if (r11 != 0) goto L_0x0372
            if (r2 == 0) goto L_0x03fa
        L_0x0372:
            if (r11 == 0) goto L_0x0377
            r15 = r19
            goto L_0x0379
        L_0x0377:
            r15 = r16
        L_0x0379:
            if (r15 == 0) goto L_0x047f
            int r13 = r15.f64538i
            switch(r13) {
                case 12: goto L_0x0474;
                case 13: goto L_0x044b;
                case 14: goto L_0x03fc;
                case 15: goto L_0x039b;
                case 16: goto L_0x0474;
                case 17: goto L_0x044b;
                case 18: goto L_0x03fc;
                case 19: goto L_0x039b;
                default: goto L_0x0380;
            }
        L_0x0380:
            r1 = 1
            r4 = 0
            di3.d r3 = di3.C86312j.m106911c(r7)
            p03.d r3 = (p03.C21912d) r3
            hz.k r3 = r3.mo34966t4()
            o03.h r3 = (o03.C21723h) r3
            r3.mo33985E()
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo96250V(r4)
            r12.mo64136k(r14, r1)
            goto L_0x0498
        L_0x039b:
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r7 = 8
            r3.mo96250V(r7)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r7 = 0
            r3.mo101934R(r7)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101932N(r7)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101933P(r7)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101937U(r7)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101940Z(r7)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            java.lang.String r7 = r15.f64539j
            int r6 = android.graphics.Color.parseColor(r6)
            r9 = -1
            r3.mo101939Y(r7, r9, r6)
            di3.d r3 = di3.C86312j.m106911c(r5)
            gt.i r3 = (p158gt.C8451i) r3
            java.lang.String r5 = r15.f64540n
            android.graphics.Bitmap r3 = r3.get(r5)
            if (r3 == 0) goto L_0x03e1
            com.tencent.mm.ui.FindMoreFriendsUI r4 = r0.f56319e
            r5 = 0
            r4.f55708y = r5
            com.tencent.mm.ui.base.preference.IconPreference r4 = r0.f56318d
            r4.mo101930L(r3)
            goto L_0x03f6
        L_0x03e1:
            di3.d r3 = di3.C86312j.m106911c(r4)
            gt.w r3 = (p158gt.C76057w) r3
            java.lang.String r4 = r15.f64540n
            com.tencent.mm.ui.FindMoreFriendsUI r5 = r0.f56319e
            gt.w$a r5 = r5.f55682Q0
            r3.h60(r4, r5)
            com.tencent.mm.ui.FindMoreFriendsUI r3 = r0.f56319e
            java.lang.String r4 = r15.f64540n
            r3.f55708y = r4
        L_0x03f6:
            r3 = 1
            r12.mo64136k(r1, r3)
        L_0x03fa:
            r1 = 1
            goto L_0x0472
        L_0x03fc:
            com.tencent.mm.ui.base.preference.IconPreference r1 = r0.f56318d
            r6 = 8
            r1.mo96250V(r6)
            com.tencent.mm.ui.base.preference.IconPreference r1 = r0.f56318d
            r6 = 0
            r1.mo101934R(r6)
            com.tencent.mm.ui.base.preference.IconPreference r1 = r0.f56318d
            r1.mo101932N(r6)
            com.tencent.mm.ui.base.preference.IconPreference r1 = r0.f56318d
            r1.mo101933P(r6)
            com.tencent.mm.ui.base.preference.IconPreference r1 = r0.f56318d
            r1.mo101940Z(r6)
            di3.d r1 = di3.C86312j.m106911c(r5)
            gt.i r1 = (p158gt.C8451i) r1
            java.lang.String r5 = r15.f64540n
            android.graphics.Bitmap r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0431
            com.tencent.mm.ui.FindMoreFriendsUI r4 = r0.f56319e
            r5 = 0
            r4.f55708y = r5
            com.tencent.mm.ui.base.preference.IconPreference r4 = r0.f56318d
            r4.mo101930L(r1)
            goto L_0x0446
        L_0x0431:
            di3.d r1 = di3.C86312j.m106911c(r4)
            gt.w r1 = (p158gt.C76057w) r1
            java.lang.String r4 = r15.f64540n
            com.tencent.mm.ui.FindMoreFriendsUI r5 = r0.f56319e
            gt.w$a r5 = r5.f55682Q0
            r1.h60(r4, r5)
            com.tencent.mm.ui.FindMoreFriendsUI r1 = r0.f56319e
            java.lang.String r4 = r15.f64540n
            r1.f55708y = r4
        L_0x0446:
            r1 = 1
            r12.mo64136k(r3, r1)
            goto L_0x0472
        L_0x044b:
            r1 = 1
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r4 = 8
            r3.mo96250V(r4)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r5 = 0
            r3.mo101937U(r5)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            java.lang.String r5 = r15.f64539j
            int r6 = android.graphics.Color.parseColor(r6)
            r7 = -1
            r3.mo101939Y(r5, r7, r6)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101940Z(r1)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo101934R(r4)
            r12.mo64136k(r9, r1)
        L_0x0472:
            r4 = 0
            goto L_0x0498
        L_0x0474:
            r1 = 1
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r4 = 0
            r3.mo96250V(r4)
            r12.mo64136k(r14, r1)
            goto L_0x0498
        L_0x047f:
            r1 = 1
            r4 = 0
            di3.d r3 = di3.C86312j.m106911c(r7)
            p03.d r3 = (p03.C21912d) r3
            hz.k r3 = r3.mo34966t4()
            o03.h r3 = (o03.C21723h) r3
            r3.mo33985E()
            com.tencent.mm.ui.base.preference.IconPreference r3 = r0.f56318d
            r3.mo96250V(r4)
            r12.mo64136k(r14, r1)
        L_0x0498:
            com.tencent.mm.ui.FindMoreFriendsUI r3 = r0.f56319e
            if (r11 != 0) goto L_0x04a7
            if (r10 != 0) goto L_0x04a7
            if (r8 != 0) goto L_0x04a7
            if (r2 == 0) goto L_0x04a3
            goto L_0x04a7
        L_0x04a3:
            r1 = r20
            r10 = 0
            goto L_0x04aa
        L_0x04a7:
            r1 = r20
            r10 = 1
        L_0x04aa:
            r3.mo25923t0(r1, r10)
            com.tencent.mm.ui.FindMoreFriendsUI r1 = r0.f56319e
            com.tencent.mm.ui.base.preference.a r1 = r1.f55702t
            r1.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C19793e0.run():void");
    }
}
