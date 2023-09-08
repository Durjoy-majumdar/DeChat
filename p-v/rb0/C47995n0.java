package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49342ew1;
import te3.C49480fw1;

/* renamed from: rb0.n0 */
public class C47995n0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128718d;

    /* renamed from: e */
    public C47350c f128719e;

    /* renamed from: f */
    public Object f128720f;

    public C47995n0(String str, int i, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49342ew1();
        bVar.f127067b = new C49480fw1();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/getbizenterpriseattr";
        bVar.f127069d = 1343;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128719e = a;
        C49342ew1 ew12 = (C49342ew1) a.f127055a.f127080a;
        ew12.f133145d = str;
        ew12.f133146e = i;
        ew12.f133147f = LocaleUtil.getApplicationLanguage().equals("zh_CN") ? 2 : 1;
        this.f128720f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128718d = nVar;
        Log.m105924i("MicroMsg.NetSceneGetBizEnterpriseAttr", "do scene");
        return dispatch(gVar, this.f128719e, this);
    }

    public int getType() {
        return 1343;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetBizEnterpriseAttr", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f128718d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
