package cn1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: cn1.c1 */
public final class C0817c1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f1913d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f1914e;

    /* renamed from: f */
    public final /* synthetic */ C0807a1 f1915f;

    public C0817c1(BaseFinderFeed baseFinderFeed, C60905o oVar, C0807a1 a1Var) {
        this.f1913d = baseFinderFeed;
        this.f1914e = oVar;
        this.f1915f = a1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RelatedLivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(this.f1913d, (long) this.f1914e.mo17363j(), "94");
        C0807a1 a1Var = this.f1915f;
        C87412m.m108593f(this.f1914e.f173499A, "holder.context");
        long itemId = this.f1913d.getItemId();
        a1Var.f1885h.invoke(Long.valueOf(itemId), this.f1913d.mo3513o().getUserName());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RelatedLivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
