package kk2;

import android.util.Base64;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49853ij;
import te3.C49997jj;

/* renamed from: kk2.a */
public final class C46730a extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f125804d = "MicroMsg.Rtos.NetSceneBuildDeviceSecureChannel";

    /* renamed from: e */
    public C11385n f125805e;

    /* renamed from: f */
    public C47350c f125806f;

    public C46730a() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49853ij();
        bVar.f127067b = new C49997jj();
        bVar.f127068c = "/cgi-bin/mmiot-bin/mmiot/mmiot_build_device_secure_channel";
        bVar.f127069d = 5043;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f125806f = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125805e = nVar;
        return dispatch(gVar, this.f125806f, this);
    }

    public int getType() {
        return 5043;
    }

    /* renamed from: j1 */
    public final C89349b mo71963j1(String str) {
        C87412m.m108594g(str, "base64");
        try {
            return new C89349b(Base64.decode(str, 0));
        } catch (Exception e) {
            Log.m105921e(this.f125804d, "decodeBase64.:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: k1 */
    public final C49997jj mo71964k1() {
        C47350c cVar = this.f125806f;
        if (cVar != null) {
            C87412m.m108591d(cVar);
            if (cVar.f127056b.f127083a != null) {
                C47350c cVar2 = this.f125806f;
                C87412m.m108591d(cVar2);
                C47465a aVar = cVar2.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BuildDeviceSecureChannelResp");
                return (C49997jj) aVar;
            }
        }
        return null;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f125804d;
        Log.m105924i(str2, "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + ' ' + str);
        C11385n nVar = this.f125805e;
        C87412m.m108591d(nVar);
        nVar.onSceneEnd(i2, i3, str, this);
    }
}
