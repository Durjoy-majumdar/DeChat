package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49573gk3;
import te3.C49920iz1;
import te3.C50055jz1;

/* renamed from: hz0.d0 */
public class C46143d0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124351d;

    /* renamed from: e */
    public C11385n f124352e;

    /* renamed from: f */
    public C49573gk3 f124353f;

    public C46143d0(LinkedList<String> linkedList, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49920iz1();
        bVar.f127067b = new C50055jz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getdynamiccardcode";
        bVar.f127069d = 1382;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124351d = a;
        C49920iz1 iz12 = (C49920iz1) a.f127055a.f127080a;
        iz12.f135769d = linkedList;
        iz12.f135770e = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124352e = nVar;
        return dispatch(gVar, this.f124351d, this);
    }

    public int getType() {
        return 1382;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetDynamicCardCode", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            this.f124353f = ((C50055jz1) this.f124351d.f127056b.f127083a).f136474d;
        }
        this.f124352e.onSceneEnd(i2, i3, str, this);
    }
}
