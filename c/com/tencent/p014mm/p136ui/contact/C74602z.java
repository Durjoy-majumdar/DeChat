package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import android.widget.AdapterView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.z */
public class C74602z implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactRemarkImagePreviewUI f219266d;

    public C74602z(ContactRemarkImagePreviewUI contactRemarkImagePreviewUI) {
        this.f219266d = contactRemarkImagePreviewUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkImagePreviewUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (!this.f219266d.isTitleShowing()) {
            this.f219266d.showTitleView();
        } else {
            this.f219266d.hideTitleView();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkImagePreviewUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
