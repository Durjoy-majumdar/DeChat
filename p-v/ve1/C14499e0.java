package ve1;

import android.content.Context;
import android.view.View;
import cm1.C55034v;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.e0 */
public final class C14499e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40190d;

    /* renamed from: e */
    public final /* synthetic */ C55034v f40191e;

    /* renamed from: f */
    public final /* synthetic */ C14680x f40192f;

    public C14499e0(C60905o oVar, C55034v vVar, C14680x xVar) {
        this.f40190d = oVar;
        this.f40191e = vVar;
        this.f40192f = xVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshNickName$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58784w3.f168295a.mo83932g1(this.f40190d, this.f40191e.f154508w.getFeedObject(), (Integer) null)) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            Context context = this.f40190d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C58417y0.Iy0((C58417y0) c, context, true, false, 1, false, 4, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshNickName$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C14680x xVar = this.f40192f;
        Context context2 = this.f40190d.f173499A;
        C87412m.m108593f(context2, "holder.context");
        xVar.mo13866k(context2, this.f40191e.f154508w, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshNickName$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
