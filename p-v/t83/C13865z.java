package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.z */
public class C13865z implements ValueCallback<String> {
    public C13865z(C48590l lVar) {
    }

    public void onReceiveValue(Object obj) {
        Log.m105925i("MicroMsg.JsApiHandler", "sys:init back %s\t", (String) obj);
    }
}
