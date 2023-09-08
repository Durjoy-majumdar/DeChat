package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.autogen.events.AppBrandOuterMenuClickReportEvent;
import com.tencent.p014mm.autogen.events.WebviewReportPublisherIdEvent;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelstat.ChattingOperationUitl;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.p136ui.chatting.viewitems.C97184i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C97625j3;
import f62.C75707s0;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p1081gi.C98121d;
import p203mi.C76758b0;
import p644pi.C77088c;
import p654pw.C100971c;
import pc0.C77068x;
import te3.C101819mz3;
import te3.C64596nz3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.model.app.k1 */
public class C96766k1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f283487d;

    /* renamed from: e */
    public C11385n f283488e;

    /* renamed from: f */
    public long f283489f;

    /* renamed from: g */
    public String f283490g;

    /* renamed from: h */
    public C98121d f283491h;

    /* renamed from: i */
    public C72683d f283492i;

    /* renamed from: j */
    public C72963f4 f283493j = null;

    /* renamed from: n */
    public boolean f283494n;

    /* renamed from: o */
    public C72681a f283495o;

    /* renamed from: p */
    public WebviewReportPublisherIdEvent f283496p;

    /* renamed from: q */
    public AppBrandOuterMenuClickReportEvent f283497q;

    /* renamed from: r */
    public C96767a f283498r;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.k1$a */
    public interface C96767a {
        /* renamed from: a */
        void mo135032a(int i, int i2);
    }

    public C96766k1(long j, boolean z, C98121d dVar, C96767a aVar, String str, C72683d dVar2) {
        this.f283489f = j;
        this.f283490g = str;
        this.f283491h = dVar;
        this.f283498r = aVar;
        this.f283494n = z;
        this.f283492i = dVar2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101819mz3();
        bVar.f127067b = new C64596nz3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendappmsg";
        bVar.f127069d = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
        bVar.f127070e = 107;
        bVar.f127071f = 1000000107;
        this.f283487d = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig NetSceneSendAppMsgForCdn msgId[%d], sceneResult[%s], sessionId[%s], attachInfo[%s]. stack[%s]", Long.valueOf(j), dVar, str, dVar2, Util.getStack());
        ((ConcurrentHashMap) C72709y1.zx0().f211551e).put(Integer.valueOf(hashCode()), new Object());
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x044a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r20, ob0.C11385n r21) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            r2 = r21
            r0.f283488e = r2
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            long r3 = r0.f283489f
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r3)
            r0.f283493j = r2
            long r2 = r2.getMsgId()
            long r4 = r0.f283489f
            r6 = 0
            r7 = 3
            r8 = 1
            r9 = -1
            java.lang.String r10 = "MicroMsg.NetSceneSendAppMsgForCdn"
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 == 0) goto L_0x003e
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r1[r6] = r2
            java.lang.String r2 = "summerbig cdntra doscene msginfo null id:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r1)
            com.tencent.mm.pluginsdk.model.app.k1$a r1 = r0.f283498r
            r1.mo135032a(r7, r9)
            return r9
        L_0x003e:
            com.tencent.mm.storage.f4 r2 = r0.f283493j
            java.lang.String r2 = r2.getContent()
            r3 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
            if (r2 != 0) goto L_0x0060
            java.lang.Object[] r4 = new java.lang.Object[r8]
            long r11 = r0.f283489f
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r4[r6] = r5
            java.lang.String r5 = "summerbig cdntra doscene AppMessage.Content.parse null id:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r5, r4)
            com.tencent.mm.pluginsdk.model.app.k1$a r4 = r0.f283498r
            r4.mo135032a(r7, r9)
        L_0x0060:
            r4 = 6
            if (r2 == 0) goto L_0x0086
            int r5 = r2.f195582i
            if (r5 != r4) goto L_0x0086
            com.tencent.mm.storage.f4 r5 = r0.f283493j
            int r5 = r5.getType()
            r11 = 10000(0x2710, float:1.4013E-41)
            if (r5 != r11) goto L_0x0086
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.tencent.mm.storage.f4 r2 = r0.f283493j
            long r2 = r2.getMsgId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r6] = r2
            java.lang.String r2 = "stop send revoke msg(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r1)
            return r9
        L_0x0086:
            r5 = 2
            if (r2 == 0) goto L_0x00dc
            int r9 = r2.f195582i
            if (r9 != r4) goto L_0x00dc
            com.tencent.mm.storage.f4 r9 = r0.f283493j
            long r11 = r9.mo108774y2()
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x00a1
            com.tencent.mm.storage.f4 r9 = r0.f283493j
            int r9 = r9.getStatus()
            if (r9 == r5) goto L_0x00dc
        L_0x00a1:
            java.lang.Class<t90.b> r9 = t90.C77878b.class
            com.tencent.mm.message.g r9 = r2.mo93555w(r9)
            t90.b r9 = (t90.C77878b) r9
            if (r9 == 0) goto L_0x00dc
            long r11 = r9.f226901b
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00b9
            java.lang.String r11 = r9.f226902c
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x00dc
        L_0x00b9:
            r9.mo107976h()
            com.tencent.mm.storage.f4 r9 = r0.f283493j
            java.lang.String r11 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r2, r3, r3)
            r9.mo108732L2(r11)
            k40.a r9 = f40.C86709a0.m107533q(r1)
            f62.k0 r9 = (f62.C75700k0) r9
            g62.l r9 = r9.mo96095LE()
            com.tencent.mm.storage.f4 r11 = r0.f283493j
            long r11 = r11.getMsgId()
            com.tencent.mm.storage.f4 r13 = r0.f283493j
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            r9.xy0(r11, r13)
        L_0x00dc:
            ob0.c r9 = r0.f283487d
            ob0.c$c r9 = r9.f127055a
            pe3.a r9 = r9.f127080a
            te3.mz3 r9 = (te3.C101819mz3) r9
            te3.u5 r11 = new te3.u5
            r11.<init>()
            java.lang.String r12 = r2.f195562d
            r11.f299573e = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.tencent.mm.storage.f4 r13 = r0.f283493j
            java.lang.String r13 = r13.mo108768t()
            r12.append(r13)
            com.tencent.mm.storage.f4 r13 = r0.f283493j
            long r13 = r13.getMsgId()
            r12.append(r13)
            java.lang.String r13 = "T"
            r12.append(r13)
            com.tencent.mm.storage.f4 r13 = r0.f283493j
            long r13 = r13.getCreateTime()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.f299579n = r12
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r13 = (int) r12
            r11.f299578j = r13
            com.tencent.mm.storage.f4 r12 = r0.f283493j
            java.lang.String r12 = r12.mo108768t()
            r11.f299575g = r12
            java.lang.String r12 = eb0.C75592q0.m90789s()
            r11.f299572d = r12
            int r12 = r2.f195582i
            r11.f299576h = r12
            int r12 = r2.f195566e
            r11.f299574f = r12
            int r12 = r2.f195618r
            r11.f299581p = r12
            cj.a r12 = p876cj.C67380a.C67381a.f193260a
            com.tencent.mm.storage.f4 r13 = r0.f283493j
            fw0.w$c r12 = (fw0.C87107w.C75813c) r12
            java.lang.String r12 = r12.mo106106a(r13)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x014c
            r11.f299583r = r12
            goto L_0x0156
        L_0x014c:
            com.tencent.mm.storage.f4 r12 = r0.f283493j
            java.lang.String r12 = r12.f230724G
            java.lang.String r12 = eb0.C75569c4.m90668a(r12)
            r11.f299583r = r12
        L_0x0156:
            java.lang.String r12 = r2.f195482E1
            r11.f299584s = r12
            java.lang.String r12 = r2.f195486F1
            r11.f299585t = r12
            java.lang.String r12 = r2.f195490G1
            r11.f299586u = r12
            com.tencent.mm.pluginsdk.model.app.a r12 = r0.f283495o
            if (r12 == 0) goto L_0x016e
            int r13 = r12.f211479a
            r11.f299587v = r13
            java.lang.String r12 = r12.f211480b
            r11.f299588w = r12
        L_0x016e:
            r9.f298895q = r6
            java.lang.String r12 = r0.f283490g
            eb0.v0$c r12 = rn3.C90056j.m112657a(r12)
            java.lang.String r13 = "preChatName"
            java.lang.String r14 = "preUsername"
            java.lang.String r15 = ""
            r16 = 5
            if (r12 == 0) goto L_0x028e
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r7 = new com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent
            r7.<init>()
            r0.f283496p = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r7 = r7.f265259d
            java.lang.String r5 = r2.f195586j
            r7.f265264e = r5
            java.lang.String r5 = "prePublishId"
            java.lang.String r5 = r12.mo120959f(r5, r15)
            r7.f265260a = r5
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.String r7 = r12.mo120959f(r14, r15)
            r5.f265262c = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.String r7 = r12.mo120959f(r13, r15)
            r5.f265263d = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.String r7 = "preMsgIndex"
            int r7 = r12.mo120958e(r7, r6)
            r5.f265265f = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.String r7 = "sendAppMsgScene"
            int r7 = r12.mo120958e(r7, r6)
            r5.f265269j = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.String r7 = "getA8KeyScene"
            int r7 = r12.mo120958e(r7, r6)
            r5.f265270k = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.String r7 = "referUrl"
            java.lang.String r7 = r12.mo120959f(r7, r3)
            r5.f265271l = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.String r7 = "adExtStr"
            java.lang.String r7 = r12.mo120959f(r7, r3)
            r5.f265272m = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            com.tencent.mm.storage.f4 r7 = r0.f283493j
            java.lang.String r7 = r7.mo108768t()
            r5.f265266g = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.String r7 = r2.f195570f
            r5.f265273n = r7
            java.lang.String r7 = r2.f195574g
            r5.f265274o = r7
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r5 = r5.mo105907v()
            com.tencent.mm.storage.f4 r7 = r0.f283493j
            java.lang.String r7 = r7.mo108768t()
            com.tencent.mm.storage.z1 r5 = r5.get(r7)
            if (r5 == 0) goto L_0x0221
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r7 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r7 = r7.f265259d
            java.lang.String r5 = r5.mo62909j3()
            r7.f265267h = r5
        L_0x0221:
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r5 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r5 = r5.f265259d
            java.lang.Class<wo.b> r7 = p740wo.C53193b.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            wo.b r7 = (p740wo.C53193b) r7
            com.tencent.mm.storage.f4 r3 = r0.f283493j
            java.lang.String r3 = r3.mo108768t()
            int r3 = r7.mo73729p1(r3)
            r5.f265268i = r3
            java.lang.String r3 = r2.f195535U1
            if (r3 == 0) goto L_0x0252
            te3.bb4 r3 = new te3.bb4
            r3.<init>()
            java.lang.String r5 = r2.f195535U1
            byte[] r5 = android.util.Base64.decode(r5, r6)
            r3.parseFrom(r5)     // Catch:{ Exception -> 0x0252 }
            te3.za4 r3 = r3.f226994f     // Catch:{ Exception -> 0x0252 }
            if (r3 == 0) goto L_0x0252
            java.lang.String r3 = r3.f186651d     // Catch:{ Exception -> 0x0252 }
            goto L_0x0253
        L_0x0252:
            r3 = r15
        L_0x0253:
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r4 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r4 = r4.f265259d
            java.lang.String r8 = r4.f265260a
            r7[r6] = r8
            java.lang.String r8 = r4.f265262c
            r18 = 1
            r7[r18] = r8
            java.lang.String r4 = r4.f265263d
            r17 = 2
            r7[r17] = r4
            int r4 = eb0.C45629t0.m50815b(r8, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 3
            r7[r8] = r4
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r4 = r0.f283496p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r4 = r4.f265259d
            int r4 = r4.f265270k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 4
            r7[r8] = r4
            r7[r16] = r3
            java.lang.String r3 = "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s"
            java.lang.String r3 = java.lang.String.format(r5, r3, r7)
            r9.f298891j = r3
        L_0x028e:
            if (r12 == 0) goto L_0x033a
            int r3 = r2.f195582i
            r4 = 33
            if (r3 != r4) goto L_0x033a
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r3 = new com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent
            r3.<init>()
            r0.f283497q = r3
            java.lang.String r3 = "fromScene"
            r4 = 1
            int r3 = r12.mo120958e(r3, r4)
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r4 = r0.f283497q
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r4 = r4.f236137d
            r4.f236141d = r3
            java.lang.String r4 = "appservicetype"
            int r4 = r12.mo120958e(r4, r6)
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r5 = r0.f283497q
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r5 = r5.f236137d
            r5.f236149l = r4
            java.lang.String r4 = r12.mo120959f(r13, r15)
            r5 = 2
            if (r5 != r3) goto L_0x02dc
            java.lang.String r3 = r12.mo120959f(r14, r15)
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r5 = r0.f283497q
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r5 = r5.f236137d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = ":"
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r5.f236143f = r3
            goto L_0x02e2
        L_0x02dc:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r3 = r0.f283497q
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r3 = r3.f236137d
            r3.f236143f = r4
        L_0x02e2:
            com.tencent.mm.storage.f4 r3 = r0.f283493j
            java.lang.String r3 = r3.mo108768t()
            java.lang.String r4 = "moreRetrAction"
            boolean r4 = r12.mo120957d(r4, r6)
            java.lang.String r5 = "@chatroom"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L_0x0303
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r3 = r0.f283497q
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r3 = r3.f236137d
            if (r4 == 0) goto L_0x02ff
            r4 = 5
            goto L_0x0300
        L_0x02ff:
            r4 = 2
        L_0x0300:
            r3.f236145h = r4
            goto L_0x030e
        L_0x0303:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r3 = r0.f283497q
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r3 = r3.f236137d
            if (r4 == 0) goto L_0x030b
            r4 = 4
            goto L_0x030c
        L_0x030b:
            r4 = 1
        L_0x030c:
            r3.f236145h = r4
        L_0x030e:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r3 = r0.f283497q
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r3 = r3.f236137d
            int r4 = r2.f195653z2
            r5 = 1
            int r4 = r4 + r5
            r3.f236142e = r4
            java.lang.String r4 = r2.f195569e2
            r3.f236144g = r4
            java.lang.String r4 = r2.f195573f2
            r3.f236138a = r4
            java.lang.String r4 = r2.f195577g2
            r3.f236139b = r4
            int r4 = r2.f195467A2
            r3.f236140c = r4
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r3.f236147j = r4
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r3 = r0.f283497q
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r3 = r3.f236137d
            r4 = 1
            r3.f236148k = r4
            java.lang.String r5 = r2.f195589j2
            r3.f236150m = r5
            goto L_0x033b
        L_0x033a:
            r4 = 1
        L_0x033b:
            r3 = 3
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r3 = r2.f195482E1
            r5[r6] = r3
            java.lang.String r3 = r2.f195486F1
            r5[r4] = r3
            java.lang.String r3 = r2.f195490G1
            r4 = 2
            r5[r4] = r3
            java.lang.String r3 = "stev summerbig SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r3, r5)
            com.tencent.mm.storage.f4 r3 = r0.f283493j
            java.lang.String r3 = r3.mo108765s2()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0380
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            com.tencent.mm.storage.f4 r4 = r0.f283493j
            java.lang.String r4 = r4.mo108765s2()
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r3 = r3.mo127161CZ(r4)
            android.graphics.BitmapFactory$Options r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r3)
            if (r3 == 0) goto L_0x0380
            int r4 = r3.outWidth
            int r3 = r3.outHeight
            goto L_0x0382
        L_0x0380:
            r3 = 0
            r4 = 0
        L_0x0382:
            gi.d r5 = r0.f283491h
            boolean r5 = r5.mo137409b()
            if (r5 == 0) goto L_0x03c1
            r5 = 4
            java.lang.Object[] r7 = new java.lang.Object[r5]
            gi.d r5 = r0.f283491h
            int r5 = r5.field_filecrc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7[r6] = r5
            gi.d r5 = r0.f283491h
            boolean r5 = r5.field_upload_by_safecdn
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8 = 1
            r7[r8] = r5
            gi.d r5 = r0.f283491h
            int r5 = r5.field_UploadHitCacheType
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2
            r7[r8] = r5
            gi.d r5 = r0.f283491h
            java.lang.String r5 = r5.field_aesKey
            r8 = 3
            r7[r8] = r5
            java.lang.String r5 = "summersafecdn app sceneResult crc[%d], safecdn[%b], hitcachetype[%d], aeskey[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r7)
            gi.d r5 = r0.f283491h
            r5.field_aesKey = r15
            r5 = 1
            r9.f298892n = r5
        L_0x03c1:
            gi.d r5 = r0.f283491h
            int r5 = r5.field_filecrc
            r9.f298893o = r5
            boolean r5 = r0.f283494n
            if (r5 == 0) goto L_0x03f4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "@cdn_"
            r5.append(r7)
            gi.d r7 = r0.f283491h
            java.lang.String r7 = r7.field_fileId
            r5.append(r7)
            java.lang.String r7 = "_"
            r5.append(r7)
            gi.d r8 = r0.f283491h
            java.lang.String r8 = r8.field_aesKey
            r5.append(r8)
            r5.append(r7)
            r7 = 1
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            goto L_0x03f5
        L_0x03f4:
            r5 = 0
        L_0x03f5:
            gi.d r7 = r0.f283491h
            java.lang.String r3 = com.tencent.p014mm.message.C68070l.C68072b.m80419r(r2, r5, r7, r4, r3)
            r11.f299577i = r3
            r9.f298885d = r11
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f283492i
            if (r3 == 0) goto L_0x0414
            int r4 = r2.f195626t
            if (r4 != 0) goto L_0x040d
            int r4 = r2.f195594l
            r5 = 26214400(0x1900000, float:5.2897246E-38)
            if (r4 <= r5) goto L_0x0414
        L_0x040d:
            java.lang.String r3 = r3.field_signature
            r9.f298890i = r3
            r3 = 7
            r9.f298889h = r3
        L_0x0414:
            java.lang.String r3 = r2.f195622s
            r9.f298888g = r3
            gi.d r3 = r0.f283491h
            java.lang.String r3 = r3.field_filemd5
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0430
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = r2.f195622s
            r4[r6] = r3
            java.lang.String r3 = "summerbig sceneResult filemd5 is null use content.filemd5[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r4)
            goto L_0x0436
        L_0x0430:
            gi.d r3 = r0.f283491h
            java.lang.String r3 = r3.field_filemd5
            r9.f298888g = r3
        L_0x0436:
            java.lang.Class<f62.s0> r3 = f62.C75707s0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            f62.s0 r3 = (f62.C75707s0) r3
            com.tencent.mm.storage.f4 r4 = r0.f283493j
            java.lang.String r4 = r4.mo108768t()
            boolean r3 = r3.mo96078pq(r4)
            if (r3 == 0) goto L_0x0460
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.storage.f4 r3 = r0.f283493j
            java.lang.String r3 = r3.mo108768t()
            java.lang.String r1 = r1.mo69662L3(r3)
            r9.f298896r = r1
        L_0x0460:
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r9.f298888g
            r1[r6] = r3
            int r3 = r9.f298892n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = r9.f298890i
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r3)
            r4 = 2
            r1[r4] = r3
            int r3 = r9.f298889h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r1[r4] = r3
            gi.d r3 = r0.f283491h
            r4 = 4
            r1[r4] = r3
            java.lang.String r3 = r9.f298891j
            r1[r16] = r3
            java.lang.String r3 = "summerbig file md5[%s], HitMd5[%d], signature[%s], type[%d], sceneResult[%s], fromScene[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r1)
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            te3.u5 r4 = r9.f298885d
            java.lang.String r4 = r4.f299583r
            r3[r6] = r4
            java.lang.String r4 = "Req MsgSource %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r4, r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f195571f0
            r1[r6] = r2
            java.lang.String r2 = "content.recordinfo %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r2, r1)
            ob0.c r1 = r0.f283487d
            r2 = r20
            int r1 = r0.dispatch(r2, r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C96766k1.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f283489f, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public int getType() {
        return WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C47350c cVar = (C47350c) uVar;
        Log.m105925i("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s], newContent[%s]", Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(this.f283489f), Util.secPrint(this.f283493j.getContent()), ((C101819mz3) cVar.f127055a.f127080a).f298885d.f299577i);
        C64596nz3 nz32 = (C64596nz3) cVar.f127056b.f127083a;
        if (nz32 != null && (i2 == 4 || (i2 == 0 && i3 == 0))) {
            ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(nz32.f184598q);
        }
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f283493j.getMsgId());
        if (i2 == 0 && i3 == 0) {
            Log.m105925i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn svrid[%d]. aeskey[%s], old content[%s]", Long.valueOf(nz32.f184595n), nz32.f184596o, Util.secPrint(b002.getContent()));
            C98121d dVar = this.f283491h;
            if (dVar != null && dVar.mo137409b()) {
                if (!Util.isNullOrNil(nz32.f184596o)) {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
                    u.f195524R = nz32.f184596o;
                    b002.mo108732L2(C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                    Log.m105925i("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn aeskey[%s], new content[%s]", nz32.f184596o, Util.secPrint(b002.getContent()));
                } else {
                    Log.m105928w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn need aeskey but ret null");
                }
            }
            b002.mo100991d(2);
            b002.mo108745Y2(nz32.f184595n);
            C75569c4.m90666L(b002, nz32.f184597p, false);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
            ((C100971c) C86312j.m106911c(C100971c.class)).Bh0(b002.getMsgId());
            ChattingOperationUitl.f48963f.mo21922e(b002, C40339m.m43520a(b002));
            this.f283488e.onSceneEnd(i2, i3, str, this);
            this.f283498r.mo135032a(i2, i3);
            WebviewReportPublisherIdEvent webviewReportPublisherIdEvent = this.f283496p;
            if (webviewReportPublisherIdEvent != null && !Util.isNullOrNil(webviewReportPublisherIdEvent.f265259d.f265264e)) {
                WebviewReportPublisherIdEvent.C92611a aVar = this.f283496p.f265259d;
                aVar.f265261b = "msg_" + Long.toString(nz32.f184595n);
                this.f283496p.publish();
            }
            AppBrandOuterMenuClickReportEvent appBrandOuterMenuClickReportEvent = this.f283497q;
            if (appBrandOuterMenuClickReportEvent != null) {
                AppBrandOuterMenuClickReportEvent.C80703a aVar2 = appBrandOuterMenuClickReportEvent.f236137d;
                aVar2.f236146i = "msg_" + b002.mo108774y2();
                this.f283497q.publish();
            }
            C68070l.C68072b u2 = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
            if (u2 != null) {
                if (C72996z1.m85807K5(b002.mo108768t())) {
                    C80995a aVar3 = (C80995a) u2.mo93555w(C80995a.class);
                    if (aVar3 != null && aVar3.f237892I) {
                        C76758b0.m92496a(b002, u2);
                    }
                    ((C77088c) C86312j.m106911c(C77088c.class)).Ew0(b002);
                }
                if (u2.f195582i == 6) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C97184i1(u2, b002, 6));
                }
            }
        } else if (i2 == 4 && i3 == 102) {
            Log.m105928w("MicroMsg.NetSceneSendAppMsgForCdn", "summersafecdn MM_ERR_GET_AESKEY_FAILED");
            this.f283488e.onSceneEnd(i2, i3, str, this);
            this.f283498r.mo135032a(i2, i3);
        } else {
            b002.mo100991d(5);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
            Log.m105920e("MicroMsg.NetSceneSendAppMsgForCdn", "summerbig send app msg failed, err=" + i2 + "," + i3);
            this.f283488e.onSceneEnd(i2, i3, str, this);
            this.f283498r.mo135032a(i2, i3);
        }
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
