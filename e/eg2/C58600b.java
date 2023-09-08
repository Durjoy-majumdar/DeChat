package eg2;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76706g;
import pe3.C47465a;
import te3.C50423mm3;
import te3.C64496km3;
import te3.C64527lm3;

/* renamed from: eg2.b */
public final class C58600b extends C117747y implements C1311n {

    /* renamed from: d */
    public final int f167778d;

    /* renamed from: e */
    public final float f167779e;

    /* renamed from: f */
    public final float f167780f;

    /* renamed from: g */
    public final int f167781g;

    /* renamed from: h */
    public final int f167782h;

    /* renamed from: i */
    public final String f167783i;

    /* renamed from: j */
    public final String f167784j;

    /* renamed from: n */
    public C11385n f167785n;

    /* renamed from: o */
    public C47350c f167786o;

    public C58600b(int i, float f, float f2, int i2, int i3, String str, String str2) {
        C87412m.m108594g(str, "macAddr");
        C87412m.m108594g(str2, "cellId");
        this.f167778d = i;
        this.f167779e = f;
        this.f167780f = f2;
        this.f167781g = i2;
        this.f167782h = i3;
        this.f167783i = str;
        this.f167784j = str2;
        if (i == 0) {
            Log.m105920e("MicroMsg.NetSceneRadarSearch", "opcode is wrong!");
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f167785n = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64527lm3();
        bVar.f127067b = new C50423mm3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmradarsearch";
        bVar.f127069d = 425;
        bVar.f127070e = 209;
        bVar.f127071f = 1000000209;
        C47350c a = bVar.mo72403a();
        this.f167786o = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RadarSearchRequest");
        C64527lm3 lm32 = (C64527lm3) aVar;
        lm32.f184114d = this.f167778d;
        lm32.f184119i = this.f167784j;
        lm32.f184120j = this.f167782h;
        lm32.f184116f = this.f167779e;
        lm32.f184115e = this.f167780f;
        lm32.f184118h = this.f167783i;
        lm32.f184117g = this.f167781g;
        return dispatch(gVar, this.f167786o, this);
    }

    public int getType() {
        return 425;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        LinkedList<C64496km3> linkedList;
        Log.m105918d("MicroMsg.NetSceneRadarSearch", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        if (this.f167778d == 1 && i2 == 0) {
            ArrayList arrayList = new ArrayList();
            C47350c cVar = this.f167786o;
            C50423mm3 mm32 = null;
            C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
            if (aVar instanceof C50423mm3) {
                mm32 = (C50423mm3) aVar;
            }
            if (!(mm32 == null || (linkedList = mm32.f138110g) == null)) {
                for (C64496km3 next : linkedList) {
                    C68097n nVar = new C68097n();
                    C87412m.m108593f(next, "member");
                    String str2 = next.f183957d;
                    if (str2 == null && (str2 = next.f183961h) == null) {
                        str2 = "";
                    }
                    nVar.f195728a = str2;
                    nVar.f195731d = next.f183960g;
                    nVar.f195733f = 1;
                    arrayList.add(nVar);
                }
            }
            ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93609jo(arrayList);
        }
        C11385n nVar2 = this.f167785n;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
