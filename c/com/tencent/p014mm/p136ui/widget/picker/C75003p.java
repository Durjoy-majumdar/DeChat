package com.tencent.p014mm.p136ui.widget.picker;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.p136ui.widget.picker.C75005r;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.picker.p */
public class C75003p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75005r f220684d;

    public C75003p(C75005r rVar) {
        this.f220684d = rVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/picker/MultiPicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75005r rVar = this.f220684d;
        ArrayList<Integer> a = rVar.f220699n.mo104572a();
        C75005r.C75009b bVar = rVar.f220700o;
        if (bVar != null) {
            bVar.mo97346a(true, a);
        }
        C104428a aVar = this.f220684d.f220686a;
        if (aVar != null) {
            aVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MultiPicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
