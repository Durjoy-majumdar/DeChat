package ig3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101803ks3;
import te3.C50306ls3;

/* renamed from: ig3.h */
public class C98687h extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f289387d;

    /* renamed from: e */
    public C11385n f289388e;

    public C98687h(C101803ks3 ks32) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101803ks3();
        bVar.f127067b = new C50306ls3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/reportmediainfo";
        bVar.f127069d = 809;
        C47350c a = bVar.mo72403a();
        this.f289387d = a;
        C101803ks3 ks33 = (C101803ks3) a.f127055a.f127080a;
        ks33.f298665f = ks32.f298665f;
        ks33.f298664e = ks32.f298664e;
        ks33.f298666g = ks32.f298666g;
        ks33.f298667h.addAll(ks32.f298667h);
        ks33.f298663d = ks32.f298663d;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f289388e = nVar;
        return dispatch(gVar, this.f289387d, this);
    }

    public int getType() {
        return 809;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneReportMediaInfo", "netId :%d errType: %d, errCode: %d, errMsg:%s, hashcode:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(hashCode()));
        this.f289388e.onSceneEnd(i2, i3, str, this);
    }
}
