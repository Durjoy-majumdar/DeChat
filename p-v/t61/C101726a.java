package t61;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: t61.a */
public final class C101726a extends RecyclerView.C16613e<C101727b<?>> {

    /* renamed from: d */
    public final C101738m f297800d;

    /* renamed from: e */
    public final LinkedList<C101728d> f297801e = new LinkedList<>();

    public C101726a(C101738m mVar) {
        C87412m.m108594g(mVar, "itemClickListener");
        this.f297800d = mVar;
    }

    public int getItemCount() {
        return this.f297801e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C101727b bVar = (C101727b) zVar;
        C87412m.m108594g(bVar, "holder");
        C101728d dVar = this.f297801e.get(i);
        C87412m.m108593f(dVar, "dataList[position]");
        bVar.mo141163y(dVar);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        return new C101732h(viewGroup, this.f297800d);
    }
}
