package af2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49254ea0;
import te3.C49638h1;
import te3.C51106rg3;
import te3.C51241sg3;
import te3.C52029xv3;

/* renamed from: af2.l */
public class C39557l extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106192d;

    /* renamed from: e */
    public C47350c f106193e;

    /* renamed from: f */
    public String f106194f;

    /* renamed from: g */
    public LinkedList<C49254ea0> f106195g;

    /* renamed from: h */
    public LinkedList<C49638h1> f106196h;

    public C39557l(LinkedList<C52029xv3> linkedList, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51106rg3();
        bVar.f127067b = new C51241sg3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/presubmitorder";
        bVar.f127069d = 554;
        int i2 = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106193e = a;
        C51106rg3 rg32 = (C51106rg3) a.f127055a.f127080a;
        rg32.f140910e = linkedList;
        rg32.f140909d = linkedList != null ? linkedList.size() : i2;
        rg32.f140911f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106192d = nVar;
        return dispatch(gVar, this.f106193e, this);
    }

    public int getType() {
        return 554;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        C51241sg3 sg32 = (C51241sg3) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0 && sg32.f141499g == 0) {
            Log.m105918d("MicroMsg.NetSceneMallPreSubmitOrder", "resp.ExpressCount " + sg32.f141496d);
            Log.m105918d("MicroMsg.NetSceneMallPreSubmitOrder", "resp.LockId " + sg32.f141498f);
            this.f106195g = sg32.f141497e;
            this.f106194f = sg32.f141498f;
            this.f106196h = sg32.f141501i;
        }
        if (i3 == 0 && (i4 = sg32.f141499g) != 0) {
            str = sg32.f141500h;
            i3 = i4;
        }
        Log.m105918d("MicroMsg.NetSceneMallPreSubmitOrder", "errCode " + i3 + ", errMsg " + str);
        this.f106192d.onSceneEnd(i2, i3, str, this);
    }
}
