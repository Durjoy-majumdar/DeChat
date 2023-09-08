package e53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51265sm;
import te3.C51414tm;

/* renamed from: e53.a */
public class C45549a extends C75123k0 {

    /* renamed from: d */
    public C11385n f123216d;

    /* renamed from: e */
    public C47350c f123217e;

    public C45549a(String str, int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51265sm smVar = new C51265sm();
        smVar.f141600f = str;
        smVar.f141598d = i;
        smVar.f141599e = i2;
        bVar.f127066a = smVar;
        bVar.f127067b = new C51414tm();
        bVar.f127068c = getUri();
        bVar.f127069d = getFuncId();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C75228t.m90208A(str);
        bVar.f127073h = 0;
        this.f123217e = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneCancelPay", "request uri: %s, reqKey: %s, payScene: %d, payChannel:%d", getUri(), str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123216d = nVar;
        return dispatch(gVar, this.f123217e, this);
    }

    public int getFuncId() {
        throw null;
    }

    public int getType() {
        return getFuncId();
    }

    public String getUri() {
        throw null;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105919d("MicroMsg.NetSceneCancelPay", "response uri: %s, errType: %d, errCode: %d, errMsg: %s", getUri(), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            try {
                C51414tm tmVar = (C51414tm) ((C47350c) uVar).f127056b.f127083a;
                Log.m105925i("MicroMsg.NetSceneCancelPay", "NetSceneCancelPay BaseResponse.Ret is %d, BaseResponse.ErrMsg is %s", Integer.valueOf(tmVar.BaseResponse.f135955d), tmVar.BaseResponse.f135956e);
            } catch (Exception e) {
                Log.m105924i("MicroMsg.NetSceneCancelPay", e.getMessage());
            }
        }
        C11385n nVar = this.f123216d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
