package com.tencent.p014mm.plugin.voip.p475ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.voip.ui.p */
public final class C57475p extends C60896i<C30540n> {

    /* renamed from: e */
    public final C32227p<Integer, C30540n, C13598b0> f164674e;

    public C57475p(C32227p<? super Integer, ? super C30540n, C13598b0> pVar) {
        C87412m.m108594g(pVar, "onClickDelete");
        this.f164674e = pVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ctx;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C30540n nVar = (C30540n) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(nVar, "item");
        StringBuilder sb = new StringBuilder();
        int i3 = nVar.f82273d;
        sb.append(i3 != 2 ? i3 != 4 ? i3 != 8 ? i3 != 16 ? i3 != 32 ? "未知编码" : "Vcodec混分软编" : "Vcodec2软编" : "264硬编" : "265硬编" : "Vcodec软编");
        sb.append("  ");
        int i4 = nVar.f82274e;
        sb.append(i4 != 4 ? i4 != 6 ? i4 != 8 ? i4 != 10 ? i4 != 12 ? "未知分辨率" : "1920p" : "1280p" : "640p" : "480p" : "320p");
        sb.append("  ");
        sb.append(nVar.f82279j);
        sb.append("kbps  ");
        sb.append(nVar.f82275f);
        sb.append("fps  ");
        sb.append(nVar.f82277h);
        sb.append(31186);
        oVar.mo85815G(C0966R.C0970id.khj, sb.toString());
        oVar.mo85812D(C0966R.C0970id.c16).setOnClickListener(new C57474o(this, oVar, nVar));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
