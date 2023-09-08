package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.u0 */
public final class C2145u0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f12115d;

    public C2145u0(MultiProcessMMKV multiProcessMMKV) {
        this.f12115d = multiProcessMMKV;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$testLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f12115d.encode("clear", true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$testLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
