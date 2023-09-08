package jg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50171ks;
import te3.C50302ls;

/* renamed from: jg0.f */
public class C9394f extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f29330d;

    /* renamed from: e */
    public C11385n f29331e;

    /* renamed from: f */
    public String f29332f;

    public C9394f(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50171ks ksVar = new C50171ks();
        ksVar.f137021d = str;
        this.f29332f = str;
        bVar.f127066a = ksVar;
        bVar.f127067b = new C50302ls();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkaliasvalid";
        bVar.f127069d = 3516;
        this.f29330d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29331e = nVar;
        return dispatch(gVar, this.f29330d, this);
    }

    public int getType() {
        return 3516;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCheckAliasValid", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f29331e.onSceneEnd(i2, i3, str, this);
    }
}
