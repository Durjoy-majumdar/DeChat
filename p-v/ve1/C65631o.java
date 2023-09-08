package ve1;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0772s;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p008bq.C28387o0;
import te3.C101824o80;

/* renamed from: ve1.o */
public final class C65631o extends C60896i<C0772s> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.a_f;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0772s sVar = (C0772s) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(sVar, "item");
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.fcr);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kwa);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.kw_);
        C101824o80 o802 = sVar.f1814d;
        if (o802 != null) {
            textView.setText(o802.f298996f);
            textView2.setText(o802.f298997g);
            C20828a.m22825b().mo32519h(o802.f298995e, imageView, ((C28387o0) C86312j.m106911c(C28387o0.class)).mo55764KA(o802.f298994d, o802.f298995e));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
