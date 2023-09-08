package ag2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import sf0.C48374j0;

/* renamed from: ag2.b0 */
public class C39567b0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106216d;

    /* renamed from: e */
    public C47350c f106217e;

    /* renamed from: f */
    public int f106218f;

    /* renamed from: g */
    public int f106219g;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106216d = nVar;
        if (Util.isNullOrNil((String) null)) {
            Log.m105920e("MicroMsg.NetSceneUploadFie", "doScene, filePath is null");
            return -1;
        } else if (!C86013q1.m106450k((String) null)) {
            Log.m105921e("MicroMsg.NetSceneUploadFie", "doScene, file: %s not exist", null);
            return -1;
        } else {
            if (this.f106219g == 0) {
                int l = (int) C86013q1.m106451l((String) null);
                this.f106219g = l;
                Log.m105925i("MicroMsg.NetSceneUploadFie", "doScene, totalLen: %d", Integer.valueOf(l));
            }
            int min = Math.min(this.f106219g - this.f106218f, 32768);
            Log.m105925i("MicroMsg.NetSceneUploadFie", "doScene, startPos: %d, dataLen: %d", Integer.valueOf(this.f106218f), Integer.valueOf(min));
            byte[] O = C86013q1.m106433O((String) null, this.f106218f, min);
            if (O == null) {
                Log.m105920e("MicroMsg.NetSceneUploadFie", "doScene, read file buf is null");
                return -1;
            }
            Log.m105925i("MicroMsg.NetSceneUploadFie", "doScene, buf.length: %d", Integer.valueOf(O.length));
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C39593n0();
            bVar.f127067b = new C39594o0();
            bVar.f127068c = "/cgi-bin/micromsg-bin/uploadfile";
            bVar.f127069d = 484;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f106217e = a;
            C39593n0 n0Var = (C39593n0) a.f127055a.f127080a;
            n0Var.f106271d = null;
            n0Var.f106272e = this.f106219g;
            n0Var.f106273f = this.f106218f;
            n0Var.f106274g = min;
            n0Var.f106275h = C48374j0.m53712a(O);
            int dispatch = dispatch(gVar, this.f106217e, this);
            Log.m105925i("MicroMsg.NetSceneUploadFie", "doScene, ret: %d", Integer.valueOf(dispatch));
            return dispatch;
        }
    }

    public int getType() {
        return 484;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C39594o0 o0Var = (C39594o0) ((C47350c) uVar).f127056b.f127083a;
            String str2 = o0Var.f106279g;
            Log.m105925i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, clientId: %s, totalLen: %d, attachId: %s", str2, Integer.valueOf(o0Var.f106278f), o0Var.f106277e);
            if (str2.equals((Object) null)) {
                int i4 = o0Var.f106276d;
                this.f106218f = i4;
                if (i4 < this.f106219g) {
                    Log.m105925i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", Integer.valueOf(i4), Integer.valueOf(this.f106219g));
                    if (doScene(dispatcher(), this.f106216d) < 0) {
                        Log.m105920e("MicroMsg.NetSceneUploadFie", "continue to upload fail");
                        C11385n nVar = this.f106216d;
                        if (nVar != null) {
                            nVar.onSceneEnd(i2, i3, str, this);
                            return;
                        }
                        return;
                    }
                }
                Log.m105925i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, finish upload, startPos: %d, totalLen: %d, attachId: %s", Integer.valueOf(this.f106218f), Integer.valueOf(this.f106219g), o0Var.f106277e);
                C11385n nVar2 = this.f106216d;
                if (nVar2 != null) {
                    nVar2.onSceneEnd(i2, i3, str, this);
                    return;
                }
                return;
            }
            return;
        }
        C11385n nVar3 = this.f106216d;
        if (nVar3 != null) {
            nVar3.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 640;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        if (!Util.isNullOrNil((String) null) && C86013q1.m106450k((String) null)) {
            return y$$d.EOk;
        }
        Log.m105920e("MicroMsg.NetSceneUploadFie", "securityVerificationChecked failed, file not exist");
        return y$$d.EFailed;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }
}
