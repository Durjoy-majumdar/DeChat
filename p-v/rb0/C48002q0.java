package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50006jl2;
import te3.C50146kl2;

/* renamed from: rb0.q0 */
public class C48002q0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128753d;

    /* renamed from: e */
    public C47350c f128754e;

    /* renamed from: f */
    public String f128755f;

    public C48002q0(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50006jl2();
        bVar.f127067b = new C50146kl2();
        bVar.f127068c = "/cgi-bin/mmkf-bin/kfgetbindlist";
        bVar.f127069d = 674;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128754e = a;
        C50006jl2 jl22 = (C50006jl2) a.f127055a.f127080a;
        jl22.f136178d = str;
        jl22.f136179e = str2;
        this.f128755f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128753d = nVar;
        Log.m105924i("MicroMsg.NetSceneKFGetBindList", "do scene");
        return dispatch(gVar, this.f128754e, this);
    }

    public int getType() {
        return 674;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneKFGetBindList", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f128753d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
