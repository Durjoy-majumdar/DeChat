package jq3;

import a14.C0000n0;
import a14.C53930o0;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import jq3.C9507n;

/* renamed from: jq3.m */
public abstract class C9506m<VH extends C9507n> extends RecyclerView.C16613e<VH> {

    /* renamed from: d */
    public final HashSet<C0000n0> f29678d = new HashSet<>();

    /* renamed from: F4 */
    public abstract void mo10187F4(VH vh, int i);

    /* renamed from: G4 */
    public abstract void mo10188G4(VH vh, int i, List<Object> list);

    /* renamed from: O4 */
    public abstract VH mo10189O4(ViewGroup viewGroup, int i);

    /* renamed from: g5 */
    public void onViewRecycled(VH vh) {
        C87412m.m108594g(vh, "holder");
        C0000n0 n0Var = vh.f29679z;
        if (n0Var != null) {
            this.f29678d.remove(n0Var);
        }
        C0000n0 n0Var2 = vh.f29679z;
        if (n0Var2 != null) {
            C53930o0.m60556c(n0Var2, (CancellationException) null);
        }
        vh.f29679z = null;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C9507n nVar = (C9507n) zVar;
        C87412m.m108594g(nVar, "holder");
        mo10187F4(nVar, i);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        C9507n O4 = mo10189O4(viewGroup, i);
        C0000n0 n0Var = O4.f29679z;
        if (n0Var != null) {
            this.f29678d.remove(n0Var);
        }
        O4.mo10193y();
        C0000n0 n0Var2 = O4.f29679z;
        if (n0Var2 != null) {
            this.f29678d.add(n0Var2);
        }
        return O4;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        for (C0000n0 e : this.f29678d) {
            C53930o0.m60558e(e, (CancellationException) null, 1, (Object) null);
        }
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C9507n nVar = (C9507n) zVar;
        C87412m.m108594g(nVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (list.isEmpty()) {
            C0000n0 n0Var = nVar.f29679z;
            if (n0Var != null) {
                this.f29678d.remove(n0Var);
            }
            nVar.mo10193y();
            C0000n0 n0Var2 = nVar.f29679z;
            if (n0Var2 != null) {
                this.f29678d.add(n0Var2);
            }
            super.onBindViewHolder(nVar, i, list);
            return;
        }
        if (nVar.f29679z == null) {
            nVar.mo10193y();
        }
        C0000n0 n0Var3 = nVar.f29679z;
        if (n0Var3 != null) {
            this.f29678d.add(n0Var3);
        }
        mo10188G4(nVar, i, list);
    }
}
