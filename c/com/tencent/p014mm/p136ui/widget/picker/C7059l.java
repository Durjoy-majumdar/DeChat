package com.tencent.p014mm.p136ui.widget.picker;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C7061n;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.picker.l */
public class C7059l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7061n f24885d;

    public C7059l(C7061n nVar) {
        this.f24885d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/picker/MMTimePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7061n.C7062a aVar = this.f24885d.f24895o;
        if (aVar != null) {
            aVar.mo7432a(false, null);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MMTimePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
