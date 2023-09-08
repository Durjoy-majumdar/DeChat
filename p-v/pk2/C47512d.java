package pk2;

import android.os.Bundle;
import android.util.Base64;
import c30.C104289g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import f40.C86709a0;
import gy3.C87412m;
import kk2.C46731b;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C50830ph2;
import te3.C51910x12;

/* renamed from: pk2.d */
public final class C47512d<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f127483d;

    public C47512d(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f127483d = rtosWatchLoginUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C47465a aVar = null;
        String string = bundle != null ? bundle.getString("licence") : null;
        String string2 = bundle != null ? bundle.getString(TPDownloadProxyEnum.USER_DEVICE_ID) : null;
        if (Util.isNullOrNil(string)) {
            Log.m105928w("MicroMsg.Rtos.RtosWatchLoginUI", "get licence fail.");
            RtosWatchLoginUI rtosWatchLoginUI = this.f127483d;
            rtosWatchLoginUI.f53370y = 3;
            rtosWatchLoginUI.mo24206N7(3);
            return;
        }
        RtosWatchLoginUI rtosWatchLoginUI2 = this.f127483d;
        int i = RtosWatchLoginUI.f53343I;
        rtosWatchLoginUI2.getClass();
        if (WeChatEnvironment.isCoolassistEnv()) {
            Log.m105925i("MicroMsg.Rtos.RtosWatchLoginUI", "getOAuthTicket deviceId:%s json:%s", string2, string);
        } else {
            Log.m105925i("MicroMsg.Rtos.RtosWatchLoginUI", "getOAuthTicket deviceId:%s json:%s", string2, Util.secPrint(string));
        }
        try {
            C104289g gVar = new C104289g(string);
            int optInt = gVar.optInt("product_id", 0);
            int optInt2 = gVar.optInt("key_version", 0);
            String optString = gVar.optString("device_sn", "");
            C87412m.m108593f(optString, "jsonObject.optString(\"device_sn\", \"\")");
            String optString2 = gVar.optString("device_signature", "");
            C87412m.m108593f(optString2, "jsonObject.optString(\"device_signature\", \"\")");
            if (Util.isNullOrNil(string2)) {
                rtosWatchLoginUI2.f53370y = 4;
                rtosWatchLoginUI2.mo24206N7(4);
            } else if (C86709a0.m107524d().f256809d == null) {
                Log.m105928w("MicroMsg.Rtos.RtosWatchLoginUI", "dispatcher null");
                rtosWatchLoginUI2.f53370y = 6;
                rtosWatchLoginUI2.mo24206N7(6);
            } else {
                C46731b bVar = new C46731b();
                C87412m.m108591d(string2);
                String str = bVar.f125807d;
                Log.m105924i(str, "setAuthInfo productId:" + optInt + " deviceSn:" + optString + " deviceId:" + string2 + " deviceSignature:" + optString2);
                C47350c cVar = bVar.f125809f;
                if (cVar != null) {
                    aVar = cVar.f127055a.f127080a;
                }
                C51910x12 x122 = (C51910x12) aVar;
                if (x122 != null) {
                    C50830ph2 ph22 = new C50830ph2();
                    ph22.f139770g = optInt2;
                    ph22.f139769f = new C89349b(Base64.decode(optString2, 0));
                    ph22.f139768e = optString;
                    ph22.f139767d = optInt;
                    x122.f144402d = ph22;
                    int length = string2.length();
                    int i2 = length / 2;
                    byte[] bArr = new byte[i2];
                    for (int i3 = 0; i3 < length; i3 += 2) {
                        bArr[i3 / 2] = (byte) ((Character.digit(string2.charAt(i3), 16) << 4) + Character.digit(string2.charAt(i3 + 1), 16));
                    }
                    x122.f144403e = new C89349b(bArr, 0, i2);
                }
                C86709a0.m107529k().f251779b.mo123460f(bVar);
            }
        } catch (Exception unused) {
            rtosWatchLoginUI2.f53370y = 5;
            rtosWatchLoginUI2.mo24206N7(5);
        }
    }
}
