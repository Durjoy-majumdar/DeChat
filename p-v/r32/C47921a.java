package r32;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50105kb0;
import te3.C50238lb0;

/* renamed from: r32.a */
public class C47921a extends C75123k0 {

    /* renamed from: d */
    public C47350c f128589d;

    /* renamed from: e */
    public C11385n f128590e;

    /* renamed from: f */
    public C50238lb0 f128591f;

    public C47921a(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50105kb0();
        bVar.f127067b = new C50238lb0();
        bVar.f127069d = 1987;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/ffclearwxhb";
        C47350c a = bVar.mo72403a();
        this.f128589d = a;
        ((C50105kb0) a.f127055a.f127080a).f136643d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128590e = nVar;
        return dispatch(gVar, this.f128589d, this);
    }

    public int getType() {
        return 1987;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        this.f128591f = (C50238lb0) ((C47350c) uVar).f127056b.f127083a;
        Log.m105925i("NetSceneF2FLuckyMoneyClear", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(this.f128591f.f137281d), this.f128591f.f137282e);
        C11385n nVar = this.f128590e;
        if (nVar != null) {
            C50238lb0 lb02 = this.f128591f;
            nVar.onSceneEnd(i2, lb02.f137281d, lb02.f137282e, this);
        }
    }
}
