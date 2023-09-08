package nm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: nm1.b */
public final class C11225b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f33081d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f33082e;

    /* renamed from: f */
    public final /* synthetic */ C11226c f33083f;

    public C11225b(BaseFinderFeed baseFinderFeed, C60905o oVar, C11226c cVar) {
        this.f33081d = baseFinderFeed;
        this.f33082e = oVar;
        this.f33083f = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(this.f33081d, (long) this.f33082e.mo17363j(), "94");
        C11226c cVar = this.f33083f;
        C87412m.m108593f(this.f33082e.f173499A, "holder.context");
        long itemId = this.f33081d.getItemId();
        cVar.f33087h.invoke(Long.valueOf(itemId), this.f33081d.mo3513o().getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
