package cv1;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import ev1.C58838a;
import ev1.C58848l;
import gc0.C20828a;
import gv1.C59712c;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import p196ln.C76705f;
import p629ny.C76979h;
import z04.C112551y;

/* renamed from: cv1.g */
public final class C57993g extends C57988b<C58848l> {
    /* renamed from: j */
    public int mo82776j() {
        return C0966R.C0971layout.as_;
    }

    /* renamed from: k */
    public void mo82777k(C60905o oVar, C58838a aVar, int i, int i2, boolean z, List list) {
        C58848l lVar = (C58848l) aVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(lVar, "item");
        if (C59712c.f170575I.mo84705a().f170567g) {
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kpm);
            if (textView != null) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3484uu));
            }
            TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.lr8);
            if (textView2 != null) {
                textView2.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3482us));
            }
        } else {
            TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.kpm);
            if (textView3 != null) {
                textView3.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3481uq));
            }
            TextView textView4 = (TextView) oVar.mo85812D(C0966R.C0970id.lr8);
            if (textView4 != null) {
                textView4.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3480up));
            }
        }
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.a27);
        if (C112551y.m153808h(lVar.f168434d, "@miniapp", false, 2, (Object) null)) {
            C20828a.m22825b().mo32518g(lVar.f168471o, imageView);
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(imageView, lVar.f168467h, 0.12f);
        }
        TextView textView5 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm);
        textView5.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(textView5.getContext(), lVar.f168468i, textView5.getTextSize()));
        ((TextView) oVar.f44854d.findViewById(C0966R.C0970id.lr8)).setText(lVar.f168469j);
        textView5.requestLayout();
    }

    /* renamed from: l */
    public void mo82778l(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
