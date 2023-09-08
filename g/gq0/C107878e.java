package gq0;

import android.view.WindowManager;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.OpenMaterialJsBridge;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.OpenMaterialWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebViewClient;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: gq0.e */
public final class C107878e extends C87413o implements C32226l<OpenMaterialWebView, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107869a f323037d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107878e(C107869a aVar) {
        super(1);
        this.f323037d = aVar;
    }

    public Object invoke(Object obj) {
        OpenMaterialWebView openMaterialWebView = (OpenMaterialWebView) obj;
        C87412m.m108594g(openMaterialWebView, "$this$$receiver");
        openMaterialWebView.mo63292c0((WebChromeClient) null, (WebViewClient) null);
        boolean z = C85875k4.m106211z();
        Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "buildHybridBottomSheet, isDarkMode: " + z);
        openMaterialWebView.getSettings().setForceDarkMode(z ? 2 : 0);
        Object systemService = openMaterialWebView.getContext().getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        openMaterialWebView.setConfigCallback((WindowManager) systemService);
        OpenMaterialJsBridge openMaterialJsBridge = new OpenMaterialJsBridge(openMaterialWebView);
        C107869a aVar = this.f323037d;
        C107877d dVar = new C107877d(aVar);
        openMaterialJsBridge.setLaunchWeAppDelegate(new C107872b(aVar, dVar));
        openMaterialJsBridge.setWeAppExposureDelegate(new C107875c(dVar, aVar));
        openMaterialWebView.addJavascriptInterface(openMaterialJsBridge, "OpenMaterialJsApi");
        C107869a aVar2 = this.f323037d;
        aVar2.getClass();
        Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync");
        ((C119157j) C119157j.f356862d).mo183875f(new C107887h(openMaterialJsBridge, aVar2, openMaterialWebView));
        this.f323037d.f323016j = openMaterialJsBridge;
        return C13598b0.f38549a;
    }
}
