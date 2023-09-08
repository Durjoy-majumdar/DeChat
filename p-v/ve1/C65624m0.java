package ve1;

import android.content.Context;
import android.view.View;
import cm1.C55033u;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.m0 */
public final class C65624m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188831d;

    /* renamed from: e */
    public final /* synthetic */ String f188832e;

    /* renamed from: f */
    public final /* synthetic */ C55033u f188833f;

    public C65624m0(C60905o oVar, String str, C55033u uVar) {
        this.f188831d = oVar;
        this.f188832e = str;
        this.f188833f = uVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58784w3.f168295a.mo83941j1(this.f188831d, this.f188832e, this.f188833f);
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        Context context = this.f188831d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C58417y0.Iy0((C58417y0) c, context, true, false, 2, false, 20, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
