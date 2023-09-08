package mf2;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: mf2.e */
public final class C47022e extends C60896i<C47023f> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ckz;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47023f fVar = (C47023f) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(fVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.ksp);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.ob4);
        if (textView != null) {
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = oVar.f173499A;
            String str = fVar.f126381d.f133510d;
            if (str == null) {
                str = "";
            }
            textView.setText(hVar.mo107057T1(context, str));
        }
        if (textView2 != null) {
            textView2.setText(fVar.f126381d.f133511e);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.ksp);
        if (textView != null) {
            textView.setTextSize(1, C76577a.m92165p(oVar.f173499A) * 14.0f);
        }
    }
}
