package cv1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import ev1.C58838a;
import ev1.C58841f;
import gv1.C59712c;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import p629ny.C76979h;

/* renamed from: cv1.d */
public final class C57990d extends C57988b<C58841f> {
    /* renamed from: j */
    public int mo82776j() {
        return C0966R.C0971layout.as9;
    }

    /* renamed from: k */
    public void mo82777k(C60905o oVar, C58838a aVar, int i, int i2, boolean z, List list) {
        C58841f fVar = (C58841f) aVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(fVar, "item");
        if (C59712c.f170575I.mo84705a().f170567g) {
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kpm);
            if (textView != null) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3484uu));
            }
            TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.edt);
            if (textView2 != null) {
                textView2.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3482us));
            }
        } else {
            TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.kpm);
            if (textView3 != null) {
                textView3.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3481uq));
            }
            TextView textView4 = (TextView) oVar.mo85812D(C0966R.C0970id.edt);
            if (textView4 != null) {
                textView4.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3480up));
            }
        }
        ((TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm)).setText(fVar.f168442h);
        TextView textView5 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.edt);
        String str = fVar.f168443i;
        if (str == null || str.length() == 0) {
            textView5.setVisibility(8);
            return;
        }
        textView5.setVisibility(0);
        textView5.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(textView5.getContext(), fVar.f168443i, textView5.getTextSize()));
    }

    /* renamed from: l */
    public void mo82778l(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
