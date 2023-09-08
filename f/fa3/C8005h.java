package fa3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51366ta0;
import te3.C51515ua0;

/* renamed from: fa3.h */
public class C8005h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f26696d;

    /* renamed from: e */
    public final C47350c f26697e;

    /* renamed from: f */
    public boolean f26698f;

    public C8005h(String str, String str2, boolean z, boolean z2) {
        this.f26698f = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51366ta0 ta02 = new C51366ta0();
        C51515ua0 ua02 = new C51515ua0();
        bVar.f127066a = ta02;
        bVar.f127067b = ua02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
        bVar.f127069d = 972;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        ta02.f142067d = str;
        ta02.f142068e = str2;
        ta02.f142070g = z;
        ta02.f142073j = z2;
        this.f26697e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f26696d = nVar;
        return dispatch(gVar, this.f26697e, this);
    }

    public int getType() {
        return 972;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f26696d.onSceneEnd(i2, i3, str, this);
    }
}
