package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.s */
public final class C44357s implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ HalfScreenWebView f120212d;

    public C44357s(HalfScreenWebView halfScreenWebView) {
        this.f120212d = halfScreenWebView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f120212d.mo68877K();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
