package ve1;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0754n;
import com.tencent.p014mm.C0966R;
import er1.C58784w3;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import up1.C14364t0;

/* renamed from: ve1.c */
public final class C14473c extends C60896i<C0754n> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.a9_;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0754n nVar = (C0754n) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(nVar, "item");
        C14364t0 t0Var = nVar.f1775d;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        ((TextView) oVar.mo85812D(C0966R.C0970id.d7f)).setText(t0Var.mo13642d(context));
        C58784w3 w3Var = C58784w3.f168295a;
        View D = oVar.mo85812D(C0966R.C0970id.d7f);
        C87412m.m108593f(D, "holder.getView<TextView>…der_block_list_sub_title)");
        C14364t0 t0Var2 = nVar.f1775d;
        Context context2 = oVar.f173499A;
        C87412m.m108593f(context2, "holder.context");
        w3Var.mo83876I1((TextView) D, new SpannableString(t0Var2.mo13642d(context2)));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
