package com.tencent.p014mm.plugin.finder.webview;

import android.view.View;
import android.webkit.WebView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import ea3.C45601r;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.webview.f0 */
public class C41630f0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ WebViewLongClickHelper f112069d;

    public C41630f0(WebViewLongClickHelper webViewLongClickHelper) {
        this.f112069d = webViewLongClickHelper;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        WebViewLongClickHelper webViewLongClickHelper = this.f112069d;
        C45601r rVar = new C45601r();
        webViewLongClickHelper.f112006h = rVar;
        rVar.f123327e = 1;
        rVar.f123323a = System.currentTimeMillis();
        Log.m105926v("MicroMsg.WebViewLongClickHelper", "registerForContextMenu normal view long click");
        WebViewLongClickHelper webViewLongClickHelper2 = this.f112069d;
        webViewLongClickHelper2.f111999a.clear();
        webViewLongClickHelper2.f112002d = null;
        webViewLongClickHelper2.f112001c = null;
        ((ScanCodeSheetItemLogic) webViewLongClickHelper2.f112005g).mo67083n();
        if (this.f112069d.mo64769f().getWebView() == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        WebViewLongClickHelper webViewLongClickHelper3 = this.f112069d;
        if (!webViewLongClickHelper3.mo64771h()) {
            try {
                if (view instanceof WebView) {
                    WebView.HitTestResult hitTestResult = webViewLongClickHelper3.mo64769f().getWebView().getHitTestResult();
                    if (hitTestResult != null) {
                        if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                            webViewLongClickHelper3.mo64774k(hitTestResult);
                        }
                    }
                } else if (view instanceof MMWebView) {
                    WebView.HitTestResult hitTestResult2 = ((MMWebView) view).getHitTestResult();
                    if (hitTestResult2 != null) {
                        if (hitTestResult2.getType() == 5 || hitTestResult2.getType() == 8) {
                            webViewLongClickHelper3.mo64773j(hitTestResult2);
                        }
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu exp %s", e.getMessage());
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
