package ve1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bd1.C54446b;
import cm1.C55029s1;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: ve1.m6 */
public final class C14571m6 extends C60896i<C55029s1> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.amm;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C55029s1) cVar, "item");
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        int i3 = c != null ? c.field_systemMsgCount : 0;
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.h2q);
        if (i3 > 0) {
            textView.setVisibility(0);
            textView.setText(i3 > 999 ? "999+" : String.valueOf(i3));
        } else {
            textView.setVisibility(8);
        }
        oVar.f44854d.setOnTouchListener(new C14563l6(textView));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
