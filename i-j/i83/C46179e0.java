package i83;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.modeltools.C43741b;
import com.tencent.p014mm.plugin.webview.modeltools.C43758q;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86301e;
import e00.C45517q0;
import e00.C45520t;
import ea3.C45598m;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import j93.C46450c;
import j93.C46451d;
import java.util.HashSet;
import java.util.Set;
import o40.C61926c;
import p248ug.C52572q0;
import t83.C13853i;
import t83.C48590l;
import tm0.C90538k;
import u93.C52492d;
import u93.C52494f;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: i83.e0 */
public class C46179e0 extends C86301e implements C52572q0 {

    /* renamed from: d */
    public static final HashSet<String> f124482d;

    static {
        HashSet<String> hashSet = new HashSet<>();
        f124482d = hashSet;
        hashSet.add("preVerifyJSAPI");
        hashSet.add("openUrlWithExtraWebview");
        hashSet.add(JsApiGetInstallState.NAME);
        hashSet.add("launchApplication");
        hashSet.add("getBrandWCPayRequest");
        hashSet.add("geoLocation");
        hashSet.add(Scopes.PROFILE);
        hashSet.add(JsApiInstallDownloadTask.NAME);
        hashSet.add(JsApiPauseDownloadTask.NAME);
        hashSet.add(JsApiAddDownloadTask.NAME);
        hashSet.add(JsApiAddDownloadTaskStraight.NAME);
        hashSet.add(JsApiResumeDownloadTask.NAME);
        hashSet.add(JsApiQueryDownloadTask.NAME);
        hashSet.add("addContact");
        hashSet.add("quicklyAddBrandContact");
        hashSet.add("requestBindPhoneNumber");
        hashSet.add("openWeApp");
        hashSet.add("checkJsApi");
        hashSet.add(C90538k.NAME);
        hashSet.add("launchAppByScheme");
        hashSet.add("jumpToBizProfile");
        hashSet.add("openCustomerServiceChat");
    }

    /* renamed from: E3 */
    public void mo71609E3(String str, boolean z) {
        C87412m.m108594g(str, "url");
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preloadWebView url:" + str + " reset:" + z);
        if (z) {
            C61926c.m72668M(C52492d.f146644d);
        }
        C61926c.m72668M(new C52494f(str));
    }

    /* renamed from: HS */
    public String mo71610HS(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String domainString = WeChatHosts.domainString(C0966R.string.f360885fm3);
        Uri parse = Uri.parse(str);
        if (parse == null || !Util.isEqual(parse.getHost(), domainString)) {
            return null;
        }
        String nullAs = Util.nullAs(parse.getQueryParameter("__biz"), "");
        String nullAs2 = Util.nullAs(parse.getQueryParameter("mid"), "");
        String nullAs3 = Util.nullAs(parse.getQueryParameter("idx"), "");
        if (nullAs.length() <= 0 || nullAs2.length() <= 0 || nullAs3.length() <= 0) {
            return null;
        }
        return Util.safeFormatString("id://local/i.html?__biz=%s&mid=%s&idx=%s", nullAs, nullAs2, nullAs3);
    }

    /* renamed from: Q3 */
    public BaseWebViewController mo71611Q3(MMWebView mMWebView, C45520t.C45522b bVar, C13853i iVar) {
        return new C43522y(mMWebView, new C43704h2(), bVar, (Set<String>) null, iVar);
    }

    /* renamed from: U1 */
    public C48590l mo71612U1(MMWebView mMWebView) {
        try {
            if (mMWebView instanceof MMWebViewWithJsApi) {
                return ((MMWebViewWithJsApi) mMWebView).getJsapi();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bq */
    public C46451d mo71613bq(C46450c cVar) {
        return new WebViewLongClickHelper(cVar);
    }

    /* renamed from: e0 */
    public boolean mo71614e0(Activity activity, int i, int i2, Intent intent) {
        return new C43741b().mo68049a(activity, i, i2, intent);
    }

    /* renamed from: f1 */
    public void mo71615f1(Activity activity, String str) {
        new C43741b().mo68050c(activity, str);
    }

    /* renamed from: fj */
    public int mo71616fj(Context context, C43791l lVar, String str) {
        return C45598m.m50660b(context, lVar, str);
    }

    /* renamed from: t3 */
    public C45517q0 mo71617t3() {
        return new C43758q();
    }

    /* renamed from: u3 */
    public C45520t mo71618u3(MMWebView mMWebView, int i) {
        C45520t.C45522b bVar = new C45520t.C45522b((C45520t.C45523c) null, false, false, false, false, 0, false, 127, (C8480h) null);
        bVar.f123184f = i;
        return new C43522y(mMWebView, new C43704h2(), bVar, f124482d, (C13853i) null);
    }
}
