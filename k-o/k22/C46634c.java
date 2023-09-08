package k22;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.URL;

/* renamed from: k22.c */
public final class C46634c implements C83165i {

    /* renamed from: d */
    public C46635d f125569d = new C46635d();

    /* renamed from: P0 */
    public void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript URL:%s script:%s cacheCategory:%s cacheKey:%s cacheType:%d", String.valueOf(url), str3, str, str2, Integer.valueOf(i));
    }

    /* renamed from: R0 */
    public void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript URL:%s script:%s ", String.valueOf(url), str);
    }

    public void addJavascriptInterface(Object obj, String str) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandJsRuntime", "addJavascriptInterface name:%s ", str);
    }

    public void destroy() {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandJsRuntime", "destroy");
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        Log.m105925i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript script:%s ", str);
    }

    /* renamed from: n0 */
    public <T extends C40481j> T mo63321n0(Class<T> cls) {
        Log.m105924i("WxaLiteApp.LiteAppAppBrandJsRuntime", "getAddon");
        return this.f125569d;
    }

    public void setJsExceptionHandler(C83164h hVar) {
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(hVar != null ? hVar.hashCode() : 0);
        Log.m105925i("WxaLiteApp.LiteAppAppBrandJsRuntime", "setJsExceptionHandler handler:%s ", objArr);
    }
}
