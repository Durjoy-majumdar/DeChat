package oq1;

import android.content.Context;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import rx3.C13598b0;
import sq1.C64151e;
import te3.C64284cg;
import ve1.C65604i;

/* renamed from: oq1.w */
public final class C62148w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64151e f176709d;

    /* renamed from: e */
    public final /* synthetic */ C62137n f176710e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f176711f;

    public C62148w(C64151e eVar, C62137n nVar, C60905o oVar) {
        this.f176709d = eVar;
        this.f176710e = nVar;
        this.f176711f = oVar;
    }

    public final void onClick(View view) {
        C13598b0 b0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64284cg bizInfo = this.f176709d.f181868d.getBizInfo();
        if (bizInfo != null) {
            C60905o oVar = this.f176711f;
            C62137n nVar = this.f176710e;
            C64151e eVar = this.f176709d;
            C65604i iVar = C65604i.f188772a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String str = bizInfo.f182468d;
            if (str == null) {
                str = "";
            }
            iVar.mo89681g(context, str, nVar.f176682e.getCommentScene(), eVar);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C62137n nVar2 = this.f176710e;
            C64151e eVar2 = this.f176709d;
            C60905o oVar2 = this.f176711f;
            C65604i iVar2 = C65604i.f188772a;
            String username = eVar2.f181868d.getUsername();
            Context context2 = oVar2.f173499A;
            C87412m.m108593f(context2, "holder.context");
            iVar2.mo89684j(username, eVar2, context2, nVar2.f176682e.getCommentScene());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
