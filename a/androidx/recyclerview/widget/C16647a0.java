package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C16650e;

/* renamed from: androidx.recyclerview.widget.a0 */
public class C16647a0 implements C16650e.C16652b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f44952a;

    public C16647a0(RecyclerView recyclerView) {
        this.f44952a = recyclerView;
    }

    /* renamed from: a */
    public int mo17480a() {
        return this.f44952a.getChildCount();
    }

    /* renamed from: b */
    public void mo17481b(int i) {
        View childAt = this.f44952a.getChildAt(i);
        if (childAt != null) {
            this.f44952a.mo17112q0(childAt);
            childAt.clearAnimation();
        }
        this.f44952a.removeViewAt(i);
    }
}
