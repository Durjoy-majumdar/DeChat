package m71;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;

/* renamed from: m71.a */
public abstract class C46947a<RequestType extends C47465a, ResponseType extends C47465a> extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126229d;

    /* renamed from: e */
    public C47350c f126230e;

    public final int doScene(C114770g gVar, C11385n nVar) {
        this.f126229d = nVar;
        if (this.f126230e == null) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = getType();
            bVar.f127068c = getUri();
            bVar.f127066a = mo72131k1();
            bVar.f127067b = mo72132l1();
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f126230e = a;
            mo72133m1(a.f127055a.f127080a);
        }
        return dispatch(gVar, this.f126230e, this);
    }

    public abstract String getUri();

    /* renamed from: j1 */
    public ResponseType mo72130j1() {
        ResponseType responsetype;
        C47350c cVar = this.f126230e;
        if (cVar == null || (responsetype = cVar.f127056b.f127083a) == null) {
            return null;
        }
        return responsetype;
    }

    /* renamed from: k1 */
    public abstract RequestType mo72131k1();

    /* renamed from: l1 */
    public abstract ResponseType mo72132l1();

    /* renamed from: m1 */
    public abstract void mo72133m1(RequestType requesttype);

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.BaseNetScene", "onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f126229d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
