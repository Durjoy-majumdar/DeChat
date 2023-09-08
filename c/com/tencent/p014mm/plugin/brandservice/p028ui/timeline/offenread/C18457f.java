package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.f */
public class C18457f implements MRecyclerView.C40583d {

    /* renamed from: a */
    public final /* synthetic */ BizTimeLineHotListView f51232a;

    public C18457f(BizTimeLineHotListView bizTimeLineHotListView) {
        this.f51232a = bizTimeLineHotListView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03e9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23073a(androidx.recyclerview.widget.RecyclerView r21, android.view.View r22, int r23, long r24) {
        /*
            r20 = this;
            r0 = r20
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r1 = r0.f51232a
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r1 = r1.f51118E1
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2 = r23
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r) r1
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.v r3 = r2.f51124K1
            boolean r2 = r2.f51126M1
            r3.getClass()
            int r4 = r1.f51255s
            r5 = 4
            r6 = 1000(0x3e8, double:4.94E-321)
            r8 = 2
            r9 = 3
            r10 = 0
            r11 = 1
            r12 = 0
            if (r4 != r11) goto L_0x008d
            te3.n53 r4 = new te3.n53
            r4.<init>()
            java.lang.String r13 = r1.f354229d
            r4.f64264d = r13
            int r13 = r1.f51253q
            int r13 = r13 - r11
            r4.f64266f = r13
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 / r6
            int r14 = (int) r13
            r4.f64267g = r14
            boolean r13 = r1.f51256t
            r4.f64265e = r13
            r4.f64268h = r12
            r4.f64274q = r2
            if (r2 == 0) goto L_0x004a
        L_0x0048:
            r13 = 1
            goto L_0x0062
        L_0x004a:
            java.lang.String r13 = r1.f354232g
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0054
            r13 = 0
            goto L_0x0062
        L_0x0054:
            com.tencent.mm.pluginsdk.model.d r13 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r14 = r1.f354229d
            java.lang.String r15 = r1.f354232g
            boolean r13 = r13.mo25187v(r14, r15)
            if (r13 == 0) goto L_0x0061
            goto L_0x0048
        L_0x0061:
            r13 = 2
        L_0x0062:
            r4.f64275r = r13
            java.lang.String r13 = r1.f354232g
            r4.f64276s = r13
            int r13 = r1.f354235j
            r4.f64277t = r13
            int r13 = r1.f51252A
            if (r13 != r8) goto L_0x0072
            r13 = 1
            goto L_0x0073
        L_0x0072:
            r13 = 0
        L_0x0073:
            r4.f64280w = r13
            if (r2 == 0) goto L_0x007f
            boolean r2 = r3.f51272c
            r4.f64278u = r2
            boolean r2 = r1.f51257u
            r4.f64279v = r2
        L_0x007f:
            java.util.LinkedList<te3.n53> r2 = r3.f51271b
            r2.add(r4)
            com.tencent.mm.pluginsdk.model.d r2 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r3 = r1.f354229d
            r2.mo25156I(r3, r10)
            goto L_0x013a
        L_0x008d:
            if (r4 != r9) goto L_0x013a
            te3.n53 r2 = new te3.n53
            r2.<init>()
            long r13 = java.lang.System.currentTimeMillis()
            int r4 = r1.f51253q
            int r4 = r4 - r11
            r2.f64266f = r4
            long r9 = r13 / r6
            int r4 = (int) r9
            r2.f64267g = r4
            fx0.h r4 = fx0.C45825h.f123727a
            boolean r9 = r4.mo71294e()
            if (r9 == 0) goto L_0x00ac
            r9 = 2
            goto L_0x00ad
        L_0x00ac:
            r9 = 1
        L_0x00ad:
            r2.f64268h = r9
            java.lang.String r9 = r4.mo71290a(r12)
            r2.f64269i = r9
            java.lang.String r9 = r4.mo71290a(r12)
            java.lang.String r9 = p243tn.C14050a.m13405b(r9)
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            r2.f64271n = r9
            te3.gr4 r9 = fx0.C45825h.m51115f()
            if (r9 != 0) goto L_0x00cc
            java.lang.String r9 = ""
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r9 = r9.f134223j
        L_0x00ce:
            r2.f64270j = r9
            te3.gr4 r9 = fx0.C45825h.m51115f()
            if (r9 != 0) goto L_0x00d8
        L_0x00d6:
            r9 = 0
            goto L_0x00e9
        L_0x00d8:
            boolean r10 = r4.mo71295g()
            if (r10 != 0) goto L_0x00e8
            java.lang.String r10 = r9.f134220g
            java.lang.String r9 = r9.f134222i
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r9)
            if (r9 == 0) goto L_0x00d6
        L_0x00e8:
            r9 = 1
        L_0x00e9:
            r2.f64272o = r9
            r2.f64273p = r13
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r12] = r9
            int r9 = r2.f64271n
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r11] = r9
            java.lang.String r9 = "MicroMsg.BizTimeLineOftenReadReport"
            java.lang.String r15 = "onClick is_default_icon %d, is_icon_cache %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r15, r10)
            java.util.LinkedList<te3.n53> r3 = r3.f51271b
            r3.add(r2)
            boolean r3 = r4.mo71294e()
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 21258(0x530a, float:2.9789E-41)
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r10[r12] = r15
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r10[r11] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r10[r8] = r13
            java.lang.String r2 = r2.f64269i
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r13 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r2)
            r13 = 3
            r10[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r10[r5] = r2
            r4.mo160131h(r9, r10)
        L_0x013a:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            boolean r2 = r2.f51126M1
            if (r2 != 0) goto L_0x03be
            com.tencent.mm.pluginsdk.model.d r2 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r3 = r1.f354229d
            java.lang.String r4 = r1.f354232g
            boolean r2 = r2.mo25187v(r3, r4)
            if (r2 == 0) goto L_0x014e
            goto L_0x03be
        L_0x014e:
            int r2 = r1.f51255s
            java.lang.String r3 = "MicroMsg.BizTimeLineHotListView"
            if (r2 != r11) goto L_0x02af
            java.lang.String r2 = r1.f354229d
            boolean r2 = eb0.C45628s0.m50740E(r2)
            boolean r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29762i.f80770a
            r5 = 8
            java.lang.String r6 = "specific_chat_from_scene"
            r7 = 91
            java.lang.String r9 = "KOpenArticleSceneFromScene"
            if (r2 == 0) goto L_0x0195
            if (r4 != 0) goto L_0x0195
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = r1.f354229d
            java.lang.String r4 = "Chat_User"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "finish_direct"
            r2.putExtra(r3, r11)
            r2.putExtra(r9, r7)
            r2.putExtra(r6, r5)
            r3 = 12
            java.lang.String r4 = "preChatTYPE"
            r2.putExtra(r4, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r3 = r0.f51232a
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = ".ui.chatting.ChattingUI"
            r5 = 0
            ke3.C88144b.m109801s(r3, r4, r2, r5)
            goto L_0x020a
        L_0x0195:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r1.f354229d
            java.lang.String r10 = "Contact_User"
            r2.putExtra(r10, r4)
            java.lang.String r4 = "force_get_contact"
            r2.putExtra(r4, r11)
            java.lang.String r4 = "key_use_new_contact_profile"
            r2.putExtra(r4, r11)
            r2.putExtra(r9, r7)
            r2.putExtra(r6, r5)
            java.lang.String r4 = "BizTimeLineHotList_UserClick_FinderMsgTimeStamp"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r4)
            java.lang.String r5 = r1.f354229d
            long r6 = r1.f51262z
            r4.encode((java.lang.String) r5, (long) r6)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r1.f51252A
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r12] = r5
            java.lang.String r5 = r1.f354229d
            r4[r11] = r5
            long r5 = r1.f51262z
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r8] = r5
            java.lang.String r5 = "user click!, greenDotJumpType = %s, username = %s, time = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            int r3 = r1.f51252A
            java.lang.String r4 = "biz_profile_enter_from_finder"
            java.lang.String r5 = "Contact_Scene"
            if (r3 != r11) goto L_0x01ec
            r3 = 228(0xe4, float:3.2E-43)
            r2.putExtra(r5, r3)
            r2.putExtra(r4, r12)
            goto L_0x01fb
        L_0x01ec:
            if (r3 != r8) goto L_0x01fb
            r3 = 235(0xeb, float:3.3E-43)
            r2.putExtra(r5, r3)
            java.lang.String r3 = "biz_profile_tab_type"
            r2.putExtra(r3, r11)
            r2.putExtra(r4, r11)
        L_0x01fb:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r3 = r0.f51232a
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "profile"
            java.lang.String r5 = ".ui.ContactInfoUI"
            r6 = 0
            ke3.C88144b.m109791i(r3, r4, r5, r2, r6)
        L_0x020a:
            r1.f51256t = r12
            r1.f51261y = r12
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            r2.mo23004K1(r1)
            java.lang.String r2 = r1.f354229d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x022e
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
            java.lang.String r3 = r1.f354229d
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            r2.mo69778p0(r3)
        L_0x022e:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            android.content.Context r2 = r2.getContext()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI
            if (r2 == 0) goto L_0x03bd
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            android.content.Context r2 = r2.getContext()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI) r2
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r2 = r2.f50249v
            java.lang.String r1 = r1.f354229d
            r2.getClass()
            com.tencent.mm.storage.t r3 = com.tencent.p014mm.storage.C19627t.f55586a
            int r3 = r3.mo25831e()
            java.util.List<com.tencent.mm.storage.o0> r4 = r2.f51080n
            int r4 = r4.size()
            if (r4 <= r3) goto L_0x03bd
            com.tencent.mm.plugin.brandservice.ui.timeline.o3 r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18418o3.f51098a
            java.util.List<com.tencent.mm.storage.o0> r4 = r2.f51080n
            java.lang.Object r3 = r4.get(r3)
            com.tencent.mm.storage.o0 r3 = (com.tencent.p014mm.storage.C19623o0) r3
            java.util.List<com.tencent.mm.storage.o0> r4 = r2.f51080n
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r2 = r2.f51081o
            java.lang.String r5 = "info"
            gy3.C87412m.m108594g(r3, r5)
            java.lang.String r5 = "sessionItemCache"
            gy3.C87412m.m108594g(r2, r5)
            rx3.g r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18418o3.f51101d
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0280
            goto L_0x03bd
        L_0x0280:
            if (r1 != 0) goto L_0x0284
            goto L_0x03bd
        L_0x0284:
            if (r4 != 0) goto L_0x0288
            goto L_0x03bd
        L_0x0288:
            long r5 = r3.mo25767q2()
            com.tencent.mm.storage.p0 r7 = rb0.C48009v0.Jx0()
            long r7 = r7.mo25791TO()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x02a1
            java.lang.String r1 = "MicroMsg.BizTimeLineResortHelper"
            java.lang.String r2 = "onOftenReadClick not newest group"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x03bd
        L_0x02a1:
            zt3.t r5 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.brandservice.ui.timeline.r3 r6 = new com.tencent.mm.plugin.brandservice.ui.timeline.r3
            r6.<init>(r3, r4, r2, r1)
            zt3.j r5 = (zt3.C119157j) r5
            r5.mo183895z(r6)
            goto L_0x03bd
        L_0x02af:
            r4 = 3
            if (r2 != r4) goto L_0x03bd
            java.lang.String r2 = "alvinluo onClick jump to video channel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18469s
            if (r2 == 0) goto L_0x03bd
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.s r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18469s) r1
            r2.getClass()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r5 = r1.f51265D
            r4[r12] = r5
            int r5 = r1.f51266E
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r11] = r5
            int r5 = r1.f51267F
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r8] = r5
            java.lang.String r5 = r1.f51268G
            r8 = 3
            r4[r8] = r5
            java.lang.String r5 = "jumpVideoChannel, appId: %s, appVersion: %d, funcVersion: %d, dataBuffer: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            fx0.h r4 = fx0.C45825h.f123727a
            boolean r5 = r4.mo71294e()
            if (r5 == 0) goto L_0x02f1
            java.lang.String r1 = "jumpVideoChannel show canvas now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            goto L_0x03bd
        L_0x02f1:
            java.lang.String r5 = r1.f51265D
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x03bd
            di0.o r5 = new di0.o
            r5.<init>()
            java.lang.String r8 = r1.f51265D
            r5.f250930b = r8
            int r8 = r1.f51266E
            r5.f250931c = r8
            r8 = 1130(0x46a, float:1.583E-42)
            r5.f250939k = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.z r8 = new com.tencent.mm.plugin.brandservice.ui.timeline.offenread.z
            r8.<init>()
            int r9 = com.tencent.p014mm.storage.C19636w0.f55626c
            r8.f158255d = r9
            java.lang.String r9 = r1.f51268G
            r8.f158256e = r9
            r5.f250937i = r8
            boolean r8 = r4.mo71295g()
            if (r8 == 0) goto L_0x0320
            goto L_0x0329
        L_0x0320:
            te3.gr4 r8 = fx0.C45825h.m51115f()
            if (r8 == 0) goto L_0x0329
            java.lang.String r8 = r8.f134216A
            goto L_0x032a
        L_0x0329:
            r8 = 0
        L_0x032a:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x0332
            r5.f250934f = r8
        L_0x0332:
            java.lang.Class<kr0.x0> r8 = kr0.C76630x0.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            kr0.x0 r8 = (kr0.C76630x0) r8
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8.mo106898tv(r9, r5)
            boolean r5 = r1.f51256t
            if (r5 == 0) goto L_0x0355
            r1.f51256t = r12
            int r5 = r1.f51267F
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r3)
            java.lang.String r8 = "VideoChannelTopBarVersion"
            r3.encode((java.lang.String) r8, (int) r5)
            r2.mo23004K1(r1)
        L_0x0355:
            r3 = 0
            r1.f51268G = r3
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$e r3 = new com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$e
            r5 = r22
            r3.<init>(r2, r5)
            android.widget.ImageView r5 = r3.f51163z
            if (r5 == 0) goto L_0x03bd
            java.lang.String r5 = r1.f354230e
            if (r5 != 0) goto L_0x0368
            goto L_0x039d
        L_0x0368:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = r4.mo71291b()
            java.lang.String r8 = "biz_video_channel_show_default_icon"
            r5.encode((java.lang.String) r8, (int) r11)
            te3.gr4 r5 = fx0.C45825h.m51115f()
            if (r5 == 0) goto L_0x039d
            java.lang.String r8 = r5.f134225o
            if (r8 == 0) goto L_0x0384
            boolean r8 = z04.C112551y.m153811k(r8)
            if (r8 == 0) goto L_0x0382
            goto L_0x0384
        L_0x0382:
            r8 = 0
            goto L_0x0385
        L_0x0384:
            r8 = 1
        L_0x0385:
            if (r8 != 0) goto L_0x039d
            r9 = 0
            r5.f134225o = r9
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = r4.mo71291b()     // Catch:{ Exception -> 0x039c }
            java.lang.String r8 = "biz_video_channel_top_bar_info"
            byte[] r5 = r5.toByteArray()     // Catch:{ Exception -> 0x039c }
            if (r5 != 0) goto L_0x0398
            byte[] r5 = new byte[r12]     // Catch:{ Exception -> 0x039c }
        L_0x0398:
            r4.encode((java.lang.String) r8, (byte[]) r5)     // Catch:{ Exception -> 0x039c }
            goto L_0x039d
        L_0x039c:
        L_0x039d:
            te3.gr4 r4 = fx0.C45825h.m51115f()
            if (r4 != 0) goto L_0x03a4
            goto L_0x03ab
        L_0x03a4:
            int r4 = r4.f134228r
            r4 = r4 & 16
            if (r4 == 0) goto L_0x03ab
            goto L_0x03ac
        L_0x03ab:
            r11 = 0
        L_0x03ac:
            if (r11 == 0) goto L_0x03bd
            zt3.t r4 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.g r5 = new com.tencent.mm.plugin.brandservice.ui.timeline.offenread.g
            r5.<init>(r2, r3, r1)
            zt3.j r4 = (zt3.C119157j) r4
            r4.getClass()
            r4.mo183892w(r5, r6, r12)
        L_0x03bd:
            return
        L_0x03be:
            r9 = 0
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            boolean r3 = r2.f51126M1
            if (r3 == 0) goto L_0x03c8
            r17 = 2
            goto L_0x03ca
        L_0x03c8:
            r17 = 1
        L_0x03ca:
            com.tencent.mm.pluginsdk.model.d r13 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            android.content.Context r14 = r2.getContext()
            java.lang.String r15 = r1.f354229d
            java.lang.String r2 = r1.f354232g
            int r3 = r1.f354235j
            boolean r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29762i.f80770a
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r4 = r0.f51232a
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r4 = r4.f51118E1
            if (r4 == 0) goto L_0x0446
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x03e9:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0413
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r r7 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r) r7
            int r8 = r7.f354235j
            if (r8 != 0) goto L_0x040c
            java.lang.String r7 = r7.f354232g
            if (r7 == 0) goto L_0x0407
            boolean r7 = z04.C112551y.m153811k(r7)
            if (r7 == 0) goto L_0x0405
            goto L_0x0407
        L_0x0405:
            r7 = 0
            goto L_0x0408
        L_0x0407:
            r7 = 1
        L_0x0408:
            if (r7 != 0) goto L_0x040c
            r7 = 1
            goto L_0x040d
        L_0x040c:
            r7 = 0
        L_0x040d:
            if (r7 == 0) goto L_0x03e9
            r5.add(r6)
            goto L_0x03e9
        L_0x0413:
            java.util.ArrayList r10 = new java.util.ArrayList
            r4 = 10
            int r4 = sx3.C36907w.m41090l(r5, r4)
            r10.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x0422:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0443
            java.lang.Object r5 = r4.next()
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r r5 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r) r5
            te3.qf r6 = new te3.qf
            r6.<init>()
            java.lang.String r7 = r5.f354229d
            r6.f354270d = r7
            java.lang.String r7 = r5.f354232g
            r6.f354271e = r7
            int r5 = r5.f354235j
            r6.f354274h = r5
            r10.add(r6)
            goto L_0x0422
        L_0x0443:
            r19 = r10
            goto L_0x0448
        L_0x0446:
            r19 = r9
        L_0x0448:
            r16 = r2
            r18 = r3
            r13.mo25190y(r14, r15, r16, r17, r18, r19)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            boolean r3 = r2.f51126M1
            if (r3 != 0) goto L_0x0462
            com.tencent.mm.pluginsdk.model.d r2 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r3 = r1.f354229d
            r2.mo25158K(r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r2 = r0.f51232a
            r2.mo23003J1(r1)
            goto L_0x0469
        L_0x0462:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.a0 r2 = r2.f51125L1
            java.lang.String r1 = r1.f354229d
            r2.mo23047y0(r1)
        L_0x0469:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18457f.mo23073a(androidx.recyclerview.widget.RecyclerView, android.view.View, int, long):void");
    }
}
