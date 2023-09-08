package mj2;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1707k3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1711l3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import mj2.C61492a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import qe3.C101125b1;
import re3.C63392c;
import re3.C63395f;
import te3.C64787vx1;
import te3.C64817wx1;
import te3.C64880zf2;

/* renamed from: mj2.g */
public class C61497g extends C117747y implements C1311n {

    /* renamed from: h */
    public static boolean f174829h;

    /* renamed from: i */
    public static Object f174830i = new Object();

    /* renamed from: d */
    public C47350c f174831d;

    /* renamed from: e */
    public C11385n f174832e;

    /* renamed from: f */
    public C64787vx1 f174833f = null;

    /* renamed from: g */
    public C61492a f174834g = new C61492a((C61492a.C61493a) null);

    public C61497g(byte[] bArr) {
        synchronized (f174830i) {
            f174829h = true;
        }
        C64787vx1 mMGetStrategyReq = SmcProtoBufUtil.toMMGetStrategyReq();
        this.f174833f = mMGetStrategyReq;
        if (mMGetStrategyReq != null) {
            mMGetStrategyReq.f186008n = new C64880zf2();
            this.f174833f.f186008n.f186699d = this.f174834g.mo86468b(0);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f174832e = nVar;
        boolean m = C86709a0.m107523b().mo121115m();
        if (!m) {
            this.f174833f.f186004g = C89349b.m111674a(Util.getUuidRandom());
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127072g = false;
        bVar.f127066a = this.f174833f;
        bVar.f127067b = new C64817wx1();
        bVar.f127068c = m ? "/cgi-bin/micromsg-bin/getkvidkeystrategy" : "/cgi-bin/micromsg-bin/getkvidkeystrategyrsa";
        bVar.f127069d = getType();
        C47350c a = bVar.mo72403a();
        this.f174831d = a;
        if (!m) {
            a.setRsaInfo(new C101125b1("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125));
            this.f174831d.f127059e = 1;
        }
        int dispatch = dispatch(gVar, this.f174831d, this);
        if (dispatch < 0) {
            Log.m105925i("MicroMsg.NetSceneGetCliKVStrategy", "mark all failed. do scene %d", Integer.valueOf(dispatch));
            try {
                SmcLogic.OnStrategyResp(3, -1, (byte[]) null, 1);
                SmcLogic.OnStrategyResp(3, -1, (byte[]) null, 2);
                synchronized (f174830i) {
                    f174829h = false;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", Integer.valueOf(hashCode()), Util.stackTraceToString(e));
            }
        }
        return dispatch;
    }

    public int getType() {
        return C86709a0.m107523b().mo121115m() ? C1711l3.CTRL_INDEX : C1707k3.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (C86709a0.m107529k().f251779b == null || C86709a0.m107529k().f251779b.f256809d == null) {
            Log.m105922f("MicroMsg.NetSceneGetCliKVStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f174832e.onSceneEnd(i2, i3, str, this);
        } else if (i2 != 0) {
            Log.m105920e("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy err, errType:" + i2 + ", errCode:" + i3);
            SmcLogic.OnStrategyResp(i2, i3, (byte[]) null, 1);
            SmcLogic.OnStrategyResp(i2, i3, (byte[]) null, 2);
            this.f174832e.onSceneEnd(i2, i3, str, this);
            synchronized (f174830i) {
                f174829h = false;
            }
        } else {
            Log.m105918d("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy ok");
            C64817wx1 wx12 = (C64817wx1) this.f174831d.f127056b.f127083a;
            this.f174834g.mo86469c(wx12.f186232w, 0);
            try {
                C63395f smcKVStrategyResp = SmcProtoBufUtil.toSmcKVStrategyResp(wx12);
                C63392c smcIdkeyStrategyResp = SmcProtoBufUtil.toSmcIdkeyStrategyResp(wx12);
                SmcLogic.OnStrategyResp(0, 0, smcKVStrategyResp.toByteArray(), 1);
                SmcLogic.OnStrategyResp(0, 0, smcIdkeyStrategyResp.toByteArray(), 2);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", Integer.valueOf(hashCode()), Util.stackTraceToString(e));
            }
            this.f174832e.onSceneEnd(i2, i3, str, this);
            synchronized (f174830i) {
                f174829h = false;
            }
        }
    }
}
