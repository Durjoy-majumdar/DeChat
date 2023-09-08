package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.r */
public final class C57548r extends C57545k0 implements C57547m0 {

    /* renamed from: g */
    public final C57547m0 f164792g;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.r$a */
    public static final class C57549a extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C57548r f164793a;

        public C57549a(C57548r rVar) {
            this.f164793a = rVar;
        }

        /* renamed from: b */
        public void mo2556b() {
            Log.m105918d("ChattingHeaderFooterRvAdapter", "onChanged() called");
            try {
                this.f164793a.notifyDataSetChanged();
            } catch (Throwable th) {
                Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th, "onchanged err", new Object[0]);
            }
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            Log.m105918d("ChattingHeaderFooterRvAdapter", "onItemRangeChanged() called with: positionStart = " + i + ", itemCount = " + i2);
            try {
                C57548r rVar = this.f164793a;
                rVar.notifyItemRangeChanged(rVar.mo81318G4() + i, i2);
            } catch (Throwable th) {
                Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th, "onItemRangeChanged err", new Object[0]);
            }
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            Log.m105918d("ChattingHeaderFooterRvAdapter", "onItemRangeInserted() called with: positionStart = " + i + ", itemCount = " + i2);
            try {
                C57548r rVar = this.f164793a;
                rVar.notifyItemRangeInserted(rVar.mo81318G4() + i, i2);
            } catch (Throwable th) {
                Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th, "onItemRangeInserted err", new Object[0]);
            }
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            Log.m105918d("ChattingHeaderFooterRvAdapter", "onItemRangeMoved() called with: fromPosition = " + i + ", toPosition = " + i2 + ", itemCount = " + i3);
            try {
                C57548r rVar = this.f164793a;
                rVar.notifyItemMoved(rVar.mo81318G4() + i, this.f164793a.mo81318G4() + i2);
            } catch (Throwable th) {
                Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th, "onItemRangeMoved err", new Object[0]);
            }
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            Log.m105918d("ChattingHeaderFooterRvAdapter", "onItemRangeRemoved() called with: positionStart = " + i + ", itemCount = " + i2);
            try {
                C57548r rVar = this.f164793a;
                rVar.notifyItemRangeRemoved(rVar.mo81318G4() + i, i2);
            } catch (Throwable th) {
                Log.printErrStackTrace("ChattingHeaderFooterRvAdapter", th, "onItemRangeRemoved err", new Object[0]);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57548r(SparseArray<View> sparseArray, SparseArray<View> sparseArray2, RecyclerView.C16613e<RecyclerView.C16631z> eVar, C57547m0 m0Var) {
        super(sparseArray, sparseArray2, eVar);
        C87412m.m108594g(sparseArray, "headerViews");
        C87412m.m108594g(sparseArray2, "footerViews");
        C87412m.m108594g(eVar, "innerAdapter");
        C87412m.m108594g(m0Var, "chatInnerAdapter");
        this.f164792g = m0Var;
        eVar.registerAdapterDataObserver(new C57549a(this));
        setHasStableIds(eVar.hasStableIds());
    }

    /* renamed from: c3 */
    public void mo81320c3(Object obj) {
        this.f164792g.mo81320c3(obj);
    }

    public int getCount() {
        return getItemCount();
    }

    public Object getItem(int i) {
        if (!(i < mo81318G4()) && !mo81319O4(i)) {
            return this.f164792g.getItem(i - mo81318G4());
        }
        return null;
    }

    public long getItemId(int i) {
        if (!(i < mo81318G4()) && !mo81319O4(i)) {
            return this.f164791f.getItemId(i - mo81318G4());
        }
        return -1;
    }
}
