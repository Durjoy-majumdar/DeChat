package l23;

import android.view.View;
import android.widget.TextView;
import c23.C67333e;
import c23.C67334f;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: l23.w */
public final class C76665w extends C76664p {

    /* renamed from: z */
    public final TextView f224354z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76665w(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.fb7);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.item_magic_panel_title)");
        this.f224354z = (TextView) findViewById;
    }

    /* renamed from: y */
    public void mo106930y(C67333e eVar) {
        C87412m.m108594g(eVar, "item");
        C67334f fVar = eVar instanceof C67334f ? (C67334f) eVar : null;
        if (fVar != null) {
            this.f224354z.setText(fVar.f193176b);
        }
    }
}
