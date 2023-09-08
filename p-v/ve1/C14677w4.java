package ve1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0794y0;
import com.tencent.p014mm.C0966R;
import er1.C7919x;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;

/* renamed from: ve1.w4 */
public final class C14677w4 extends C60896i<C0794y0> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cyu;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.na_);
        if (textView != null) {
            C7919x.m8091a(textView);
        }
    }
}
