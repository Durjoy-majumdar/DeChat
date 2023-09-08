package nm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: nm1.a */
public final class C11224a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f33078d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f33079e;

    /* renamed from: f */
    public final /* synthetic */ C11226c f33080f;

    public C11224a(BaseFinderFeed baseFinderFeed, C60905o oVar, C11226c cVar) {
        this.f33078d = baseFinderFeed;
        this.f33079e = oVar;
        this.f33080f = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(this.f33078d, (long) this.f33079e.mo17363j(), "94");
        C11226c cVar = this.f33080f;
        C87412m.m108593f(this.f33079e.f173499A, "holder.context");
        long itemId = this.f33078d.getItemId();
        cVar.f33087h.invoke(Long.valueOf(itemId), this.f33078d.mo3513o().getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
