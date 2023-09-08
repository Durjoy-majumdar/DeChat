package pf2;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import nf2.C47240a;

/* renamed from: pf2.e */
public final class C47476e extends RecyclerView.C16631z {

    /* renamed from: A */
    public final Context f127348A;

    /* renamed from: z */
    public final C47240a f127349z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47476e(View view, C47240a aVar, int i) {
        super(view);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "outAdapter");
        this.f127349z = aVar;
        this.f127348A = view.getContext();
    }
}
