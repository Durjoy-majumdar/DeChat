package com.tencent.p014mm.plugin.appbrand.jsruntime;

import android.webkit.ValueCallback;
import java.net.URL;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.i */
public interface C83165i extends C40482o {
    /* renamed from: P0 */
    void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback);

    /* renamed from: R0 */
    void mo63304R0(URL url, String str, ValueCallback<String> valueCallback);

    void addJavascriptInterface(Object obj, String str);

    void destroy();

    /* renamed from: n0 */
    <T extends C40481j> T mo63321n0(Class<T> cls);

    void setJsExceptionHandler(C83164h hVar);
}
