package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50356m52;
import te3.C50498n52;

/* renamed from: je0.q */
public class C33549q extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f90831d;

    /* renamed from: e */
    public final C47350c f90832e;

    /* renamed from: f */
    public String f90833f;

    public C33549q(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50356m52();
        bVar.f127067b = new C50498n52();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getopenurl";
        bVar.f127069d = 913;
        C47350c a = bVar.mo72403a();
        this.f90832e = a;
        Log.m105925i("MicroMsg.NetSceneGetOpenIMUrl", "NetSceneGetOpenIMUrl username: %s", str);
        ((C50356m52) a.f127055a.f127080a).f137845d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90831d = nVar;
        return dispatch(gVar, this.f90832e, this);
    }

    public int getType() {
        return 913;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetOpenIMUrl", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            String str2 = ((C50498n52) this.f90832e.f127056b.f127083a).f138417d;
            this.f90833f = str2;
            Log.m105925i("MicroMsg.NetSceneGetOpenIMUrl", "openUrl %s", str2);
            this.f90831d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f90831d.onSceneEnd(i2, i3, str, this);
    }
}
