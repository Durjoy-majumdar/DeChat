package kd0;

import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75568c3;
import f40.C86709a0;
import f62.C75700k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
import kj2.C117407d;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C35136m;
import ob0.C47350c;
import ob0.C77002r;
import ob0.y$$c;
import ob0.y$$d;
import p1081gi.C98124g;
import p206nj.C76861g;
import p663qo.C77384i;
import pe3.C89349b;
import te3.C51646v50;
import te3.C64744u50;
import te3.jt4;

/* renamed from: kd0.f */
public class C76539f extends C117747y implements C1311n {

    /* renamed from: s */
    public static C75568c3 f223992s;

    /* renamed from: t */
    public static List<C76538e> f223993t = new ArrayList();

    /* renamed from: d */
    public C11385n f223994d;

    /* renamed from: e */
    public C47350c f223995e;

    /* renamed from: f */
    public String f223996f;

    /* renamed from: g */
    public String f223997g;

    /* renamed from: h */
    public String f223998h;

    /* renamed from: i */
    public int f223999i = 0;

    /* renamed from: j */
    public boolean f224000j = false;

    /* renamed from: n */
    public boolean f224001n = false;

    /* renamed from: o */
    public long f224002o = 0;

    /* renamed from: p */
    public long f224003p = 0;

    /* renamed from: q */
    public MTimerHandler f224004q = new MTimerHandler(new f$$c(this), false);

    /* renamed from: r */
    public C55384i f224005r = new f$$a(this);

