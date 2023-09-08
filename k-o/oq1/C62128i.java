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

/* renamed from: oq1.i */
public final class C62128i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64151e f176661d;

    /* renamed from: e */
    public final /* synthetic */ C62131l f176662e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f176663f;

    public C62128i(C64151e eVar, C62131l lVar, C60905o oVar) {
        this.f176661d = eVar;
        this.f176662e = lVar;
        this.f176663f = oVar;
    }

    public final void onClick(View view) {
        C13598b0 b0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64284cg bizInfo = this.f176661d.f181868d.getBizInfo();
        if (bizInfo != null) {
            C60905o oVar = this.f176663f;
            C62131l lVar = this.f176662e;
            C64151e eVar = this.f176661d;
            C65604i iVar = C65604i.f188772a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String str = bizInfo.f182468d;
            if (str == null) {
                str = "";
            }
            iVar.mo89681g(context, str, lVar.f176670e.getCommentScene(), eVar);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C62131l lVar2 = this.f176662e;
            C64151e eVar2 = this.f176661d;
            C60905o oVar2 = this.f176663f;
            C65604i iVar2 = C65604i.f188772a;
            String username = eVar2.f181868d.getUsername();
            Context context2 = oVar2.f173499A;
            C87412m.m108593f(context2, "holder.context");
            iVar2.mo89684j(username, eVar2, context2, lVar2.f176670e.getCommentScene());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
