package vf1;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderInteractionSearchUIContract$ViewCallback;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import ef1.C58556f;
import ef1.C58563g;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import jq3.C9500j;
import rs1.C13442s8;

/* renamed from: vf1.z0 */
public final class C14853z0 extends WxRecyclerAdapter<C0740i2> {

    /* renamed from: G */
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f40867G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14853z0(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback, C9500j jVar, ArrayList<C0740i2> arrayList) {
        super(jVar, arrayList, true);
        this.f40867G = finderInteractionSearchUIContract$ViewCallback;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(list, "payloads");
        super.onBindViewHolder(oVar, i, list);
    }

    /* renamed from: w6 */
    public void mo10297w6(RecyclerView recyclerView) {
        C58556f j3;
        C87412m.m108594g(recyclerView, "recyclerView");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f40867G.f14445d);
        if (f != null && (j3 = f.mo12854j3(-1)) != null) {
            new C58563g(j3).onScrollStateChanged(recyclerView, 5);
        }
    }

    /* renamed from: z6 */
    public void onViewAttachedToWindow(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        super.onViewAttachedToWindow(oVar);
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            int i = oVar.f44859i;
            this.f40867G.getClass();
            if (i == 0 || oVar.f44859i == this.f40867G.f14458t) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
            }
        }
    }
}
