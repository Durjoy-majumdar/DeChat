package oq1;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import lq1.C61364h;
import sq1.C64151e;

/* renamed from: oq1.c */
public final class C62122c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62131l f176644d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f176645e;

    /* renamed from: f */
    public final /* synthetic */ C64151e f176646f;

    public C62122c(C62131l lVar, C60905o oVar, C64151e eVar) {
        this.f176644d = lVar;
        this.f176645e = oVar;
        this.f176646f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$13$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C61364h hVar = this.f176644d.f176670e;
        View view2 = this.f176645e.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        hVar.mo79240m1(view2, this.f176646f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$13$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
