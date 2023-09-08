package ve1;

import android.content.Context;
import android.view.View;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60172g4;
import jq3.C60905o;
import l31.C61212e;
import rx3.C13604l;
import sx3.C90363p0;
import tf0.C64916p1;

/* renamed from: ve1.i4 */
public final class C14544i4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C14552j4 f40305d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40306e;

    /* renamed from: f */
    public final /* synthetic */ int f40307f;

    public C14544i4(C14552j4 j4Var, C60905o oVar, int i) {
        this.f40305d = j4Var;
        this.f40306e = oVar;
        this.f40307f = i;
    }

    public final void run() {
        C14552j4 j4Var = this.f40305d;
        View view = this.f40306e.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        int i = this.f40307f;
        j4Var.getClass();
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.se0(view);
        eVar.o30(view, "recommend_pos_tag");
        eVar.mo86175pO(view, 40, 25496);
        eVar.mo86149PM(view, C90363p0.m113143b(new C13604l("view_position", Integer.valueOf(i))));
        Context context = view.getContext();
        C87412m.m108593f(context, "view.context");
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
        eVar.E60(view, new C14539h4(gr02 != null ? gr02.mo12861q3() : null));
    }
}
