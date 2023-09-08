package com.tencent.p014mm.modelsimple;

import android.text.TextUtils;
import android.util.Base64;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NotifyGroupToolsResetEvent;
import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75604z3;
import eb0.C97625j3;
import hd0.C98408n0;
import hd0.C98429r0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p203mi.C34572d0;
import p680ru.C77569h;
import p682rz.C101491u;
import p763ym.C53543s;
import p873bx.C67328d;
import te3.C51159ru3;
import u72.C78135c;
import xf3.C112148b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelsimple.d0 */
public class C68139d0 extends C117747y implements C1311n {

    /* renamed from: j */
    public static final MMHandler f195812j = new MMHandler("deleteRevokeMessageThread");

    /* renamed from: d */
    public C11385n f195813d;

    /* renamed from: e */
    public final long f195814e;

    /* renamed from: f */
    public final String f195815f;

    /* renamed from: g */
    public final C47350c f195816g;

    /* renamed from: h */
    public String f195817h;

    /* renamed from: i */
    public final long f195818i;

    /* renamed from: com.tencent.mm.modelsimple.d0$b */
    public class C29028b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f79555d;

        public C29028b(C72963f4 f4Var) {
            this.f79555d = f4Var;
        }

        public void run() {
            Log.m105925i("MicroMsg.NetSceneRevokeMsg", "delete invoke message! msg:%s", Long.valueOf(this.f79555d.getMsgId()));
            this.f79555d.setType(10002);
            C68139d0.m80543k1(C68139d0.this.f195815f, "", this.f79555d, "");
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f79555d.getMsgId(), this.f79555d);
        }
    }

    /* renamed from: com.tencent.mm.modelsimple.d0$a */
    public class C68140a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f195819d;

        public C68140a(String str) {
            this.f195819d = str;
        }

        public void run() {
            Class cls = C53543s.class;
            C68070l.C68072b u = C68070l.C68072b.m80422u(this.f195819d, (String) null);
            if (u != null && u.f195582i == 6) {
                Log.m105925i("MicroMsg.NetSceneRevokeMsg", "pause msg:%s send, result:%s", Long.valueOf(C68139d0.this.f195814e), Integer.valueOf(C72695v.m85078t(C68139d0.this.f195814e, u.f195570f)));
            }
            C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100150Yt(C68139d0.this.f195814e);
            if (Yt != null) {
                C86013q1.m106447h(Yt.field_fileFullPath);
                ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100152jo(Yt, new String[]{"msgInfoId"});
            }
        }
    }

    /* renamed from: com.tencent.mm.modelsimple.d0$c */
    public class C68141c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f195821d;

        /* renamed from: e */
        public final /* synthetic */ C98408n0 f195822e;

        public C68141c(C72963f4 f4Var, C98408n0 n0Var) {
            this.f195821d = f4Var;
            this.f195822e = n0Var;
        }

        public void run() {
            this.f195821d.mo108745Y2(this.f195822e.f288556c);
            this.f195821d.setType(43);
            C72963f4 f4Var = this.f195821d;
            C68139d0 d0Var = C68139d0.this;
            C97625j3.m125815e().mo123460f(new C68139d0(f4Var, d0Var.f195815f, d0Var.f195817h));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00f0, code lost:
        r12 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C68139d0(com.tencent.p014mm.storage.C72963f4 r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            r17.<init>()
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 290818(0x47002, float:4.07523E-40)
            java.lang.Object r3 = r3.mo119684e(r6, r5)
            if (r3 == 0) goto L_0x0028
            java.lang.String r3 = r3.toString()
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            long r5 = r18.getMsgId()
            r0.f195814e = r5
            r5 = r19
            r0.f195815f = r5
            long r5 = r18.getCreateTime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            int r6 = (int) r5
            long r7 = r18.mo108774y2()
            r0.f195818i = r7
            java.lang.String r5 = eb0.C75592q0.m90789s()
            java.lang.String r9 = r18.mo108768t()
            int r10 = r1.f230728K
            java.lang.String r11 = "MicroMsg.NetSceneRevokeMsg"
            r15 = 4
            r14 = 1
            if (r10 == r14) goto L_0x017a
            int r10 = r18.getType()
            java.lang.String r12 = "T"
            switch(r10) {
                case 1: goto L_0x0156;
                case 3: goto L_0x0113;
                case 34: goto L_0x00f3;
                case 42: goto L_0x0156;
                case 43: goto L_0x00df;
                case 47: goto L_0x00c2;
                case 48: goto L_0x0156;
                case 49: goto L_0x0081;
                case 62: goto L_0x00df;
                case 66: goto L_0x0156;
                case 1048625: goto L_0x0081;
                case 268435505: goto L_0x0081;
                case 419430449: goto L_0x005c;
                case 553648177: goto L_0x0081;
                case 587202609: goto L_0x0081;
                default: goto L_0x005a;
            }
        L_0x005a:
            goto L_0x017a
        L_0x005c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = r18.mo108768t()
            r10.append(r13)
            r16 = r5
            long r4 = r18.getMsgId()
            r10.append(r4)
            r10.append(r12)
            long r4 = r18.getCreateTime()
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r14 = r4
            goto L_0x00f0
        L_0x0081:
            r16 = r5
            com.tencent.mm.pluginsdk.model.app.e r4 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            long r13 = r18.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r4 = r4.mo100150Yt(r13)
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r4.field_clientAppDataId
            goto L_0x00b5
        L_0x0094:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = r18.mo108768t()
            r4.append(r10)
            long r13 = r18.getMsgId()
            r4.append(r13)
            r4.append(r12)
            long r12 = r18.getCreateTime()
            r4.append(r12)
            java.lang.String r4 = r4.toString()
        L_0x00b5:
            r14 = r4
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r10 = 0
            r5[r10] = r14
            java.lang.String r12 = "[oneliang][doSendRevokeMsg] type:app msg/emoji/img,clientMsgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r5)
            goto L_0x00f0
        L_0x00c2:
            r16 = r5
            r4 = 1
            r10 = 0
            java.lang.String r5 = r18.getContent()
            com.tencent.mm.storage.o2 r12 = new com.tencent.mm.storage.o2
            r12.<init>(r5)
            long r12 = r12.f212819b
            java.lang.String r14 = java.lang.String.valueOf(r12)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r10] = r14
            java.lang.String r12 = "[oneliang][doSendRevokeMsg] type:emoji,clientMsgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r5)
            goto L_0x00f0
        L_0x00df:
            r16 = r5
            r4 = 1
            r10 = 0
            java.lang.String r14 = r18.mo108765s2()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r10] = r14
            java.lang.String r12 = "[oneliang][doSendRevokeMsg] type:video,clientMsgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r5)
        L_0x00f0:
            r12 = r6
            goto L_0x017e
        L_0x00f3:
            r16 = r5
            r4 = 1
            r10 = 0
            kd0.g0 r5 = kd0.C76546u.yx0()
            java.lang.String r12 = r18.mo108765s2()
            kd0.y r5 = r5.mo106785jo(r12)
            if (r5 == 0) goto L_0x0111
            java.lang.String r14 = r5.f224053d
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r10] = r14
            java.lang.String r4 = "[oneliang][doSendRevokeMsg] type:voice,clientMsgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r12)
            goto L_0x00f0
        L_0x0111:
            r12 = r6
            goto L_0x017d
        L_0x0113:
            r16 = r5
            java.lang.Class<gt.k> r4 = p158gt.C98201k.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r10 = r18.mo108768t()
            long r13 = r18.getMsgId()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            com.tencent.mm.modelimage.k r4 = r4.mo127200vP(r10, r13)
            java.lang.String r14 = r1.f230731N
            java.lang.Object[] r10 = new java.lang.Object[r15]
            java.lang.String r13 = r18.mo108768t()
            r12 = 0
            r10[r12] = r13
            int r12 = r4.f267390q
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r5 = 1
            r10[r5] = r12
            r12 = r6
            long r5 = r4.f267374a
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r5 = 2
            r10[r5] = r4
            r4 = 3
            r10[r4] = r14
            java.lang.String r4 = "[oneliang][doSendRevokeMsg] type:img,talker:%s,hdId:%s,localId:%s,clientMsgId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r10)
            goto L_0x017e
        L_0x0156:
            r16 = r5
            r12 = r6
            java.lang.String r4 = eb0.C75592q0.m90789s()
            long r5 = r18.getCreateTime()
            java.lang.String r4 = eb0.C7628p0.m7761a(r4, r5)
            int r4 = r4.hashCode()
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r13 = 0
            r6[r13] = r10
            java.lang.String r10 = "[oneliang][doSendRevokeMsg] type:text,newClientMsgId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r6)
            r14 = 0
            goto L_0x017f
        L_0x017a:
            r16 = r5
            goto L_0x0111
        L_0x017d:
            r14 = 0
        L_0x017e:
            r4 = 0
        L_0x017f:
            ob0.c$b r6 = new ob0.c$b
            r6.<init>()
            te3.qu3 r10 = new te3.qu3
            r10.<init>()
            r6.f127066a = r10
            te3.ru3 r10 = new te3.ru3
            r10.<init>()
            r6.f127067b = r10
            java.lang.String r10 = "/cgi-bin/micromsg-bin/revokemsg"
            r6.f127068c = r10
            r10 = 594(0x252, float:8.32E-43)
            r6.f127069d = r10
            r10 = 0
            r6.f127070e = r10
            r6.f127071f = r10
            ob0.c r6 = r6.mo72403a()
            r0.f195816g = r6
            ob0.c$c r6 = r6.f127055a
            pe3.a r6 = r6.f127080a
            te3.qu3 r6 = (te3.C77988qu3) r6
            r6.f228133d = r14
            r6.f228134e = r4
            r6.f228136g = r10
            r6.f228140n = r7
            r4 = r12
            r6.f228135f = r4
            r4 = r16
            r6.f228137h = r4
            r6.f228138i = r9
            r6.f228139j = r3
            r6.f228141o = r2
            r0.f195817h = r2
            boolean r2 = m80542j1(r18)
            if (r2 == 0) goto L_0x01df
            int r2 = r1.f230723F
            r2 = r2 | r15
            r1.mo108743W2(r2)
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            long r3 = r18.getMsgId()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            r2.xy0(r3, r1)
        L_0x01df:
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r6.f228133d
            r3 = 0
            r1[r3] = r2
            int r2 = r6.f228134e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            int r2 = r6.f228136g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            int r2 = r6.f228135f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r1[r3] = r2
            java.lang.String r2 = r6.f228137h
            r1[r15] = r2
            r2 = 5
            java.lang.String r3 = r6.f228138i
            r1[r2] = r3
            r2 = 6
            int r3 = r6.f228139j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "[oneliang][NetSceneRevokeMsg]:clientMsgId:%s,newClientMsgId:%d,svrMsgId:%d,createTime:%d,fromUserName:%s,toUserName:%s,indexOfRequest:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelsimple.C68139d0.<init>(com.tencent.mm.storage.f4, java.lang.String, java.lang.String):void");
    }

    /* renamed from: j1 */
    public static boolean m80542j1(C72963f4 f4Var) {
        if (f4Var != null) {
            return f4Var.getType() == 1 || f4Var.getType() == 16777265 || f4Var.getType() == 822083633 || f4Var.getType() == 805306417 || f4Var.getType() == 1107296305;
        }
        return false;
    }

    /* renamed from: k1 */
    public static void m80543k1(String str, String str2, C72963f4 f4Var, String str3) {
        if (m80542j1(f4Var)) {
            if (f4Var.getType() == 822083633) {
                str3 = m80544l1(str3);
            }
            String l1 = m80544l1(f4Var.f230724G);
            int type = f4Var.getType();
            f4Var.setType(268445458);
            String format = String.format("<sysmsg type=\"invokeMessage\"><invokeMessage><text><![CDATA[%s]]></text><timestamp><![CDATA[%s]]></timestamp><link><text><![CDATA[%s]]></text></link><preContent><![CDATA[%s]]></preContent><type><![CDATA[%s]]></type><msgSource><![CDATA[%s]]></msgSource></invokeMessage></sysmsg>", new Object[]{str, Long.valueOf(C31543z5.m39451a()), str2, "", Integer.valueOf(type), l1});
            f4Var.mo108732L2(str3);
            f4Var.f230762x0 = format;
            f4Var.f230755r = true;
            return;
        }
        f4Var.setType(268445456);
        f4Var.mo108732L2(str);
        f4Var.f230762x0 = str;
        f4Var.f230755r = true;
    }

    /* renamed from: l1 */
    public static String m80544l1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(str.getBytes(), 0);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.NetSceneRevokeMsg", th, "safeBase64Encode err:%s", str);
            return "";
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f195813d = nVar;
        return dispatch(gVar, this.f195816g, this);
    }

    public int getType() {
        return 594;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C98408n0 Zd;
        Class cls = C77569h.class;
        int i4 = 0;
        if (((Integer) C79758p.f233760a.mo109880c(new C112148b())).intValue() == 1) {
            i3 = -1;
            C51159ru3 ru32 = (C51159ru3) this.f195816g.f127056b.f127083a;
            if (ru32 != null) {
                ru32.f141156e = null;
            }
            i2 = 4;
        }
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f195814e);
        C67328d dVar = C67328d.f193168a;
        if (i2 == 0 && i3 == 0) {
            dVar.mo91458a(b002, 1);
        } else {
            dVar.mo91458a(b002, 2);
        }
        if ((i2 == 0 && i3 == 0) || !Util.isNullOrNil(this.f195817h)) {
            long msgId = b002.getMsgId();
            long j = this.f195814e;
            if (msgId == j) {
                if (b002.getType() == 1090519089) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C68140a(b002.getContent()));
                } else {
                    C75604z3.m90833e(b002, false);
                }
                C72963f4 l3 = C72963f4.m85593l3(b002);
                C51159ru3 ru33 = (C51159ru3) this.f195816g.f127056b.f127083a;
                if (ru33 != null) {
                    Log.m105925i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSceneEnd.revokeMsg] msgId:%s,msgSvrId:%s,responseSysWording:%s， type:%s", Long.valueOf(b002.getMsgId()), Long.valueOf(b002.mo108774y2()), ru33.f141156e, Integer.valueOf(b002.getType()));
                    int type = b002.getType();
                    String str2 = this.f195815f;
                    m80543k1(str2, "  " + MMApplicationContext.getContext().getString(C0966R.string.ftg), b002, b002.getContent());
                    b002.mo108740T2(0);
                    b002.mo108743W2(4 | b002.f230723F);
                    RevokeNativeMsgEvent revokeNativeMsgEvent = new RevokeNativeMsgEvent();
                    revokeNativeMsgEvent.f78950d.f78951a = this.f195814e;
                    revokeNativeMsgEvent.publish();
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                    ((C78135c) C86312j.m106911c(C78135c.class)).mo108113Hb(b002.getMsgId(), b002.mo108774y2());
                    Object e = C97625j3.m125812b().mo105906u().mo119684e(290818, 0);
                    if (e != null) {
                        i4 = Util.getInt(e.toString(), 0);
                    }
                    C97625j3.m125812b().mo105906u().mo119676J(290818, Integer.valueOf(i4 + 1));
                    b002.setType(type);
                    if (b002.mo101020w3()) {
                        ((C77569h) C86312j.m106911c(cls)).mo35231KK(b002, C40339m.m43520a(b002));
                    } else {
                        ((C77569h) C86312j.m106911c(cls)).Oi0(b002);
                    }
                    f195812j.postDelayed(new C29028b(b002), 300000);
                    if (C34572d0.m40390a(l3)) {
                        NotifyGroupToolsResetEvent notifyGroupToolsResetEvent = new NotifyGroupToolsResetEvent();
                        notifyGroupToolsResetEvent.f78880d.f78881a = l3;
                        notifyGroupToolsResetEvent.publish();
                    }
                    if (C98429r0.m127830u() && b002.mo100994f4() && (Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(b002.mo108765s2())) != null && Zd.f288556c != this.f195818i) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C68141c(b002, Zd));
                    }
                } else {
                    return;
                }
            } else {
                Log.m105921e("MicroMsg.NetSceneRevokeMsg", "cannot find the msg:%d after revoke.", Long.valueOf(j));
            }
        } else if (m80542j1(b002)) {
            b002.mo108743W2(b002.f230723F & -5);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
        }
        this.f195813d.onSceneEnd(i2, i3, str, this);
    }
}
