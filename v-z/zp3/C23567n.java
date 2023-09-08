package zp3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C8478d0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import zp3.C23555k;

/* renamed from: zp3.n */
public final class C23567n extends C23555k.C23559e {

    /* renamed from: a */
    public final /* synthetic */ C23555k.C23558c f67554a;

    /* renamed from: b */
    public final /* synthetic */ RecyclerView f67555b;

    /* renamed from: c */
    public final /* synthetic */ boolean f67556c;

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f67557d;

    public C23567n(C23555k.C23558c cVar, RecyclerView recyclerView, boolean z, C8478d0 d0Var) {
        this.f67554a = cVar;
        this.f67555b = recyclerView;
        this.f67556c = z;
        this.f67557d = d0Var;
    }

    /* renamed from: a */
    public boolean mo37018a(View view) {
        C87412m.m108594g(view, "view");
        return this.f67554a.mo10181a(this.f67555b.mo17021F0(view));
    }

    /* renamed from: b */
    public float mo37019b(View view) {
        C87412m.m108594g(view, "view");
        return this.f67554a.mo10182b(view);
    }

    /* renamed from: c */
    public long mo37020c(View view) {
        C87412m.m108594g(view, "view");
        return this.f67554a.mo10183c(this.f67555b.mo17021F0(view));
    }

    /* renamed from: d */
    public boolean mo37021d() {
        return this.f67556c && this.f67557d.f27483d == 2;
    }

    /* renamed from: e */
    public void mo37022e(View view, List<? extends View> list) {
        C87412m.m108594g(view, "parent");
        C87412m.m108594g(list, "exposedChildren");
        LinkedList linkedList = new LinkedList();
        RecyclerView recyclerView = this.f67555b;
        for (View F0 : list) {
            RecyclerView.C16631z F02 = recyclerView.mo17021F0(F0);
            if (F02 != null) {
                linkedList.add(F02);
            }
        }
        this.f67554a.mo778e(this.f67555b, linkedList);
    }
}
