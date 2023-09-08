package o03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.po4;
import te3.qo4;

/* renamed from: o03.e */
public class C47321e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f127000d;

    /* renamed from: e */
    public C47350c f127001e;

    public C47321e(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new po4();
        bVar.f127067b = new qo4();
        bVar.f127068c = "/cgi-bin/mmsearch-bin/usercloserecommend";
        bVar.f127069d = 4393;
        C47350c a = bVar.mo72403a();
        this.f127001e = a;
        ((po4) a.f127055a.f127080a).f139887d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127000d = nVar;
        return dispatch(gVar, this.f127001e, this);
    }

    public int getType() {
        return 4071;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneExtFunctionSwitch", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneExtFunctionSwitch", "return is 0.now we parse the json and resetList..");
        }
        this.f127000d.onSceneEnd(i2, i3, str, this);
    }
}
