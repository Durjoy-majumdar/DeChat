package wn1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import tn1.C14058m;

/* renamed from: wn1.o */
public final class C15566o extends C60896i<C14058m> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aiu;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C14058m mVar = (C14058m) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(mVar, "item");
        ((TextView) oVar.mo85812D(C0966R.C0970id.ikx)).setText(oVar.f173499A.getString(C0966R.string.e16, new Object[]{String.valueOf(mVar.f39436d)}));
        oVar.f44854d.setOnClickListener(new C15565n(mVar));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
