package az2;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import qz2.C47916g;

/* renamed from: az2.b */
public final class C39670b extends C60896i<C47916g> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c_0;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47916g gVar = (C47916g) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(gVar, "item");
        ((TextView) oVar.mo85812D(C0966R.C0970id.kyn)).setText(gVar.f128573d);
        ((TextView) oVar.mo85812D(C0966R.C0970id.kyo)).setText(gVar.f128574e);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
