package lk0;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import sk0.C90215a;

/* renamed from: lk0.h */
public final class C88555h extends AdvertiseCallback {

    /* renamed from: a */
    public final /* synthetic */ C88552g f255774a;

    /* renamed from: b */
    public final /* synthetic */ int f255775b;

    /* renamed from: c */
    public final /* synthetic */ C82381f f255776c;

    public C88555h(C88552g gVar, int i, C82381f fVar) {
        this.f255774a = gVar;
        this.f255775b = i;
        this.f255776c = fVar;
    }

    public void onStartFailure(int i) {
        String str;
        super.onStartFailure(i);
        Log.m105920e("MicroMsg.BLE.JsApiStartBlePeripheralAdvertising", "Not broadcasting: " + i);
        if (i == 1) {
            str = "fail:data too large";
        } else if (i == 2) {
            str = "fail:too many advertisers";
        } else if (i == 3) {
            str = "fail:already started";
        } else if (i == 4) {
            str = "fail:internal error";
        } else if (i != 5) {
            str = "fail:Unhandled " + i + " error";
        } else {
            str = "fail:feature unsupported";
        }
        String str2 = str;
        Log.m105920e("MicroMsg.BLE.JsApiStartBlePeripheralAdvertising", "onStartFailure: error msg = " + str2);
        C90215a.m112929a(this.f255774a, this.f255775b, this.f255776c, 10008, str2, (HashMap) null, 16, (Object) null);
    }

    public void onStartSuccess(AdvertiseSettings advertiseSettings) {
        super.onStartSuccess(advertiseSettings);
        C90215a.m112930b(this.f255774a, this.f255775b, this.f255776c, (HashMap<String, Object>) null);
    }
}
