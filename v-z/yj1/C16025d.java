package yj1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import il1.C8961e;
import java.util.LinkedList;
import java.util.List;
import ok1.C11471u;
import rx3.C13598b0;
import te3.C51068r71;

/* renamed from: yj1.d */
public final class C16025d extends C8961e {

    /* renamed from: h */
    public final C32226l<Long, C13598b0> f43105h;

    /* renamed from: i */
    public final C32224a<C13598b0> f43106i;

    /* renamed from: j */
    public RecyclerView f43107j;

    /* renamed from: n */
    public final LinkedList<C16027b> f43108n;

    /* renamed from: o */
    public final C16026a f43109o;

    /* renamed from: p */
    public C51068r71 f43110p;

    /* renamed from: yj1.d$a */
    public final class C16026a extends RecyclerView.C16613e<C16028c> {

        /* renamed from: d */
        public final List<C16027b> f43111d;

        /* renamed from: e */
        public final /* synthetic */ C16025d f43112e;

        public C16026a(C16025d dVar, List<C16027b> list) {
            C87412m.m108594g(list, "itemList");
            this.f43112e = dVar;
            this.f43111d = list;
        }

        public int getItemCount() {
            return this.f43111d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C16028c cVar = (C16028c) zVar;
            C87412m.m108594g(cVar, "holder");
            cVar.f43117z.setOnClickListener(new C16024c(this.f43112e, i));
            TextView textView = cVar.f43115A;
            StringBuilder sb = new StringBuilder();
            sb.append(65509);
            sb.append(this.f43111d.get(i).f43113a);
            textView.setText(sb.toString());
            cVar.f43116B.setVisibility(this.f43111d.get(i).f43114b ? 0 : 8);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359747d21, viewGroup, false);
            C87412m.m108593f(inflate, "contentView");
            return new C16028c(inflate);
        }
    }

    /* renamed from: yj1.d$b */
    public static final class C16027b {

        /* renamed from: a */
        public final long f43113a;

        /* renamed from: b */
        public boolean f43114b;

        public C16027b(long j, boolean z) {
            this.f43113a = j;
            this.f43114b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16027b)) {
                return false;
            }
            C16027b bVar = (C16027b) obj;
            return this.f43113a == bVar.f43113a && this.f43114b == bVar.f43114b;
        }

        public int hashCode() {
            long j = this.f43113a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            boolean z = this.f43114b;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "ItemData(content=" + this.f43113a + ", isSelect=" + this.f43114b + ')';
        }
    }

    /* renamed from: yj1.d$c */
    public static final class C16028c extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f43115A;

        /* renamed from: B */
        public final WeImageView f43116B;

        /* renamed from: z */
        public final View f43117z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16028c(View view) {
            super(view);
            C87412m.m108594g(view, "view");
            this.f43117z = view;
            View findViewById = view.findViewById(C0966R.C0970id.f359001np3);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.quota_text)");
            this.f43115A = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.nk_);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.choose_icon)");
            this.f43116B = (WeImageView) findViewById2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16025d(Context context, C32226l<? super Long, C13598b0> lVar, C32224a<C13598b0> aVar) {
        super(context, false, (C11471u.C11473b) null, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "onSelect");
        C87412m.m108594g(aVar, "onCancel");
        this.f43105h = lVar;
        this.f43106i = aVar;
        LinkedList<C16027b> linkedList = new LinkedList<>();
        this.f43108n = linkedList;
        C16026a aVar2 = new C16026a(this, linkedList);
        this.f43109o = aVar2;
        RecyclerView recyclerView = this.f43107j;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(aVar2);
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: b */
    public View mo9448b() {
        return mo9765d();
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.f359748d22;
    }

    /* renamed from: j */
    public String mo9449j() {
        String string = this.f28306d.getResources().getString(C0966R.string.mwg);
        C87412m.m108593f(string, "context.resources.getStr…onsume_switch_list_title)");
        return string;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        View findViewById = view.findViewById(C0966R.C0970id.iiq);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.recycler_view)");
        this.f43107j = (RecyclerView) findViewById;
    }

    /* renamed from: l */
    public void mo9450l() {
    }

    /* renamed from: n */
    public void mo9451n() {
        mo9763a();
        this.f43106i.invoke();
    }
}
