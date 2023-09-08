package n43;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.nu4;
import te3.ou4;

/* renamed from: n43.f */
public class C47160f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126692d;

    /* renamed from: e */
    public C47350c f126693e;

    public C47160f(long j, long j2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new nu4();
        bVar.f127067b = new ou4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/csvoipsync";
        bVar.f127069d = 818;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126693e = a;
        nu4 nu4 = (nu4) a.f127055a.f127080a;
        nu4.f138783d = j;
        nu4.f138784e = j2;
        nu4.f138786g = i;
        nu4.f138785f = System.currentTimeMillis();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126692d = nVar;
        return dispatch(gVar, this.f126693e, this);
    }

    public int getType() {
        return 818;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneVoipCSSync", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f126692d.onSceneEnd(i2, i3, str, this);
    }
}
