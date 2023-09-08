package xl3;

import androidx.lifecycle.C0120a0;

/* renamed from: xl3.e */
public final class C23103e<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C23104f f66383d;

    public C23103e(C23104f fVar) {
        this.f66383d = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        if (r7.field_ctrType == 1011) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(java.lang.Object r15) {
        /*
            r14 = this;
            com.tencent.mm.plugin.finder.extension.reddot.a r15 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2458a) r15
            xl3.f r0 = r14.f66383d
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.Class<gt1.b> r2 = gt1.C20838b.class
            com.tencent.mm.ui.FinderIconViewTipPreference r5 = r0.f66387d
            java.lang.String r3 = "NearbyEntryPreferenceMgr"
            if (r5 != 0) goto L_0x0015
            java.lang.String r15 = "handleNearbyEntranceRedDot return for null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
            goto L_0x025c
        L_0x0015:
            r4 = 32
            java.lang.String r6 = "handleNearbyEntranceRedDot preference:"
            if (r15 != 0) goto L_0x003e
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            r15.append(r5)
            r15.append(r4)
            int r0 = r5.hashCode()
            r15.append(r0)
            java.lang.String r0 = " return for null"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
            goto L_0x025c
        L_0x003e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "handleNearbyEntranceRedDot nearbyEntrance result:"
            r7.append(r8)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            boolean r7 = r15.f12908a
            java.lang.String r8 = "find_live_friends_by_near"
            r9 = 0
            if (r7 != 0) goto L_0x0068
            r5.mo25956f(r9)
            com.tencent.mm.ui.FindMoreFriendsUI r15 = r0.f66385b
            r15.mo25923t0(r8, r9)
            java.lang.String r15 = "handleNearbyEntranceRedDot return for isShow"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r15)
            goto L_0x025c
        L_0x0068:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r7 = r15.f12910c
            r10 = 1
            if (r7 == 0) goto L_0x0082
            int r11 = r7.field_ctrType
            r12 = 1013(0x3f5, float:1.42E-42)
            if (r11 == r12) goto L_0x0080
            r12 = 1014(0x3f6, float:1.421E-42)
            if (r11 == r12) goto L_0x0080
            gy3.C87412m.m108591d(r7)
            int r7 = r7.field_ctrType
            r11 = 1011(0x3f3, float:1.417E-42)
            if (r7 != r11) goto L_0x0082
        L_0x0080:
            r7 = 1
            goto L_0x0083
        L_0x0082:
            r7 = 0
        L_0x0083:
            if (r7 != 0) goto L_0x00a7
            di3.d r11 = di3.C86312j.m106911c(r2)
            gt1.b r11 = (gt1.C20838b) r11
            boolean r11 = r11.mo32540ag()
            if (r11 == 0) goto L_0x00a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleNearbyEntranceRedDot return for nearby v3 result:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r15)
            goto L_0x025c
        L_0x00a7:
            te3.nn1 r11 = r15.f12909b
            if (r11 != 0) goto L_0x00b2
            java.lang.String r15 = "handleNearbyEntranceRedDot info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r15)
            goto L_0x025c
        L_0x00b2:
            di3.d r12 = di3.C86312j.m106911c(r1)
            ht1.t1 r12 = (ht1.C60200t1) r12
            ht1.b4 r12 = r12.Nt0()
            boolean r12 = r12.mo77229H5()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r5)
            r13.append(r4)
            int r4 = r5.hashCode()
            r13.append(r4)
            java.lang.String r4 = " [onChanged] isEnableShowNearByEntranceRedDot:"
            r13.append(r4)
            r13.append(r12)
            java.lang.String r4 = " result"
            r13.append(r4)
            r13.append(r15)
            java.lang.String r4 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.lang.String r4 = ""
            r6 = -1
            if (r7 == 0) goto L_0x01d9
            int r1 = r11.f184502d
            r2 = 101(0x65, float:1.42E-43)
            if (r1 == r2) goto L_0x0114
            if (r12 != 0) goto L_0x0114
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "handleNearbyEntranceLocalRedDot return for enableShowNearByEntranceRedDot:"
            r15.append(r0)
            r15.append(r12)
            r0 = 46
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r15)
            goto L_0x0250
        L_0x0114:
            com.tencent.mm.ui.FindMoreFriendsUI r1 = r0.f66385b
            int r1 = r1.f55676K
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 != 0) goto L_0x011e
            r1 = 1
            goto L_0x011f
        L_0x011e:
            r1 = 0
        L_0x011f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "handleNearbyEntranceLocalRedDot enableNearbyFriends:"
            r7.append(r13)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            com.tencent.mm.ui.FindMoreFriendsUI r3 = r0.f66385b
            r3.mo25923t0(r8, r10)
            int r3 = r11.f184502d
            r7 = 6
            if (r3 != r7) goto L_0x0161
            com.tencent.mm.storage.c4 r15 = fd0.C75743h.xx0()
            int r15 = r15.mo100937kD()
            if (r15 <= 0) goto L_0x0149
            if (r1 != 0) goto L_0x0250
        L_0x0149:
            r5.mo25956f(r9)
            r5.mo101936T(r9)
            android.content.Context r15 = r0.f66384a
            r0 = 2131821611(0x7f11042b, float:1.927597E38)
            java.lang.String r15 = r15.getString(r0)
            r0 = 2131234251(0x7f080dcb, float:1.8084662E38)
            r5.f215054P = r15
            r5.f215055Q = r0
            goto L_0x0250
        L_0x0161:
            r5.mo25956f(r9)
            r5.mo101932N(r9)
            r5.mo101934R(r9)
            android.content.Context r1 = r0.f66384a
            r3 = 2131756042(0x7f10040a, float:1.914298E38)
            android.content.res.Resources r7 = r1.getResources()
            r8 = 2131100124(0x7f0601dc, float:1.781262E38)
            int r7 = r7.getColor(r8)
            android.graphics.drawable.Drawable r1 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r1, r3, r7)
            r5.f215050K = r1
            r3 = 0
            r5.f215073Z = r3
            r5.f215049J = r6
            android.widget.ImageView r3 = r5.f215051L
            if (r3 == 0) goto L_0x018c
            r3.setImageDrawable(r1)
        L_0x018c:
            android.content.Context r1 = r0.f66384a
            r3 = 2131165329(0x7f070091, float:1.7944872E38)
            int r1 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r1, r3)
            android.content.Context r6 = r0.f66384a
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r6, r3)
            r5.mo101935S(r1, r3)
            int r1 = r11.f184502d
            if (r1 == r2) goto L_0x0250
            int r1 = r11.f184503e
            r5.mo101936T(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            android.content.Context r0 = r0.f66384a
            int r0 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r0, r1)
            r5.f215054P = r2
            r5.f215055Q = r0
            java.lang.Class<ht1.e4> r0 = ht1.C60165e4.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.e4 r0 = (ht1.C60165e4) r0
            com.tencent.mm.plugin.finder.extension.reddot.s0 r15 = r15.f12910c
            gy3.C87412m.m108591d(r15)
            java.lang.String r15 = r15.field_tipsId
            java.lang.String r1 = "result.ctrInfo!!.field_tipsId"
            gy3.C87412m.m108593f(r15, r1)
            r0.mo85171pZ(r15)
            goto L_0x0250
        L_0x01d9:
            di3.d r2 = di3.C86312j.m106911c(r2)
            gt1.b r2 = (gt1.C20838b) r2
            boolean r2 = r2.mo32540ag()
            if (r2 == 0) goto L_0x01eb
            java.lang.String r15 = "handleNearbyEntranceLiveRedDot return for isEnableFindLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r15)
            goto L_0x0250
        L_0x01eb:
            boolean r2 = uc3.C78146a.m94353b()
            if (r2 != 0) goto L_0x01f7
            java.lang.String r15 = "handleNearbyEntranceLiveRedDot return for isEnableNearByLiveFriends"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r15)
            goto L_0x0250
        L_0x01f7:
            r2 = 8
            r5.mo101932N(r2)
            r5.mo101936T(r2)
            r5.f215054P = r4
            r5.f215055Q = r6
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.b4 r1 = r1.Nt0()
            boolean r1 = r1.mo77229H5()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "handleNearbyEntranceLiveRedDot isEnableShowNearByEntranceRedDot:"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = " result:"
            r2.append(r4)
            r2.append(r15)
            java.lang.String r4 = " info:"
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.ui.FindMoreFriendsUI r3 = r0.f66385b
            r6 = 0
            com.tencent.mm.plugin.finder.extension.reddot.s0 r15 = r15.f12910c
            if (r15 == 0) goto L_0x0246
            te3.yi1 r15 = r15.f158585F
            if (r15 == 0) goto L_0x0246
            int r15 = r15.f186565z
            if (r15 != r10) goto L_0x0246
            r8 = 1
            goto L_0x0247
        L_0x0246:
            r8 = 0
        L_0x0247:
            r9 = 0
            r4 = r11
            r7 = r1
            r3.mo25896Y(r4, r5, r6, r7, r8, r9)
            r0.mo36510b(r1)
        L_0x0250:
            zt3.t r15 = zt3.C119157j.f356862d
            xl3.d r0 = new xl3.d
            r0.<init>(r12)
            zt3.j r15 = (zt3.C119157j) r15
            r15.mo183870a(r0)
        L_0x025c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xl3.C23103e.onChanged(java.lang.Object):void");
    }
}
