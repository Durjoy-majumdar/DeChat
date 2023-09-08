package cz2;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import qz2.C12939c;

/* renamed from: cz2.j */
public final class C7154j extends C60896i<C12939c> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c95;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C12939c cVar2 = (C12939c) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(cVar2, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kx7);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        textView.setText(cVar2.f36959d);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
