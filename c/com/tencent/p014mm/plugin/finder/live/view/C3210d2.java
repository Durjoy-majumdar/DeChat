package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.live.view.d2 */
public final class C3210d2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SimpleLivingCardView f15324d;

    /* renamed from: e */
    public final /* synthetic */ FinderItem f15325e;

    public C3210d2(SimpleLivingCardView simpleLivingCardView, FinderItem finderItem) {
        this.f15324d = simpleLivingCardView;
        this.f15325e = finderItem;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SimpleLivingCardView.m3134a(this.f15324d, this.f15325e.getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
