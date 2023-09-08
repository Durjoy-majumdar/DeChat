package cn1;

import an1.C0096i;
import an1.C0097j;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import ln1.C10584f;
import te3.C49712hj1;
import te3.C51942x91;
import xm1.C15834h;
import z04.C112551y;

/* renamed from: cn1.a0 */
public final class C0806a0 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C0097j f1880d;

    /* renamed from: e */
    public final /* synthetic */ C0885y f1881e;

    public C0806a0(C0097j jVar, C0885y yVar) {
        this.f1880d = jVar;
        this.f1881e = yVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        if (i <= this.f1880d.f537e.size()) {
            C0740i2 i2Var = this.f1880d.f537e.get(i);
            C87412m.m108593f(i2Var, "item.feedDataList[position]");
            C0740i2 i2Var2 = i2Var;
            Context context = oVar.f173499A;
            String str = null;
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                C0885y yVar = this.f1881e;
                boolean z = i2Var2 instanceof C0096i;
                C0096i iVar = z ? (C0096i) i2Var2 : null;
                if (iVar != null) {
                    C15834h hVar = (C15834h) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C15834h.class);
                    hVar.mo14507c3(0, hVar.getContext(), iVar.f534d.f131576d);
                }
                yVar.getClass();
                C10584f fVar = (C10584f) C39818r.f106831a.mo62443b(mMActivity).mo75002a(C10584f.class);
                if (fVar != null) {
                    C0096i iVar2 = z ? (C0096i) i2Var2 : null;
                    if (iVar2 != null) {
                        C104289g gVar = new C104289g();
                        C51942x91 x912 = iVar2.f534d.f131576d;
                        gVar.mo145967r("tab_id", Integer.valueOf(x912 != null ? x912.f144531d : 0));
                        gVar.mo145967r("card_index", Integer.valueOf(i));
                        Log.m105924i("Finder.LiveTabJumpersListConvert", "handleClickReport: " + gVar + ' ');
                        C49712hj1 hj12 = yVar.f2096e;
                        if (hj12 != null) {
                            str = hj12.f134671e;
                        }
                        String gVar2 = gVar.toString();
                        C87412m.m108593f(gVar2, "eldUdfKv.toString()");
                        fVar.mo10842d3(str, "main_page_tab_card", C112551y.m153814n(gVar2, ",", ";", false));
                    }
                }
            }
        }
    }
}
