package gq1;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58784w3;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq3.C60905o;
import p525fr.C59313e;
import pb1.C11882u0;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64197v;
import te3.C64682rk1;
import wp1.C15585f;

/* renamed from: gq1.b */
public final class C59605b extends C59604a {

    /* renamed from: g */
    public final C59313e f170315g;

    /* renamed from: h */
    public boolean f170316h;

    public C59605b(C59313e eVar) {
        this.f170315g = eVar;
    }

    /* renamed from: G */
    public final void mo84626G(List<? extends C64682rk1> list, boolean z, boolean z2) {
        C87412m.m108594g(list, "data");
        Log.m105924i("FinderGlobalFavPresenter", "updateData, data:" + list.size() + ", refresh:" + z + ", hasMore: " + z2);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C64682rk1 u : list) {
            arrayList.add(C58784w3.f168295a.mo83967u(u));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a((FinderObject) it.next(), 256)));
        }
        arrayList2.addAll(arrayList3);
        if (z) {
            this.f170312d.clear();
        }
        int size = this.f170312d.size();
        this.f170312d.addAll(arrayList2);
        if (z) {
            RecyclerView.C16613e adapter = mo84620e().mo84629b().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        } else {
            RecyclerView.C16613e adapter2 = mo84620e().mo84629b().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(size, arrayList2.size());
            }
        }
        C59613h e = mo84620e();
        FrameLayout frameLayout = e.f170334h;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = e.f170337k;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.f170316h = z2;
                if (z) {
                    mo84620e().mo84630c().mo26604l(true);
                } else {
                    mo84620e().mo84630c().mo26580f(true);
                }
                mo84620e().mo84630c().mo26642z(true ^ z2);
                if (this.f170312d.isEmpty()) {
                    mo84620e().mo84631d();
                    return;
                }
                return;
            }
            C87412m.m108603p("retryView");
            throw null;
        }
        C87412m.m108603p("loadingLayout");
        throw null;
    }

    /* renamed from: n */
    public boolean mo84621n() {
        return this.f170315g != null;
    }

    /* renamed from: q */
    public void mo84622q(RecyclerView.C16613e<C60905o> eVar, View view, int i, C60905o oVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C59313e eVar2 = this.f170315g;
        if (eVar2 != null) {
            eVar2.mo84413W(view, i);
        }
    }

    public void requestRefresh() {
    }

    /* renamed from: t */
    public void mo84624t() {
        Log.m105924i("FinderGlobalFavPresenter", "requestInit stack=" + Util.getStack());
        C13604l<Boolean, List<C64682rk1>> nF = ((C11882u0) C86312j.m106911c(C11882u0.class)).mo11759nF(10);
        mo84626G((List) nF.f38556e, true, ((Boolean) nF.f38555d).booleanValue());
    }

    /* renamed from: x */
    public void mo84625x() {
        Log.m105924i("FinderGlobalFavPresenter", "requestLoadMore stack=" + Util.getStack());
        C13604l<Boolean, List<C64682rk1>> LQ = ((C11882u0) C86312j.m106911c(C11882u0.class)).mo11758LQ(C64197v.m75536e(this.f170312d), 10);
        mo84626G((List) LQ.f38556e, false, ((Boolean) LQ.f38555d).booleanValue());
    }
}
