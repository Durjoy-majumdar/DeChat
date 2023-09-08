package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: jb2.d */
public final class C9287d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f29046d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29046d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 8141;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Mv.NetSceneMMListenCommentInfo", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        C11385n nVar = this.f29046d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
