package fk3;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: fk3.j */
public final class C8097j extends RecyclerView.C16613e<C8098a> {

    /* renamed from: d */
    public ArrayList<Pair<String, ArrayList<String>>> f26952d;

    /* renamed from: e */
    public C32226l<? super Integer, C13598b0> f26953e;

    /* renamed from: fk3.j$a */
    public static final class C8098a extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f26954z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8098a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.mec);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.item_sug_name_tv)");
            this.f26954z = (TextView) findViewById;
        }
    }

    public C8097j(ArrayList<Pair<String, ArrayList<String>>> arrayList, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(arrayList, "sugList");
        C87412m.m108594g(lVar, "callback");
        this.f26952d = arrayList;
        this.f26953e = lVar;
    }

    public int getItemCount() {
        return this.f26952d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C8098a aVar = (C8098a) zVar;
        C87412m.m108594g(aVar, "holder");
        Pair<String, ArrayList<String>> pair = this.f26952d.get(i);
        C87412m.m108593f(pair, "sugList[position]");
        aVar.f26954z.setText((CharSequence) pair.first);
        aVar.f44854d.setOnClickListener(new C8099k(this, i));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cpi, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C8098a(inflate);
    }
}
