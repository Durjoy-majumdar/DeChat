package cn1;

import an1.C0096i;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import l31.C61212e;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;
import xm1.C15828e;

/* renamed from: cn1.w */
public class C0881w extends C60896i<C0096i> {
    public C0881w(C15828e eVar) {
        C87412m.m108594g(eVar, "outsideOperator");
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cnd;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0096i iVar = (C0096i) cVar;
        Class cls = C61212e.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(iVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f359438ma2);
        if (textView != null) {
            textView.setText(iVar.f534d.f131577e);
        }
        ((C61212e) C86312j.m106911c(cls)).o30(oVar.f44854d, "live_square_column_more_card");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(oVar.f44854d, 40, 25388);
        C61212e eVar = (C61212e) C86312j.m106911c(cls);
        View view = oVar.f44854d;
        C13604l[] lVarArr = new C13604l[2];
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        lVarArr[0] = new C13604l("comment_scene", f != null ? Integer.valueOf(f.f38096i) : null);
        lVarArr[1] = new C13604l("live_label_type", Integer.valueOf(iVar.f535e.f130377d));
        eVar.mo86149PM(view, C90364q0.m113147f(lVarArr));
        ((C61212e) C86312j.m106911c(cls)).E60(oVar.f44854d, new C0879v(oVar));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
