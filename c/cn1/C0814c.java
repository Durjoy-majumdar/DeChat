package cn1;

import an1.C0089b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main.AdItemConvertFactory;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import rs1.C13442s8;
import te3.C49712hj1;
import xm1.C15828e;
import xm1.C15829e0;
import ym1.C16052a;
import zm1.C16297a;

/* renamed from: cn1.c */
public class C0814c extends C60896i<C0089b> {

    /* renamed from: e */
    public C16052a f1905e;

    /* renamed from: f */
    public C49712hj1 f1906f;

    /* renamed from: cn1.c$a */
    public final class C0815a {

        /* renamed from: a */
        public final C54259z f1907a = new C54259z();

        public C0815a(C0814c cVar) {
        }
    }

    public C0814c(C15829e0 e0Var, C15828e eVar) {
        C87412m.m108594g(e0Var, "outsideEventListener");
        C87412m.m108594g(eVar, "outsideOperator");
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cps;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0089b bVar = (C0089b) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        Object obj = oVar.f173502D;
        if (obj != null && (obj instanceof C0815a)) {
            ((C0815a) obj).f1907a.mo75025b((RecyclerView) null);
        }
        oVar.f173502D = null;
        C0815a aVar = new C0815a(this);
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = oVar.mo85812D(C0966R.C0970id.m_q);
        Context context = oVar.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C16297a aVar2 = new C16297a(new AdItemConvertFactory((MMActivity) context, false, false, 0, bVar.f526e.size() > 1), bVar.f526e);
        aVar2.f173488o = new C0818d(bVar, this, f0Var);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) f0Var.f27484d;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(aVar2);
        }
        aVar.f1907a.mo75025b((RecyclerView) f0Var.f27484d);
        WxRecyclerView wxRecyclerView2 = (WxRecyclerView) f0Var.f27484d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(new FinderStaggeredGridLayoutManager(1, 0));
        }
        oVar.f173502D = aVar;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C49712hj1 q3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
        Context context2 = oVar.f173499A;
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f1905e = new C16052a(q3, (MMActivity) context2, (Fragment) null, 0, (C15828e) null, 16, (C8480h) null);
        this.f1906f = q3;
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("AdListConvert", "#onViewRecycled holder=" + oVar);
        Object obj = oVar.f173502D;
        if (obj != null && (obj instanceof C0815a)) {
            ((C0815a) obj).f1907a.mo75025b((RecyclerView) null);
        }
        oVar.f173502D = null;
    }
}
