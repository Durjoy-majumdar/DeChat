package pz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: pz0.e */
public class C12023e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f35018d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f35018d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 1132;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", 1132, Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        Log.m105921e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f35018d.onSceneEnd(i2, i3, str, this);
    }
}
