package ve1;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0740i2;
import cm1.C0795y1;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.u6 */
public final class C14650u6 extends C60896i<C0740i2> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f7192wf;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0740i2 i2Var = (C0740i2) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(i2Var, "item");
        super.mo44e(oVar, i2Var, i, i2, z, list);
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
            ((TextView) oVar.mo85812D(C0966R.C0970id.onf)).setText(((C0795y1) i2Var).f1854d);
        }
    }
}
