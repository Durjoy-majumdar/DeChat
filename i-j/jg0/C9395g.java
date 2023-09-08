package jg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49467ft;
import te3.C49606gt;

/* renamed from: jg0.g */
public class C9395g extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f29333d;

    /* renamed from: e */
    public C11385n f29334e;

    public C9395g() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49467ft();
        bVar.f127067b = new C49606gt();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkcansetalias";
        bVar.f127069d = 926;
        this.f29333d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29334e = nVar;
        return dispatch(gVar, this.f29333d, this);
    }

    public int getType() {
        return 926;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCheckModifyAlias", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f29334e.onSceneEnd(i2, i3, str, this);
    }
}
