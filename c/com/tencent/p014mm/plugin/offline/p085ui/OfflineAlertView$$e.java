package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$e */
public class OfflineAlertView$$e implements View.OnTouchListener {
    public OfflineAlertView$$e(OfflineAlertView offlineAlertView) {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/offline/ui/OfflineAlertView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/offline/ui/OfflineAlertView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
