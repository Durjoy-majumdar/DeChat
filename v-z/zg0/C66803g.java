package zg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51568um3;
import te3.C64779vm3;
import xg0.C78803b;

/* renamed from: zg0.g */
public class C66803g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f191922d;

    /* renamed from: e */
    public C47350c f191923e;

    /* renamed from: f */
    public boolean f191924f;

    public C66803g(int i, String str, String str2, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51568um3();
        bVar.f127067b = new C64779vm3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/rcptinfoquery";
        bVar.f127069d = 417;
        bVar.f127070e = 202;
        bVar.f127071f = 1000000202;
        C47350c a = bVar.mo72403a();
        this.f191923e = a;
        C51568um3 um32 = (C51568um3) a.f127055a.f127080a;
        um32.f142941d = i;
        um32.f142942e = str;
        um32.f142943f = str2;
        um32.f142944g = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f191922d = nVar;
        return dispatch(gVar, this.f191923e, this);
    }

    public int getType() {
        return 417;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRcptInfoQuery", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C64779vm3 vm32 = (C64779vm3) ((C47350c) uVar).f127056b.f127083a;
            String str2 = vm32.f185960f;
            boolean z = true;
            if (vm32.f185961g != 1) {
                z = false;
            }
            this.f191924f = z;
            if (vm32.f185958d.f185431e != null) {
                Log.m105918d("MicroMsg.NetSceneRcptInfoQuery", "resp.rImpl.rcptinfolist.rcptinfolist " + vm32.f185958d.f185431e.size());
                C78803b.vx0();
                C78803b.xx0().mo183785j(vm32.f185958d.f185431e);
                C78803b.vx0();
                C78803b.xx0().mo183784i();
            }
        }
        this.f191922d.onSceneEnd(i2, i3, str, this);
    }
}
