package kj1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: kj1.y1 */
public final class C10274y1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C10125e1.C10132d f31330d;

    public C10274y1(C10125e1.C10132d dVar) {
        this.f31330d = dVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        Iterator it = ((ArrayList) this.f31330d.f31040f).iterator();
        while (it.hasNext()) {
            ((C10538e) it.next()).mo10809p(e0Var);
        }
        RecyclerView recyclerView = null;
        if (e0Var.mo107176v()) {
            C10222s0 s0Var = this.f31330d.f31039e;
            TextView textView = s0Var != null ? s0Var.f31224n : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            C10222s0 s0Var2 = this.f31330d.f31039e;
            if (s0Var2 != null) {
                recyclerView = s0Var2.f31219i;
            }
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        C10222s0 s0Var3 = this.f31330d.f31039e;
        TextView textView2 = s0Var3 != null ? s0Var3.f31224n : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        C10222s0 s0Var4 = this.f31330d.f31039e;
        if (s0Var4 != null) {
            recyclerView = s0Var4.f31219i;
        }
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }
}
