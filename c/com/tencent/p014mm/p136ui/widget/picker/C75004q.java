package com.tencent.p014mm.p136ui.widget.picker;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.p136ui.widget.picker.C75005r;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.picker.q */
public class C75004q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75005r f220685d;

    public C75004q(C75005r rVar) {
        this.f220685d = rVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/picker/MultiPicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75005r.C75009b bVar = this.f220685d.f220700o;
        C104428a aVar = this.f220685d.f220686a;
        if (aVar != null) {
            aVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MultiPicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
