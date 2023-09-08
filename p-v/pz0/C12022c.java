package pz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: pz0.c */
public class C12022c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f35017d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f35017d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 1051;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", 1051, Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        this.f35017d.onSceneEnd(i2, i3, str, this);
    }
}
