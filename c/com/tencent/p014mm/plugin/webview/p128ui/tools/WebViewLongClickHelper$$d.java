package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ea3.C45601r;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import u24.C90598g;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$d */
public class WebViewLongClickHelper$$d implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMWebView f118423d;

    /* renamed from: e */
    public final /* synthetic */ WebViewLongClickHelper f118424e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$d$a */
    public class C43809a implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ View f118425a;

        public C43809a(View view) {
            this.f118425a = view;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105925i("MicroMsg.WebViewLongClickHelper", "getWXLongPressImageEventConfig value %s", str);
            if (!Util.isNullOrNil(str)) {
                try {
                    boolean z = new JSONObject(C90598g.m113505d(str)).optInt("forbidForward", 0) == 1;
                    Map<String, Boolean> map = WebViewLongClickHelper.f118388r;
                    WebViewLongClickHelper webViewLongClickHelper = WebViewLongClickHelper$$d.this.f118424e;
                    ((HashMap) map).put(webViewLongClickHelper.mo68195i(webViewLongClickHelper.f118400i), Boolean.valueOf(z));
                    Log.m105919d("MicroMsg.WebViewLongClickHelper", "getWXLongPressImageEventConfig forbidForward %b", Boolean.valueOf(z));
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.WebViewLongClickHelper", "reportOnLeave, ex = %s", e.getMessage());
                }
            }
            WebViewLongClickHelper.m47785b(WebViewLongClickHelper$$d.this.f118424e, this.f118425a);
        }
    }

    public WebViewLongClickHelper$$d(WebViewLongClickHelper webViewLongClickHelper, MMWebView mMWebView) {
        this.f118424e = webViewLongClickHelper;
        this.f118423d = mMWebView;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        WebViewLongClickHelper webViewLongClickHelper = this.f118424e;
        C45601r rVar = new C45601r();
        webViewLongClickHelper.f118399h = rVar;
        rVar.f123327e = 1;
        rVar.f123323a = System.currentTimeMillis();
        Log.m105926v("MicroMsg.WebViewLongClickHelper", "registerForContextMenu normal view long click");
        WebViewLongClickHelper webViewLongClickHelper2 = this.f118424e;
        webViewLongClickHelper2.f118392a.clear();
        webViewLongClickHelper2.f118395d = null;
        webViewLongClickHelper2.f118394c = null;
        ((ScanCodeSheetItemLogic) webViewLongClickHelper2.f118398g).mo67083n();
        if (this.f118423d == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        WebViewLongClickHelper webViewLongClickHelper3 = this.f118424e;
        webViewLongClickHelper3.f118400i = WebViewLongClickHelper.m47784a(webViewLongClickHelper3);
        WebViewLongClickHelper webViewLongClickHelper4 = this.f118424e;
        if (!((HashMap) WebViewLongClickHelper.f118388r).containsKey(webViewLongClickHelper4.mo68195i(webViewLongClickHelper4.f118400i))) {
            String str = this.f118424e.f118400i;
            Class cls = C45696d.class;
            if ((str == null || C86709a0.m107533q(cls) == null) ? false : ((C45696d) C86709a0.m107533q(cls)).mo70989eQ(str)) {
                this.f118423d.evaluateJavascript("javascript:(typeof window.getWXLongPressImageEventConfig === 'function')?window.getWXLongPressImageEventConfig():{}", new C43809a(view));
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }
        WebViewLongClickHelper.m47785b(this.f118424e, view);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
