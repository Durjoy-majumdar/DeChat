package v53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import eb0.C31543z5;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49668h72;
import te3.C49809i72;

/* renamed from: v53.l */
public class C52772l extends C75123k0 {

    /* renamed from: d */
    public final C47350c f147448d;

    /* renamed from: e */
    public C11385n f147449e;

    /* renamed from: f */
    public C49809i72 f147450f;

    public C52772l() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49668h72 h722 = new C49668h72();
        h722.f134475d = C31543z5.m39453c();
        bVar.f127066a = h722;
        bVar.f127067b = new C49809i72();
        bVar.f127069d = 2860;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getreceiptassisplugin";
        this.f147448d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147449e = nVar;
        return dispatch(gVar, this.f147448d, this);
    }

    public int getType() {
        return 2860;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.NetSceneGetReceipAssistPlugin", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f147450f = (C49809i72) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f147449e.onSceneEnd(i2, i3, str, this);
    }
}
