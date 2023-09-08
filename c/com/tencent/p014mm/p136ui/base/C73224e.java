package com.tencent.p014mm.p136ui.base;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.base.MMListPopupWindow;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.base.e */
public class C73224e implements AdapterView.OnItemSelectedListener {

    /* renamed from: d */
    public final /* synthetic */ MMListPopupWindow f215012d;

    public C73224e(MMListPopupWindow mMListPopupWindow) {
        this.f215012d = mMListPopupWindow;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        MMListPopupWindow.C73168a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/MMListPopupWindow$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (!(i == -1 || (aVar = this.f215012d.f214825i) == null)) {
            aVar.f214839d = false;
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/base/MMListPopupWindow$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
