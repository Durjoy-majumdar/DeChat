package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.product.ui.HtmlTextView2 */
public class HtmlTextView2 extends MMWebView {

    /* renamed from: t */
    public WebViewClient f115270t = new C42597b(this);

    /* renamed from: com.tencent.mm.plugin.product.ui.HtmlTextView2$a */
    public class C42596a implements View.OnTouchListener {
        public C42596a(HtmlTextView2 htmlTextView2) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/HtmlTextView2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            boolean z = motionEvent.getAction() == 2;
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/product/ui/HtmlTextView2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.HtmlTextView2$b */
    public class C42597b extends WebViewClient {
        public C42597b(HtmlTextView2 htmlTextView2) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.m105918d(APMidasPayAPI.ENV_TEST, str);
            return true;
        }
    }

    public HtmlTextView2(Context context, AttributeSet attributeSet, int i) {
        super(MMApplicationContext.getContext(), attributeSet, i);
        mo66707a0();
    }

    /* renamed from: a0 */
    public final void mo66707a0() {
        setOnTouchListener(new C42596a(this));
        setVerticalScrollBarEnabled(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        getSettings().setDefaultTextEncodingName("utf-8");
    }

    public void setText(String str) {
        setWebViewClient((WebViewClient) null);
        loadData(str, "text/html", "utf-8");
        setWebViewClient(this.f115270t);
    }

    public HtmlTextView2(Context context, AttributeSet attributeSet) {
        super(MMApplicationContext.getContext(), attributeSet);
        mo66707a0();
    }
}
