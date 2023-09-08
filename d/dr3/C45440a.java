package dr3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.model.C45118l0;
import com.tencent.p014mm.wallet_core.model.C75117g0;
import com.tenpay.android.wechat.TenpayUtil;
import eb0.C75592q0;
import java.net.URLEncoder;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49130dd3;
import te3.C49269ed3;
import te3.C51018qv3;

/* renamed from: dr3.a */
public abstract class C45440a extends C75117g0 {
    public void configRequest(boolean z, boolean z2) {
        C47350c commReqResp = getCommReqResp();
        if (commReqResp == null) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C49130dd3();
            bVar.f127067b = new C49269ed3();
            bVar.f127068c = "/cgi-bin/mmpay-bin/payu";
            bVar.f127069d = 1518;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            commReqResp = bVar.mo72403a();
            commReqResp.setIsUserCmd(true);
        }
        C49130dd3 dd32 = (C49130dd3) commReqResp.f127055a.f127080a;
        if (z) {
            dd32.f132255d = mo70937j1();
        }
        if (z2) {
            dd32.f132256e = 1;
        }
        setCommReqResp(commReqResp);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.callback = nVar;
        if (C75592q0.m90763K()) {
            return dispatch(gVar, this.f221047rr, this);
        }
        Log.m105920e("MicroMsg.NetScenePayUBase", "hy: serious error: not payupay");
        nVar.onSceneEnd(1000, -100868, "Pay Method Err", this);
        return 1;
    }

    public int doSceneSimulately(C47350c cVar, C114770g gVar, C11385n nVar) {
        C49130dd3 dd32 = (C49130dd3) cVar.f127055a.f127080a;
        C51018qv3 qv32 = dd32.f132257f;
        if (qv32 != null) {
            new String(qv32.f140574f.f257327a);
        }
        C51018qv3 qv33 = dd32.f132258g;
        if (qv33 != null) {
            new String(qv33.f140574f.f257327a);
        }
        MMApplicationContext.getContext();
        mo70937j1();
        return -1;
    }

    public String getEncryptUrl(String str) {
        return TenpayUtil.signWith3Des(str);
    }

    public int getPayCgicmd() {
        return mo70937j1();
    }

    public C45118l0 getRetModel(C47350c cVar) {
        C49269ed3 ed32 = (C49269ed3) cVar.f127056b.f127083a;
        C45118l0 l0Var = new C45118l0();
        int i = ed32.f132877g;
        l0Var.f122388c = ed32.f132876f;
        l0Var.f122387b = ed32.f132875e;
        l0Var.f122386a = ed32.f132874d;
        l0Var.f122390e = ed32.f132879i;
        l0Var.f122389d = ed32.f132878h;
        return l0Var;
    }

    public int getType() {
        return 1518;
    }

    /* renamed from: j1 */
    public abstract int mo70937j1();

    public void putToReqText(C47350c cVar, C51018qv3 qv32) {
        ((C49130dd3) cVar.f127055a.f127080a).f132257f = qv32;
    }

    public void putToRequest(StringBuilder sb, String str) {
        sb.append(URLEncoder.encode(str));
    }

    public void putToWXReqText(C47350c cVar, C51018qv3 qv32) {
        ((C49130dd3) cVar.f127055a.f127080a).f132258g = qv32;
    }
}
