package zi3;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gj3.C59476i;
import gy3.C87412m;
import java.util.List;

/* renamed from: zi3.c */
public class C66832c extends RecyclerView.C16613e<C66833f> {

    /* renamed from: d */
    public final List<Integer> f191954d;

    /* renamed from: e */
    public final int f191955e;

    /* renamed from: f */
    public final List<Pair<View, String>> f191956f;

    public C66832c(List<Integer> list, int i, List<Pair<View, String>> list2) {
        C87412m.m108594g(list, "dataList");
        this.f191954d = list;
        this.f191955e = i;
        this.f191956f = list2;
    }

    /* renamed from: F4 */
    public C66833f onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6327bm, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C66833f(inflate);
    }

    public int getItemCount() {
        int size = this.f191954d.size();
        int i = this.f191955e;
        return size > i ? i : this.f191954d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C66833f fVar = (C66833f) zVar;
        C87412m.m108594g(fVar, "holder");
        fVar.f191957z.setImageResource(this.f191954d.get(i).intValue());
        ImageView imageView = fVar.f191957z;
        C87412m.m108593f(imageView, "holder.vItem");
        C59476i.m69399a(imageView, "soontest" + i, Integer.valueOf(i));
        List<Pair<View, String>> list = this.f191956f;
        if (list != null) {
            ImageView imageView2 = fVar.f191957z;
            Pair create = Pair.create(imageView2, imageView2.getTransitionName());
            C87412m.m108593f(create, "create(holder.vItem, holder.vItem.transitionName)");
            list.add(create);
        }
    }
}
