package com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageStartSoterAuthentication$1 */
class JsApiLuggageStartSoterAuthentication$1 extends ResultReceiver {
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == -1) {
            Log.m105924i("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter auth ok");
            throw null;
        } else if (i == 1) {
            Log.m105928w("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter auth failed");
            throw null;
        } else {
            Log.m105920e("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter user cancelled");
            throw null;
        }
    }
}
