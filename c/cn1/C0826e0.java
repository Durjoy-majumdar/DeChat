package cn1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: cn1.e0 */
public final class C0826e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f1941d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f1942e;

    /* renamed from: f */
    public final /* synthetic */ C0810b0 f1943f;

    public C0826e0(BaseFinderFeed baseFinderFeed, C60905o oVar, C0810b0 b0Var) {
        this.f1941d = baseFinderFeed;
        this.f1942e = oVar;
        this.f1943f = b0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(this.f1941d, (long) this.f1942e.mo17363j(), "94");
        C0810b0 b0Var = this.f1943f;
        C87412m.m108593f(this.f1942e.f173499A, "holder.context");
        long itemId = this.f1941d.getItemId();
        b0Var.f1893h.invoke(Long.valueOf(itemId), this.f1941d.mo3513o().getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
