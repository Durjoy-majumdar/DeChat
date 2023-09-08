package com.tencent.p014mm.plugin.webview.luggage;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$j */
public class n$$j implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C43658n f117978d;

    public n$$j(C43658n nVar) {
        this.f117978d = nVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/luggage/LuggageMMWebPage$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f117978d.f117953w.isShown()) {
            this.f117978d.f117953w.mo68983a();
        }
        if (motionEvent.getAction() == 0) {
            this.f117978d.f117929R0 = (int) motionEvent.getRawX();
            this.f117978d.f117931S0 = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/luggage/LuggageMMWebPage$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
