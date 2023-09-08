package bj2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: bj2.g0 */
public final class C67267g0 extends C60896i<C67265e0> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.czc;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C67265e0 e0Var = (C67265e0) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(e0Var, "item");
        View view = oVar.f44854d;
        ((TextView) view.findViewById(C0966R.C0970id.f6j)).setText(e0Var.f193099d);
        ((WeImageView) view.findViewById(C0966R.C0970id.f2s)).setImageResource(e0Var.f193101f);
        ((TextView) view.findViewById(C0966R.C0970id.kpm)).setText(e0Var.f193102g);
    }
}
