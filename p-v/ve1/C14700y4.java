package ve1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0716c;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.y4 */
public final class C14700y4 extends C60896i<C0716c> {

    /* renamed from: e */
    public final List<View> f40649e = new ArrayList();

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.adb;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0716c) cVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.j85);
        oVar.mo85812D(C0966R.C0970id.f359146j83);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        List<View> list = this.f40649e;
        View D = oVar.mo85812D(C0966R.C0970id.j7v);
        C87412m.m108593f(D, "holder.getView(R.id.section_item_bottom_1)");
        ((ArrayList) list).add(D);
        List<View> list2 = this.f40649e;
        View D2 = oVar.mo85812D(C0966R.C0970id.j7w);
        C87412m.m108593f(D2, "holder.getView(R.id.section_item_bottom_2)");
        ((ArrayList) list2).add(D2);
        List<View> list3 = this.f40649e;
        View D3 = oVar.mo85812D(C0966R.C0970id.j7x);
        C87412m.m108593f(D3, "holder.getView(R.id.section_item_bottom_3)");
        ((ArrayList) list3).add(D3);
    }
}
