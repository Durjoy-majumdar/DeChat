package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import eb0.C31543z5;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50811pc3;
import te3.C50944qc3;

/* renamed from: v53.j */
public class C52770j extends C75123k0 {

    /* renamed from: d */
    public final C47350c f147440d;

    /* renamed from: e */
    public C11385n f147441e;

    /* renamed from: f */
    public C50944qc3 f147442f;

    public C52770j() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50811pc3 pc32 = new C50811pc3();
        pc32.f139700d = C31543z5.m39453c();
        bVar.f127066a = pc32;
        bVar.f127067b = new C50944qc3();
        bVar.f127069d = 1820;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getpayplugin";
        this.f147440d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147441e = nVar;
        return dispatch(gVar, this.f147440d, this);
    }

    public int getType() {
        return 1820;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.NetSceneGetPayPlugin", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f147442f = (C50944qc3) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f147441e.onSceneEnd(i2, i3, str, this);
    }
}
