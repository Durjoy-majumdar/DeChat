package lz2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: lz2.i */
public final class C10698i extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f32138d;

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f32138d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 6284;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneTextStatusGetTopicShowInfos", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        throw null;
    }
}
