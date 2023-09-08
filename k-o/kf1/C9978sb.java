package kf1;

import android.content.Context;
import android.view.View;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64311db1;

/* renamed from: kf1.sb */
public final class C9978sb implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f30660d;

    /* renamed from: e */
    public final /* synthetic */ C64311db1 f30661e;

    public C9978sb(View view, C64311db1 db12) {
        this.f30660d = view;
        this.f30661e = db12;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$refreshHeader$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58784w3 w3Var = C58784w3.f168295a;
        Context context = this.f30660d.getContext();
        C87412m.m108593f(context, "context");
        w3Var.mo83920c1(context, this.f30661e, true, 5);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$refreshHeader$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
