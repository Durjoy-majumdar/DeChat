package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.autogen.events.AppBrandOuterMenuClickReportEvent;
import com.tencent.p014mm.autogen.events.WebviewReportPublisherIdEvent;
import com.tencent.p014mm.autogen.events.WebviewReportTmplTransferEvent;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.modelstat.ChattingOperationUitl;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.p136ui.chatting.viewitems.C97184i1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C96766k1;
import com.tencent.p014mm.sdk.p134kt.DataPair3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C97625j3;
import f62.C75707s0;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import k62.C33838c;
import k62.C33839d;
import kj2.C117407d;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C98201k;
import p203mi.C76758b0;
import p644pi.C77088c;
import p654pw.C100971c;
import p753xp.C102704b;
import p867wp.C102479b;
import pc0.C77068x;
import rx3.C13601g;
import sz1.C77815b;
import te3.C101819mz3;
import te3.C64596nz3;
import u72.C78135c;
import wz1.C78756d;
import wz1.C78757e;
import wz1.C78761f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.model.app.j1 */
public class C96763j1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f283471d;

    /* renamed from: e */
    public C11385n f283472e;

    /* renamed from: f */
    public C72963f4 f283473f = null;

    /* renamed from: g */
    public long f283474g;

    /* renamed from: h */
    public String f283475h;

    /* renamed from: i */
    public String f283476i;

    /* renamed from: j */
    public C72681a f283477j;

    /* renamed from: n */
    public long f283478n = 0;

    /* renamed from: o */
    public String f283479o = "";

    /* renamed from: p */
    public WebviewReportPublisherIdEvent f283480p;

    /* renamed from: q */
    public WebviewReportTmplTransferEvent f283481q;

    /* renamed from: r */
    public AppBrandOuterMenuClickReportEvent f283482r;

    /* renamed from: s */
    public long f283483s = 0;

    /* renamed from: t */
    public C98124g.C98125a f283484t = new C96764a();

    /* renamed from: com.tencent.mm.pluginsdk.model.app.j1$a */
    public class C96764a implements C98124g.C98125a {

        /* renamed from: com.tencent.mm.pluginsdk.model.app.j1$a$a */
        public class C96765a implements C96766k1.C96767a {
            public C96765a() {
            }

            /* renamed from: a */
            public void mo135032a(int i, int i2) {
                Log.m105919d("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra NetSceneSendAppMsgForCdn callback %d,%d", Integer.valueOf(i), Integer.valueOf(i2));
                C96763j1 j1Var = C96763j1.this;
                j1Var.f283472e.onSceneEnd(i, i2, "", j1Var);
            }
        }

        public C96764a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            WebviewReportTmplTransferEvent webviewReportTmplTransferEvent;
            String str2;
            int i2;
            String str3 = str;
            int i3 = i;
            C98121d dVar2 = dVar;
            Log.m105919d("MicroMsg.NetSceneSendAppMsg", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", C96763j1.this.f283479o, Integer.valueOf(i), cVar, dVar2);
            if (i3 == -21005) {
                Log.m105919d("MicroMsg.NetSceneSendAppMsg", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", C96763j1.this.f283479o);
                return 0;
            }
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(C96763j1.this.f283473f.getMsgId());
            if (i3 != 0) {
                b002.mo100991d(5);
                C117407d.INSTANCE.idkeyStat(111, 34, 1, true);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                C96763j1 j1Var = C96763j1.this;
                j1Var.f283472e.onSceneEnd(3, i3, "", j1Var);
                return 0;
            }
            if (dVar2 != null) {
                int i4 = dVar2.field_retCode;
                if (i4 != 0) {
                    Log.m105921e("MicroMsg.NetSceneSendAppMsg", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", Integer.valueOf(i4), dVar2.field_arg, dVar2.field_transInfo, "", "", "", "", "", "", "", dVar2.f287610b);
                    b002.mo100991d(5);
                    C117407d.INSTANCE.idkeyStat(111, 34, 1, true);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                    C96763j1 j1Var2 = C96763j1.this;
                    j1Var2.f283472e.onSceneEnd(3, dVar2.field_retCode, "", j1Var2);
                } else {
                    if (C96763j1.this.f283483s <= 0 || dVar2.field_fileLength <= 0 || b002.getType() == 738197553) {
                        str2 = "MicroMsg.NetSceneSendAppMsg";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("");
                        sb.append(C96763j1.this.f283483s);
                        sb.append(",");
                        str2 = "MicroMsg.NetSceneSendAppMsg";
                        sb.append(dVar2.field_fileLength);
                        sb.append(",");
                        sb.append(dVar2.field_fileId);
                        MMUncaughtExceptionHandler.assertTrue("SendAppMsgThumbTooBig", sb.toString(), C96763j1.this.f283483s * 2 > dVar2.field_fileLength);
                    }
                    String str4 = str2;
                    Log.m105925i(str4, "summersafecdn cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s]", Integer.valueOf(dVar2.field_UploadHitCacheType), Boolean.valueOf(z), Boolean.valueOf(dVar2.field_exist_whencheck), Util.secPrint(dVar2.field_aesKey), dVar2.field_filemd5);
                    if (b002.getType() == 738197553) {
                        C72695v.m85080v(b002.getMsgId(), "", dVar2, false);
                    }
                    C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
                    if (u != null && ((i2 = u.f195582i) == 33 || i2 == 36 || i2 == 44)) {
                        String h302 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(b002.mo108765s2());
                        C102479b Bg = ((C102704b) C86312j.m106911c(C102704b.class)).mo138748Bg(h302, u.f195582i, (String) null, (byte[]) null);
                        Log.m105925i(str4, "fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", h302, Integer.valueOf(Bg.f301760a), Boolean.valueOf(Bg.f301761b), Boolean.FALSE, Boolean.valueOf(Bg.f301762c), Long.valueOf(Bg.f301763d));
                    }
                    C96763j1 j1Var3 = C96763j1.this;
                    long j = j1Var3.f283474g;
                    C96765a aVar = new C96765a();
                    String str5 = j1Var3.f283475h;
                    C72681a aVar2 = j1Var3.f283477j;
                    C96766k1 k1Var = new C96766k1(j, false, dVar, aVar, str5, (C72683d) null);
                    k1Var.f283495o = aVar2;
                    C97625j3.m125815e().mo123460f(k1Var);
                }
            }
            if (!(str3 == null || !str3.equals(C96763j1.this.f283479o) || (webviewReportTmplTransferEvent = C96763j1.this.f283481q) == null || webviewReportTmplTransferEvent.f79068d.f79069a == -1)) {
                webviewReportTmplTransferEvent.publish();
                C96763j1.this.f283481q = null;
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    public C96763j1(long j, String str, String str2) {
        this.f283474g = j;
        this.f283475h = str;
        this.f283476i = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101819mz3();
        bVar.f127067b = new C64596nz3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendappmsg";
        bVar.f127069d = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
        bVar.f127070e = 107;
        bVar.f127071f = 1000000107;
        this.f283471d = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneSendAppMsg", "summersafecdn NetSceneSendAppMsg msgid[%d], sessionid[%s], signature[%s], stack[%s]", Long.valueOf(j), str, Util.secPrint(str2), Util.getStack());
        ((ConcurrentHashMap) C72709y1.zx0().f211551e).put(Integer.valueOf(hashCode()), new Object());
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r23, ob0.C11385n r24) {
        /*
            r22 = this;
            r0 = r22
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            r2 = r24
            r0.f283472e = r2
            long r2 = r0.f283478n
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0016
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f283478n = r2
        L_0x0016:
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            long r6 = r0.f283474g
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r6)
            r0.f283473f = r2
            long r2 = r2.getMsgId()
            long r6 = r0.f283474g
            r8 = -1
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0034
            return r8
        L_0x0034:
            com.tencent.mm.storage.f4 r2 = r0.f283473f
            java.lang.String r2 = r2.getContent()
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80421t(r2)
            java.lang.String r3 = "MicroMsg.NetSceneSendAppMsg"
            r6 = 8
            r7 = 6
            r9 = 0
            r10 = 2
            if (r2 != 0) goto L_0x0078
            com.tencent.mm.storage.f4 r2 = r0.f283473f
            java.lang.String r2 = r2.getContent()
            com.tencent.mm.storage.o2 r2 = com.tencent.p014mm.storage.C72989o2.m85758a(r2)
            java.lang.String r4 = r2.mo101197d()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x006f
            com.tencent.mm.message.l$b r4 = new com.tencent.mm.message.l$b
            r4.<init>()
            java.lang.String r2 = r2.mo101196c()
            r4.f195610p = r2
            r4.f195582i = r6
            java.lang.String r2 = "create new content. loss appid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r2 = r4
            goto L_0x00cd
        L_0x006f:
            java.lang.String r2 = r2.mo101197d()
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80421t(r2)
            goto L_0x00cd
        L_0x0078:
            int r11 = r2.f195582i
            if (r11 != r7) goto L_0x00cd
            com.tencent.mm.storage.f4 r11 = r0.f283473f
            long r11 = r11.mo108774y2()
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x008e
            com.tencent.mm.storage.f4 r11 = r0.f283473f
            int r11 = r11.getStatus()
            if (r11 == r10) goto L_0x00cd
        L_0x008e:
            java.lang.Class<t90.b> r11 = t90.C77878b.class
            com.tencent.mm.message.g r11 = r2.mo93555w(r11)
            t90.b r11 = (t90.C77878b) r11
            if (r11 == 0) goto L_0x00cd
            long r12 = r11.mo107975g()
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x00aa
            java.lang.String r4 = r11.mo107974f()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x00cd
        L_0x00aa:
            r11.mo107976h()
            com.tencent.mm.storage.f4 r4 = r0.f283473f
            java.lang.String r5 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r2, r9, r9)
            r4.mo108732L2(r5)
            k40.a r4 = f40.C86709a0.m107533q(r1)
            f62.k0 r4 = (f62.C75700k0) r4
            g62.l r4 = r4.mo96095LE()
            com.tencent.mm.storage.f4 r5 = r0.f283473f
            long r11 = r5.getMsgId()
            com.tencent.mm.storage.f4 r5 = r0.f283473f
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            r4.xy0(r11, r5)
        L_0x00cd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "content != null [["
            r4.append(r5)
            com.tencent.mm.storage.f4 r5 = r0.f283473f
            java.lang.String r5 = r5.getContent()
            r4.append(r5)
            java.lang.String r5 = "]]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            r11 = 1
            if (r2 == 0) goto L_0x00ef
            r12 = 1
            goto L_0x00f0
        L_0x00ef:
            r12 = 0
        L_0x00f0:
            junit.framework.Assert.assertTrue(r4, r12)
            if (r2 != 0) goto L_0x00f8
            r0.f283473f = r9
            return r8
        L_0x00f8:
            com.tencent.mm.storage.f4 r4 = r0.f283473f
            boolean r4 = r4.mo100983V3()
            java.lang.String r12 = ""
            if (r4 == 0) goto L_0x011b
            java.lang.Class<rz.u> r4 = p682rz.C101491u.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            rz.u r4 = (p682rz.C101491u) r4
            com.tencent.mm.storage.f4 r13 = r0.f283473f
            java.lang.String r13 = r13.mo108765s2()
            hd0.n0 r4 = r4.mo140806Zd(r13)
            if (r4 == 0) goto L_0x0140
            te3.tc4 r4 = r4.f288535C
            java.lang.String r4 = r4.f299542i
            goto L_0x0141
        L_0x011b:
            com.tencent.mm.storage.f4 r4 = r0.f283473f
            java.lang.String r4 = r4.mo108765s2()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0140
            java.lang.Class<gt.k> r4 = p158gt.C98201k.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            com.tencent.mm.storage.f4 r13 = r0.f283473f
            java.lang.String r13 = r13.mo108765s2()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            java.lang.String r4 = r4.mo127161CZ(r13)
            goto L_0x0141
        L_0x0140:
            r4 = r12
        L_0x0141:
            java.lang.Class<qo.l> r13 = p663qo.C101213l.class
            int r14 = r2.f195582i
            r16 = 5
            r9 = 33
            r15 = 3
            if (r14 == r6) goto L_0x031d
            r7 = 9
            if (r14 != r7) goto L_0x0152
            goto L_0x031d
        L_0x0152:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 == 0) goto L_0x016a
            java.lang.Object[] r6 = new java.lang.Object[r11]
            int r7 = r2.f195582i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r5] = r7
            java.lang.String r7 = "cdntra cdn not support no thumb msg type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
        L_0x0167:
            r6 = 1
            goto L_0x032b
        L_0x016a:
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            int r7 = (int) r6
            long r6 = (long) r7
            r0.f283483s = r6
            int r14 = r2.f195582i
            if (r14 == r9) goto L_0x018d
            r9 = 36
            if (r14 == r9) goto L_0x018d
            r9 = 46
            if (r14 == r9) goto L_0x018d
            r9 = 44
            if (r14 == r9) goto L_0x018d
            r9 = 48
            if (r14 == r9) goto L_0x018d
            r9 = 101(0x65, float:1.42E-43)
            if (r14 != r9) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r9 = 0
            goto L_0x018e
        L_0x018d:
            r9 = 1
        L_0x018e:
            if (r9 != 0) goto L_0x01a7
            r19 = 262144(0x40000, double:1.295163E-318)
            int r21 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x01a7
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r9[r5] = r4
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r9[r11] = r6
            java.lang.String r6 = "cdntra thumb[%s][%d] Too Big Not Use CDN TRANS"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r6, r9)
            goto L_0x0167
        L_0x01a7:
            java.lang.Object[] r6 = new java.lang.Object[r15]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r6[r5] = r7
            r6[r11] = r4
            r14 = r9
            long r8 = r0.f283483s
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6[r10] = r8
            java.lang.String r8 = "cdntra content.type:%d  thumbPath:%s,  thumbLength:%d "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r6)
            java.lang.String r6 = r2.f195606o
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x01d7
            java.lang.Object[] r6 = new java.lang.Object[r11]
            long r8 = r0.f283474g
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6[r5] = r8
            java.lang.String r8 = "cdntra attach has been upload by cdn msgid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r8, r6)
            goto L_0x0167
        L_0x01d7:
            if (r14 != 0) goto L_0x01ff
            di3.d r6 = di3.C86312j.m106911c(r13)
            qo.l r6 = (p663qo.C101213l) r6
            r7 = 4
            boolean r6 = r6.dm0(r7)
            if (r6 != 0) goto L_0x01ff
            java.lang.Object[] r6 = new java.lang.Object[r11]
            di3.d r8 = di3.C86312j.m106911c(r13)
            qo.l r8 = (p663qo.C101213l) r8
            boolean r8 = r8.dm0(r7)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r6[r5] = r8
            java.lang.String r8 = "cdntra not use cdn flag:%b "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r8, r6)
            goto L_0x0167
        L_0x01ff:
            com.tencent.mm.storage.f4 r6 = r0.f283473f
            long r8 = r6.getCreateTime()
            com.tencent.mm.storage.f4 r6 = r0.f283473f
            java.lang.String r6 = r6.mo108768t()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            com.tencent.mm.storage.f4 r7 = r0.f283473f
            long r10 = r7.getMsgId()
            r14.append(r10)
            java.lang.String r7 = r14.toString()
            java.lang.String r10 = "upappmsg"
            java.lang.String r6 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r10, r8, r6, r7)
            r0.f283479o = r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0245
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.mm.storage.f4 r6 = r0.f283473f
            long r8 = r6.getMsgId()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r7[r5] = r6
            java.lang.String r6 = "cdntra genClientId failed not use cdn msgid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r6, r7)
            goto L_0x0167
        L_0x0245:
            gi.g r6 = new gi.g
            r6.<init>()
            java.lang.String r7 = "task_AppMessage"
            r6.f287660d = r7
            r6.field_fullpath = r12
            r6.field_fileType = r15
            r7 = 2
            r6.field_priority = r7
            r6.field_needStorage = r5
            r6.field_isStreamMedia = r5
            r7 = 1
            r6.field_force_aeskeycdn = r7
            r6.field_trysafecdn = r5
            java.util.HashMap<java.lang.Class<? extends com.tencent.mm.message.g>, com.tencent.mm.message.g> r7 = r2.f195487F2
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0269:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0281
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.message.g r8 = (com.tencent.p014mm.message.C68066g) r8
            if (r8 == 0) goto L_0x0269
            r8.mo93543b(r6, r2)
            goto L_0x0269
        L_0x0281:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 != 0) goto L_0x0289
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r7 == 0) goto L_0x02a5
        L_0x0289:
            gi.g$a r7 = r6.f287662f
            if (r7 != 0) goto L_0x0315
            java.lang.String r7 = r6.field_mediaId
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0315
            java.lang.String r7 = r6.field_thumbpath
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0315
            java.lang.String r7 = r6.field_talker
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0315
        L_0x02a5:
            gi.g$a r7 = r0.f283484t
            r6.f287662f = r7
            java.lang.String r7 = r0.f283479o
            r6.field_mediaId = r7
            r6.field_thumbpath = r4
            com.tencent.mm.storage.f4 r7 = r0.f283473f
            java.lang.String r7 = r7.mo108768t()
            r6.field_talker = r7
            r7 = 8
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r7 = r2.f195582i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r5] = r7
            r7 = 1
            r8[r7] = r4
            java.lang.String r7 = r0.f283479o
            r9 = 2
            r8[r9] = r7
            int r7 = r6.field_fileType
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8[r15] = r7
            boolean r7 = r6.field_enable_hitcheck
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r9 = 4
            r8[r9] = r7
            boolean r9 = r6.field_onlycheckexist
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r16] = r9
            boolean r9 = r6.field_force_aeskeycdn
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10 = 6
            r8[r10] = r9
            boolean r9 = r6.field_trysafecdn
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10 = 7
            r8[r10] = r9
            java.lang.String r9 = "summersafecdn cdntra checkUseCdn content.type[%d], thumb[%s], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b], force_aeskeycdn[%b], trysafecdn[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r8)
            di3.d r8 = di3.C86312j.m106911c(r13)
            qo.l r8 = (p663qo.C101213l) r8
            boolean r6 = r8.if0(r6)
            if (r6 != 0) goto L_0x0311
            java.lang.String r6 = "cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)
            r0.f283479o = r12
            goto L_0x0167
        L_0x0311:
            r6 = 1
            r21 = 1
            goto L_0x032d
        L_0x0315:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not fill reserved fields!"
            r1.<init>(r2)
            throw r1
        L_0x031d:
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r8[r5] = r9
            java.lang.String r9 = "cdntra cdn not support Emoji or voiceremind now type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r8)
        L_0x032b:
            r21 = 0
        L_0x032d:
            if (r21 == 0) goto L_0x033b
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r2 = r0.f283479o
            r1[r5] = r2
            java.lang.String r2 = "cdntra use cdn return -1 for onGYNetEnd clientId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r1)
            return r5
        L_0x033b:
            java.lang.String r6 = r0.f283475h
            eb0.v0$c r6 = rn3.C90056j.m112657a(r6)
            if (r6 == 0) goto L_0x035b
            java.lang.String r8 = "_tmpl_webview_transfer_scene"
            boolean r9 = r6.mo120954a(r8)
            if (r9 == 0) goto L_0x035b
            com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent r9 = new com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent
            r9.<init>()
            r0.f283481q = r9
            com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent$a r9 = r9.f79068d
            r10 = -1
            int r8 = r6.mo120958e(r8, r10)
            r9.f79069a = r8
        L_0x035b:
            ob0.c r8 = r0.f283471d
            pe3.a r8 = r8.mo72394a()
            te3.mz3 r8 = (te3.C101819mz3) r8
            te3.u5 r9 = new te3.u5
            r9.<init>()
            java.lang.String r10 = r2.f195562d
            r9.f299573e = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            com.tencent.mm.storage.f4 r11 = r0.f283473f
            java.lang.String r11 = r11.mo108768t()
            r10.append(r11)
            com.tencent.mm.storage.f4 r11 = r0.f283473f
            long r13 = r11.getMsgId()
            r10.append(r13)
            java.lang.String r11 = "T"
            r10.append(r11)
            com.tencent.mm.storage.f4 r11 = r0.f283473f
            long r13 = r11.getCreateTime()
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r9.f299579n = r10
            int r10 = r2.f195582i
            r11 = 19
            if (r10 == r11) goto L_0x03aa
            r11 = 24
            if (r10 != r11) goto L_0x03a2
            goto L_0x03aa
        L_0x03a2:
            r10 = 0
            java.lang.String r11 = com.tencent.p014mm.message.C68070l.C68072b.m80419r(r2, r10, r10, r5, r5)
            r9.f299577i = r11
            goto L_0x03c0
        L_0x03aa:
            com.tencent.mm.storage.f4 r10 = r0.f283473f     // Catch:{ Exception -> 0x03b9 }
            java.lang.String r10 = r10.getContent()     // Catch:{ Exception -> 0x03b9 }
            java.lang.String r11 = "appmsg"
            java.lang.String r10 = com.tencent.p014mm.sdk.p134kt.CommonKt.extractSubXmlTag(r10, r11)     // Catch:{ Exception -> 0x03b9 }
            r9.f299577i = r10     // Catch:{ Exception -> 0x03b9 }
            goto L_0x03c0
        L_0x03b9:
            r10 = 0
            java.lang.String r11 = com.tencent.p014mm.message.C68070l.C68072b.m80419r(r2, r10, r10, r5, r5)
            r9.f299577i = r11
        L_0x03c0:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r11 = (int) r10
            r9.f299578j = r11
            com.tencent.mm.storage.f4 r10 = r0.f283473f
            java.lang.String r10 = r10.mo108768t()
            r9.f299575g = r10
            java.lang.String r10 = eb0.C75592q0.m90789s()
            r9.f299572d = r10
            int r10 = r2.f195582i
            r9.f299576h = r10
            int r10 = r2.f195566e
            r9.f299574f = r10
            int r10 = r2.f195618r
            r9.f299581p = r10
            cj.a r10 = p876cj.C67380a.C67381a.m79751a()
            com.tencent.mm.storage.f4 r11 = r0.f283473f
            fw0.w$c r10 = (fw0.C87107w.C75813c) r10
            java.lang.String r10 = r10.mo106106a(r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x03f6
            r9.f299583r = r10
            goto L_0x0402
        L_0x03f6:
            com.tencent.mm.storage.f4 r10 = r0.f283473f
            java.lang.String r10 = r10.mo108773x2()
            java.lang.String r10 = eb0.C75569c4.m90668a(r10)
            r9.f299583r = r10
        L_0x0402:
            java.lang.String r10 = r2.f195482E1
            r9.f299584s = r10
            java.lang.String r10 = r2.f195486F1
            r9.f299585t = r10
            java.lang.String r10 = r2.f195490G1
            r9.f299586u = r10
            com.tencent.mm.pluginsdk.model.app.a r10 = r0.f283477j
            if (r10 == 0) goto L_0x041a
            int r11 = r10.f211479a
            r9.f299587v = r11
            java.lang.String r10 = r10.f211480b
            r9.f299588w = r10
        L_0x041a:
            java.lang.String r10 = "preChatName"
            java.lang.String r11 = "preUsername"
            if (r6 == 0) goto L_0x0535
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = new com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent
            r13.<init>()
            r0.f283480p = r13
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r14 = r2.f195586j
            r13.f265264e = r14
            java.lang.String r14 = "prePublishId"
            java.lang.String r14 = r6.mo120959f(r14, r12)
            r13.f265260a = r14
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r14 = r6.mo120959f(r11, r12)
            r13.f265262c = r14
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r14 = r6.mo120959f(r10, r12)
            r13.f265263d = r14
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r14 = "preMsgIndex"
            int r14 = r6.mo120958e(r14, r5)
            r13.f265265f = r14
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r14 = "sendAppMsgScene"
            int r14 = r6.mo120958e(r14, r5)
            r13.f265269j = r14
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r14 = "getA8KeyScene"
            int r14 = r6.mo120958e(r14, r5)
            r13.f265270k = r14
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r14 = "referUrl"
            r7 = 0
            java.lang.String r14 = r6.mo120959f(r14, r7)
            r13.f265271l = r14
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r14 = "adExtStr"
            java.lang.String r7 = r6.mo120959f(r14, r7)
            r13.f265272m = r7
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r7 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r7 = r7.f265259d
            com.tencent.mm.storage.f4 r13 = r0.f283473f
            java.lang.String r13 = r13.mo108768t()
            r7.f265266g = r13
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r7 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r7 = r7.f265259d
            java.lang.String r13 = r2.f195570f
            r7.f265273n = r13
            java.lang.String r13 = r2.f195574g
            r7.f265274o = r13
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r7 = r7.mo105907v()
            com.tencent.mm.storage.f4 r13 = r0.f283473f
            java.lang.String r13 = r13.mo108768t()
            com.tencent.mm.storage.z1 r7 = r7.get(r13)
            if (r7 == 0) goto L_0x04c2
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r13 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r13 = r13.f265259d
            java.lang.String r7 = r7.mo62909j3()
            r13.f265267h = r7
        L_0x04c2:
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r7 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r7 = r7.f265259d
            java.lang.Class<wo.b> r13 = p740wo.C53193b.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            wo.b r13 = (p740wo.C53193b) r13
            com.tencent.mm.storage.f4 r14 = r0.f283473f
            java.lang.String r14 = r14.mo108768t()
            int r13 = r13.mo73729p1(r14)
            r7.f265268i = r13
            java.lang.String r7 = r2.f195535U1
            if (r7 == 0) goto L_0x04f4
            te3.bb4 r7 = new te3.bb4
            r7.<init>()
            java.lang.String r13 = r2.f195535U1
            byte[] r13 = android.util.Base64.decode(r13, r5)
            r7.parseFrom(r13)     // Catch:{ Exception -> 0x04f4 }
            te3.za4 r7 = r7.f226994f     // Catch:{ Exception -> 0x04f4 }
            if (r7 == 0) goto L_0x04f4
            java.lang.String r7 = r7.f186651d     // Catch:{ Exception -> 0x04f4 }
            r13 = r7
            goto L_0x04f5
        L_0x04f4:
            r13 = r12
        L_0x04f5:
            java.util.Locale r14 = java.util.Locale.US
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r15 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r15 = r15.f265259d
            r17 = r1
            java.lang.String r1 = r15.f265260a
            r7[r5] = r1
            java.lang.String r1 = r15.f265262c
            r18 = 1
            r7[r18] = r1
            java.lang.String r15 = r15.f265263d
            r18 = 2
            r7[r18] = r15
            int r1 = eb0.C45629t0.m50815b(r1, r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15 = 3
            r7[r15] = r1
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent r1 = r0.f283480p
            com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent$a r1 = r1.f265259d
            int r1 = r1.f265270k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15 = 4
            r7[r15] = r1
            r1 = r7
            r1[r16] = r13
            java.lang.String r13 = "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s"
            java.lang.String r1 = java.lang.String.format(r14, r13, r1)
            r8.f298891j = r1
            goto L_0x0537
        L_0x0535:
            r17 = r1
        L_0x0537:
            if (r6 == 0) goto L_0x05e3
            int r1 = r2.f195582i
            r13 = 33
            if (r1 != r13) goto L_0x05e3
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r1 = new com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent
            r1.<init>()
            r0.f283482r = r1
            java.lang.String r1 = "fromScene"
            r13 = 1
            int r1 = r6.mo120958e(r1, r13)
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r13 = r0.f283482r
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r13 = r13.f236137d
            r13.f236141d = r1
            java.lang.String r13 = "appservicetype"
            int r13 = r6.mo120958e(r13, r5)
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r14 = r0.f283482r
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r14 = r14.f236137d
            r14.f236149l = r13
            java.lang.String r10 = r6.mo120959f(r10, r12)
            r13 = 2
            if (r13 != r1) goto L_0x0585
            java.lang.String r1 = r6.mo120959f(r11, r12)
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r11 = r0.f283482r
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r11 = r11.f236137d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = ":"
            r12.append(r10)
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            r11.f236143f = r1
            goto L_0x058b
        L_0x0585:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r1 = r0.f283482r
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r1 = r1.f236137d
            r1.f236143f = r10
        L_0x058b:
            com.tencent.mm.storage.f4 r1 = r0.f283473f
            java.lang.String r1 = r1.mo108768t()
            java.lang.String r10 = "moreRetrAction"
            boolean r6 = r6.mo120957d(r10, r5)
            java.lang.String r10 = "@chatroom"
            boolean r1 = r1.endsWith(r10)
            if (r1 == 0) goto L_0x05ac
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r1 = r0.f283482r
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r1 = r1.f236137d
            if (r6 == 0) goto L_0x05a8
            r6 = 5
            goto L_0x05a9
        L_0x05a8:
            r6 = 2
        L_0x05a9:
            r1.f236145h = r6
            goto L_0x05b7
        L_0x05ac:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r1 = r0.f283482r
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r1 = r1.f236137d
            if (r6 == 0) goto L_0x05b4
            r6 = 4
            goto L_0x05b5
        L_0x05b4:
            r6 = 1
        L_0x05b5:
            r1.f236145h = r6
        L_0x05b7:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r1 = r0.f283482r
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r1 = r1.f236137d
            int r6 = r2.f195653z2
            r10 = 1
            int r6 = r6 + r10
            r1.f236142e = r6
            java.lang.String r6 = r2.f195569e2
            r1.f236144g = r6
            java.lang.String r6 = r2.f195573f2
            r1.f236138a = r6
            java.lang.String r6 = r2.f195577g2
            r1.f236139b = r6
            int r6 = r2.f195467A2
            r1.f236140c = r6
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r1.f236147j = r10
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r1 = r0.f283482r
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r1 = r1.f236137d
            r6 = 1
            r1.f236148k = r6
            java.lang.String r10 = r2.f195589j2
            r1.f236150m = r10
            goto L_0x05e4
        L_0x05e3:
            r6 = 1
        L_0x05e4:
            r1 = 3
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = r2.f195482E1
            r10[r5] = r1
            java.lang.String r1 = r2.f195486F1
            r10[r6] = r1
            java.lang.String r1 = r2.f195490G1
            r6 = 2
            r10[r6] = r1
            java.lang.String r1 = "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r1, r10)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r1 != 0) goto L_0x0615
            r1 = -1
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r4, r5, r1)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)
            if (r10 != 0) goto L_0x0616
            te3.qv3 r10 = new te3.qv3
            r10.<init>()
            r10.mo73350k(r6)
            r9.f299580o = r10
            goto L_0x0616
        L_0x0615:
            r1 = -1
        L_0x0616:
            r6 = 2
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r5] = r4
            te3.qv3 r4 = r9.f299580o
            if (r4 == 0) goto L_0x0623
            int r1 = r4.mo73347d()
        L_0x0623:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r10[r4] = r1
            java.lang.String r1 = "doScene thumbFile:[%s] thumbdata:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r1, r10)
            r8.f298885d = r9
            int r1 = r2.f195626t
            if (r1 != 0) goto L_0x063b
            int r1 = r2.f195594l
            r4 = 26214400(0x1900000, float:5.2897246E-38)
            if (r1 <= r4) goto L_0x063e
        L_0x063b:
            r1 = 7
            r8.f298889h = r1
        L_0x063e:
            java.lang.String r1 = r2.f195622s
            r8.f298888g = r1
            java.lang.String r1 = r0.f283476i
            r8.f298890i = r1
            r8.f298895q = r5
            java.lang.Class<f62.s0> r1 = f62.C75707s0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            f62.s0 r1 = (f62.C75707s0) r1
            com.tencent.mm.storage.f4 r4 = r0.f283473f
            java.lang.String r4 = r4.mo108768t()
            boolean r1 = r1.mo96078pq(r4)
            if (r1 == 0) goto L_0x0672
            k40.a r1 = f40.C86709a0.m107533q(r17)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.storage.f4 r4 = r0.f283473f
            java.lang.String r4 = r4.mo108768t()
            java.lang.String r1 = r1.mo69662L3(r4)
            r8.f298896r = r1
        L_0x0672:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r8.f298888g
            r1[r5] = r4
            java.lang.String r4 = r8.f298890i
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r4)
            r6 = 1
            r1[r6] = r4
            int r4 = r8.f298889h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r1[r7] = r4
            java.lang.String r4 = r8.f298891j
            r7 = 3
            r1[r7] = r4
            java.lang.String r4 = "summersafecdn file md5[%s], signature[%s], type[%d], fromScene[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            te3.u5 r4 = r8.f298885d
            java.lang.String r4 = r4.f299583r
            r1[r5] = r4
            java.lang.String r4 = "Req MsgSource %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r2 = r2.f195571f0
            r1[r5] = r2
            java.lang.String r2 = "content.recordinfo %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r1)
            ob0.c r1 = r0.f283471d
            r2 = r23
            int r1 = r0.dispatch(r2, r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C96763j1.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f283474g, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public int getType() {
        return WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4 = i2;
        int i5 = i3;
        String str3 = str;
        String str4 = "";
        Class cls = C77815b.class;
        int i6 = 2;
        Log.m105925i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra onGYNetEnd [%d,%d,%s] msgId:%d, oldContent[%s]", Integer.valueOf(i2), Integer.valueOf(i3), str3, Long.valueOf(this.f283474g), Util.secPrint(this.f283473f.getContent()));
        C47350c cVar = (C47350c) uVar;
        C64596nz3 nz32 = (C64596nz3) cVar.f127056b.f127083a;
        C101819mz3 mz32 = (C101819mz3) cVar.f127055a.f127080a;
        if (nz32 != null && (i4 == 4 || (i4 == 0 && i5 == 0))) {
            ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(nz32.f184598q);
        }
        if (i4 == 3 && i5 == -1 && !Util.isNullOrNil(this.f283479o)) {
            Log.m105929w("MicroMsg.NetSceneSendAppMsg", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", this.f283479o);
            return;
        }
        String str5 = "MicroMsg.NetSceneSendAppMsg";
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f283473f.getMsgId());
        if (i4 == 0 && i5 == 0) {
            b002.mo100991d(2);
            b002.mo108745Y2(nz32.f184595n);
            C75569c4.m90666L(b002, nz32.f184597p, false);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
            ((C100971c) C86312j.m106911c(C100971c.class)).Bh0(b002.getMsgId());
            ChattingOperationUitl.f48963f.mo21922e(b002, C40339m.m43520a(b002));
            WebviewReportPublisherIdEvent webviewReportPublisherIdEvent = this.f283480p;
            if (webviewReportPublisherIdEvent != null && !Util.isNullOrNil(webviewReportPublisherIdEvent.f265259d.f265264e)) {
                WebviewReportPublisherIdEvent.C92611a aVar = this.f283480p.f265259d;
                aVar.f265261b = "msg_" + Long.toString(nz32.f184595n);
                this.f283480p.publish();
            }
            WebviewReportTmplTransferEvent webviewReportTmplTransferEvent = this.f283481q;
            if (!(webviewReportTmplTransferEvent == null || webviewReportTmplTransferEvent.f79068d.f79069a == -1)) {
                webviewReportTmplTransferEvent.publish();
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
            if (u != null && "wx4310bbd51be7d979".equals(u.f195562d)) {
                boolean z = !Util.isNullOrNil(b002.mo108768t()) && C72996z1.m85820U5(b002.mo108768t());
                try {
                    str4 = URLEncoder.encode(u.f195574g, "UTF-8");
                    str2 = str5;
                } catch (UnsupportedEncodingException e) {
                    str2 = str5;
                    Log.printErrStackTrace(str2, e, str4, new Object[0]);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("1,");
                if (!z) {
                    i6 = 1;
                }
                sb.append(i6);
                sb.append(",,");
                sb.append(str4);
                String sb4 = sb.toString();
                Log.m105925i(str2, "androidSystemShareFixed(13717) %s", sb4);
                C115669n.INSTANCE.kvStat(13717, sb4);
            }
            if (u != null) {
                int i7 = u.f195582i;
                if (i7 == 6) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C97184i1(u, b002, 6));
                } else if (i7 == 53) {
                    C78757e wx02 = ((C77815b) C86312j.m106911c(cls)).wx0();
                    wx02.getClass();
                    if (b002.mo108774y2() > 0) {
                        ((C119157j) C119157j.f356862d).mo183876g(new C78756d(wx02, b002), "GroupSolitaireReport");
                    }
                    C78757e wx03 = ((C77815b) C86312j.m106911c(cls)).wx0();
                    wx03.getClass();
                    if (b002.mo108774y2() > 0) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C78761f(wx03, b002));
                    }
                } else if (i7 == 57) {
                    ((C78135c) C86312j.m106911c(C78135c.class)).mo108116kv(b002.getMsgId(), b002.mo108774y2());
                }
            }
            if (u != null && C72996z1.m85807K5(b002.mo108768t())) {
                C80995a aVar2 = (C80995a) u.mo93555w(C80995a.class);
                if (aVar2 != null && aVar2.f237892I) {
                    C76758b0.m92496a(b002, u);
                }
                ((C77088c) C86312j.m106911c(C77088c.class)).Ew0(b002);
            }
            AppBrandOuterMenuClickReportEvent appBrandOuterMenuClickReportEvent = this.f283482r;
            if (appBrandOuterMenuClickReportEvent != null) {
                AppBrandOuterMenuClickReportEvent.C80703a aVar3 = appBrandOuterMenuClickReportEvent.f236137d;
                aVar3.f236146i = "msg_" + b002.mo108774y2();
                this.f283482r.publish();
            }
            this.f283472e.onSceneEnd(i4, i5, str3, this);
            return;
        }
        b002.mo100991d(5);
        C117407d.INSTANCE.idkeyStat(111, 34, 1, true);
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
        Log.m105920e(str5, "send app msg failed, err=" + i4 + "," + i5 + ", msgId " + b002.getMsgId());
        C13601g<HashMap<Long, DataPair3<Integer, Integer, String>>> gVar = C33839d.f91468d;
        C61926c.m72661F("AndroidSendMsgFailReport", new C33838c(b002.getMsgId(), new DataPair3(Integer.valueOf(i2), Integer.valueOf(i3), str3)));
        this.f283472e.onSceneEnd(i4, i5, str3, this);
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
