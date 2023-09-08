package vl1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0708a1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: vl1.g */
public final class C14898g extends C60896i<C0708a1> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ahv;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0708a1 a1Var = (C0708a1) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(a1Var, "item");
        ((TextView) oVar.mo85812D(C0966R.C0970id.g7e)).setText(oVar.f173499A.getString(C0966R.string.dts, new Object[]{Integer.valueOf(a1Var.f1696e)}));
        String g = C72715f.m85114g(oVar.f173499A.getString(C0966R.string.dtw), a1Var.f1695d);
        ((TextView) oVar.mo85812D(C0966R.C0970id.g7t)).setText(oVar.f173499A.getString(C0966R.string.dtt, new Object[]{g}));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
