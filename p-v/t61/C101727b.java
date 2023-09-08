package t61;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import t61.C101728d;

/* renamed from: t61.b */
public abstract class C101727b<T extends C101728d> extends RecyclerView.C16631z {

    /* renamed from: z */
    public T f297802z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101727b(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
    }

    /* renamed from: y */
    public void mo141163y(C101728d dVar) {
        C87412m.m108594g(dVar, "item");
        this.f297802z = dVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C101727b(android.view.ViewGroup r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = "parent"
            gy3.C87412m.m108594g(r3, r0)
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            android.view.View r3 = r0.inflate(r4, r3, r1)
            java.lang.String r4 = "from(parent.context).inf…(layoutId, parent, false)"
            gy3.C87412m.m108593f(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t61.C101727b.<init>(android.view.ViewGroup, int):void");
    }
}
