package ve1;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kf1.C9794i6;

/* renamed from: ve1.c5 */
public final class C14482c5 extends C60896i<C9794i6> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aa4;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C9794i6 i6Var = (C9794i6) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(i6Var, "item");
        oVar.mo85815G(C0966R.C0970id.evb, i6Var.f30328f);
        ViewGroup.LayoutParams layoutParams = oVar.mo85812D(C0966R.C0970id.evc).getLayoutParams();
        if (i6Var.f30326d.f141000f == 0) {
            layoutParams.height = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.a6c);
        } else {
            layoutParams.height = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3749d0);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.evb);
        if (textView != null) {
            textView.setText("");
        }
    }
}
