package ve1;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0734g2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: ve1.q */
public final class C14607q extends C60896i<C0734g2> {

    /* renamed from: e */
    public final String f40441e = "Finder.FinderFavFilterConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.a_t;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0734g2 g2Var = (C0734g2) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(g2Var, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.ksp);
        if (textView != null) {
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = oVar.f173499A;
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            String str = g2Var.f1749d.f141617d;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            textView.setText(hVar.mo107057T1(context, sb.toString()));
        }
        if (g2Var.f1751f) {
            if (textView != null) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.FG_0));
            }
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
        } else {
            if (textView != null) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.FG_1));
            }
            C85875k4.m106189j0(textView.getPaint(), 0.1f);
        }
        String str2 = this.f40441e;
        Log.m105924i(str2, "item hash:" + g2Var.hashCode() + ", topic:" + g2Var.f1749d.f141617d + ", selected:" + g2Var.f1751f);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.ksp);
        if (textView != null) {
            textView.setTextSize(1, C76577a.m92165p(oVar.f173499A) * 15.0f);
        }
    }
}
