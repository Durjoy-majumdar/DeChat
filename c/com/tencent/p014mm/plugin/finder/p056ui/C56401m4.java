package com.tencent.p014mm.plugin.finder.p056ui;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import er1.C7919x;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import pe1.C35464c;

/* renamed from: com.tencent.mm.plugin.finder.ui.m4 */
public final class C56401m4 extends C60896i<C35464c<?>> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cs_;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C35464c cVar2 = (C35464c) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(cVar2, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.msz);
        C87412m.m108593f(textView, "");
        C7919x.m8091a(textView);
        textView.setText(cVar2.f94903d);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
