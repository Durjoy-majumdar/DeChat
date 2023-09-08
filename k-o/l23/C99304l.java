package l23;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c23.C67333e;
import c23.C92334b;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import k60.C99101e;
import l60.C99342a;

/* renamed from: l23.l */
public final class C99304l extends C76664p {

    /* renamed from: A */
    public final TextView f291200A;

    /* renamed from: z */
    public final ImageView f291201z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99304l(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.fb5);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.item_magic_panel_icon)");
        this.f291201z = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.fb6);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.item_magic_panel_order)");
        this.f291200A = (TextView) findViewById2;
    }

    /* renamed from: y */
    public void mo106930y(C67333e eVar) {
        C87412m.m108594g(eVar, "item");
        C92334b bVar = eVar instanceof C92334b ? (C92334b) eVar : null;
        if (bVar != null) {
            C99101e eVar2 = C99101e.f290570a;
            ((C99342a) C99101e.f290571b.mo138472g(bVar.f264196b.f264195b)).mo85954d(this.f291201z);
            this.f291200A.setText(String.valueOf(bVar.f264200f));
        }
    }
}
