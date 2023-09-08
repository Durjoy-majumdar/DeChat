package kr0;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

public class b$$l implements ValueCallback<String> {
    public b$$l(C88256b bVar) {
    }

    public void onReceiveValue(Object obj) {
        Log.m105929w("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "hy: eval WAService.js result %s", (String) obj);
    }
}
