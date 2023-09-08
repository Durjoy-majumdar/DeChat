package n43;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fm0.C86956l0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.bu4;
import te3.cu4;

/* renamed from: n43.a */
public class C47156a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126684d;

    /* renamed from: e */
    public C47350c f126685e;

    public C47156a(int i, long j, long j2, String str, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new bu4();
        bVar.f127067b = new cu4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/csvoiphangup";
        bVar.f127069d = C86956l0.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126685e = a;
        bu4 bu4 = (bu4) a.f127055a.f127080a;
        bu4.f131316d = i;
        bu4.f131317e = j;
        bu4.f131318f = j2;
        bu4.f131319g = str;
        bu4.f131321i = i2;
        bu4.f131320h = System.currentTimeMillis();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126684d = nVar;
        return dispatch(gVar, this.f126685e, this);
    }

    public int getType() {
        return C86956l0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneVoipCSHangUp", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f126684d.onSceneEnd(i2, i3, str, this);
    }
}
