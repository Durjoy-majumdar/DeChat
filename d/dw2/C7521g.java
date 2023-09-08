package dw2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Vector;
import ob0.C11385n;
import ob0.C117747y;
import vl0.C90830d;

/* renamed from: dw2.g */
public final class C7521g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f25787d;

    static {
        new Vector();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f25787d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public String getInfo() {
        return null;
    }

    public int getType() {
        return C90830d.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.StoryCgi.NetSceneStoryUserPage", this + " netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str + " source:" + 0);
        throw null;
    }
}
