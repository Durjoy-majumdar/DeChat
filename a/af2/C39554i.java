package af2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49254ea0;
import te3.C49932j22;
import te3.C50070k22;
import te3.C77905b4;

/* renamed from: af2.i */
public class C39554i extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106180d;

    /* renamed from: e */
    public C47350c f106181e;

    /* renamed from: f */
    public LinkedList<C49254ea0> f106182f;

    public C39554i(String str, String str2, C77905b4 b4Var) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49932j22();
        bVar.f127067b = new C50070k22();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlastestexpressinfo";
        bVar.f127069d = 578;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106181e = a;
        C49932j22 j222 = (C49932j22) a.f127055a.f127080a;
        j222.f135825d = str;
        Log.m105918d("MicroMsg.NetSceneMallGetLastestExpressInfo", "pid " + str);
        j222.f135826e = str2;
        j222.f135827f = b4Var;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106180d = nVar;
        return dispatch(gVar, this.f106181e, this);
    }

    public int getType() {
        return 578;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        C50070k22 k222 = (C50070k22) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0 && k222.f136517f == 0) {
            Log.m105918d("MicroMsg.NetSceneMallGetLastestExpressInfo", "resp.ExpressCount " + k222.f136516e);
            this.f106182f = k222.f136515d;
        }
        if (i3 == 0 && (i4 = k222.f136517f) != 0) {
            str = k222.f136518g;
            i3 = i4;
        }
        Log.m105918d("MicroMsg.NetSceneMallGetLastestExpressInfo", "errCode " + i3 + ", errMsg " + str);
        this.f106180d.onSceneEnd(i2, i3, str, this);
    }
}
