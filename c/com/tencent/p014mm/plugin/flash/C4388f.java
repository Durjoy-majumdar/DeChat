package com.tencent.p014mm.plugin.flash;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.flash.f */
public class C4388f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashProcessLayout f19025d;

    public C4388f(FaceFlashProcessLayout faceFlashProcessLayout) {
        this.f19025d = faceFlashProcessLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19025d.f18889d.mo5241M7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
