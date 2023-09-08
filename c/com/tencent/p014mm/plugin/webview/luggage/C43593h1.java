package com.tencent.p014mm.plugin.webview.luggage;

import android.view.View;
import android.webkit.WebView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.luggage.h1 */
public class C43593h1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuggageWebViewLongClickHelper f117836d;

    public C43593h1(LuggageWebViewLongClickHelper luggageWebViewLongClickHelper) {
        this.f117836d = luggageWebViewLongClickHelper;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Log.m105926v("MicroMsg.LuggageWebViewLongClickHelper", "registerForContextMenu normal view long click");
        LuggageWebViewLongClickHelper luggageWebViewLongClickHelper = this.f117836d;
        luggageWebViewLongClickHelper.f117779a = null;
        luggageWebViewLongClickHelper.f117783e = null;
        luggageWebViewLongClickHelper.f117782d = null;
        ((ScanCodeSheetItemLogic) luggageWebViewLongClickHelper.f117786h).mo67083n();
        LuggageWebViewLongClickHelper luggageWebViewLongClickHelper2 = this.f117836d;
        if (luggageWebViewLongClickHelper2.f117787i == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        luggageWebViewLongClickHelper2.getClass();
        try {
            if (view instanceof WebView) {
                WebView.HitTestResult hitTestResult = luggageWebViewLongClickHelper2.f117787i.f117947q.getHitTestResult();
                if (hitTestResult != null) {
                    if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                        luggageWebViewLongClickHelper2.mo67865d(hitTestResult);
                    }
                }
            } else if (view instanceof MMWebView) {
                WebView.HitTestResult hitTestResult2 = ((MMWebView) view).getHitTestResult();
                if (hitTestResult2 != null) {
                    if (hitTestResult2.getType() == 5 || hitTestResult2.getType() == 8) {
                        luggageWebViewLongClickHelper2.mo67864c(hitTestResult2);
                    }
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.LuggageWebViewLongClickHelper", "onCreateContextMenu exp %s", e.getMessage());
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
