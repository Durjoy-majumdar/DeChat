package ag2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;

/* renamed from: ag2.x */
public class C39601x extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106322d;

    /* renamed from: e */
    public int f106323e;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106322d = nVar;
        if (Util.isNullOrNil((String) null)) {
            Log.m105920e("MicroMsg.NetSceneComposeSend", "doScene, sendContent is null");
            return -1;
        }
        int min = Math.min(0 - this.f106323e, 32768);
        Log.m105925i("MicroMsg.NetSceneComposeSend", "doScene, dataLen: %d", Integer.valueOf(min));
        byte[] bArr = new byte[min];
        throw null;
    }

    public int getType() {
        return 485;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f106323e = ((C39580g) ((C47350c) uVar).f127056b.f127083a).f106244d;
            C11385n nVar = this.f106322d;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
            }
            int i4 = this.f106323e;
            if (i4 < 0) {
                Log.m105925i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", Integer.valueOf(i4), 0);
                doScene(dispatcher(), this.f106322d);
                Log.m105920e("MicroMsg.NetSceneComposeSend", "continue to upload fail");
                return;
            }
            Log.m105924i("MicroMsg.NetSceneComposeSend", "finished upload");
            return;
        }
        C11385n nVar2 = this.f106322d;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 100;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        if (!Util.isNullOrNil((String) null)) {
            return y$$d.EOk;
        }
        Log.m105920e("MicroMsg.NetSceneComposeSend", "securityVerificationChecked failed, content is null");
        return y$$d.EFailed;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }
}
