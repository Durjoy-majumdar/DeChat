package com.tencent.p014mm.plugin.finder.feed;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ur1.C65468g;

/* renamed from: com.tencent.mm.plugin.finder.feed.f */
public final class C2639f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f13490d;

    public C2639f(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        this.f13490d = finderCommentDrawerPresenter;
    }

    public final void onClick(View view) {
        Context context;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        C58684b bVar = (C58684b) c;
        C65468g gVar = this.f13490d.f158622n;
        if (gVar != null) {
            context = gVar.f188411s;
            if (context == null) {
                C87412m.m108603p("context");
                throw null;
            }
        } else {
            context = null;
        }
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        bVar.qy0((Activity) context, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
