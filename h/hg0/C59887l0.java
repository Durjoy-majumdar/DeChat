package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82102w;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116746l3;
import f40.C86709a0;
import f40.C86718e;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import ob0.y$$d;
import p156gj.C87203t;
import qe3.C89631w;
import te3.C64413h70;
import te3.C64438i70;

/* renamed from: hg0.l0 */
public class C59887l0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C114799u f170958d;

    /* renamed from: e */
    public C11385n f170959e;

    /* renamed from: f */
    public int f170960f;

    /* renamed from: hg0.l0$a */
    public static class C59888a extends C117746w {

        /* renamed from: a */
        public C59883a0 f170961a = new C59883a0();

        /* renamed from: b */
        public C59884b0 f170962b = new C59884b0();

        public int getOptions() {
            return 1;
        }

        public C89631w.C89634d getReqObjImp() {
            return this.f170961a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f170962b;
        }

        public int getType() {
            return C82102w.CTRL_INDEX;
        }

        public String getUri() {
            return "/cgi-bin/micromsg-bin/emailreg";
        }
    }

    public C59887l0(int i, String str, String str2, String str3) {
        this.f170960f = 2;
        C59888a aVar = new C59888a();
        this.f170958d = aVar;
        C59883a0 a0Var = (C59883a0) aVar.getReqObj();
        C64413h70 h702 = a0Var.f170954a;
        h702.f183416e = i;
        h702.f183417f = str;
        h702.f183418g = LocaleUtil.getApplicationLanguage();
        a0Var.f170954a.f183419h = Util.getCutPasswordMD5(str2);
        C64413h70 h703 = a0Var.f170954a;
        h703.f183420i = str3;
        C86709a0.m107523b();
        h703.f183421j = C86718e.m107547e();
        a0Var.f170954a.f183422n = C87203t.m108277m();
        a0Var.f170954a.f183423o = 1;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f170959e = nVar;
        return dispatch(gVar, this.f170958d, this);
    }

    public int getType() {
        return C82102w.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneEmailReg", "onGYNetEnd  errType:%d errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        C59884b0 b0Var = (C59884b0) uVar.getRespObj();
        if (i2 == 4 && i3 == -301) {
            C64438i70 i702 = b0Var.f170955a;
            C116746l3.m164676c(true, i702.f183630e, i702.f183633h, i702.f183631f, true, 0);
            int i4 = this.f170960f - 1;
            this.f170960f = i4;
            if (i4 <= 0) {
                this.f170959e.onSceneEnd(3, -1, "", this);
            } else {
                doScene(dispatcher(), this.f170959e);
            }
        } else if (i2 == 0 && i3 == 0) {
            C64438i70 i703 = b0Var.f170955a;
            C116746l3.m164676c(false, i703.f183630e, i703.f183633h, i703.f183631f, false, 0);
            this.f170959e.onSceneEnd(i2, i3, str, this);
        } else {
            Log.m105920e("MicroMsg.NetSceneEmailReg", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
            this.f170959e.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 5;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public C59887l0(String str, String str2) {
        this(1, str, str2, "");
    }
}
