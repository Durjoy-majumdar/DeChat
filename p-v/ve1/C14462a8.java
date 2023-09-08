package ve1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0725d2;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.a8 */
public final class C14462a8 extends C60896i<C0725d2> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.and;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0725d2) cVar, "item");
        ((TextView) oVar.mo85812D(C0966R.C0970id.kpm)).setText(C0966R.string.ehx);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
