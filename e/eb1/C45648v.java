package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.y$$c;
import ob0.y$$d;
import te3.C49510g33;
import te3.up4;
import te3.vp4;

/* renamed from: eb1.v */
public class C45648v extends C45645r implements C116765c {

    /* renamed from: g */
    public final C114799u f123440g;

    /* renamed from: h */
    public String f123441h = "";

    public C45648v(long j, String str, String str2) {
        C45635e eVar = new C45635e();
        this.f123440g = eVar;
        up4 up4 = ((C45638k) eVar.getReqObj()).f123418a;
        up4.f143020d = C45645r.f123433f;
        up4.f143021e = j;
        up4.f143024h = str2;
        up4.f143023g = str;
    }

    /* renamed from: F */
    public String mo71155F() {
        return this.f123441h;
    }

    public int getType() {
        return 930;
    }

    /* renamed from: j1 */
    public int mo71157j1(C114770g gVar, C11385n nVar) {
        C45638k kVar = (C45638k) this.f123440g.getReqObj();
        return dispatch(gVar, this.f123440g, this);
    }

    /* renamed from: k1 */
    public C49510g33 mo71158k1(C114799u uVar) {
        return ((C45639l) uVar.getRespObj()).f123419a.f143618e;
    }

    /* renamed from: l1 */
    public void mo71159l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        vp4 vp4;
        Log.m105918d("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        C45639l lVar = (C45639l) uVar.getRespObj();
        if (i2 == 0 && i3 == 0) {
            vp4 vp42 = lVar.f123419a;
            boolean z = vp42.f143619f == 0;
            this.f123441h = vp42.f143617d;
            Log.m105925i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: is verify ok: %b, youtuRet: %d, has random pwd: %b", Boolean.valueOf(z), Integer.valueOf(lVar.f123419a.f143619f), Boolean.valueOf(true ^ Util.isNullOrNil(this.f123441h)));
            i3 = lVar.f123419a.f143619f;
        } else if (!(lVar == null || (vp4 = lVar.f123419a) == null || vp4.f143619f == 0)) {
            Log.m105924i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: has detail ret. use");
            i3 = lVar.f123419a.f143619f;
        }
        this.f123434e.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: m1 */
    public void mo71160m1(String str) {
        ((C45638k) this.f123440g.getReqObj()).f123418a.f143020d = str;
    }

    /* renamed from: o0 */
    public boolean mo71156o0() {
        return true;
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }
}
