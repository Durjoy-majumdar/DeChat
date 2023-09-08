package com.tencent.p014mm.p136ui.widget.picker;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C7061n;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.tencent.mm.ui.widget.picker.k */
public class C7058k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7061n f24884d;

    public C7058k(C7061n nVar) {
        this.f24884d = nVar;
    }

    public void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/picker/MMTimePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7061n nVar = this.f24884d;
        CustomTimePickerNew customTimePickerNew = nVar.f24894n;
        if (customTimePickerNew == null) {
            str = null;
        } else {
            customTimePickerNew.f24842e.mo35391g();
            str = String.format(Locale.US, "%02d:%02d", new Object[]{Integer.valueOf(customTimePickerNew.f24850p), Integer.valueOf(customTimePickerNew.f24851q)});
        }
        C7061n.C7062a aVar = nVar.f24895o;
        if (aVar != null) {
            aVar.mo7432a(true, str);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/picker/MMTimePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
