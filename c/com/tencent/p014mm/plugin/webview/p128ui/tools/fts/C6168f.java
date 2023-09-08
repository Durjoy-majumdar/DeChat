package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.f */
public class C6168f implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f22633d;

    public C6168f(BaseSearchWebViewUI baseSearchWebViewUI, boolean z) {
        this.f22633d = z;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean z = this.f22633d;
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/webview/ui/tools/fts/BaseSearchWebViewUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
