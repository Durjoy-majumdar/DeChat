package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50616o0;
import te3.C50761p0;
import te3.C51854wn;

/* renamed from: hz0.p */
public class C46155p extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124419d;

    /* renamed from: e */
    public C11385n f124420e;

    /* renamed from: f */
    public String f124421f;

    /* renamed from: g */
    public int f124422g;

    /* renamed from: h */
    public String f124423h;

    public C46155p(LinkedList<C51854wn> linkedList, int i, String str, String str2, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50616o0();
        bVar.f127067b = new C50761p0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/acceptcardlistfromapp";
        bVar.f127069d = 1049;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124419d = a;
        C50616o0 o0Var = (C50616o0) a.f127055a.f127080a;
        o0Var.f138867d = linkedList;
        o0Var.f138868e = i;
        o0Var.f138870g = str;
        o0Var.f138869f = str2;
        o0Var.f138871h = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124420e = nVar;
        return dispatch(gVar, this.f124419d, this);
    }

    public int getType() {
        return 1049;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C50761p0 p0Var = (C50761p0) this.f124419d.f127056b.f127083a;
            this.f124421f = p0Var.f139472d;
            this.f124422g = p0Var.f139473e;
            this.f124423h = p0Var.f139474f;
            Log.m105920e("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, ret_code = " + this.f124422g + " ret_msg = " + this.f124423h);
        }
        this.f124420e.onSceneEnd(i2, i3, str, this);
    }
}
