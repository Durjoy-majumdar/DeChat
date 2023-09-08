package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.f0 */
public class C72601f0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SDKOAuthUI f211220d;

    public C72601f0(SDKOAuthUI sDKOAuthUI) {
        this.f211220d = sDKOAuthUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f211220d.f249414g = (int) motionEvent.getRawX();
            this.f211220d.f249415h = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
