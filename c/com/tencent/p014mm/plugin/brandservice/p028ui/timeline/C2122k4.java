package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.k4 */
public class C2122k4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f12088d;

    public C2122k4(BizTimeLineUI bizTimeLineUI) {
        this.f12088d = bizTimeLineUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BizTimeLineUI.m18783H7(this.f12088d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
