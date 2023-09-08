package com.tencent.p014mm.modelsimple;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import fm0.C86943h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p728vs.C52991e;
import sf0.C48374j0;
import sl0.C90220f;
import te3.C48857bh2;
import te3.C48904bt1;
import te3.C49082d20;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C51832wh;
import te3.C51874wt1;
import te3.C52018xt1;
import yl0.C91485g;

/* renamed from: com.tencent.mm.modelsimple.s */
public class C40368s extends C117747y implements C1311n, C52991e {

    /* renamed from: d */
    public C11385n f108482d;

    /* renamed from: e */
    public final C47350c f108483e;

    /* renamed from: f */
    public final long f108484f;

    /* renamed from: g */
    public final long f108485g;

    /* renamed from: h */
    public final Bundle f108486h;

    /* renamed from: i */
    public Object f108487i;

    /* renamed from: com.tencent.mm.modelsimple.s$a */
    public static class C40369a {

        /* renamed from: com.tencent.mm.modelsimple.s$a$a */
        public enum C40370a {
            GetA8Key,
            MpGetA8Key,
            PayGetA8Key,
            MinorGetA8Key,
            ThridGetA8Key
        }

        /* renamed from: a */
        public static C47350c m43559a(C47350c cVar) {
            if (MMApplicationContext.isMainProcess() && C86709a0.m107522a()) {
                C51874wt1 wt12 = (C51874wt1) cVar.f127055a.f127080a;
                C86709a0.m107528h();
                String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(46, (Object) null));
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(Util.decodeHexString(nullAsNil));
                wt12.f144268e = qv32;
                C86709a0.m107528h();
                String nullAsNil2 = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(72, (Object) null));
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(Util.decodeHexString(nullAsNil2));
                wt12.f144278r = qv33;
                Log.m105918d("MicroMsg.NetSceneGetA8Key", "dkwt get a2=" + nullAsNil + " newa2=" + nullAsNil2);
            }
            return cVar;
        }

        /* renamed from: b */
        public static C47350c m43560b(String str, int i) {
            String str2;
            C40370a aVar = C40370a.ThridGetA8Key;
            C40370a aVar2 = C40370a.GetA8Key;
            if (i == 5) {
                aVar = C40370a.MinorGetA8Key;
            } else {
                if (Util.isNullOrNil(str)) {
                    Log.m105924i("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl reqUrl is null, getA8Key");
                } else {
                    try {
                        Uri parse = Uri.parse(str);
                        if (parse != null) {
                            String lowerCase = Util.nullAsNil(parse.getHost()).toLowerCase();
                            if (Util.isNullOrNil(parse.getFragment())) {
                                str2 = "";
                            } else {
                                str2 = "#" + parse.getFragment();
                            }
                            Log.m105919d("MicroMsg.NetSceneGetA8Key", "get TypeFromUrl domain:%s, fragment:%s", lowerCase, str2);
                            if (!lowerCase.equals(WeChatHosts.domainString(C0966R.string.fm5)) && !lowerCase.equals(WeChatHosts.domainString(C0966R.string.f360885fm3))) {
                                if (!lowerCase.equals("mp.weixinbridge.com")) {
                                    if (str2.contains("wechat_pay")) {
                                        aVar = C40370a.PayGetA8Key;
                                    } else if (!lowerCase.contains(".qq.com") && !lowerCase.equals("qq.com") && !lowerCase.contains(".wechat.com") && !lowerCase.equals("wechat.com") && !lowerCase.contains(".tenpay.com") && !lowerCase.equals("tenpay.com") && !lowerCase.contains(".url.cn") && !lowerCase.equals("url.com") && !lowerCase.contains(".wechatpay.cn") && !lowerCase.equals("wechatpay.cn")) {
                                        if (!str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                                        }
                                    }
                                }
                            }
                            aVar = C40370a.MpGetA8Key;
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl parse uri fail %s", e.getMessage());
                    }
                }
                aVar = aVar2;
            }
            Log.m105925i("MicroMsg.NetSceneGetA8Key", "getCommReqRespFromReqUrl reqUrl=%s, type=%s, reason=%d", str, aVar, Integer.valueOf(i));
            C47350c c = m43561c(aVar);
            m43559a(c);
            return c;
        }

        /* renamed from: c */
        public static C47350c m43561c(C40370a aVar) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C51874wt1();
            bVar.f127067b = new C52018xt1();
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                bVar.f127068c = "/cgi-bin/micromsg-bin/geta8key";
                bVar.f127069d = 233;
                bVar.f127070e = 155;
                bVar.f127071f = 1000000155;
            } else if (ordinal == 2) {
                bVar.f127068c = "/cgi-bin/micromsg-bin/mp-geta8key";
                bVar.f127069d = WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC;
                bVar.f127070e = 345;
                bVar.f127071f = 1000000345;
            } else if (ordinal == 3) {
                bVar.f127068c = "/cgi-bin/micromsg-bin/pay-geta8key";
                bVar.f127069d = 835;
                bVar.f127070e = C90220f.CTRL_INDEX;
                bVar.f127071f = 1000000346;
            } else if (ordinal == 4) {
                bVar.f127068c = "/cgi-bin/micromsg-bin/minor-geta8key";
                bVar.f127069d = C91485g.CTRL_INDEX;
                bVar.f127070e = 387;
                bVar.f127071f = 1000000387;
            } else if (ordinal != 5) {
                bVar.f127068c = "/cgi-bin/micromsg-bin/3rd-geta8key";
                bVar.f127069d = 226;
                bVar.f127070e = C86943h0.CTRL_INDEX;
                bVar.f127071f = 1000000388;
            } else {
                bVar.f127068c = "/cgi-bin/micromsg-bin/3rd-geta8key";
                bVar.f127069d = 226;
                bVar.f127070e = C86943h0.CTRL_INDEX;
                bVar.f127071f = 1000000388;
            }
            return bVar.mo72403a();
        }
    }

    public C40368s() {
        this.f108484f = SystemClock.elapsedRealtime();
        this.f108485g = System.currentTimeMillis();
        this.f108486h = new Bundle();
        C47350c c = C40369a.m43561c(C40369a.C40370a.GetA8Key);
        C40369a.m43559a(c);
        this.f108483e = c;
    }

    /* renamed from: J */
    public void mo63056J(int i) {
        ((C51874wt1) this.f108483e.f127055a.f127080a).f144256D = i;
    }

    /* renamed from: J0 */
    public long mo63057J0() {
        C49082d20 d202 = ((C52018xt1) this.f108483e.f127056b.f127083a).f144955u;
        if (d202 != null) {
            return d202.f132073d;
        }
        return -1;
    }

    /* renamed from: K */
    public int mo63058K() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144943f;
    }

    /* renamed from: L0 */
    public byte[] mo63059L0() {
        C51018qv3 qv32 = ((C52018xt1) this.f108483e.f127056b.f127083a).f144938C;
        if (qv32 != null) {
            return C48374j0.m53715d(qv32);
        }
        return null;
    }

    /* renamed from: Q */
    public C48904bt1 mo63060Q() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144947j;
    }

    /* renamed from: Q0 */
    public int mo63061Q0() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).computeSize();
    }

    /* renamed from: R */
    public String mo63062R() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144941d;
    }

    /* renamed from: U */
    public byte[] mo63063U() {
        C51018qv3 qv32 = ((C52018xt1) this.f108483e.f127056b.f127083a).f144936A;
        if (qv32 == null) {
            return new byte[0];
        }
        try {
            return C48374j0.m53715d(qv32);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    /* renamed from: U0 */
    public String mo63064U0() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144949o;
    }

    /* renamed from: Y */
    public String mo63065Y() {
        C51163rv3 rv32 = ((C51874wt1) this.f108483e.f127055a.f127080a).f144272i;
        if (rv32 != null) {
            return rv32.f141175d;
        }
        return null;
    }

    /* renamed from: Z */
    public String mo63066Z() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144937B;
    }

    /* renamed from: b0 */
    public void mo63067b0(String str) {
        ((C51874wt1) this.f108483e.f127055a.f127080a).f144261I = str;
    }

    /* renamed from: c0 */
    public byte[] mo63068c0() {
        C51018qv3 qv32 = ((C52018xt1) this.f108483e.f127056b.f127083a).f144956v;
        if (qv32 == null) {
            return null;
        }
        try {
            return C48374j0.m53715d(qv32);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d0 */
    public int mo63069d0() {
        return ((C51874wt1) this.f108483e.f127055a.f127080a).f144283w;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108482d = nVar;
        Log.m105919d("MicroMsg.NetSceneGetA8Key", "doScene, url:[%s], requestId:[%d]", mo63065Y(), Integer.valueOf(getCurrentSessionId()));
        return dispatch(gVar, this.f108483e, this);
    }

    /* renamed from: e1 */
    public Bundle mo63070e1() {
        return this.f108486h;
    }

    public C47350c getCommReqResp() {
        return this.f108483e;
    }

    public String getContent() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144945h;
    }

    public int getCurrentSessionId() {
        return ((C51874wt1) this.f108483e.f127055a.f127080a).f144285y;
    }

    public String getHeadImg() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144960z;
    }

    public List<C48857bh2> getHttpHeader() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144958x;
    }

    public Object getTag() {
        return this.f108487i;
    }

    public String getTitle() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144944g;
    }

    public int getType() {
        return 233;
    }

    public String getUsername() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144948n;
    }

    public String getWording() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).f144959y;
    }

    /* renamed from: m */
    public int mo63080m() {
        return ((C52018xt1) this.f108483e.f127056b.f127083a).BaseResponse.f135955d;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetA8Key", "dkwt geta8key onGYNetEnd:[%d,%d] url:[%s]  a8key:[%s], requestId:[%d]", Integer.valueOf(i2), Integer.valueOf(i3), mo63062R(), ((C52018xt1) this.f108483e.f127056b.f127083a).f144942e, Integer.valueOf(getCurrentSessionId()));
        Log.m105919d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie:%s", Util.encodeHexString(mo63063U()));
        this.f108486h.putLong("CgiSpeedOutSideStructStartTimeStamp", this.f108485g);
        this.f108486h.putLong("CgiSpeedOutSideStructEndTimeStamp", System.currentTimeMillis());
        this.f108486h.putLong("CgiSpeedOutSideStructCostTime", SystemClock.elapsedRealtime() - this.f108484f);
        this.f108486h.putInt("CgiSpeedOutSideStructCgiNo", 233);
        this.f108486h.putInt("CgiSpeedOutSideStructRet", i3);
        this.f108482d.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: q */
    public void mo63081q(String str) {
        ((C51874wt1) this.f108483e.f127055a.f127080a).f144255C = str;
    }

    public void setTag(Object obj) {
        this.f108487i = obj;
    }

    /* renamed from: v */
    public ArrayList<byte[]> mo63083v() {
        LinkedList<C51832wh> linkedList;
        C52018xt1 xt12 = (C52018xt1) this.f108483e.f127056b.f127083a;
        ArrayList<byte[]> arrayList = new ArrayList<>();
        if (!(xt12 == null || (linkedList = xt12.f144951q) == null)) {
            Iterator<C51832wh> it = linkedList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(it.next().toByteArray());
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.NetSceneGetA8Key", "exception:%s", Util.stackTraceToString(e));
                }
            }
            Log.m105919d("MicroMsg.NetSceneGetA8Key", "ScopeList size = %s", Integer.valueOf(arrayList.size()));
        }
        return arrayList;
    }

    /* renamed from: z0 */
    public int mo63084z0() {
        return ((C51874wt1) this.f108483e.f127055a.f127080a).f144279s;
    }

    public C40368s(String str, int i) {
        this.f108484f = SystemClock.elapsedRealtime();
        this.f108485g = System.currentTimeMillis();
        this.f108486h = new Bundle();
        this.f108483e = C40369a.m43560b(str, i);
    }

    public C40368s(String str, String str2, String str3, int i) {
        C40369a.C40370a aVar = C40369a.C40370a.MpGetA8Key;
        this.f108484f = SystemClock.elapsedRealtime();
        this.f108485g = System.currentTimeMillis();
        this.f108486h = new Bundle();
        C47350c c = C40369a.m43561c(aVar);
        this.f108483e = c;
        C51874wt1 wt12 = (C51874wt1) c.f127055a.f127080a;
        wt12.f144267d = 1;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        wt12.f144269f = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = str2;
        rv33.f141176e = true;
        wt12.f144270g = rv33;
        C51163rv3 rv34 = new C51163rv3();
        rv34.f141175d = str3;
        rv34.f141176e = true;
        wt12.f144271h = rv34;
        wt12.f144285y = i;
        Log.m105919d("MicroMsg.NetSceneGetA8Key", "get a8key appid=%s requestId=%d", str, Integer.valueOf(i));
    }

    public C40368s(String str, String str2, int i, int i2, int i3, byte[] bArr) {
        this(str, i2);
        C51874wt1 wt12 = (C51874wt1) this.f108483e.f127055a.f127080a;
        wt12.f144267d = 2;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        wt12.f144272i = rv32;
        wt12.f144275o = i;
        wt12.f144276p = str2;
        wt12.f144279s = i2;
        wt12.f144285y = i3;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        wt12.f144254B = qv32;
        Log.m105918d("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = " + str + ", username = " + str2 + ", scene = " + i + ", reason = " + i2 + ", requestId = " + i3);
        Log.m105919d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie = %s", Util.encodeHexString(bArr));
    }
}
