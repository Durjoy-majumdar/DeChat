package sy0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49966ja;
import te3.C50143kl;
import te3.C50698ol;
import te3.C50844pl;
import te3.C51163rv3;

/* renamed from: sy0.a */
public abstract class C48502a extends C117747y implements C1311n {

    /* renamed from: g */
    public static final Set<Long> f129711g = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    public final C50143kl f129712d;

    /* renamed from: e */
    public C47350c f129713e;

    /* renamed from: f */
    public C11385n f129714f;

    public C48502a(int i, C50143kl klVar) {
        C87412m.m108594g(klVar, "pack");
        this.f129712d = klVar;
        C50698ol olVar = new C50698ol();
        C47350c.C47352b bVar = new C47350c.C47352b();
        olVar.f139244e = klVar;
        olVar.f139243d = i;
        bVar.f127066a = olVar;
        C50844pl plVar = new C50844pl();
        plVar.setBaseResponse(new C49966ja());
        plVar.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = plVar;
        bVar.f127068c = "/cgi-bin/micromsg-bin/bypsend";
        bVar.f127069d = 3862;
        this.f129713e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129714f = nVar;
        f129711g.add(Long.valueOf(mo73135j1()));
        return dispatch(gVar, this.f129713e, this);
    }

    public int getType() {
        return 3862;
    }

    /* renamed from: j1 */
    public long mo73135j1() {
        return 0;
    }

    /* renamed from: k1 */
    public void mo73136k1(int i, int i2, String str, C50844pl plVar) {
        C87412m.m108594g(plVar, "resp");
    }

    /* renamed from: l1 */
    public void mo73137l1(C50844pl plVar) {
        C87412m.m108594g(plVar, "resp");
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        C47465a aVar = this.f129713e.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BypSendResponse");
        C50844pl plVar = (C50844pl) aVar;
        Log.m105924i("Byp.CgiBypSend", "[onCgiBack] errType=" + i2 + " errCode=" + i3 + " errMsg=" + str + " resp=" + plVar);
        f129711g.remove(Long.valueOf(mo73135j1()));
        if (i2 == 0 && i3 == 0) {
            mo73137l1(plVar);
        } else {
            mo73136k1(i2, i3, str, plVar);
        }
        C11385n nVar = this.f129714f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
