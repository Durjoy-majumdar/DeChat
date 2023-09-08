package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51916x3;
import te3.C52060y3;
import te3.ck4;

/* renamed from: xm2.h */
public class C15859h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f42706d;

    /* renamed from: e */
    public List<String> f42707e;

    public C15859h(List<String> list) {
        this.f42707e = list;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f42706d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51916x3 x3Var = new C51916x3();
        ArrayList arrayList = new ArrayList();
        if (this.f42707e != null) {
            for (int i = 0; i < this.f42707e.size(); i++) {
                ck4 ck4 = new ck4();
                ck4.f131801d = this.f42707e.get(i);
                arrayList.add(ck4);
            }
        }
        x3Var.f144419d.addAll(arrayList);
        bVar.f127066a = x3Var;
        bVar.f127067b = new C52060y3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addtrustedfriends";
        bVar.f127069d = 583;
        bVar.f127070e = 0;
        return dispatch(gVar, bVar.mo72403a(), this);
    }

    public int getType() {
        return 583;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchIdNew(i);
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105921e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.f42706d.onSceneEnd(i2, i3, str, this);
    }
}
