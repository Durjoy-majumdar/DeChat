package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import bp3.C104160f;
import bp3.C79758p;
import c83.C0437d;
import c83.C23800b;
import c83.C67348c;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.InputChangeLineStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TranslateMsgStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCTopicSearchVCActionReportStruct;
import com.tencent.p014mm.p136ui.chatting.component.C73537m5;
import com.tencent.p014mm.p136ui.chatting.component.FootComponent$$j;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d83.C97448g;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import g13.C75824d;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.UUID;
import p206nj.C117627q;
import p255vr.C65873e;
import ro3.C110588j;
import te3.xe4;
import u73.C22613h1;
import yd3.C66622a;
import z04.C112551y;
import zj3.C79353f1;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.u */
public class C72833u implements C110588j.C110590c {

    /* renamed from: a */
    public final /* synthetic */ Context f212254a;

    /* renamed from: b */
    public final /* synthetic */ ChatFooter f212255b;

    public C72833u(ChatFooter chatFooter, Context context) {
        this.f212255b = chatFooter;
        this.f212254a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (((zj3.C79366k) r2.f211826V1.mo100531a().f193278b.mo102812a(zj3.C79366k.class)).mo70129g1() == false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ea  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14785a(java.util.List<ro3.C110588j.C110589b> r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.Class<zj3.f1> r3 = zj3.C79353f1.class
            java.lang.Class<c00.n> r4 = c00.C0405n.class
            int r5 = eb0.C31543z5.m39455e()
            long r14 = (long) r5
            r13 = 7
            r12 = 4
            r11 = 8
            r10 = 3
            r9 = 2
            r7 = 1
            if (r2 == r11) goto L_0x0267
            if (r2 == r7) goto L_0x0267
            java.lang.Class<u73.n> r2 = u73.C101980n.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            u73.n r2 = (u73.C101980n) r2
            boolean r2 = r2.n30()
            if (r2 == 0) goto L_0x00cf
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f212255b
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r6 = r2.f211826V1
            if (r6 == 0) goto L_0x0079
            ck3.b r6 = r6.mo100531a()
            if (r6 == 0) goto L_0x0079
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r6 = r2.f211826V1
            ck3.b r6 = r6.mo100531a()
            java.lang.Class<zj3.j> r7 = zj3.C79365j.class
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r6 = r6.mo102812a(r7)
            zj3.j r6 = (zj3.C79365j) r6
            boolean r6 = r6.mo70105e4()
            if (r6 != 0) goto L_0x0077
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r6 = r2.f211826V1
            ck3.b r6 = r6.mo100531a()
            java.lang.Class<zj3.q> r7 = zj3.C79377q.class
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r6 = r6.mo102812a(r7)
            zj3.q r6 = (zj3.C79377q) r6
            boolean r6 = r6.mo70131k2()
            if (r6 != 0) goto L_0x0077
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r2 = r2.f211826V1
            ck3.b r2 = r2.mo100531a()
            java.lang.Class<zj3.k> r6 = zj3.C79366k.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r6)
            zj3.k r2 = (zj3.C79366k) r2
            boolean r2 = r2.mo70129g1()
            if (r2 != 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r2 = 0
            goto L_0x007a
        L_0x0079:
            r2 = 1
        L_0x007a:
            if (r2 == 0) goto L_0x00cf
            di3.d r2 = di3.C86312j.m106911c(r4)
            c00.n r2 = (c00.C0405n) r2
            boolean r2 = r2.mo279e()
            if (r2 != 0) goto L_0x00cf
            ro3.j$b r2 = new ro3.j$b
            android.content.Context r6 = r0.f212254a
            r7 = 2131837611(0x7f1142ab, float:1.9308422E38)
            java.lang.String r6 = r6.getString(r7)
            r2.<init>(r6, r9)
            r1.add(r2)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f212255b
            com.tencent.mm.ui.widget.cedit.api.a r2 = r2.f211888j
            android.view.View r6 = r2.view()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f212255b
            java.lang.String r2 = r2.f211858d
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r2 == 0) goto L_0x00ad
            r7 = 2
            goto L_0x00ae
        L_0x00ad:
            r7 = 1
        L_0x00ae:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f212255b
            java.lang.String r8 = r2.f211858d
            java.lang.String r9 = r2.f211753E1
            r17 = 1
            java.lang.String r2 = r2.f211757F1
            r18 = 1
            java.lang.String r19 = ""
            r5 = 1
            r5 = 3
            r10 = r17
            r16 = 8
            r11 = r19
            r5 = 4
            r12 = r2
            r2 = 7
            r13 = r18
            r17 = r14
            c83.C23800b.m28600a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00d5
        L_0x00cf:
            r17 = r14
            r2 = 7
            r5 = 4
            r16 = 8
        L_0x00d5:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            boolean r6 = r6.mo100496t0()
            if (r6 == 0) goto L_0x0113
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            com.tencent.mm.pluginsdk.ui.chat.z0 r6 = r6.f211745C1
            boolean r6 = r6.mo100697j()
            if (r6 == 0) goto L_0x0113
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            boolean r6 = r6.mo100444p0()
            if (r6 != 0) goto L_0x0113
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            boolean r6 = r6.f211874g1
            if (r6 == 0) goto L_0x0113
            ro3.j$b r6 = new ro3.j$b
            android.content.Context r7 = r0.f212254a
            r8 = 2131832869(0x7f113025, float:1.9298804E38)
            java.lang.String r7 = r7.getString(r8)
            r6.<init>(r7, r2)
            r1.add(r6)
            yd3.a r6 = yd3.C66622a.f191567a
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r7 = r0.f212255b
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r7 = r7.f211826V1
            ck3.b r7 = r7.mo100531a()
            r6.mo90685a(r5, r7)
        L_0x0113:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            boolean r6 = r6.mo100496t0()
            if (r6 == 0) goto L_0x0169
            di3.d r4 = di3.C86312j.m106911c(r4)
            c00.n r4 = (c00.C0405n) r4
            boolean r4 = r4.mo279e()
            if (r4 != 0) goto L_0x0169
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f212255b
            boolean r4 = r4.mo100444p0()
            if (r4 != 0) goto L_0x0169
            ro3.j$b r4 = new ro3.j$b
            android.content.Context r6 = r0.f212254a
            r7 = 2131825971(0x7f111533, float:1.9284813E38)
            java.lang.String r6 = r6.getString(r7)
            r14 = 3
            r4.<init>(r6, r14)
            r1.add(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f212255b
            com.tencent.mm.ui.widget.cedit.api.a r4 = r4.f211888j
            android.view.View r6 = r4.view()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f212255b
            java.lang.String r4 = r4.f211858d
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
            if (r4 == 0) goto L_0x0155
            r7 = 2
            goto L_0x0156
        L_0x0155:
            r7 = 1
        L_0x0156:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f212255b
            java.lang.String r8 = r4.f211858d
            java.lang.String r9 = r4.f211753E1
            r10 = 1
            java.lang.String r12 = r4.f211757F1
            r13 = 2
            java.lang.String r11 = ""
            r4 = 3
            r14 = r17
            c83.C23800b.m28600a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x016a
        L_0x0169:
            r4 = 3
        L_0x016a:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            boolean r6 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85254h(r6)
            java.lang.String r7 = "randomUUID().toString()"
            java.lang.String r8 = "chatId"
            if (r6 == 0) goto L_0x01ea
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            com.tencent.mm.ui.chatting.component.m5$c r6 = r6.f211773J1
            if (r6 == 0) goto L_0x01ea
            com.tencent.mm.ui.chatting.component.FootComponent$$j r6 = (com.tencent.p014mm.p136ui.chatting.component.FootComponent$$j) r6
            com.tencent.mm.ui.chatting.component.FootComponent r6 = r6.f215537a
            ck3.b r6 = r6.f215752d
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r6 = r6.mo102812a(r3)
            zj3.f1 r6 = (zj3.C79353f1) r6
            boolean r6 = r6.mo102519Q0()
            if (r6 != 0) goto L_0x01ea
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            boolean r6 = r6.mo100444p0()
            if (r6 != 0) goto L_0x01ea
            ro3.j$b r3 = new ro3.j$b
            android.content.Context r6 = r0.f212254a
            r9 = 2131832896(0x7f113040, float:1.9298859E38)
            java.lang.String r6 = r6.getString(r9)
            r3.<init>(r6, r5)
            r1.add(r3)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f212255b
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211826V1
            java.lang.String r3 = r3.mo100532b()
            gy3.C87412m.m108594g(r3, r8)
            com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct
            r6.<init>()
            java.lang.String r8 = g13.C75824d.f222434a
            int r8 = r8.length()
            if (r8 != 0) goto L_0x01c4
            r8 = 1
            goto L_0x01c5
        L_0x01c4:
            r8 = 0
        L_0x01c5:
            if (r8 == 0) goto L_0x01d5
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            gy3.C87412m.m108593f(r8, r7)
            g13.C75824d.f222434a = r8
            goto L_0x01d7
        L_0x01d5:
            java.lang.String r8 = g13.C75824d.f222434a
        L_0x01d7:
            r6.mo93199u(r8)
            r7 = 1
            r6.f194636f = r7
            java.lang.String r7 = "1"
            r6.mo93197s(r7)
            r6.mo93198t(r3)
            r6.mo86054n()
            goto L_0x0265
        L_0x01ea:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            boolean r6 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85254h(r6)
            if (r6 == 0) goto L_0x0265
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f212255b
            com.tencent.mm.ui.chatting.component.m5$c r6 = r6.f211773J1
            if (r6 == 0) goto L_0x0265
            com.tencent.mm.ui.chatting.component.FootComponent$$j r6 = (com.tencent.p014mm.p136ui.chatting.component.FootComponent$$j) r6
            com.tencent.mm.ui.chatting.component.FootComponent r6 = r6.f215537a
            ck3.b r6 = r6.f215752d
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r3 = r6.mo102812a(r3)
            zj3.f1 r3 = (zj3.C79353f1) r3
            boolean r3 = r3.mo102519Q0()
            if (r3 == 0) goto L_0x0265
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f212255b
            boolean r3 = r3.mo100444p0()
            if (r3 != 0) goto L_0x0265
            ro3.j$b r3 = new ro3.j$b
            android.content.Context r6 = r0.f212254a
            r9 = 2131832895(0x7f11303f, float:1.9298857E38)
            java.lang.String r6 = r6.getString(r9)
            r9 = 5
            r3.<init>(r6, r9)
            r1.add(r3)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f212255b
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211826V1
            java.lang.String r3 = r3.mo100532b()
            gy3.C87412m.m108594g(r3, r8)
            com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct
            r6.<init>()
            java.lang.String r8 = g13.C75824d.f222434a
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0240
            r8 = 1
            goto L_0x0241
        L_0x0240:
            r8 = 0
        L_0x0241:
            if (r8 == 0) goto L_0x0251
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            gy3.C87412m.m108593f(r8, r7)
            g13.C75824d.f222434a = r8
            goto L_0x0253
        L_0x0251:
            java.lang.String r8 = g13.C75824d.f222434a
        L_0x0253:
            r6.mo93199u(r8)
            r7 = 1
            r6.f194636f = r7
            java.lang.String r7 = "2"
            r6.mo93197s(r7)
            r6.mo93198t(r3)
            r6.mo86054n()
            goto L_0x026d
        L_0x0265:
            r9 = 5
            goto L_0x026d
        L_0x0267:
            r2 = 7
            r4 = 3
            r5 = 4
            r9 = 5
            r16 = 8
        L_0x026d:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f212255b
            com.tencent.mm.ui.widget.cedit.api.a r6 = r3.f211888j
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211826V1
            java.lang.String r7 = "items"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.String r7 = "edt"
            gy3.C87412m.m108594g(r6, r7)
            if (r3 != 0) goto L_0x0281
            goto L_0x032e
        L_0x0281:
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0289
            r8 = 1
            goto L_0x028a
        L_0x0289:
            r8 = 0
        L_0x028a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Iterator r1 = r21.iterator()
        L_0x0293:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x02d5
            java.lang.Object r7 = r1.next()
            ro3.j$b r7 = (ro3.C110588j.C110589b) r7
            int r7 = r7.f330853b
            r13 = -1
            switch(r7) {
                case 1: goto L_0x02ba;
                case 2: goto L_0x02b8;
                case 3: goto L_0x02b5;
                case 4: goto L_0x02b2;
                case 5: goto L_0x02af;
                case 6: goto L_0x02ad;
                case 7: goto L_0x02aa;
                default: goto L_0x02a5;
            }
        L_0x02a5:
            switch(r7) {
                case 16908319: goto L_0x02c2;
                case 16908320: goto L_0x02c0;
                case 16908321: goto L_0x02be;
                case 16908322: goto L_0x02bc;
                default: goto L_0x02a8;
            }
        L_0x02a8:
            r7 = -1
            goto L_0x02c3
        L_0x02aa:
            r7 = 11
            goto L_0x02c3
        L_0x02ad:
            r7 = 2
            goto L_0x02c3
        L_0x02af:
            r7 = 9
            goto L_0x02c3
        L_0x02b2:
            r7 = 8
            goto L_0x02c3
        L_0x02b5:
            r7 = 10
            goto L_0x02c3
        L_0x02b8:
            r7 = 7
            goto L_0x02c3
        L_0x02ba:
            r7 = 4
            goto L_0x02c3
        L_0x02bc:
            r7 = 1
            goto L_0x02c3
        L_0x02be:
            r7 = 0
            goto L_0x02c3
        L_0x02c0:
            r7 = 3
            goto L_0x02c3
        L_0x02c2:
            r7 = 5
        L_0x02c3:
            if (r7 == r13) goto L_0x0293
            int r10 = r6.length()
            if (r10 <= 0) goto L_0x02d1
            java.lang.String r10 = "|"
            r6.append(r10)
        L_0x02d1:
            r6.append(r7)
            goto L_0x0293
        L_0x02d5:
            java.lang.String r1 = r6.toString()
            java.lang.String r2 = "StringBuilder().apply {\n…   }\n        }.toString()"
            gy3.C87412m.m108593f(r1, r2)
            com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct
            r2.<init>()
            r4 = 1
            r2.f194249h = r4
            java.lang.String r6 = "MenuList"
            r7 = 1
            java.lang.String r1 = r2.mo86045b(r6, r1, r7)
            r2.f194250i = r1
            r2.f194245d = r4
            java.lang.String r1 = r3.mo100532b()
            java.lang.String r3 = "username"
            java.lang.String r1 = r2.mo86045b(r3, r1, r7)
            r2.f194248g = r1
            long r3 = (long) r8
            r2.f194246e = r3
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 16112(0x3ef0, float:2.2578E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = r2.mo1006q()
            java.lang.String r5 = "struct.toShowString()"
            gy3.C87412m.m108593f(r3, r5)
            java.lang.String r5 = "\r\n"
            java.lang.String r6 = " "
            java.lang.String r3 = z04.C112551y.m153814n(r3, r5, r6, r4)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "CEMenuReporter"
            java.lang.String r4 = "report%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            r2.mo86054n()
        L_0x032e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72833u.mo14785a(java.util.List, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* renamed from: b */
    public void mo14786b(View view, C110588j.C110589b bVar, String str) {
        long j;
        ? r1;
        int i;
        C110588j.C110589b bVar2;
        int i2;
        String str2;
        String str3;
        Class cls = C79353f1.class;
        long e = (long) C31543z5.m39455e();
        int i3 = bVar.f330853b;
        if (i3 == 2) {
            this.f212255b.f211888j.getText().insert(this.f212255b.f211888j.getSelectionStart(), this.f212254a.getString(C0966R.string.f361426jt2));
            View view2 = this.f212255b.f211888j.view();
            int i4 = C72996z1.m85820U5(this.f212255b.f211858d) ? 2 : 1;
            ChatFooter chatFooter = this.f212255b;
            C23800b.m28600a(view2, i4, chatFooter.f211858d, chatFooter.f211753E1, 2, "", chatFooter.f211757F1, 1, e);
            r1 = 0;
            j = 1;
        } else {
            String str4 = "1";
            if (i3 == 3) {
                this.f212255b.f211888j.clearFocus();
                ChatFooter chatFooter2 = this.f212255b;
                chatFooter2.f211937t1 = true;
                String obj = chatFooter2.f211888j.getText().toString();
                C0437d dVar = C0437d.f1061a;
                Context context = this.f212255b.getContext();
                ChatFooter chatFooter3 = this.f212255b;
                String str5 = chatFooter3.f211858d;
                String str6 = chatFooter3.f211757F1;
                int selectionStart = chatFooter3.f211888j.getSelectionStart();
                C87412m.m108594g(context, "context");
                C87412m.m108594g(str5, "talker");
                C87412m.m108594g(obj, SearchIntents.EXTRA_QUERY);
                C87412m.m108594g(str6, "sessionId");
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = new xe4();
                HashMap hashMap = new HashMap();
                long j2 = e;
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(72));
                hashMap.put("sessionId", str6);
                hashMap.put("subSessionId", str6);
                hashMap.put("isHomePage", str4);
                if (!TextUtils.isEmpty(obj)) {
                    String b = C117627q.m165909b(obj, "utf8");
                    C87412m.m108593f(b, "encode(query, \"utf8\")");
                    hashMap.put(SearchIntents.EXTRA_QUERY, b);
                    hashMap.put("cursorIndex", String.valueOf(selectionStart));
                }
                if (!Util.isOverseasUser(context)) {
                    str4 = "0";
                }
                hashMap.put("isOverseaApp", str4);
                dVar.mo477b(hashMap);
                f0Var.f27484d.f228419g = dVar.mo476a(hashMap);
                xe4 xe4 = f0Var.f27484d;
                xe4.f228424o = str5;
                xe4.f228417e = str6;
                xe4.f228418f = 72;
                xe4.f228421i = "";
                xe4.f228416d = "";
                xe4.f228425p = 2;
                C97448g gVar = new C97448g(context, f0Var.f27484d, new C67348c(chatFooter3, f0Var, 2, str5, str6));
                gVar.show();
                Window window = gVar.getWindow();
                if (window != null) {
                    window.setLayout(-1, -1);
                }
                WCTopicSearchVCActionReportStruct wCTopicSearchVCActionReportStruct = new WCTopicSearchVCActionReportStruct();
                wCTopicSearchVCActionReportStruct.f194690d = 1;
                wCTopicSearchVCActionReportStruct.f194691e = 0;
                wCTopicSearchVCActionReportStruct.f194692f = (long) 2;
                wCTopicSearchVCActionReportStruct.f194693g = (long) C31543z5.m39455e();
                wCTopicSearchVCActionReportStruct.f194694h = C72996z1.m85820U5(str5) ? 2 : 1;
                wCTopicSearchVCActionReportStruct.f194695i = wCTopicSearchVCActionReportStruct.mo86045b("EnterSceneId", str5, true);
                wCTopicSearchVCActionReportStruct.f194696j = wCTopicSearchVCActionReportStruct.mo86045b("SessionId", str6, true);
                wCTopicSearchVCActionReportStruct.f194697k = wCTopicSearchVCActionReportStruct.mo86045b("QueryKey", obj, true);
                wCTopicSearchVCActionReportStruct.mo86054n();
                C22613h1.m26490p(wCTopicSearchVCActionReportStruct);
                Log.m105924i("MicroMsg.WebSearch.TagSearchUILogic", "startTagSearchDialog url:" + f0Var.f27484d.f228419g);
                ChatFooter.f211728C4 = gVar;
                View view3 = this.f212255b.f211888j.view();
                int i5 = C72996z1.m85820U5(this.f212255b.f211858d) ? 2 : 1;
                ChatFooter chatFooter4 = this.f212255b;
                String str7 = chatFooter4.f211858d;
                String str8 = chatFooter4.f211753E1;
                String str9 = chatFooter4.f211757F1;
                r1 = 0;
                j = 1;
                C23800b.m28600a(view3, i5, str7, str8, 2, obj, str9, 2, j2);
                this.f212255b.f211757F1 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(73);
            } else {
                r1 = 0;
                j = 1;
                if (i3 == 4) {
                    C73537m5.C30825c cVar = this.f212255b.f211773J1;
                    if (cVar != null) {
                        ((C79353f1) ((FootComponent$$j) cVar).f215537a.f215752d.f193278b.mo102812a(cls)).mo102520X1(true);
                        C85801v1 i6 = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CHATFOOT_TRANS_IN_WRITE_EDT_EDU_HAS_SHOW_BOOLEAN_SYNC;
                        if (!i6.mo119686g(aVar, false) || C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_TransInWriteTipsShow_Int, 0) == 1) {
                            ChatFooter chatFooter5 = this.f212255b;
                            ChatFooter$$i1 chatFooter$$i1 = chatFooter5.f211826V1;
                            if (!(chatFooter$$i1 == null || chatFooter$$i1.mo100531a() == null)) {
                                chatFooter5.f211860d2 = true;
                                ((C79353f1) chatFooter5.f211826V1.mo100531a().f193278b.mo102812a(cls)).mo102521Z2(new C72842y(chatFooter5));
                                chatFooter5.f211888j.setHint(chatFooter5.f211826V1.mo100531a().mo91565f().getString(C0966R.string.b5w));
                            }
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                        }
                        String b2 = this.f212255b.f211826V1.mo100532b();
                        C87412m.m108594g(b2, "chatId");
                        TranslateMsgStruct translateMsgStruct = new TranslateMsgStruct();
                        if (C75824d.f222434a.length() == 0) {
                            str3 = UUID.randomUUID().toString();
                            C87412m.m108593f(str3, "randomUUID().toString()");
                            C75824d.f222434a = str3;
                        } else {
                            str3 = C75824d.f222434a;
                        }
                        translateMsgStruct.mo93199u(str3);
                        translateMsgStruct.f194636f = 2;
                        translateMsgStruct.mo93197s(str4);
                        translateMsgStruct.mo93198t(b2);
                        translateMsgStruct.mo86054n();
                    }
                    this.f212255b.f211888j.mo104240b();
                } else if (i3 == 5) {
                    C73537m5.C30825c cVar2 = this.f212255b.f211773J1;
                    if (cVar2 != null) {
                        ((C79353f1) ((FootComponent$$j) cVar2).f215537a.f215752d.f193278b.mo102812a(cls)).mo102520X1(false);
                        String b3 = this.f212255b.f211826V1.mo100532b();
                        C87412m.m108594g(b3, "chatId");
                        TranslateMsgStruct translateMsgStruct2 = new TranslateMsgStruct();
                        if (C75824d.f222434a.length() == 0) {
                            str2 = UUID.randomUUID().toString();
                            C87412m.m108593f(str2, "randomUUID().toString()");
                            C75824d.f222434a = str2;
                        } else {
                            str2 = C75824d.f222434a;
                        }
                        translateMsgStruct2.mo93199u(str2);
                        translateMsgStruct2.f194636f = 2;
                        translateMsgStruct2.mo93197s("2");
                        translateMsgStruct2.mo93198t(b3);
                        translateMsgStruct2.mo86054n();
                    }
                    this.f212255b.f211888j.mo104240b();
                } else if (i3 == 7) {
                    this.f212255b.f211745C1.mo100698k();
                    this.f212255b.f211888j.mo104240b();
                    C66622a.f191567a.mo90685a(5, this.f212255b.f211826V1.mo100531a());
                }
            }
        }
        ChatFooter chatFooter6 = this.f212255b;
        C74974a aVar2 = chatFooter6.f211888j;
        ChatFooter$$i1 chatFooter$$i12 = chatFooter6.f211826V1;
        C87412m.m108594g(aVar2, "edt");
        if (chatFooter$$i12 != null) {
            if (aVar2.length() > 0) {
                bVar2 = bVar;
                i = 1;
            } else {
                bVar2 = bVar;
                i = 0;
            }
            int i7 = bVar2.f330853b;
            switch (i7) {
                case 1:
                    i2 = 16;
                    break;
                case 2:
                    i2 = 128;
                    break;
                case 3:
                    i2 = 1024;
                    break;
                case 4:
                    i2 = 256;
                    break;
                case 5:
                    i2 = 512;
                    break;
                case 6:
                    i2 = 4;
                    break;
                case 7:
                    i2 = 2048;
                    break;
                default:
                    switch (i7) {
                        case 16908319:
                            i2 = 32;
                            break;
                        case 16908320:
                            i2 = 8;
                            break;
                        case 16908321:
                            i2 = 1;
                            break;
                        case 16908322:
                            i2 = 2;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
            }
            InputChangeLineStruct inputChangeLineStruct = new InputChangeLineStruct();
            inputChangeLineStruct.f194249h = 2;
            inputChangeLineStruct.f194247f = (long) i2;
            inputChangeLineStruct.f194245d = j;
            inputChangeLineStruct.f194248g = inputChangeLineStruct.mo86045b("username", chatFooter$$i12.mo100532b(), true);
            inputChangeLineStruct.f194246e = (long) i;
            Object[] objArr = new Object[2];
            objArr[r1] = 16112;
            String q = inputChangeLineStruct.mo1006q();
            C87412m.m108593f(q, "struct.toShowString()");
            objArr[1] = C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", r1);
            Log.m105925i("CEMenuReporter", "report%s %s", objArr);
            inputChangeLineStruct.mo86054n();
        }
    }
}
