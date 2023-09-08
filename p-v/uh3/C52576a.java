package uh3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50771p22;
import te3.C50906q22;

/* renamed from: uh3.a */
public final class C52576a extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f146855d = "MicroMsg.NetSceneGetLensInfo";

    /* renamed from: e */
    public final C47350c f146856e;

    /* renamed from: f */
    public C11385n f146857f;

    public C52576a() {
        C50771p22 p222 = new C50771p22();
        p222.f139537d = "com.tencent.xin.lens.lens_test1";
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = p222;
        bVar.f127067b = new C50906q22();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlensinfo";
        bVar.f127069d = 3903;
        this.f146856e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146857f = nVar;
        return dispatch(gVar, this.f146856e, this);
    }

    public int getType() {
        return 3903;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f146855d;
        Log.m105924i(str2, "onGYNetEnd: " + i2 + ", " + i3);
        C11385n nVar = this.f146857f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
