package pz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.n44;
import te3.w34;
import te3.x34;
import te3.xa4;
import te3.y34;

/* renamed from: pz0.g */
public class C22061g extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f62436d;

    /* renamed from: e */
    public C11385n f62437e;

    /* renamed from: f */
    public String f62438f;

    /* renamed from: g */
    public int f62439g;

    /* renamed from: h */
    public String f62440h;

    public C22061g(int i, LinkedList<y34> linkedList, String str, String str2, n44 n44, int i2, xa4 xa4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new w34();
        bVar.f127067b = new x34();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sharecarditem";
        bVar.f127069d = C82613z.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f62436d = a;
        w34 w34 = (w34) a.f127055a.f127080a;
        w34.f64669d = i;
        w34.f64670e = linkedList;
        w34.f64671f = str;
        w34.f64672g = str2;
        if (linkedList != null) {
            Log.m105924i("MicroMsg.NetSceneShareCardItem", "list length is " + linkedList.size());
        }
        w34.f64673h = n44;
        w34.f64674i = i2;
        w34.f64675j = xa4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f62437e = nVar;
        return dispatch(gVar, this.f62436d, this);
    }

    public int getType() {
        return C82613z.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneShareCardItem", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", Integer.valueOf(C82613z.CTRL_INDEX), Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneShareCardItem", "do ShareCardItem netscene success!");
            x34 x34 = (x34) this.f62436d.f127056b.f127083a;
            if (x34 != null) {
                this.f62438f = x34.f144433f;
                this.f62439g = x34.f144431d;
                this.f62440h = x34.f144432e;
            }
        } else {
            x34 x342 = (x34) this.f62436d.f127056b.f127083a;
            if (x342 != null) {
                this.f62438f = x342.f144433f;
                this.f62439g = x342.f144431d;
                this.f62440h = x342.f144432e;
            }
        }
        this.f62437e.onSceneEnd(i2, i3, str, this);
    }
}
