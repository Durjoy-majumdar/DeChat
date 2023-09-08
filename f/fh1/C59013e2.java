package fh1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import cj1.C54741c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C9493c;

/* renamed from: fh1.e2 */
public final class C59013e2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168845d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f168846e;

    public C59013e2(C59018f2 f2Var, ViewGroup viewGroup) {
        this.f168845d = f2Var;
        this.f168846e = viewGroup;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C59018f2 f2Var = this.f168845d;
        C9493c cVar = f2Var.f168863A;
        C54741c cVar2 = cVar instanceof C54741c ? (C54741c) cVar : null;
        if (cVar2 != null) {
            Context context = this.f168846e.getContext();
            C87412m.m108593f(context, "root.context");
            C59018f2.m68936m3(f2Var, context, cVar2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
