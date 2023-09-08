package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: rb0.r0 */
public class C12968r0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f36993d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f36993d = nVar;
        Log.m105924i("MicroMsg.NetSceneKFGetDefaultList", "do scene");
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 672;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneKFGetDefaultList", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f36993d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
