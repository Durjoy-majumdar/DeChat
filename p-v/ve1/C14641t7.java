package ve1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ve1.t7 */
public final class C14641t7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14651u7 f40507d;

    /* renamed from: e */
    public final /* synthetic */ View f40508e;

    /* renamed from: f */
    public final /* synthetic */ BaseFinderFeed f40509f;

    public C14641t7(C14651u7 u7Var, View view, BaseFinderFeed baseFinderFeed) {
        this.f40507d = u7Var;
        this.f40508e = view;
        this.f40509f = baseFinderFeed;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14651u7 u7Var = this.f40507d;
        Context context = this.f40508e.getContext();
        C87412m.m108593f(context, "holder.context");
        BaseFinderFeed baseFinderFeed = this.f40509f;
        C14651u7.m13989y(u7Var, context, baseFinderFeed, baseFinderFeed.mo3513o().getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
