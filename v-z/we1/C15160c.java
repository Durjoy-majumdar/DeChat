package we1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: we1.c */
public final class C15160c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f41294d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f41295e;

    /* renamed from: f */
    public final /* synthetic */ C15155a f41296f;

    public C15160c(BaseFinderFeed baseFinderFeed, C60905o oVar, C15155a aVar) {
        this.f41294d = baseFinderFeed;
        this.f41295e = oVar;
        this.f41296f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(this.f41294d, (long) this.f41295e.mo17363j(), "94");
        C15155a aVar = this.f41296f;
        C87412m.m108593f(this.f41295e.f173499A, "holder.context");
        BaseFinderFeed baseFinderFeed = this.f41294d;
        aVar.f41282h.invoke(baseFinderFeed, baseFinderFeed.mo3513o().getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
