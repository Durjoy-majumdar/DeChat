package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import com.tencent.p014mm.storage.C19613h1;
import j20.C117292a;
import java.util.ArrayList;
import ox0.C21904a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.y0 */
public final class C29805y0 implements View.OnClickListener {

    /* renamed from: d */
    public static final C29805y0 f80815d = new C29805y0();

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$testNativeFinder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C21904a aVar = C21904a.f61955a;
        C19613h1.m21053z("finderbiztest_list_case1.xml", false);
        aVar.mo34944a("finderbiztest_list_case1.xml");
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$testNativeFinder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
