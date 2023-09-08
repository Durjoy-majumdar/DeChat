package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49506g24;
import te3.C49648h24;
import te3.C50122kf;

/* renamed from: rb0.u0 */
public class C48007u0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128766d;

    /* renamed from: e */
    public C47350c f128767e;

    /* renamed from: f */
    public Object f128768f;

    public C48007u0(C50122kf kfVar, int i, int i2, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49506g24();
        bVar.f127067b = new C49648h24();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/setbizenterpriseattr";
        bVar.f127069d = 1228;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128767e = a;
        C49506g24 g242 = (C49506g24) a.f127055a.f127080a;
        g242.f133811f = kfVar;
        g242.f133810e = i;
        g242.f133809d = i2;
        this.f128768f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128766d = nVar;
        Log.m105924i("MicroMsg.NetSceneSetBizEnterpriseAttr", "do scene");
        return dispatch(gVar, this.f128767e, this);
    }

    public int getType() {
        return 1228;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneSetBizEnterpriseAttr", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f128766d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
