package go3;

import android.view.View;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: go3.w */
public final class C76017w {

    /* renamed from: a */
    public final View f222875a;

    /* renamed from: b */
    public List<Runnable> f222876b = new ArrayList();

    /* renamed from: c */
    public boolean f222877c;

    public C76017w(View view) {
        C87412m.m108594g(view, "view");
        this.f222875a = view;
    }

    /* renamed from: a */
    public final void mo106233a() {
        this.f222877c = true;
        for (Runnable post : this.f222876b) {
            this.f222875a.post(post);
        }
        ((ArrayList) this.f222876b).clear();
    }
}
