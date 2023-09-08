package wn1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bl3.C39818r;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import rx3.C13604l;
import sx3.C90364q0;
import tf0.C13883o1;
import tn1.C14051a;
import un1.C65411a;

/* renamed from: wn1.b */
public final class C15552b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f42145d;

    /* renamed from: e */
    public final /* synthetic */ C14051a f42146e;

    public C15552b(C60905o oVar, C14051a aVar) {
        this.f42145d = oVar;
        this.f42146e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindFinderInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39818r rVar = C39818r.f106831a;
        Context context = this.f42145d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C65411a aVar = (C65411a) rVar.mo62443b(context).mo75002a(C65411a.class);
        C13604l[] lVarArr = new C13604l[3];
        C14051a aVar2 = this.f42146e;
        boolean z = false;
        lVarArr[0] = new C13604l("finderuin", aVar2.f39416x);
        lVarArr[1] = new C13604l("current_page", "order_list");
        String str = aVar2.f39399d.f137197d;
        if (str == null) {
            str = "";
        }
        lVarArr[2] = new C13604l("order_id", str);
        aVar.mo89492c3("enter_finder_profile", C90364q0.m113147f(lVarArr));
        if (this.f42146e.f39416x.length() == 0) {
            z = true;
        }
        if (!z) {
            Intent intent = new Intent();
            intent.putExtra("finder_username", this.f42146e.f39416x);
            Context context2 = this.f42145d.f173499A;
            C87412m.m108593f(context2, "holder.context");
            ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13272V1(context2, intent);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindFinderInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
