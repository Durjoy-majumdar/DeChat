package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50184kv1;
import te3.C50314lv1;

/* renamed from: v53.h */
public class C52768h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f147434d;

    /* renamed from: e */
    public C47350c f147435e;

    /* renamed from: f */
    public C50314lv1 f147436f;

    public C52768h(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50184kv1();
        bVar.f127067b = new C50314lv1();
        bVar.f127068c = "/cgi-bin/mmpay-bin/tenpay/getbanpaymobileinfo";
        bVar.f127069d = 1667;
        C75228t.m90208A(str);
        bVar.f127073h = 0;
        C47350c a = bVar.mo72403a();
        this.f147435e = a;
        Log.m105919d("MicroMsg.NetSceneGetBanpayMobileInfo", "req_key: %s", str);
        ((C50184kv1) a.f127055a.f127080a).f137062d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147434d = nVar;
        return dispatch(gVar, this.f147435e, this);
    }

    public int getType() {
        return 1667;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetBanpayMobileInfo", "NetSceneGetBanpayMobileInfo, netId: %s, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        this.f147436f = (C50314lv1) this.f147435e.f127056b.f127083a;
        C11385n nVar = this.f147434d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
