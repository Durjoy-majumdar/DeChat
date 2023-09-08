package ve1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.C2808m0;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.n8 */
public final class C14582n8 extends C60896i<C2808m0> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.abi;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C2808m0) cVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kab);
        if (textView != null) {
            textView.setTextSize(1, 12.0f);
            textView.setText((CharSequence) null);
            textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            textView.setBackgroundResource(C0966R.C0969drawable.f5104wx);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.setEnabled(true);
    }
}
