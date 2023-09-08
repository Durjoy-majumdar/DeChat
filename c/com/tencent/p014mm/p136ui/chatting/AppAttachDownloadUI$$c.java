package com.tencent.p014mm.p136ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI$$c */
public class AppAttachDownloadUI$$c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f121494d;

    public AppAttachDownloadUI$$c(AppAttachDownloadUI appAttachDownloadUI) {
        this.f121494d = appAttachDownloadUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachDownloadUI$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f121494d.f55952y0 = (int) motionEvent.getRawX();
            this.f121494d.f55918Q0 = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/AppAttachDownloadUI$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
