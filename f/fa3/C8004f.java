package fa3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50515na0;
import te3.C50653oa0;

/* renamed from: fa3.f */
public class C8004f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f26694d;

    /* renamed from: e */
    public final C47350c f26695e;

    public C8004f(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50515na0 na02 = new C50515na0();
        C50653oa0 oa02 = new C50653oa0();
        bVar.f127066a = na02;
        bVar.f127067b = oa02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmcancel";
        bVar.f127069d = 973;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        na02.f138503d = str;
        this.f26695e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f26694d = nVar;
        return dispatch(gVar, this.f26695e, this);
    }

    public int getType() {
        return 973;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f26694d.onSceneEnd(i2, i3, str, this);
    }
}
