package cn1;

import an1.C0096i;
import an1.C0097j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main.LiveTabJumpersItemConvertFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9495e;
import jq3.C9496f;
import ln1.C10584f;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C51942x91;
import xm1.C15828e;
import xm1.C15829e0;
import z04.C112551y;
import zm1.C16300d;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: cn1.y */
public class C0885y extends C60896i<C0097j> {

    /* renamed from: e */
    public C49712hj1 f2096e;

    /* renamed from: cn1.y$a */
    public final class C0886a {
        public C0886a(C0885y yVar) {
        }
    }

    /* renamed from: cn1.y$b */
    public static final class C0887b extends C23555k.C23558c {

        /* renamed from: a */
        public final /* synthetic */ C0885y f2097a;

        public C0887b(C0885y yVar) {
            this.f2097a = yVar;
        }

        /* renamed from: d */
        public boolean mo777d() {
            return true;
        }

        /* renamed from: e */
        public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
            C10584f fVar;
            C87412m.m108594g(view, "parent");
            C87412m.m108594g(list, "exposedHolders");
            C0885y yVar = this.f2097a;
            for (RecyclerView.C16631z zVar : list) {
                String str = null;
                C60905o oVar = zVar instanceof C60905o ? (C60905o) zVar : null;
                if (oVar != null) {
                    Context context = view.getContext();
                    C87412m.m108593f(context, "parent.context");
                    Object obj = oVar.f173502D;
                    C0096i iVar = obj instanceof C0096i ? (C0096i) obj : null;
                    yVar.getClass();
                    MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
                    if (!(mMActivity == null || (fVar = (C10584f) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C10584f.class)) == null || iVar == null)) {
                        C104289g gVar = new C104289g();
                        C51942x91 x912 = iVar.f534d.f131576d;
                        gVar.mo145967r("tab_id", Integer.valueOf(x912 != null ? x912.f144531d : 0));
                        View view2 = oVar.f44854d;
                        Object tag = view2 != null ? view2.getTag() : null;
                        Integer num = tag instanceof Integer ? (Integer) tag : null;
                        gVar.mo145967r("card_index", Integer.valueOf(num != null ? num.intValue() : 0));
                        Log.m105924i("Finder.LiveTabJumpersListConvert", "handleExposeReport: " + gVar + ' ');
                        C49712hj1 hj12 = yVar.f2096e;
                        if (hj12 != null) {
                            str = hj12.f134671e;
                        }
                        String gVar2 = gVar.toString();
                        C87412m.m108593f(gVar2, "eldUdfKv.toString()");
                        fVar.mo10841c3("", str, "main_page_tab_card", C112551y.m153814n(gVar2, ",", ";", false));
                    }
                }
            }
        }
    }

    public C0885y(C15829e0 e0Var, C15828e eVar) {
        C87412m.m108594g(e0Var, "outsideEventListener");
        C87412m.m108594g(eVar, "outsideOperator");
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d6t;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0097j jVar = (C0097j) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(jVar, "item");
        C0886a aVar = new C0886a(this);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.iiq);
        C87412m.m108593f(wxRecyclerView, "recyclerView");
        C9496f.m9181b(wxRecyclerView, new C0891z(oVar), C9495e.f29669d);
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        C16300d dVar = new C16300d(new LiveTabJumpersItemConvertFactory(), jVar.f537e);
        dVar.f173488o = new C0806a0(jVar, this);
        wxRecyclerView.setAdapter(dVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(oVar.f173499A);
        linearLayoutManager.mo16974W(0);
        wxRecyclerView.setLayoutManager(linearLayoutManager);
        oVar.f173502D = aVar;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        this.f2096e = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.iiq);
        if (wxRecyclerView != null) {
            C23564m.m28137g(wxRecyclerView, new C0887b(this));
        }
    }
}
