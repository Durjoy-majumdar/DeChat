package r32;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50378mb0;
import te3.C50519nb0;
import te3.C77963l1;

/* renamed from: r32.b */
public class C47922b extends C75123k0 {

    /* renamed from: d */
    public C47350c f128592d;

    /* renamed from: e */
    public C11385n f128593e;

    /* renamed from: f */
    public C50378mb0 f128594f;

    /* renamed from: g */
    public int f128595g;

    /* renamed from: h */
    public String f128596h;

    public C47922b(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127066a = new C50378mb0();
        bVar.f127067b = new C50519nb0();
        bVar.f127069d = 1971;
        bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/ffwxhbinvalidateshareurl";
        C47350c a = bVar.mo72403a();
        this.f128592d = a;
        this.f128594f = (C50378mb0) a.f127055a.f127080a;
        C77963l1 c = C113146l.m154805c();
        if (c != null) {
            C50378mb0 mb02 = this.f128594f;
            mb02.f137936e = c.f227793f;
            mb02.f137937f = c.f227794g;
        }
        this.f128594f.f137935d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128593e = nVar;
        return dispatch(gVar, this.f128592d, this);
    }

    public int getType() {
        return 1971;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i(" NetSceneF2FLuckyMoneyInvalid", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50519nb0 nb02 = (C50519nb0) ((C47350c) uVar).f127056b.f127083a;
        int i4 = nb02.f138523d;
        this.f128595g = i4;
        String str2 = nb02.f138524e;
        this.f128596h = str2;
        C11385n nVar = this.f128593e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i4, str2, this);
        }
    }
}
