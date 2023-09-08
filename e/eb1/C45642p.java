package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.y$$c;
import ob0.y$$d;
import te3.C49510g33;
import te3.C49884iq3;
import te3.C50024jq3;

/* renamed from: eb1.p */
public class C45642p extends C45645r implements C116765c {

    /* renamed from: g */
    public final C114799u f123428g;

    /* renamed from: h */
    public String f123429h = "";

    public C45642p(long j, String str, String str2) {
        C45634d dVar = new C45634d();
        this.f123428g = dVar;
        C49884iq3 iq32 = ((C45636i) dVar.getReqObj()).f123416a;
        iq32.f135593g = C45645r.f123433f;
        iq32.f135590d = j;
        iq32.f135591e = str;
        iq32.f135592f = str2;
    }

    /* renamed from: F */
    public String mo71155F() {
        return this.f123429h;
    }

    public int getType() {
        return 930;
    }

    /* renamed from: j1 */
    public int mo71157j1(C114770g gVar, C11385n nVar) {
        C45636i iVar = (C45636i) this.f123428g.getReqObj();
        return dispatch(gVar, this.f123428g, this);
    }

    /* renamed from: k1 */
    public C49510g33 mo71158k1(C114799u uVar) {
        return ((C45637j) uVar.getRespObj()).f123417a.f136259e;
    }

    /* renamed from: l1 */
    public void mo71159l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C50024jq3 jq32;
        Log.m105918d("MicroMsg.NetSceneFaceRegFaceRsa", "hy: onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        C45637j jVar = (C45637j) uVar.getRespObj();
        if (i2 == 0 && i3 == 0) {
            C50024jq3 jq33 = jVar.f123417a;
            int i4 = jq33.f136260f;
            boolean z = i4 == 0;
            this.f123429h = jq33.f136258d;
            Log.m105925i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: is verify ok: %b, youtuRet; %d, has random pwd: %b", Boolean.valueOf(z), Integer.valueOf(jVar.f123417a.f136260f), Boolean.valueOf(true ^ Util.isNullOrNil(this.f123429h)));
            i3 = i4;
        } else if (!(jVar == null || (jq32 = jVar.f123417a) == null || jq32.f136260f == 0)) {
            Log.m105924i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: has detail ret. use");
            i3 = jVar.f123417a.f136260f;
        }
        this.f123434e.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: m1 */
    public void mo71160m1(String str) {
        ((C45636i) this.f123428g.getReqObj()).f123416a.f135593g = str;
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
