package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import com.tencent.p014mm.storage.C19613h1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.a1 */
public final class C29725a1 implements View.OnClickListener {

    /* renamed from: d */
    public static final C29725a1 f80730d = new C29725a1();

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$testNativeFinder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C19613h1.m21053z("finderbiztest_missed_multi_case1.xml", false);
        C19613h1.m21053z("finderbiztest_missed_multi_case2.xml", false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$testNativeFinder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
