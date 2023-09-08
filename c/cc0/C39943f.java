package cc0;

import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50448mt1;
import te3.C50591nt1;

/* renamed from: cc0.f */
public class C39943f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f107082d;

    /* renamed from: e */
    public final C47350c f107083e;

    /* renamed from: f */
    public String f107084f = "";

    public C39943f(double d, double d2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50448mt1();
        bVar.f127067b = new C50591nt1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/geocoderlocation";
        bVar.f127069d = WearableStatusCodes.ASSET_UNAVAILABLE;
        C47350c a = bVar.mo72403a();
        this.f107083e = a;
        C50448mt1 mt12 = (C50448mt1) a.f127055a.f127080a;
        mt12.f138197e = d;
        mt12.f138196d = d2;
        mt12.f138200h = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f107082d = nVar;
        return dispatch(gVar, this.f107083e, this);
    }

    public int getType() {
        return WearableStatusCodes.ASSET_UNAVAILABLE;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetAddress", "onGYNetEnd errType %d errCode%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            String str2 = ((C50591nt1) ((C47350c) uVar).f127056b.f127083a).f138760d;
            this.f107084f = str2;
            Log.m105918d("MicroMsg.NetSceneGetAddress", str2);
            C11385n nVar = this.f107082d;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f107082d;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
