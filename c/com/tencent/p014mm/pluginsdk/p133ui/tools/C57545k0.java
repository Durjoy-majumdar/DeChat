package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.k0 */
public class C57545k0 extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final SparseArray<View> f164789d;

    /* renamed from: e */
    public final SparseArray<View> f164790e;

    /* renamed from: f */
    public final RecyclerView.C16613e<RecyclerView.C16631z> f164791f;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.k0$a */
    public static final class C57546a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57546a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    public C57545k0(SparseArray<View> sparseArray, SparseArray<View> sparseArray2, RecyclerView.C16613e<RecyclerView.C16631z> eVar) {
        C87412m.m108594g(sparseArray, "headerViews");
        C87412m.m108594g(sparseArray2, "footerViews");
        C87412m.m108594g(eVar, "innerAdapter");
        this.f164789d = sparseArray;
        this.f164790e = sparseArray2;
        this.f164791f = eVar;
    }

    /* renamed from: F4 */
    public final void mo81317F4(RecyclerView.C16631z zVar, int i, List<Object> list) {
        if (!(i < mo81318G4()) && !mo81319O4(i)) {
            zVar.f44854d.setTag(C0966R.C0970id.msq, new WeakReference(this));
            this.f164791f.onBindViewHolder(zVar, i - mo81318G4(), list);
        }
    }

    /* renamed from: G4 */
    public final int mo81318G4() {
        return this.f164789d.size();
    }

    /* renamed from: O4 */
    public final boolean mo81319O4(int i) {
        return i >= mo81318G4() + this.f164791f.getItemCount();
    }

    public int getItemCount() {
        return mo81318G4() + this.f164790e.size() + this.f164791f.getItemCount();
    }

    public int getItemViewType(int i) {
        return i < mo81318G4() ? this.f164789d.keyAt(i) : mo81319O4(i) ? this.f164790e.keyAt((i - mo81318G4()) - this.f164791f.getItemCount()) : this.f164791f.getItemViewType(i - mo81318G4());
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List<Object> list) {
        C87412m.m108594g(zVar, "holder");
        C87412m.m108594g(list, "payloads");
        mo81317F4(zVar, i, list);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (this.f164789d.get(i) != null) {
            View view = this.f164789d.get(i);
            C87412m.m108593f(view, "headerViews.get(viewType)");
            return new C57546a(view);
        } else if (this.f164790e.get(i) != null) {
            View view2 = this.f164790e.get(i);
            C87412m.m108593f(view2, "footerViews.get(viewType)");
            return new C57546a(view2);
        } else {
            RecyclerView.C16631z onCreateViewHolder = this.f164791f.onCreateViewHolder(viewGroup, i);
            C87412m.m108593f(onCreateViewHolder, "{\n                innerA…, viewType)\n            }");
            return onCreateViewHolder;
        }
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f164791f.onDetachedFromRecyclerView(recyclerView);
    }

    public void onViewRecycled(RecyclerView.C16631z zVar) {
        C87412m.m108594g(zVar, "holder");
        super.onViewRecycled(zVar);
        if (!(zVar instanceof C57546a)) {
            this.f164791f.onViewRecycled(zVar);
        }
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C87412m.m108594g(zVar, "holder");
        mo81317F4(zVar, i, new ArrayList());
    }
}
