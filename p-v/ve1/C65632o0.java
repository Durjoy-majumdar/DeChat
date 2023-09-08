package ve1;

import android.content.Context;
import android.view.View;
import cm1.C55033u;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import rs1.C13442s8;
import up1.C65426w0;

/* renamed from: ve1.o0 */
public final class C65632o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C55033u f188849d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f188850e;

    public C65632o0(C55033u uVar, C60905o oVar) {
        this.f188849d = uVar;
        this.f188850e = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String username = this.f188849d.f154492d.getUsername();
        Context context = this.f188850e.f173499A;
        C87412m.m108593f(context, "holder.context");
        ((C58684b) C86312j.m106911c(C58684b.class)).fy0(username, context);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context2 = this.f188850e.f173499A;
        C87412m.m108593f(context2, "holder.context");
        C13442s8 f = aVar.mo12873f(context2);
        if (f != null) {
            C65426w0 w0Var = this.f188849d.f154492d;
            ((C58417y0) C86312j.m106911c(C58417y0.class)).yx0(1, w0Var.field_feedId, f.f38096i, 2, w0Var.getUsername());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
