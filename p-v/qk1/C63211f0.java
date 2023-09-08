package qk1;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveApplyLinkView;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: qk1.f0 */
public final class C63211f0 extends RecyclerView.C16613e<C63212a> {

    /* renamed from: d */
    public final C54795n5 f179370d;

    /* renamed from: e */
    public C45795b f179371e;

    /* renamed from: f */
    public final ArrayList<FinderLiveApplyLinkView> f179372f = new ArrayList<>();

    /* renamed from: qk1.f0$a */
    public static final class C63212a extends RecyclerView.C16631z {

        /* renamed from: z */
        public final FinderLiveApplyLinkView f179373z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63212a(FinderLiveApplyLinkView finderLiveApplyLinkView) {
            super(finderLiveApplyLinkView);
            C87412m.m108594g(finderLiveApplyLinkView, "pageView");
            this.f179373z = finderLiveApplyLinkView;
        }
    }

    public C63211f0(C54795n5 n5Var) {
        this.f179370d = n5Var;
    }

    /* renamed from: F4 */
    public final void mo88125F4(long j) {
        for (FinderLiveApplyLinkView h : this.f179372f) {
            h.mo77774h(j);
        }
    }

    public int getItemCount() {
        return this.f179372f.size();
    }

    public int getItemViewType(int i) {
        if (i != 0) {
            return i != 1 ? -1 : 1;
        }
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63212a aVar = (C63212a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f179373z.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aVar.f179373z.mo77771e(this.f179371e, this.f179370d);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 0) {
            FinderLiveApplyLinkView finderLiveApplyLinkView = this.f179372f.get(0);
            C87412m.m108593f(finderLiveApplyLinkView, "pageList[0]");
            return new C63212a(finderLiveApplyLinkView);
        }
        FinderLiveApplyLinkView finderLiveApplyLinkView2 = this.f179372f.get(1);
        C87412m.m108593f(finderLiveApplyLinkView2, "pageList[1]");
        return new C63212a(finderLiveApplyLinkView2);
    }
}
