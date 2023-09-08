package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64499kq0;
import tf0.C13883o1;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.n */
public final class C55844n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveHistoryUI f159054d;

    /* renamed from: e */
    public final /* synthetic */ C64499kq0 f159055e;

    public C55844n(FinderLiveHistoryUI finderLiveHistoryUI, C64499kq0 kq02) {
        this.f159054d = finderLiveHistoryUI;
        this.f159055e = kq02;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveHistoryUI$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C13883o1.class);
        C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
        AppCompatActivity context = this.f159054d.getContext();
        C87412m.m108593f(context, "context");
        C64499kq0 kq02 = this.f159055e;
        ((C13883o1) c).Uq0((Intent) null, context, kq02.f183974d, kq02.f183975e, "", (String) null, "", (String) null, "");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveHistoryUI$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
