package com.tencent.p014mm.p136ui.widget.picker;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.picker.d */
public class C74997d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19877i f220678d;

    public C74997d(C19877i iVar) {
        this.f220678d = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/picker/MMDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C19877i iVar = this.f220678d;
        int year = iVar.f56637n.getYear();
        int month = this.f220678d.f56637n.getMonth();
        int dayOfMonth = this.f220678d.f56637n.getDayOfMonth();
        C19877i.C19878a aVar = iVar.f56638o;
        if (aVar != null) {
            aVar.onResult(true, year, month, dayOfMonth);
        }
        this.f220678d.mo26532b();
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MMDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
