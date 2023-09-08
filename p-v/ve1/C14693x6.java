package ve1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C39994x1;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.x6 */
public final class C14693x6 extends C60896i<C39994x1> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.an5;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C39994x1 x1Var = (C39994x1) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(x1Var, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kxj);
        int i3 = x1Var.f107218f;
        if (i3 == 1) {
            if (textView != null) {
                textView.setText(oVar.f173499A.getResources().getString(C0966R.string.f360737eh1));
            }
        } else if (i3 == 2 && textView != null) {
            textView.setText(oVar.f173499A.getResources().getString(C0966R.string.eh7));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
