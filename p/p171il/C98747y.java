package p171il;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;

/* renamed from: il.y */
public final class C98747y extends GridLayoutManager.C0127b {

    /* renamed from: b */
    public final RecyclerView.C16613e<?> f289537b;

    /* renamed from: c */
    public final GridLayoutManager f289538c;

    public C98747y(RecyclerView.C16613e<?> eVar, GridLayoutManager gridLayoutManager) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(gridLayoutManager, "layoutManager");
        this.f289537b = eVar;
        this.f289538c = gridLayoutManager;
    }

    /* renamed from: c */
    public int mo118c(int i) {
        switch (this.f289537b.getItemViewType(i)) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return this.f289538c.f44669w;
            default:
                return 1;
        }
    }
}
