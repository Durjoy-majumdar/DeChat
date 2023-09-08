package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.live.view.c2 */
public final class C3208c2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SimpleLivingCardView f15321d;

    /* renamed from: e */
    public final /* synthetic */ FinderItem f15322e;

    public C3208c2(SimpleLivingCardView simpleLivingCardView, FinderItem finderItem) {
        this.f15321d = simpleLivingCardView;
        this.f15322e = finderItem;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SimpleLivingCardView.m3134a(this.f15321d, this.f15322e.getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
