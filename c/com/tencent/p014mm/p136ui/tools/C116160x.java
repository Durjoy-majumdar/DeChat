package com.tencent.p014mm.p136ui.tools;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.x */
public class C116160x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f348615d;

    public C116160x(CropImageNewUI cropImageNewUI) {
        this.f348615d = cropImageNewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/CropImageNewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f348615d.f348468h.mo177441a();
        C117292a.m165361g(this, "com/tencent/mm/ui/tools/CropImageNewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
