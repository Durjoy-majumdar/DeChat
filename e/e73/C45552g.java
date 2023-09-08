package e73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50510n83;
import te3.C50648o83;

/* renamed from: e73.g */
public class C45552g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123224d;

    /* renamed from: e */
    public C47350c f123225e;

    public C45552g(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50510n83();
        bVar.f127067b = new C50648o83();
        bVar.f127068c = "/cgi-bin/mmpay-bin/opensotertouchlock";
        bVar.f127069d = 1967;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123225e = a;
        C50510n83 n832 = (C50510n83) a.f127055a.f127080a;
        Log.m105919d("MicroMsg.NetSceneOpenSoterFingerprintLock", "alvinluo json: %s, signature: %s, token: %s", str, str2, str3);
        n832.f138479d = str;
        n832.f138480e = str2;
        n832.f138481f = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123224d = nVar;
        return dispatch(gVar, this.f123225e, this);
    }

    public int getType() {
        return 1967;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneOpenSoterFingerprintLock", "alvinluo open soter fingerprint lock errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f123224d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
