package t83;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

public class l$$o implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ String f130069a;

    public l$$o(C48590l lVar, String str) {
        this.f130069a = str;
    }

    public void onReceiveValue(Object obj) {
        Log.m105925i("MicroMsg.JsApiHandler", "handle url %s, re %s", this.f130069a, (String) obj);
    }
}
