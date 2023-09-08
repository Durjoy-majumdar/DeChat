package d22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50422mm2;
import te3.jl4;
import te3.kl4;

/* renamed from: d22.f */
public class C45260f extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f122610d;

    /* renamed from: e */
    public C11385n f122611e;

    /* renamed from: f */
    public C50422mm2 f122612f = null;

    public C45260f(int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new jl4();
        bVar.f127067b = new kl4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/updatecontactlabel";
        bVar.f127069d = 637;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f122610d = bVar.mo72403a();
        if (i >= 0 && !Util.isNullOrNil(str)) {
            C50422mm2 mm22 = new C50422mm2();
            this.f122612f = mm22;
            mm22.f138106e = i;
            mm22.f138105d = str;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f122611e = nVar;
        C47350c cVar = this.f122610d;
        jl4 jl4 = (jl4) cVar.f127055a.f127080a;
        C50422mm2 mm22 = this.f122612f;
        if (mm22 != null) {
            jl4.f136182d = mm22;
            return dispatch(gVar, cVar, this);
        }
        Log.m105920e("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[doScene] label pair is null.");
        nVar.onSceneEnd(3, -1, "[doScene]empty label pair.", this);
        return 0;
    }

    public int getType() {
        return 637;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f122611e.onSceneEnd(i2, i3, str, this);
    }
}
