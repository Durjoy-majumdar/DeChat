package com.tencent.p014mm.plugin.flash.action;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.flash.action.k */
public class C4379k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashActionProcessLayout f19011d;

    public C4379k(FaceFlashActionProcessLayout faceFlashActionProcessLayout) {
        this.f19011d = faceFlashActionProcessLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19011d.f18967d.mo5276M7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
