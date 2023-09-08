package l23;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c23.C67333e;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;

/* renamed from: l23.o */
public final class C76663o extends RecyclerView.C16613e<C76664p> {

    /* renamed from: d */
    public final LinkedList<C67333e> f224352d = new LinkedList<>();

    /* renamed from: e */
    public C32227p<? super Integer, ? super C67333e, C13598b0> f224353e;

    /* renamed from: c */
    public final void mo106929c(List<? extends C67333e> list) {
        C87412m.m108594g(list, "items");
        this.f224352d.clear();
        this.f224352d.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f224352d.size();
    }

    public int getItemViewType(int i) {
        return this.f224352d.get(i).f193175a;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C76664p pVar = (C76664p) zVar;
        C87412m.m108594g(pVar, "viewHolder");
        C67333e eVar = this.f224352d.get(i);
        C87412m.m108593f(eVar, "itemList[position]");
        C67333e eVar2 = eVar;
        pVar.mo106930y(eVar2);
        pVar.f44854d.setOnClickListener(new C76662n(this, i, eVar2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b2t, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context)\n   …nel_title, parent, false)");
            return new C76665w(inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b2r, viewGroup, false);
            C87412m.m108593f(inflate2, "from(parent.context)\n   …gic_panel, parent, false)");
            return new C99305m(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b2s, viewGroup, false);
            C87412m.m108593f(inflate3, "from(parent.context)\n   …nel_added, parent, false)");
            return new C99304l(inflate3);
        }
    }
}
