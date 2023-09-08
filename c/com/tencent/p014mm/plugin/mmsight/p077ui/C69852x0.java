package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.x0 */
public class C69852x0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f201540d;

    public C69852x0(SightCaptureUI sightCaptureUI) {
        this.f201540d = sightCaptureUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SightCaptureUI sightCaptureUI = this.f201540d;
        if (sightCaptureUI.f313870i != null) {
            sightCaptureUI.mo150352U7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
