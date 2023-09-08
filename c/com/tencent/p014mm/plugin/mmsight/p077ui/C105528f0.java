package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import p206nj.C100115c;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.f0 */
public class C105528f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f313924d;

    public C105528f0(SightCaptureUI sightCaptureUI) {
        this.f313924d = sightCaptureUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C100115c cVar = this.f313924d.f313884x0;
        if (cVar != null) {
            cVar.mo139414a();
        }
        this.f313924d.mo150348Q7();
        this.f313924d.mo150344M7(true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