    public C76539f(C76551y yVar) {
        Assert.assertTrue(yVar != null);
        String c = yVar.mo106796c();
        this.f223996f = c;
        Assert.assertTrue(c != null);
        this.f223997g = yVar.mo106798e();
        this.f223998h = yVar.mo106797d();
        Log.m105925i("MicroMsg.NetSceneDownloadVoice", "NetSceneDownloadVoice[%s]:  file[%s] voiceFormat[%s] user[%s]", toString(), this.f223996f, this.f223997g, this.f223998h);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        jt4 jt4;
        this.f223994d = nVar;
        prepareDispatcher(gVar);
        String str = this.f223996f;
        if (str == null) {
            Log.m105920e("MicroMsg.NetSceneDownloadVoice", "doScene:  filename null!");
            this.f223999i = C76861g.m92658a() + 10000;
            return -1;
        }
        C76551y o = C76552z.m92077o(str);
        if (o != null) {
            int i = o.f224058i;
            if (i == 5 || i == 6) {
                Log.m105924i("MicroMsg.NetSceneDownloadVoice", "doScene file:" + this.f223996f + " netTimes:" + o.f224064o);
                if (!C76552z.m92066d(this.f223996f)) {
                    Log.m105920e("MicroMsg.NetSceneDownloadVoice", "checkVoiceNetTimes Failed file:" + this.f223996f);
                    C76552z.m92084v(this.f223996f);
                    this.f223999i = C76861g.m92658a() + 10000;
                    return -1;
                }
                int i2 = o.f224055f;
                int i3 = o.f224056g;
                int i4 = i2 - i3;
                if (i4 > 0) {
                    if (o.f224057h == i2) {
                        this.f224001n = true;
                    }
                    this.f224002o = Util.currentTicks();
                    boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("VoiceCdnDownloadSwitch", 0) == 1;
                    Log.m105925i("MicroMsg.NetSceneDownloadVoice", "canUseCdnDownload %s, forceDisableCdn %s", Boolean.valueOf(z), Boolean.valueOf(this.f224000j));
                    if (this.f224000j || !z || (jt4 = o.f224072w) == null || Util.isNullOrNil(jt4.f183841d) || Util.isNullOrNil(o.f224072w.f183842e)) {
                        C47350c.C47352b bVar = new C47350c.C47352b();
                        bVar.f127066a = new C64744u50();
                        bVar.f127067b = new C51646v50();
                        bVar.f127068c = "/cgi-bin/micromsg-bin/downloadvoice";
                        bVar.f127069d = 128;
                        bVar.f127070e = 20;
                        bVar.f127071f = 1000000020;
                        C47350c a = bVar.mo72403a();
                        this.f223995e = a;
                        C64744u50 u502 = (C64744u50) a.f127055a.f127080a;
                        u502.f185710g = o.f224053d;
                        u502.f185711h = o.f224054e;
                        u502.f185709f = i4;
                        u502.f185708e = o.f224056g;
                        if (C72996z1.m85820U5(this.f223998h)) {
                            u502.f185712i = this.f223998h;
                            u502.f185713j = o.f224069t;
                        }
                        Log.m105925i("MicroMsg.NetSceneDownloadVoice", "[%s]doScene req.ClientMsgId:%s req.MsgId:%d req.NewMsgId:%d, req.Length:%d req.Offset:%d req.ChatRoomName:%s req.MasterBufId %d", toString(), u502.f185710g, Integer.valueOf(u502.f185707d), Long.valueOf(u502.f185711h), Integer.valueOf(u502.f185709f), Integer.valueOf(u502.f185708e), u502.f185712i, Long.valueOf(u502.f185713j));
                        return dispatch(gVar, this.f223995e, this);
                    }
                    C117407d.INSTANCE.idkeyStat(111, 56, 1, false);
                    C98124g gVar2 = new C98124g();
                    gVar2.field_mediaId = "VoiceData" + this.f223996f;
                    gVar2.field_fullpath = C76552z.m92076n(this.f223996f, true) + "_cdn";
                    gVar2.field_fileType = 15;
                    jt4 jt42 = o.f224072w;
                    gVar2.field_aesKey = jt42.f183842e;
                    gVar2.field_fileId = jt42.f183841d;
                    if (C72996z1.m85820U5(o.f224052c)) {
                        gVar2.field_chattype = 1;
                    } else {
                        gVar2.field_chattype = 0;
                    }
                    Log.m105925i("MicroMsg.NetSceneDownloadVoice", "startCdnVoiceDownload %s %s %s %s", gVar2.field_mediaId, gVar2.field_fullpath, gVar2.field_aesKey, gVar2.field_fileId);
                    return ((C77384i) C86312j.m106911c(C77384i.class)).mo107504hs(gVar2, new WeakReference(this.f224005r)) == null ? -1 : 0;
                } else if (o.f224058i == 5) {
                    Log.m105920e("MicroMsg.NetSceneDownloadVoice", "doScene file:" + this.f223996f + " Net:" + o.f224055f + " Local:" + o.f224056g);
                    this.f223999i = C76861g.m92658a() + 10000;
                    return -1;
                } else {
                    C76552z.m92086x(this.f223996f, i3, (C35136m.C35137a) null);
                    this.f223999i = C76861g.m92658a() + 10000;
                    return -1;
                }
            }
        }
        Log.m105920e("MicroMsg.NetSceneDownloadVoice", "Get info Failed file:" + this.f223996f);
        this.f223999i = C76861g.m92658a() + 10000;
        return -1;
    }

    public int getType() {
        return 128;
    }

    /* renamed from: j1 */
    public final void mo106776j1() {
        String str = this.f223996f;
        C72963f4 f4Var = null;
        if (str == null) {
            HashMap<String, WeakReference<C77002r>> hashMap = C76552z.f224074a;
        } else {
            C76551y o = C76552z.m92077o(str);
            if (o != null) {
                f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(o.f224062m);
            }
        }
        if (f4Var != null) {
            C75568c3 c3Var = f223992s;
            if (c3Var != null) {
                c3Var.mo93204a(f4Var);
            }
            Iterator it = ((ArrayList) f223993t).iterator();
            while (it.hasNext()) {
                MMHandlerThread.postToMainThread(new f$$b(this, (C76538e) it.next(), f4Var));
            }
        }
    }

