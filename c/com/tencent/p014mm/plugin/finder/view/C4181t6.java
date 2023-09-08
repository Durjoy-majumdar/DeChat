package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.t6 */
public final class C4181t6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ HorizontalVideoPreviewLayout f18438d;

    public C4181t6(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
        this.f18438d = horizontalVideoPreviewLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f18438d.mo4789e();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
