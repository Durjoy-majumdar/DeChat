package lw2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gw2.C98266k;
import gy3.C87412m;
import java.util.ArrayList;
import zv2.C103109c;

/* renamed from: lw2.a */
public final class C10658a extends RecyclerView.C16613e<C10659a> {

    /* renamed from: d */
    public int f32077d;

    /* renamed from: e */
    public final ArrayList<C98266k> f32078e = new ArrayList<>();

    /* renamed from: lw2.a$a */
    public final class C10659a extends RecyclerView.C16631z {

        /* renamed from: z */
        public final View f32079z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10659a(C10658a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.k4q);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…y_control_page_indicator)");
            this.f32079z = findViewById;
        }
    }

    public int getItemCount() {
        return this.f32078e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C10659a aVar = (C10659a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f32079z.setSelected(i == this.f32077d);
        if (C103109c.f304232b.mo108963a()) {
            aVar.f32079z.setActivated(this.f32078e.get(i).f288078a.mo138656o2());
        } else {
            aVar.f32079z.setActivated(this.f32078e.get(i).f288083f.f288071d);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c7b, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context)\n   …tor_image, parent, false)");
        return new C10659a(this, inflate);
    }
}