    /* renamed from: k1 */
    public final void mo106777k1(int i, String str) {
        boolean U5 = C72996z1.m85820U5(this.f223998h);
        if (this.f224000j) {
            C21321k.m23907a(this.f223996f, 3, i, this.f224003p, U5, str);
            return;
        }
        C21321k.m23907a(this.f223996f, 1, i, this.f224003p, U5, str);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105924i("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd[" + toString() + "] file:" + this.f223996f + " + id:" + i + " errtype:" + i4 + " errCode:" + i5);
        this.f224003p = this.f224003p + Util.ticksToNow(this.f224002o);
        C51646v50 v502 = (C51646v50) ((C47350c) uVar).f127056b.f127083a;
        if (v502.f143310n == 1) {
            Log.m105926v("MicroMsg.NetSceneDownloadVoice", this.f223996f + " cancelFlag = 1");
            C76552z.m92063a(this.f223996f);
            mo106777k1(240, (String) null);
        } else if (i5 == -22) {
            C76552z.m92084v(this.f223996f);
            this.f223994d.onSceneEnd(i4, i5, str2, this);
            mo106777k1(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, (String) null);
        } else if (i4 == 4 && i5 != 0) {
            C115669n.INSTANCE.idkeyStat(111, 231, 1, false);
            C76552z.m92084v(this.f223996f);
            this.f223994d.onSceneEnd(i4, i5, str2, this);
            mo106777k1(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, i5 + "");
        } else if (i4 == 0 && i5 == 0) {
            Log.m105918d("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.f223996f + " Recv:" + v502.f143308i.f140572d + " fileOff:" + v502.f143304e);
            C89349b bVar = v502.f143308i.f140574f;
            if (bVar == null) {
                Log.m105920e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd get recv Buffer null");
                C76552z.m92084v(this.f223996f);
                this.f223994d.onSceneEnd(i4, i5, str2, this);
                mo106777k1(221, (String) null);
                return;
            }
            byte[] f = bVar.mo123703f();
            if (f.length == 0) {
                Log.m105920e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Recv Buf ZERO length ");
                C76552z.m92084v(this.f223996f);
                this.f223994d.onSceneEnd(i4, i5, str2, this);
                mo106777k1(221, (String) null);
                return;
            }
            int a = C76552z.m92074l(this.f223997g, this.f223996f).mo106768a(f, f.length, v502.f143304e);
            if (a < 0) {
                Log.m105920e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Write Failed File:" + this.f223996f + " ret:" + a);
                C76552z.m92084v(this.f223996f);
                this.f223994d.onSceneEnd(i4, i5, str2, this);
                mo106777k1(220, (String) null);
                return;
            }
            Log.m105924i("MicroMsg.NetSceneDownloadVoice", "OnRecvEnd : file:" + this.f223996f + " filesize:" + a + " voiceFormat:" + this.f223997g);
            int x = C76552z.m92086x(this.f223996f, a, (C35136m.C35137a) null);
            StringBuilder sb = new StringBuilder();
            sb.append("OnRecvEnd[");
            sb.append(toString());
            sb.append("] : file:%s ret:%s");
            Log.m105925i("MicroMsg.NetSceneDownloadVoice", sb.toString(), this.f223996f, Integer.valueOf(x));
            if (x < 0) {
                mo106777k1(225, x + "");
                C115669n.INSTANCE.idkeyStat(111, 229, 1, false);
                Log.m105920e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.f223996f + "updateAfterRecv Ret:" + x);
                this.f223994d.onSceneEnd(i4, i5, str2, this);
            } else if (x == 1) {
                mo106777k1(100, (String) null);
                mo106776j1();
                this.f223994d.onSceneEnd(i4, i5, str2, this);
            } else {
                long j = 1000;
                if (this.f224001n) {
                    j = 0;
                }
                this.f224004q.startTimer(j);
            }
        } else {
            C115669n.INSTANCE.idkeyStat(111, 230, 1, false);
            Log.m105920e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd  errType:" + i4 + " errCode:" + i5 + " resp:" + uVar.getRespObj().getRetCode());
            this.f223994d.onSceneEnd(i4, i5, str2, this);
            mo106777k1(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, String.format("type:%d;code:%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    public int securityLimitCount() {
        return 100;
    }

    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            C115669n.INSTANCE.idkeyStat(111, 232, 1, false);
        }
        return securityLimitCountReach;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        String str;
        C64744u50 u502 = (C64744u50) ((C47350c) uVar).f127055a.f127080a;
        if (u502.f185711h != 0 && (str = u502.f185710g) != null && str.length() != 0 && u502.f185709f > 0 && u502.f185708e >= 0) {
            return y$$d.EOk;
        }
        C76552z.m92084v(this.f223996f);
        return y$$d.EFailed;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C115669n.INSTANCE.idkeyStat(111, 233, 1, false);
        C76552z.m92084v(this.f223996f);
    }
}
