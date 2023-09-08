package n61;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.emoji.model.C93116n;
import com.tencent.p014mm.storage.C96984r2;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p61.C100640a0;
import p61.C100666n;
import p61.C100683x;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C101824o80;
import u61.C101963g;
import x51.C102562g;

/* renamed from: n61.b */
public final class C100078b extends RecyclerView.C16613e<C100666n> {

    /* renamed from: d */
    public C100640a0 f293188d;

    /* renamed from: e */
    public C32224a<C13598b0> f293189e;

    /* renamed from: f */
    public final LinkedList<C101824o80> f293190f = new LinkedList<>();

    public C100078b(C54248l.C54252d<C101824o80> dVar) {
        C87412m.m108594g(dVar, "diffCallback");
    }

    public int getItemCount() {
        return this.f293190f.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C32224a<C13598b0> aVar;
        C100666n nVar = (C100666n) zVar;
        C87412m.m108594g(nVar, "holder");
        I xVar = new C100683x();
        C101824o80 o802 = (C101824o80) C110818d0.m150917O(this.f293190f, i);
        C102562g gVar = new C102562g(o802);
        if (C101963g.m134218c(o802)) {
            if (C101963g.m134216a()) {
                gVar.mo142189b(7);
            } else {
                gVar.mo142189b(3);
            }
        }
        C93116n.C93117a aVar2 = C93116n.f268258c;
        if (C93116n.f268260e == null) {
            C93116n.f268260e = Boolean.valueOf(C75592q0.m90796z());
        }
        gVar.mo142188a(C87412m.m108589b(C93116n.f268260e, Boolean.TRUE), (C96984r2) null, C93116n.f268259d.containsKey(o802 != null ? o802.f298994d : null));
        xVar.f294996a = gVar;
        nVar.f294874A = xVar;
        nVar.mo140091y(xVar, new ArrayList());
        if (i >= getItemCount() - 3 && (aVar = this.f293189e) != null) {
            aVar.invoke();
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.ab8, viewGroup, false);
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "parent.context");
        C87412m.m108593f(inflate, "itemView");
        return new C100666n(context, inflate, (List) null, false, false, this.f293188d, 28, (C8480h) null);
    }
}
