package eg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50961qh3;
import te3.C51110rh3;

/* renamed from: eg0.c */
public class C45655c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123453d;

    /* renamed from: e */
    public C47350c f123454e;

    public C45655c(int i, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50961qh3();
        bVar.f127067b = new C51110rh3();
        bVar.f127069d = 268;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/micromsg-bin/privacypolicychoise";
        C47350c a = bVar.mo72403a();
        this.f123454e = a;
        C50961qh3 qh32 = (C50961qh3) a.f127055a.f127080a;
        qh32.f140318d = i;
        qh32.f140319e = str;
        qh32.f140320f = str2;
        Log.m105925i("MicroMsg.NetScenePrivacyPolicyChoice", "NetScenePrivacyPolicyChoice %s %s %s", Integer.valueOf(i), str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123453d = nVar;
        return dispatch(gVar, this.f123454e, this);
    }

    public int getType() {
        return 268;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetScenePrivacyPolicyChoice", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f123453d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
