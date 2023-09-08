package com.tencent.p014mm.p136ui.widget.picker;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.picker.e */
public class C74998e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19877i f220679d;

    public C74998e(C19877i iVar) {
        this.f220679d = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/picker/MMDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C19877i.C19878a aVar = this.f220679d.f56638o;
        if (aVar != null) {
            aVar.onResult(false, 0, 0, 0);
        }
        this.f220679d.mo26532b();
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MMDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
