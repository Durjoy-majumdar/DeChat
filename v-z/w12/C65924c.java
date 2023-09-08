package w12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import pe3.C47465a;
import te3.C48832bb0;
import te3.C64229ab0;

/* renamed from: w12.c */
public final class C65924c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f189523d;

    /* renamed from: e */
    public C47350c f189524e;

    public C65924c(String str, String str2, int i, boolean z, String str3, String str4, String str5) {
        C87412m.m108594g(str, "nickName");
        C87412m.m108594g(str2, "bindMobile");
        C87412m.m108594g(str3, "extRegUrl");
        C87412m.m108594g(str4, "fileId");
        C87412m.m108594g(str5, "aesKey");
        Log.m105918d("MicroMsg.NetSceneExtReg", "NetSceneExtReg: nickname = " + str + ", bindMobile = " + str2 + ", regMode = " + i + ", hasAvatar=" + z + ", extRegUrl:" + str3);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64229ab0();
        bVar.f127067b = new C48832bb0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/extreg";
        bVar.f127069d = 5888;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f189524e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
        C64229ab0 ab02 = (C64229ab0) aVar;
        ab02.f182058d = str;
        ab02.f182059e = str2;
        ab02.f182060f = i;
        ab02.f182061g = z ? 1 : 0;
        ab02.f182064j = str3;
        ab02.f182065n = str4;
        ab02.f182066o = str5;
        Log.m105924i("MicroMsg.NetSceneExtReg", "fileId:" + str4 + ", aesKey:" + str5);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "autoAuth");
        C87412m.m108594g(nVar, "callback");
        this.f189523d = nVar;
        return dispatch(gVar, this.f189524e, this);
    }

    public int getType() {
        return 5888;
    }

    /* renamed from: j1 */
    public final void mo89958j1(String str) {
        if (!Util.isNullOrNil(str)) {
            C47465a aVar = this.f189524e.f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
            ((C64229ab0) aVar).f182062h = str;
            Log.m105925i("MicroMsg.NetSceneExtReg", "setRegSessionId %s", str);
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C87412m.m108594g(uVar, "rr");
        C47350c cVar = (C47350c) uVar;
        C47465a aVar = cVar.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
        C64229ab0 ab02 = (C64229ab0) aVar;
        C47465a aVar2 = cVar.f127056b.f127083a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
        C48832bb0 bb02 = (C48832bb0) aVar2;
        C11385n nVar = this.f189523d;
        C87412m.m108591d(nVar);
        nVar.onSceneEnd(i2, i3, str, this);
        Log.m105924i("MicroMsg.NetSceneExtReg", "errType:" + i2 + ", errCode:" + i3 + ", errType:" + str);
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        C87412m.m108594g(uVar, "rr");
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C87412m.m108594g(y__c, "e");
    }
}
