package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.q */
public class C70573q implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ MobileRemittanceUI f204035d;

    public C70573q(MobileRemittanceUI mobileRemittanceUI) {
        this.f204035d = mobileRemittanceUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f204035d.handleKeyboardTouchEvent(motionEvent);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
