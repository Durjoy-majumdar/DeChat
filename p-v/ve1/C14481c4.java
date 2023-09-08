package ve1;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import rs1.C13442s8;

/* renamed from: ve1.c4 */
public final class C14481c4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14468b4 f40135d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40136e;

    public C14481c4(C14468b4 b4Var, C60905o oVar) {
        this.f40135d = b4Var;
        this.f40136e = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderHistoryDividerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14468b4 b4Var = this.f40135d;
        Context context = this.f40136e.f173499A;
        C87412m.m108593f(context, "holder.context");
        int j = this.f40136e.mo17363j();
        SparseArray<Integer> sparseArray = C14468b4.f40108f;
        b4Var.getClass();
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Sx0(2, 2, j, f.mo12861q3());
        }
        C39622i0 a = C39818r.f106831a.mo62444c((MMActivity) context).mo75002a(FinderHomeUIC.class);
        C87412m.m108593f(a, "UICProvider.of(context a…inderHomeUIC::class.java)");
        Bundle bundle = new Bundle();
        bundle.putInt("Source", 4);
        ((FinderHomeUIC) a).mo5135k3(4, bundle);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderHistoryDividerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
