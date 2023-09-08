package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49235e50;
import te3.C49380f50;

/* renamed from: mi.o */
public class C47044o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126417d;

    /* renamed from: e */
    public C47350c f126418e;

    /* renamed from: f */
    public String f126419f;

    public C47044o(String str) {
        this.f126419f = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49235e50();
        bVar.f127067b = new C49380f50();
        bVar.f127068c = "/cgi-bin/micromsg-bin/dismisschatroom";
        bVar.f127069d = 6217;
        C47350c a = bVar.mo72403a();
        this.f126418e = a;
        ((C49235e50) a.f127055a.f127080a).f132696d = this.f126419f;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126417d = nVar;
        return dispatch(gVar, this.f126418e, this);
    }

    public int getType() {
        return 6217;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneExtFunctionSwitch", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneExtFunctionSwitch", "return is 0.now we parse the json and resetList..");
        }
        this.f126417d.onSceneEnd(i2, i3, str, this);
    }
}
