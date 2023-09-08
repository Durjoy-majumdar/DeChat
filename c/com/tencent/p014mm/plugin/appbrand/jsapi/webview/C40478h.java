package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.xweb.WebResourceRequest;
import org.json.JSONObject;
import rq0.C90087f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.h */
public interface C40478h extends C90087f {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.h$a */
    public interface C40479a {
    }

    /* renamed from: E */
    void mo63228E(String str);

    /* renamed from: G0 */
    void mo63229G0();

    /* renamed from: a1 */
    void mo63230a1(String str, int i, String str2);

    void destroy();

    /* renamed from: f */
    void mo63232f(Context context);

    /* renamed from: g0 */
    void mo63233g0(C40479a aVar);

    Context getAndroidContext();

    View getAndroidView();

    String getAppId();

    int getBinderID();

    C83107f getController();

    int getCoverViewId();

    String getCurrentUrl();

    String[] getJsApiReportArgs();

    C83780d1 getPageView();

    MMWebView getWebView();

    /* renamed from: h1 */
    void mo63244h1(String str);

    /* renamed from: i1 */
    void mo63245i1(String str);

    /* renamed from: k */
    boolean mo63246k();

    /* renamed from: l1 */
    boolean mo63247l1();

    /* renamed from: m0 */
    void mo63248m0(JSONObject jSONObject);

    /* renamed from: o1 */
    void mo63249o1(String str);

    boolean post(Runnable runnable);

    /* renamed from: r1 */
    boolean mo63251r1();

    void runOnUiThread(Runnable runnable);

    void setAndroidViewId(int i);

    void setCoverViewId(int i);

    /* renamed from: y */
    void mo63255y(String str, WebResourceRequest webResourceRequest);
}
