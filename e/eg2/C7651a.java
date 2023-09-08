package eg2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: eg2.a */
public final class C7651a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f25983d;

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f25983d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 602;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.Radar.NetSceneRadarRelationChain", "netId:%d errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f25983d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
