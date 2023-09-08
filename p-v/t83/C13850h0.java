package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: t83.h0 */
public class C13850h0 implements ValueCallback<String> {
    public C13850h0(C48590l lVar) {
    }

    public void onReceiveValue(Object obj) {
        Log.m105925i("MicroMsg.JsApiHandler", "sys:bridged back %s\t", (String) obj);
    }
}
