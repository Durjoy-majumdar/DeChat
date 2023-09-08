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

/* renamed from: ve1.z */
public final class C14703z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40650d;

    /* renamed from: e */
    public final /* synthetic */ C55034v f40651e;

    /* renamed from: f */
    public final /* synthetic */ C14680x f40652f;

    public C14703z(C60905o oVar, C55034v vVar, C14680x xVar) {
        this.f40650d = oVar;
        this.f40651e = vVar;
        this.f40652f = xVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58784w3.f168295a.mo83932g1(this.f40650d, this.f40651e.f154508w.getFeedObject(), (Integer) null)) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            Context context = this.f40650d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C58417y0.Iy0((C58417y0) c, context, true, false, 1, true, 4, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C14680x xVar = this.f40652f;
        Context context2 = this.f40650d.f173499A;
        C87412m.m108593f(context2, "holder.context");
        xVar.mo13866k(context2, this.f40651e.f154508w, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
