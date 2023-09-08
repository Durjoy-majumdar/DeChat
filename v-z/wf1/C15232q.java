package wf1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import rx3.C36570n;

/* renamed from: wf1.q */
public final class C15232q extends RecyclerView.C0129l {

    /* renamed from: d */
    public final /* synthetic */ C15193l f41451d;

    public C15232q(C15193l lVar) {
        this.f41451d = lVar;
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int N0 = recyclerView.mo17029N0(view);
        int i = N0 % 4;
        if (i == 0) {
            rect.left = ((Number) ((C36570n) this.f41451d.f41399y).getValue()).intValue();
            rect.right = C15193l.m14278c3(this.f41451d);
        } else if (i != 3) {
            rect.left = C15193l.m14278c3(this.f41451d);
            rect.right = C15193l.m14278c3(this.f41451d);
        } else {
            rect.left = C15193l.m14278c3(this.f41451d);
            rect.right = ((Number) ((C36570n) this.f41451d.f41399y).getValue()).intValue();
        }
        if (N0 >= 4) {
            rect.top = ((Number) ((C36570n) this.f41451d.f41368A).getValue()).intValue();
        }
    }
}
