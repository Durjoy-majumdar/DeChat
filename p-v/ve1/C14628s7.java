package ve1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ve1.s7 */
public final class C14628s7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14651u7 f40472d;

    /* renamed from: e */
    public final /* synthetic */ View f40473e;

    /* renamed from: f */
    public final /* synthetic */ BaseFinderFeed f40474f;

    public C14628s7(C14651u7 u7Var, View view, BaseFinderFeed baseFinderFeed) {
        this.f40472d = u7Var;
        this.f40473e = view;
        this.f40474f = baseFinderFeed;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14651u7 u7Var = this.f40472d;
        Context context = this.f40473e.getContext();
        C87412m.m108593f(context, "holder.context");
        BaseFinderFeed baseFinderFeed = this.f40474f;
        C14651u7.m13989y(u7Var, context, baseFinderFeed, baseFinderFeed.mo3513o().getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
