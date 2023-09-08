package o23;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C50152kn1;
import te3.C50287ln1;

/* renamed from: o23.b */
public final class C47326b extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f127006d;

    /* renamed from: e */
    public C47350c f127007e;

    /* renamed from: f */
    public C11385n f127008f;

    /* renamed from: g */
    public int f127009g;

    /* renamed from: h */
    public byte[] f127010h;

    /* renamed from: i */
    public long f127011i;

    public C47326b(String str, String str2) {
        C87412m.m108594g(str, "finderUserName");
        C87412m.m108594g(str2, "inputText");
        this.f127006d = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/findertexttospeech";
        bVar.f127069d = 5207;
        C50152kn1 kn12 = new C50152kn1();
        kn12.f136894e = str;
        kn12.f136895f = str2;
        bVar.f127066a = kn12;
        bVar.f127067b = new C50287ln1();
        this.f127007e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneFinderTextToSpeech", "doScene");
        this.f127008f = nVar;
        return dispatch(gVar, this.f127007e, this);
    }

    public int getType() {
        return 5207;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneFinderTextToSpeech", "onGYNetEnd, errType:" + i2 + ", errCode:" + i3);
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.NetSceneFinderTextToSpeech", "onGYNetEnd error");
        }
        C47465a aVar = this.f127007e.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderTextToSpeechResp");
        C50287ln1 ln12 = (C50287ln1) aVar;
        C89349b bVar = ln12.f137524d;
        this.f127010h = bVar != null ? bVar.f257327a : null;
        this.f127011i = ln12.f137525e;
        C11385n nVar = this.f127008f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
