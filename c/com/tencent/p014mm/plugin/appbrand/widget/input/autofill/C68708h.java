package com.tencent.p014mm.plugin.appbrand.widget.input.autofill;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.h */
public class C68708h implements AdapterView.OnItemSelectedListener {

    /* renamed from: d */
    public final /* synthetic */ AutoFillListPopupWindowBase f197384d;

    public C68708h(AutoFillListPopupWindowBase autoFillListPopupWindowBase) {
        this.f197384d = autoFillListPopupWindowBase;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        AutoFillListPopupWindowBase.C68700a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (!(i == -1 || (aVar = this.f197384d.f197359d) == null)) {
            aVar.f197376d = false;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
