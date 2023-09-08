package cv1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import ev1.C58838a;
import ev1.C58847k;
import gv1.C59712c;
import gy3.C87412m;
import h81.C59774i;
import java.util.List;
import jq3.C60905o;
import l31.C61212e;
import p629ny.C76979h;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: cv1.f */
public final class C57992f extends C57988b<C58847k> {
    /* renamed from: j */
    public int mo82776j() {
        return C0966R.C0971layout.as9;
    }

    /* renamed from: k */
    public void mo82777k(C60905o oVar, C58838a aVar, int i, int i2, boolean z, List list) {
        C58847k kVar = (C58847k) aVar;
        Class cls = C59774i.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(kVar, "item");
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
        TextView textView5 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm);
        String str = kVar.f168462o;
        int i3 = 0;
        if (str == null || str.length() == 0) {
            textView5.setText(textView5.getResources().getString(C0966R.string.f1i, new Object[]{kVar.f168458h}));
        } else {
            textView5.setText(kVar.f168462o);
        }
        TextView textView6 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.edt);
        String str2 = kVar.f168464q;
        if (str2 == null || str2.length() == 0) {
            textView6.setVisibility(8);
        } else {
            textView6.setVisibility(0);
            textView6.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(textView6.getContext(), kVar.f168464q, textView6.getTextSize()));
        }
        C61212e pO = ((C61212e) C86312j.m106911c(C61212e.class)).o30(oVar.f44854d, "finder_live_msg_notify").mo86175pO(oVar.f44854d, 40, 26236);
        View view = oVar.f44854d;
        C13604l[] lVarArr = new C13604l[12];
        lVarArr[0] = new C13604l("feed_id", kVar.f168459i);
        lVarArr[1] = new C13604l("live_id", kVar.f168460j);
        lVarArr[2] = new C13604l("comment_scene", "temp_7");
        String str3 = kVar.f168465r;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[3] = new C13604l("finder_username", str3);
        lVarArr[4] = new C13604l("session_buffer", "");
        String Wb = ((C59774i) C86312j.m106911c(cls)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        lVarArr[5] = new C13604l("behaviour_session_id", Wb);
        String S0 = ((C59774i) C86312j.m106911c(cls)).mo84749S0();
        if (S0 == null) {
            S0 = "";
        }
        lVarArr[6] = new C13604l("finder_tab_context_id", S0);
        String E = ((C59774i) C86312j.m106911c(cls)).mo84747E();
        if (E == null) {
            E = "";
        }
        lVarArr[7] = new C13604l("finder_context_id", E);
        lVarArr[8] = new C13604l("live_enter_status", 1);
        lVarArr[9] = new C13604l("share_username", "");
        lVarArr[10] = new C13604l("share_username", "");
        String str4 = kVar.f168466s;
        if (str4 != null) {
            if (str4.length() == 0) {
                i3 = 1;
            }
        }
        lVarArr[11] = new C13604l("live_notice_type", Integer.valueOf(i3));
        pO.mo86149PM(view, C90364q0.m113147f(lVarArr));
    }

    /* renamed from: l */
    public void mo82778l(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
