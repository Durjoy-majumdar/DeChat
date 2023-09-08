package ef2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49789i24;
import te3.C49934j24;

/* renamed from: ef2.c */
public class C45653c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123449d;

    /* renamed from: e */
    public C47350c f123450e;

    public C45653c(String str, int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49789i24();
        bVar.f127067b = new C49934j24();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/setbrandflag";
        bVar.f127069d = 1363;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123450e = a;
        C49789i24 i242 = (C49789i24) a.f127055a.f127080a;
        i242.f135038d = str;
        i242.f135039e = i;
        i242.f135040f = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123449d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneSetBrandFlag", "do scene");
        return dispatch(gVar, this.f123450e, this);
    }

    public int getType() {
        return 1363;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneSetBrandFlag", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f123449d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
