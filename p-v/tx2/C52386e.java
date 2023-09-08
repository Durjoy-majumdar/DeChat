package tx2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C47350c;
import te3.df4;
import te3.ef4;

/* renamed from: tx2.e */
public class C52386e extends C52387f {

    /* renamed from: d */
    public C11385n f146439d;

    /* renamed from: e */
    public final C47350c f146440e;

    /* renamed from: f */
    public final String f146441f;

    /* renamed from: g */
    public int f146442g;

    public C52386e(String str, int i, long j, int i2) {
        this.f146442g = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new df4();
        bVar.f127067b = new ef4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/talknoop";
        bVar.f127069d = 335;
        bVar.f127070e = 149;
        bVar.f127071f = 1000000149;
        C47350c a = bVar.mo72403a();
        this.f146440e = a;
        df4 df4 = (df4) a.f127055a.f127080a;
        df4.f132295d = i;
        df4.f132296e = j;
        df4.f132297f = (int) Util.nowSecond();
        this.f146441f = str;
        df4.f132298g = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneTalkNoop", "doScene");
        this.f146439d = nVar;
        return dispatch(gVar, this.f146440e, this);
    }

    public int getType() {
        return 335;
    }

    /* renamed from: j1 */
    public String mo73384j1() {
        return this.f146441f;
    }

    /* renamed from: k1 */
    public int mo73385k1() {
        return this.f146442g;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneTalkNoop", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            this.f146439d.onSceneEnd(i2, i3, str, this);
        } else {
            this.f146439d.onSceneEnd(i2, i3, str, this);
        }
    }
}
