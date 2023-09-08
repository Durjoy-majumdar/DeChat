package qk1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.List;
import l60.C99342a;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C50249le;
import up1.C27696y;

/* renamed from: qk1.h0 */
public final class C63218h0 extends RecyclerView.C16613e<C63219a> {

    /* renamed from: d */
    public List<C50249le> f179392d = new ArrayList();

    /* renamed from: qk1.h0$a */
    public final class C63219a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f179393A;

        /* renamed from: B */
        public final ImageView f179394B;

        /* renamed from: C */
        public final TextView f179395C;

        /* renamed from: z */
        public final View f179396z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63219a(C63218h0 h0Var, View view) {
            super(view);
            C87412m.m108594g(view, "view");
            this.f179396z = view;
            View findViewById = view.findViewById(C0966R.C0970id.nfk);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.article_title)");
            this.f179393A = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.mu8);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.article_cover)");
            this.f179394B = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.nop);
            C87412m.m108593f(findViewById3, "view.findViewById(R.id.published_date)");
            this.f179395C = (TextView) findViewById3;
        }
    }

    public int getItemCount() {
        return this.f179392d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63219a aVar = (C63219a) zVar;
        C87412m.m108594g(aVar, "holder");
        C50249le leVar = this.f179392d.get(i);
        C87412m.m108594g(leVar, "article");
        aVar.f179393A.setText(leVar.f137336d);
        ((C99342a) ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(leVar.f137342j, C27696y.RAW_IMAGE))).mo85954d(aVar.f179394B);
        aVar.f179395C.setText(C72715f.m85111d("yyyy/MM/dd HH:mm", (long) leVar.f137334S));
        aVar.f179396z.setOnClickListener(new C47866g0(leVar));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d1o, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C63219a(this, inflate);
    }
}
