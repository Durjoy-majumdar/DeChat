package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51785w50;
import te3.C51926x50;

/* renamed from: v53.m */
public class C52773m extends C117747y implements C1311n {

    /* renamed from: d */
    public C51926x50 f147451d;

    /* renamed from: e */
    public C47350c f147452e;

    /* renamed from: f */
    public C11385n f147453f;

    /* renamed from: g */
    public boolean f147454g;

    public C52773m(String str, int i, boolean z) {
        this.f147454g = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51785w50();
        bVar.f127067b = new C51926x50();
        if (z) {
            bVar.f127069d = 1859;
            bVar.f127068c = "/cgi-bin/mmpay-bin/mktdrawf2flottery";
        } else {
            bVar.f127069d = 2547;
            bVar.f127068c = "/cgi-bin/mmpay-bin/mktdrawlottery";
        }
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f147452e = a;
        C51785w50 w502 = (C51785w50) a.f127055a.f127080a;
        w502.f143862d = str;
        w502.f143863e = i;
        Log.m105925i("MicroMsg.NetSceneMktDrawLottery", "NetSceneMktDrawLottery, drawLotteryParams: %s, drawLotteryType: %s, isF2f: %s", str, Integer.valueOf(i), Boolean.valueOf(z));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147453f = nVar;
        return dispatch(gVar, this.f147452e, this);
    }

    public int getType() {
        return this.f147454g ? 1859 : 2547;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMktDrawLottery", "onGYNetEnd netId: %s, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f147451d = (C51926x50) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f147453f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
