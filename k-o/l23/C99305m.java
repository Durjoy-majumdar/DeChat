package l23;

import android.view.View;
import android.widget.ImageView;
import c23.C67333e;
import c23.C92336d;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import k60.C99101e;
import l60.C99342a;

/* renamed from: l23.m */
public final class C99305m extends C76664p {

    /* renamed from: z */
    public final ImageView f291202z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99305m(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.fb5);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.item_magic_panel_icon)");
        this.f291202z = (ImageView) findViewById;
    }

    /* renamed from: y */
    public void mo106930y(C67333e eVar) {
        C87412m.m108594g(eVar, "item");
        C92336d dVar = eVar instanceof C92336d ? (C92336d) eVar : null;
        if (dVar != null) {
            C99101e eVar2 = C99101e.f290570a;
            ((C99342a) C99101e.f290571b.mo138472g(dVar.f264203b.f264195b)).mo85954d(this.f291202z);
        }
    }
}
