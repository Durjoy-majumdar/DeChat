package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48725ak;
import te3.C52270zj;
import te3.C77925f4;

/* renamed from: com.tencent.mm.plugin.remittance.model.l */
public class C42845l extends C75123k0 {

    /* renamed from: d */
    public C47350c f116026d;

    /* renamed from: e */
    public C48725ak f116027e;

    /* renamed from: f */
    public C11385n f116028f;

    public C42845l() {
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116028f = nVar;
        return dispatch(gVar, this.f116026d, this);
    }

    public int getType() {
        return 2504;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneBusiF2fSucpage", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f116027e = (C48725ak) ((C47350c) uVar).f127056b.f127083a;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f116027e.f130575g != null) {
            stringBuffer.append("response: " + this.f116027e.f130576h);
            stringBuffer.append("is_show_btn: " + this.f116027e.f130575g.f226710g);
            if (this.f116027e.f130575g.f226707d != null) {
                stringBuffer.append("single_exposure_info_list " + this.f116027e.f130575g.f226707d.size());
            }
        }
        Log.m105925i("MicroMsg.NetSceneBusiF2fSucpage", "ret_code: %s, ret_msg: %s %s", Integer.valueOf(this.f116027e.f130572d), this.f116027e.f130573e, stringBuffer.toString());
        C11385n nVar = this.f116028f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    public C42845l(C77925f4 f4Var, String str, int i, int i2, long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52270zj();
        bVar.f127067b = new C48725ak();
        bVar.f127069d = 2504;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2fsucpage";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116026d = a;
        C52270zj zjVar = (C52270zj) a.f127055a.f127080a;
        zjVar.f145990d = f4Var;
        zjVar.f145991e = str;
        zjVar.f145992f = i;
        if (Util.isEqual(i, 1)) {
            zjVar.f145993g = i2;
            zjVar.f145994h = j;
        }
        Log.m105925i("MicroMsg.NetSceneBusiF2fSucpage", "NetSceneBusiF2fSucpage suc_page_extend %s req %s fault_flag %s fault_retry_cnt %s fault_retry_client_time %s", str, C70580a.m83108b(f4Var), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j));
    }
}
