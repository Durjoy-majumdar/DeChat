package jq3;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53896h0;
import a14.C53922m0;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f14.C58901s;
import gy3.C87412m;
import java.util.concurrent.CancellationException;

/* renamed from: jq3.n */
public class C9507n extends RecyclerView.C16631z {

    /* renamed from: z */
    public C0000n0 f29679z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9507n(View view) {
        super(view);
        C87412m.m108594g(view, "view");
    }

    /* renamed from: y */
    public void mo10193y() {
        C0000n0 n0Var = this.f29679z;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        this.f29679z = C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a).plus(new C53922m0("ScopeViewHolder")));
    }
}
