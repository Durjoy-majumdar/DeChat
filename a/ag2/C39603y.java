package ag2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: ag2.y */
public class C39603y extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f106325d;

    /* renamed from: e */
    public C11385n f106326e;

    public C39603y(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3848;
        C39572d0 d0Var = new C39572d0();
        d0Var.f106228d = str;
        bVar.f127066a = d0Var;
        bVar.f127067b = new C39575e0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/preparebindxmail";
        Log.m105925i("MicroMsg.NetScenePrepareBindXmail", "bindQQMail %s", str);
        this.f106325d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106326e = nVar;
        return dispatch(gVar, this.f106325d, this);
    }

    public int getType() {
        return 3848;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f106326e.onSceneEnd(i2, i3, str, this);
    }
}
