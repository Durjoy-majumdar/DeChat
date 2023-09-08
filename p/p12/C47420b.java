package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50966qi3;
import te3.C51114ri3;

/* renamed from: p12.b */
public class C47420b extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f127206d = null;

    /* renamed from: e */
    public C51114ri3 f127207e = null;

    /* renamed from: f */
    public C11385n f127208f;

    public C47420b(String str, String str2, String str3, String str4, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50966qi3();
        bVar.f127067b = new C51114ri3();
        bVar.f127069d = 807;
        bVar.f127068c = "/cgi-bin/micromsg-bin/pstnchecknumber";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f127206d = a;
        C50966qi3 qi32 = (C50966qi3) a.f127055a.f127080a;
        qi32.f140333d = str;
        qi32.f140335f = str2;
        qi32.f140337h = str3;
        qi32.f140336g = str4;
        qi32.f140338i = i;
        Log.m105925i("MicroMsg.NetSceneIPCallCheckNumber", "NetSceneIPCallCheckNumber pureNumber:%s,lastCountry:%s,osCountry:%s,simCountry:%s,dialScene:%d", str, str2, str3, str4, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127208f = nVar;
        return dispatch(gVar, this.f127206d, this);
    }

    public int getType() {
        return 807;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallCheckNumber", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f127207e = (C51114ri3) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f127208f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
