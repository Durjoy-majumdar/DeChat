package we1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: we1.b */
public final class C15159b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f41291d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f41292e;

    /* renamed from: f */
    public final /* synthetic */ C15155a f41293f;

    public C15159b(BaseFinderFeed baseFinderFeed, C60905o oVar, C15155a aVar) {
        this.f41291d = baseFinderFeed;
        this.f41292e = oVar;
        this.f41293f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(this.f41291d, (long) this.f41292e.mo17363j(), "94");
        C15155a aVar = this.f41293f;
        C87412m.m108593f(this.f41292e.f173499A, "holder.context");
        BaseFinderFeed baseFinderFeed = this.f41291d;
        aVar.f41282h.invoke(baseFinderFeed, baseFinderFeed.mo3513o().getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
