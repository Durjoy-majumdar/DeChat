package eg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.kk4;
import te3.lk4;

/* renamed from: eg0.e */
public class C45656e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123455d;

    /* renamed from: e */
    public C47350c f123456e;

    public C45656e(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new kk4();
        bVar.f127067b = new lk4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/unbindqq";
        bVar.f127069d = 253;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123456e = a;
        ((kk4) a.f127055a.f127080a).f136861d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123455d = nVar;
        return dispatch(gVar, this.f123456e, this);
    }

    public int getType() {
        return 253;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        this.f123455d.onSceneEnd(i2, i3, str, this);
    }
}
