package p830xc;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.page.C40525w2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebExtendInterface;
import com.tencent.xweb.XWebSdk;
import java.util.Locale;
import p1000ld.C88480a;
import p572jd.C108707f;
import p817kd.C88140c;
import p817kd.C88141d;
import p980id.C87697c;

/* renamed from: xc.d */
public class C91167d {
    /* renamed from: a */
    public static C88140c m114400a(WebView webView, C88141d dVar, C87697c cVar, C40525w2 w2Var) {
        if (!XWebSdk.isCurrentVersionSupportExtendPluginForAppbrand()) {
            Log.m105928w("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, current version not support extend plugin");
            return null;
        }
        if (webView == null || !webView.isXWalkKernel()) {
            Log.m105924i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, current webview is not xweb kernel");
        } else {
            View webViewUI = webView.getWebViewUI();
            if (!(webViewUI instanceof XWebExtendInterface) || dVar == null) {
                Log.m105924i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, set extend plugin client fail");
            } else {
                XWebExtendInterface xWebExtendInterface = (XWebExtendInterface) webViewUI;
                C88140c createClientProxy = dVar.createClientProxy();
                C91166c cVar2 = new C91166c(xWebExtendInterface);
                cVar2.f261398a = createClientProxy;
                createClientProxy.mo122543b(cVar2);
                xWebExtendInterface.setExtendPluginClient(cVar2);
                if (w2Var != null) {
                    C88480a aVar = new C88480a(xWebExtendInterface);
                    aVar.f255565a = w2Var;
                    xWebExtendInterface.setExtendTextAreaClient(aVar);
                    C108707f fVar = new C108707f(xWebExtendInterface);
                    fVar.f325555e = w2Var;
                    xWebExtendInterface.setExtendInputClient(fVar);
                }
                if (cVar != null) {
                    createClientProxy.mo122545d(cVar);
                }
                Log.m105924i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, set extend plugin client success");
                return createClientProxy;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m114401b(C88140c cVar, String str, int i) {
        if (cVar != null && cVar.mo122544c() != null) {
            Log.m105925i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyPluginScreenshot, %s#%d", str, Integer.valueOf(i));
            cVar.mo122544c().takePluginScreenshot(str, i);
        }
    }

    /* renamed from: c */
    public static void m114402c(C88140c cVar, String str, int i, float f, float f2) {
        if (cVar != null && cVar.mo122544c() != null) {
            Log.m105925i("MicroMsg.SameLayer.WebViewExtendPluginUtil", "applyPluginTextureScale, %s#%d, scale:[%s,%s]", str, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2));
            cVar.mo122544c().setPluginTextureScale(str, i, f, f2);
        }
    }

    /* renamed from: d */
    public static String m114403d(String str, int i) {
        return String.format(Locale.US, "%s#%d", new Object[]{str, Integer.valueOf(i)});
    }
}
