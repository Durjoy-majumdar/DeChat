package mj2;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import mj2.C61492a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import qe3.C101125b1;
import re3.C63396g;
import re3.C63398i;
import te3.C64349ew;
import te3.C64377fw;
import te3.C64880zf2;

/* renamed from: mj2.e */
public class C61494e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f174821d;

    /* renamed from: e */
    public boolean f174822e = false;

    /* renamed from: f */
    public C11385n f174823f;

    /* renamed from: g */
    public C64349ew f174824g = null;

    /* renamed from: h */
    public int f174825h = 0;

    /* renamed from: i */
    public C61492a f174826i = new C61492a((C61492a.C61493a) null);

    /* renamed from: mj2.e$a */
    public class C61495a implements Runnable {
        public C61495a() {
        }

        public void run() {
            SmcLogic.OnReportResp(3, -1, (byte[]) null, C61494e.this.f174825h);
        }
    }

    /* renamed from: mj2.e$b */
    public class C61496b implements Runnable {
        public C61496b() {
        }

        public void run() {
            SmcLogic.OnReportResp(3, -1, (byte[]) null, C61494e.this.f174825h);
        }
    }

    public C61494e(byte[] bArr, int i) {
        if (bArr != null) {
            this.f174825h = i;
            this.f174822e = C86709a0.m107523b().mo121115m();
            if (i == 1) {
                try {
                    C63398i iVar = new C63398i();
                    iVar.parseFrom(bArr);
                    this.f174824g = SmcProtoBufUtil.toMMReportKvReq(iVar);
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.NetSceneCliReportKV", "parse data error");
                    C86709a0.m107528h();
                    C86709a0.m107525e().postToWorker(new C61495a());
                }
            } else if (i == 2) {
                try {
                    C63396g gVar = new C63396g();
                    gVar.parseFrom(bArr);
                    this.f174824g = SmcProtoBufUtil.toMMReportIdkeyReq(gVar);
                } catch (Exception unused2) {
                    Log.m105920e("MicroMsg.NetSceneCliReportKV", "parse data error");
                    C86709a0.m107528h();
                    C86709a0.m107525e().postToWorker(new C61496b());
                }
            }
            C64349ew ewVar = this.f174824g;
            if (ewVar != null) {
                ewVar.f183038i = new C64880zf2();
                this.f174824g.f183038i.f186699d = this.f174826i.mo86468b(this.f174825h);
                return;
            }
            Log.m105925i("MicroMsg.NetSceneCliReportKV", "NetSceneCliReportKV parse req is null, stack[%s]", Util.getStack());
            return;
        }
        throw new NullPointerException("data must not be null");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f174823f = nVar;
        C64349ew ewVar = this.f174824g;
        if (ewVar == null) {
            Log.m105920e("MicroMsg.NetSceneCliReportKV", "do scene but req is null!");
            return -2;
        }
        if (!this.f174822e) {
            ewVar.f183037h = C89349b.m111674a(Util.getUuidRandom());
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127072g = false;
        bVar.f127066a = this.f174824g;
        bVar.f127067b = new C64377fw();
        int i = this.f174825h;
        String str = 1 == i ? "/cgi-bin/micromsg-bin/newreportkvcomm" : "/cgi-bin/micromsg-bin/newreportidkey";
        String str2 = 1 == i ? "/cgi-bin/micromsg-bin/newreportkvcommrsa" : "/cgi-bin/micromsg-bin/newreportidkeyrsa";
        if (!this.f174822e) {
            str = str2;
        }
        bVar.f127068c = str;
        bVar.f127069d = getType();
        C47350c a = bVar.mo72403a();
        this.f174821d = a;
        if (!this.f174822e) {
            a.setRsaInfo(new C101125b1("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125));
            this.f174821d.f127059e = 1;
        }
        int dispatch = dispatch(gVar, this.f174821d, this);
        if (dispatch < 0) {
            Log.m105925i("MicroMsg.NetSceneCliReportKV", "mark all failed. do scene %d", Integer.valueOf(dispatch));
            try {
                SmcLogic.OnReportResp(3, -1, (byte[]) null, this.f174825h);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", Integer.valueOf(hashCode()), Util.stackTraceToString(e));
            }
        }
        return dispatch;
    }

    public int getType() {
        return !this.f174822e ? 1 == this.f174825h ? 997 : 987 : 1 == this.f174825h ? 996 : 986;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (C86709a0.m107529k().f251779b == null || C86709a0.m107529k().f251779b.f256809d == null) {
            Log.m105922f("MicroMsg.NetSceneCliReportKV", "null == MMCore.getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f174823f.onSceneEnd(i2, i3, str, this);
        } else if (i2 != 0) {
            Log.m105920e("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy err, errType:" + i2 + ", errCode:" + i3);
            SmcLogic.OnReportResp(i2, i3, (byte[]) null, this.f174825h);
            this.f174823f.onSceneEnd(i2, i3, str, this);
        } else {
            Log.m105918d("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy ok, channel:" + this.f174825h);
            C64377fw fwVar = (C64377fw) this.f174821d.f127056b.f127083a;
            this.f174826i.mo86469c(fwVar.f183240q, this.f174825h);
            try {
                int i4 = this.f174825h;
                if (i4 == 1) {
                    SmcLogic.OnReportResp(0, 0, SmcProtoBufUtil.toSmcReportKvResp(fwVar).toByteArray(), this.f174825h);
                } else if (i4 == 2) {
                    SmcLogic.OnReportResp(0, 0, SmcProtoBufUtil.toSmcReportIdkeyResp(fwVar).toByteArray(), this.f174825h);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", Integer.valueOf(hashCode()), Util.stackTraceToString(e));
            }
            this.f174823f.onSceneEnd(i2, i3, str, this);
        }
    }
}
