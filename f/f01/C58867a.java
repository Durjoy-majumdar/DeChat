package f01;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C75592q0;
import gy3.C87412m;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C64226a81;
import te3.C64381fz0;
import te3.C64408gz0;

/* renamed from: f01.a */
public final class C58867a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f168501d;

    /* renamed from: e */
    public C64381fz0 f168502e;

    /* renamed from: f */
    public C64408gz0 f168503f;

    /* renamed from: g */
    public C11385n f168504g;

    public C58867a(String str) {
        C87412m.m108594g(str, "ticket");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64381fz0();
        bVar.f127067b = new C64408gz0();
        bVar.f127069d = 4261;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetauthorization";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f168501d = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetAuthorizationRequest");
        C64381fz0 fz02 = (C64381fz0) aVar;
        this.f168502e = fz02;
        fz02.f183262i = 3;
        fz02.f183258e = C75592q0.m90778h();
        this.f168502e.f183260g = str;
        setHasCallbackToQueue(true);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetScreenCastAuthorization", "doScene");
        this.f168504g = nVar;
        return dispatch(gVar, this.f168501d, this);
    }

    public int getType() {
        return 4261;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C64226a81 a812;
        Log.m105925i("MicroMsg.NetSceneGetScreenCastAuthorization", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C87412m.m108592e(uVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetAuthorizationResponse");
        this.f168503f = (C64408gz0) aVar;
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105920e("MicroMsg.NetSceneGetScreenCastAuthorization", "onGYNetEnd error");
            Log.m105924i("MicroMsg.CastReportHelper", "markScreenCastFailedNetSceneCallbackFailedReport");
            C115669n.INSTANCE.mo175913w(1634, 2, 1);
        }
        C64408gz0 gz02 = this.f168503f;
        if (gz02 != null && (a812 = gz02.f183381e) != null) {
            C11385n nVar = this.f168504g;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
            }
            Log.m105924i("MicroMsg.NetSceneGetScreenCastAuthorization", "response is " + a812.f182038d + " and " + a812.f182039e + " and " + a812.f182040f);
            Intent intent = new Intent();
            intent.putExtra("remoteConfig", a812.f182038d);
            intent.putExtra("pc_ip", a812.f182039e);
            intent.putExtra("phone_ip", a812.f182040f);
            Log.m105924i("MicroMsg.CastReportHelper", "markScreenCastNetSceneCallbackSuccReport");
            C115669n.INSTANCE.mo175913w(1634, 3, 1);
            C88144b.m109791i(MMApplicationContext.getContext(), "cast", ".ui.ScreenCastActivity", intent, (Bundle) null);
        }
    }
}
