package p171il;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import p813fl.C97891b0;
import p813fl.C97927q0;

/* renamed from: il.r */
public final class C98738r extends C98748z<C97891b0> {

    /* renamed from: B */
    public final TextView f289526B;

    /* renamed from: C */
    public final View f289527C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98738r(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.cgj);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.…_panel_item_expand_title)");
        this.f289526B = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.cgi);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.…i_panel_item_expand_icon)");
        this.f289527C = findViewById2;
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        C97891b0 b0Var = (C97891b0) q0Var;
        this.f289526B.setText(C0966R.string.c6z);
        this.f289527C.setRotation(0.0f);
    }
}
