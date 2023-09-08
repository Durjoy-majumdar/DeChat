package zi3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;

/* renamed from: zi3.d */
public final class C16213d extends RecyclerView.C16613e<C16214e> {

    /* renamed from: d */
    public final List<Integer> f43431d;

    /* renamed from: e */
    public final View.OnClickListener f43432e;

    public C16213d(List<Integer> list, View.OnClickListener onClickListener) {
        C87412m.m108594g(list, "dataList");
        C87412m.m108594g(onClickListener, "clickListener");
        this.f43431d = list;
        this.f43432e = onClickListener;
    }

    public int getItemCount() {
        return this.f43431d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C16214e eVar = (C16214e) zVar;
        C87412m.m108594g(eVar, "holder");
        eVar.f43433z.setText(String.valueOf(this.f43431d.get(i).intValue()));
        eVar.f43433z.setOnClickListener(this.f43432e);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6325bi, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C16214e(inflate);
    }
}
