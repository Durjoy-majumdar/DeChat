package oq1;

import android.content.Context;
import android.view.View;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import rs1.C13442s8;
import sq1.C64147b;
import sq1.C64151e;

/* renamed from: oq1.f */
public final class C62125f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64151e f176653d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f176654e;

    public C62125f(C64151e eVar, C60905o oVar) {
        this.f176653d = eVar;
        this.f176654e = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String username = this.f176653d.f181868d.getUsername();
        Context context = this.f176654e.f173499A;
        C87412m.m108593f(context, "holder.context");
        ((C58684b) C86312j.m106911c(C58684b.class)).fy0(username, context);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context2 = this.f176654e.f173499A;
        C87412m.m108593f(context2, "holder.context");
        C13442s8 f = aVar.mo12873f(context2);
        if (f != null) {
            C64147b bVar = this.f176653d.f181868d;
            ((C58417y0) C86312j.m106911c(C58417y0.class)).yx0(1, bVar.field_feedId, f.f38096i, 2, bVar.getUsername());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
