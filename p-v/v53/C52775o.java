package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49937j32;
import te3.C50074k32;

/* renamed from: v53.o */
public class C52775o extends C117747y implements C1311n {

    /* renamed from: d */
    public C50074k32 f147459d;

    /* renamed from: e */
    public boolean f147460e;

    /* renamed from: f */
    public C47350c f147461f;

    /* renamed from: g */
    public C11385n f147462g;

    public C52775o(String str, boolean z) {
        this.f147460e = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49937j32();
        bVar.f127067b = new C50074k32();
        if (z) {
            bVar.f127069d = 2803;
            bVar.f127068c = "/cgi-bin/mmpay-bin/mktgetf2flottery";
        } else {
            bVar.f127069d = 2508;
            bVar.f127068c = "/cgi-bin/mmpay-bin/mktgetlottery";
        }
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f147461f = a;
        ((C49937j32) a.f127055a.f127080a).f135844d = str;
        Log.m105925i("MicroMsg.NetSceneMktGetLottery", "NetSceneMktGetLottery, getLotteryParams: %s, isF2f: %s", str, Boolean.valueOf(z));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147462g = nVar;
        return dispatch(gVar, this.f147461f, this);
    }

    public int getType() {
        return this.f147460e ? 2803 : 2508;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMktGetLottery", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f147459d = (C50074k32) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f147462g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
