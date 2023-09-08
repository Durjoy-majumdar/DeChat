package com.tencent.p014mm.p136ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$o */
public class AppAttachNewDownloadUI$$o implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f215150d;

    public AppAttachNewDownloadUI$$o(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f215150d = appAttachNewDownloadUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$22", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f215150d.f56019Z0 = (int) motionEvent.getRawX();
            this.f215150d.f56020a1 = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$22", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
