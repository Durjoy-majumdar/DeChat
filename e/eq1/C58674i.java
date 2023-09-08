package eq1;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import gy3.C87412m;
import java.util.Date;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: eq1.i */
public final class C58674i extends C60896i<C58675j> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f7158bg;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C58675j jVar = (C58675j) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(jVar, "item");
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f358063ok1);
        if (textView != null) {
            textView.setText(C74763a.m89510e().mo103935c(new Date(jVar.f167971d), oVar.f173499A));
        }
    }
}
