package r32;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50938qb0;
import te3.C51083rb0;
import te3.C77963l1;

/* renamed from: r32.e */
public class C47924e extends C75123k0 {

    /* renamed from: d */
    public C47350c f128604d;

    /* renamed from: e */
    public C11385n f128605e;

    /* renamed from: f */
    public C50938qb0 f128606f;

    /* renamed from: g */
    public String f128607g;

    /* renamed from: h */
    public String f128608h;

    /* renamed from: i */
    public String f128609i;

    /* renamed from: j */
    public String f128610j;

    /* renamed from: n */
    public int f128611n;

    public C47924e() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50938qb0();
        bVar.f127067b = new C51083rb0();
        bVar.f127069d = 1990;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/ffquerydowxhb";
        C47350c a = bVar.mo72403a();
        this.f128604d = a;
        C50938qb0 qb02 = (C50938qb0) a.f127055a.f127080a;
        this.f128606f = qb02;
        qb02.f140225f = System.currentTimeMillis() / 1000;
        C77963l1 c = C113146l.m154805c();
        if (c != null) {
            C50938qb0 qb03 = this.f128606f;
            qb03.f140223d = c.f227793f;
            qb03.f140224e = c.f227794g;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128605e = nVar;
        return dispatch(gVar, this.f128604d, this);
    }

    public int getType() {
        return 1990;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("NetSceneF2FLuckyMoneyQuery", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51083rb0 rb02 = (C51083rb0) ((C47350c) uVar).f127056b.f127083a;
        this.f128607g = rb02.f140799f;
        this.f128608h = rb02.f140800g;
        this.f128611n = rb02.f140801h;
        this.f128609i = rb02.f140803j;
        this.f128610j = rb02.f140802i;
        C11385n nVar = this.f128605e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, rb02.f140797d, rb02.f140798e, this);
        }
    }
}
