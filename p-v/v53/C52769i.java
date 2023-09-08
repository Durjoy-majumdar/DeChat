package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import eb0.C31543z5;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51232se2;
import te3.C51385te2;

/* renamed from: v53.i */
public class C52769i extends C75123k0 {

    /* renamed from: d */
    public final C47350c f147437d;

    /* renamed from: e */
    public C11385n f147438e;

    /* renamed from: f */
    public C51385te2 f147439f;

    public C52769i() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51232se2 se22 = new C51232se2();
        se22.f141461d = C31543z5.m39453c();
        bVar.f127066a = se22;
        bVar.f127067b = new C51385te2();
        bVar.f127069d = 6855;
        bVar.f127068c = "/cgi-bin/mmpay-bin/hkpayplugin";
        this.f147437d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147438e = nVar;
        return dispatch(gVar, this.f147437d, this);
    }

    public int getType() {
        return 6855;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.NetSceneGetPayHKPlugin", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f147439f = (C51385te2) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f147438e.onSceneEnd(i2, i3, str, this);
    }
}
