package t61;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;

/* renamed from: t61.j */
public final class C101736j extends C60898l<C101727b<?>> {

    /* renamed from: s */
    public final C101738m f297814s;

    /* renamed from: t */
    public final LinkedList<C101728d> f297815t = new LinkedList<>();

    public C101736j(C101738m mVar) {
        C87412m.m108594g(mVar, "clickListener");
        this.f297814s = mVar;
    }

    /* renamed from: F4 */
    public int mo82597F4() {
        return this.f297815t.size();
    }

    /* renamed from: P5 */
    public RecyclerView.C16631z mo82602P5(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        return new C101732h(viewGroup, this.f297814s);
    }

    /* renamed from: n6 */
    public RecyclerView.C16631z mo82607n6(View view) {
        C87412m.m108594g(view, "view");
        return new C101737k(view);
    }

    /* renamed from: w5 */
    public void mo10426w5(RecyclerView.C16631z zVar, int i) {
        C101727b bVar = (C101727b) zVar;
        C87412m.m108594g(bVar, "holder");
        C101728d dVar = this.f297815t.get(i);
        C87412m.m108593f(dVar, "dataList[position]");
        bVar.mo141163y(dVar);
    }

    /* renamed from: y5 */
    public void mo82615y5(RecyclerView.C16631z zVar, int i, List list) {
        C101727b bVar = (C101727b) zVar;
        C87412m.m108594g(bVar, "holder");
        C87412m.m108594g(list, "payloads");
        C101728d dVar = this.f297815t.get(i);
        C87412m.m108593f(dVar, "dataList[position]");
        bVar.mo141163y(dVar);
    }
}
