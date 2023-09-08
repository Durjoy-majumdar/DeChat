package jk2;

import android.os.Bundle;
import android.util.Base64;
import c30.C104289g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import g02.C32291d;
import gy3.C87412m;
import kk2.C46730a;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import te3.C49216e14;
import te3.C49363f14;
import te3.C49997jj;

/* renamed from: jk2.a */
public final class C46558a implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ Bundle f125451d;

    /* renamed from: e */
    public final /* synthetic */ C46559b f125452e;

    /* renamed from: f */
    public final /* synthetic */ int f125453f;

    /* renamed from: g */
    public final /* synthetic */ C1256g<Bundle> f125454g;

    public C46558a(Bundle bundle, C46559b bVar, int i, C1256g<Bundle> gVar) {
        this.f125451d = bundle;
        this.f125452e = bVar;
        this.f125453f = i;
        this.f125454g = gVar;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        C89349b bVar;
        C49363f14 f142;
        String str3;
        String str4;
        Log.m105924i("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
        yVar.setHasCallbackToQueue(true);
        if (i == 0 && i2 == 0) {
            C46730a aVar = (C46730a) yVar;
            if (aVar.mo71964k1() == null) {
                Log.m105928w("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "ticketScene.getResp() == null");
            }
            Bundle bundle = this.f125451d;
            C46559b bVar2 = this.f125452e;
            C49997jj k1 = aVar.mo71964k1();
            bVar2.getClass();
            if (k1 == null) {
                str2 = "";
            } else {
                C104289g gVar = new C104289g();
                try {
                    gVar.mo145953n("resp_handshake_type_flag", k1.f136149g);
                    Log.m105919d("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "flag %d", Integer.valueOf(k1.f136149g));
                    int i3 = k1.f136149g;
                    if ((i3 & 1) != 0) {
                        C49216e14 e142 = k1.f136146d;
                        if (!(e142 == null || (str4 = e142.f132622e) == null)) {
                            gVar.put("signature_plain_json", str4);
                        }
                    } else if (!((i3 & 2) == 0 || (f142 = k1.f136147e) == null || (str3 = f142.f133243f) == null)) {
                        gVar.put("signature_plain_json", str3);
                    }
                    C49216e14 e143 = k1.f136146d;
                    C89349b bVar3 = null;
                    if (!(e143 == null || (bVar = e143.f132621d) == null)) {
                        gVar.put("ecdsa_signature", Base64.encodeToString(bVar.f257327a, 2));
                    }
                    C49363f14 f143 = k1.f136147e;
                    if (f143 != null) {
                        C89349b bVar4 = f143.f133241d;
                        if (bVar4 != null) {
                            gVar.put("hmac_signature", Base64.encodeToString(bVar4.f257327a, 2));
                        }
                        C49363f14 f144 = k1.f136147e;
                        if (f144 != null) {
                            bVar3 = f144.f133242e;
                        }
                        if (bVar3 != null) {
                            gVar.put("local_base_key", Base64.encodeToString(f144.f133242e.f257327a, 2));
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "parse json fail: %s", e);
                }
                str2 = gVar.toString();
                C87412m.m108593f(str2, "jsonObject.toString()");
            }
            C32291d.m39671d(bundle, "handshke", str2);
            C32291d.m39670c(this.f125451d, "code", i2);
            C32291d.m39670c(this.f125451d, "taskid", this.f125453f);
            C1256g<Bundle> gVar2 = this.f125454g;
            if (gVar2 != null) {
                gVar2.mo894a(this.f125451d);
                return;
            }
            return;
        }
        C32291d.m39670c(this.f125451d, "code", i2);
        C32291d.m39670c(this.f125451d, "taskid", this.f125453f);
        C1256g<Bundle> gVar3 = this.f125454g;
        if (gVar3 != null) {
            gVar3.mo894a(this.f125451d);
        }
        Log.m105924i("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "build channel Fail");
    }
}
