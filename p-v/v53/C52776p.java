package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48827ba0;
import te3.C48975ca0;

/* renamed from: v53.p */
public class C52776p extends C117747y implements C1311n {

    /* renamed from: d */
    public C48975ca0 f147463d;

    /* renamed from: e */
    public boolean f147464e;

    /* renamed from: f */
    public C47350c f147465f;

    /* renamed from: g */
    public C11385n f147466g;

    public C52776p(String str, boolean z) {
        this.f147464e = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48827ba0();
        bVar.f127067b = new C48975ca0();
        if (z) {
            bVar.f127069d = 2529;
            bVar.f127068c = "/cgi-bin/mmpay-bin/mktf2fmodifyexposure";
        } else {
            bVar.f127069d = 2888;
            bVar.f127068c = "/cgi-bin/mmpay-bin/mktmodifyexposure";
        }
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f147465f = a;
        ((C48827ba0) a.f127055a.f127080a).f131024d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147466g = nVar;
        return dispatch(gVar, this.f147465f, this);
    }

    public int getType() {
        return this.f147464e ? 2529 : 2888;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMktModifyExposure", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f147463d = (C48975ca0) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f147466g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
