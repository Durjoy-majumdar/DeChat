package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49087d30;
import te3.C49224e30;

/* renamed from: je0.i */
public final class C46476i extends C117747y implements C1311n {

    /* renamed from: d */
    public String f125212d;

    /* renamed from: e */
    public C11385n f125213e;

    /* renamed from: f */
    public C47350c f125214f;

    public C46476i(String str) {
        String str2 = "";
        this.f125212d = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49087d30();
        bVar.f127067b = new C49224e30();
        bVar.f127068c = "/cgi-bin/micromsg-bin/delopenimkefucontact";
        bVar.f127069d = 5997;
        C47350c a = bVar.mo72403a();
        this.f125214f = a;
        this.f125212d = str != null ? str : str2;
        C49087d30 d302 = (C49087d30) a.f127055a.f127080a;
        if (d302 != null) {
            d302.f132086d = str;
        }
        Log.m105924i("MicroMsg.NetSceneDelOpenIMKefuContact", "alvinluo delOpenImKefuContact username: " + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125213e = nVar;
        return dispatch(gVar, this.f125214f, this);
    }

    public int getType() {
        return 5997;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneDelOpenIMKefuContact", "alvinluo delOpenImKefuContact onGYNetEnd errType: " + i2 + ", errCode: " + i3 + ", errMsg: " + str + ", type: " + 5997 + ", username: " + this.f125212d);
        if (i2 == 0 && i3 == 0) {
            C11385n nVar = this.f125213e;
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
            return;
        }
        C11385n nVar2 = this.f125213e;
        C87412m.m108591d(nVar2);
        nVar2.onSceneEnd(i2, i3, str, this);
    }
}
