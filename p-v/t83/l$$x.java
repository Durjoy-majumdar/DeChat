package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$x implements ValueCallback<String> {
    public l$$x(C48590l lVar) {
    }

    public void onReceiveValue(Object obj) {
        Log.m105925i("MicroMsg.JsApiHandler", "sys:updateRandomStr back %s\t", (String) obj);
    }
}
