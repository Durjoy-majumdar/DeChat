package m23;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49722hm;
import te3.C64368fm;
import te3.C64400gm;
import z04.C119027c;

/* renamed from: m23.q */
public final class C61436q extends C117747y implements C1311n {

    /* renamed from: d */
    public final int f174693d;

    /* renamed from: e */
    public int f174694e;

    /* renamed from: f */
    public C89349b f174695f;

    /* renamed from: g */
    public C47350c f174696g;

    /* renamed from: h */
    public ArrayList<C64368fm> f174697h = new ArrayList<>();

    /* renamed from: i */
    public boolean f174698i;

    /* renamed from: j */
    public String f174699j = "";

    /* renamed from: n */
    public C11385n f174700n;

    public C61436q(int i, C89349b bVar, int i2, int i3, int i4, C89349b bVar2) {
        this.f174693d = i;
        this.f174694e = i2;
        this.f174695f = bVar2;
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127066a = new C64400gm();
        bVar3.f127067b = new C49722hm();
        bVar3.f127068c = "/cgi-bin/micromsg-bin/mmccvoicetrans";
        bVar3.f127069d = 3835;
        bVar3.f127070e = 0;
        bVar3.f127071f = 0;
        C47350c a = bVar3.mo72403a();
        this.f174696g = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransRequest");
        C64400gm gmVar = (C64400gm) aVar;
        if (this.f174695f == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append(hashCode());
            byte[] bytes = sb.toString().getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            this.f174695f = new C89349b(bytes, 0, bytes.length);
        }
        gmVar.f183345d = this.f174695f;
        gmVar.f183346e = this.f174694e;
        gmVar.f183347f = bVar;
        gmVar.f183348g = i3;
        gmVar.f183349h = i4;
        gmVar.f183350i = 10;
        if (bVar == null) {
            this.f174698i = true;
        } else if (bVar.f257327a.length + i3 >= i4) {
            this.f174698i = true;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetVideoCaption", "doScene");
        this.f174700n = nVar;
        return dispatch(gVar, this.f174696g, this);
    }

    public int getType() {
        return 3835;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetVideoCaption", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.NetSceneGetVideoCaption", "onGYNetEnd error");
        }
        this.f174697h.clear();
        ArrayList<C64368fm> arrayList = this.f174697h;
        C47465a aVar = this.f174696g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
        arrayList.addAll(((C49722hm) aVar).f134721d);
        C11385n nVar = this.f174700n;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
