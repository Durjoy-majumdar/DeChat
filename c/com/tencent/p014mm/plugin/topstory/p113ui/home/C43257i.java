package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.i */
public class C43257i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryHomeUIComponentImpl f117056d;

    public C43257i(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl) {
        this.f117056d = topStoryHomeUIComponentImpl;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f117056d.mo24898e();
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
