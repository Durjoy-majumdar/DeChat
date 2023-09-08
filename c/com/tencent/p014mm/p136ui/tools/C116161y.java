package com.tencent.p014mm.p136ui.tools;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.y */
public class C116161y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f348616d;

    public C116161y(CropImageNewUI cropImageNewUI) {
        this.f348616d = cropImageNewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/CropImageNewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f348616d.f348468h.mo177442b();
        C117292a.m165361g(this, "com/tencent/mm/ui/tools/CropImageNewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
