package z22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.backgroundfetch.C1633a;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: z22.c */
public class C16096c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f43247d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f43247d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return C1633a.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetScenePushLoginUrl", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f43247d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
