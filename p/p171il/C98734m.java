package p171il;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p813fl.C97906h;
import p813fl.C97907h0;
import p813fl.C97915l0;
import p813fl.C97927q0;
import p813fl.C97935v;
import p813fl.C97942y;
import p813fl.C97944z;
import sx3.C110818d0;

/* renamed from: il.m */
public class C98734m extends RecyclerView.C16613e<C98748z<?>> implements C98745v {

    /* renamed from: d */
    public final C97906h f289519d;

    /* renamed from: e */
    public final ArrayList<C97927q0> f289520e;

    /* renamed from: f */
    public C98744t f289521f;

    /* renamed from: il.m$a */
    public static class C98735a implements C97915l0 {

        /* renamed from: a */
        public final C98734m f289522a;

        public C98735a(C98734m mVar) {
            C87412m.m108594g(mVar, "adapter");
            this.f289522a = mVar;
        }

        /* renamed from: a */
        public void mo137241a(int i, int i2) {
            this.f289522a.notifyItemRangeRemoved(i, i2);
        }

        /* renamed from: b */
        public void mo137242b(int i, int i2) {
            this.f289522a.notifyItemRangeInserted(i, i2);
        }

        /* renamed from: c */
        public void mo127712c(C97907h0 h0Var) {
            C87412m.m108594g(h0Var, "data");
            this.f289522a.mo138125c(h0Var.mo127614a());
        }

        /* renamed from: d */
        public void mo137243d(int i, int i2) {
            this.f289522a.notifyItemRangeChanged(i, i2);
        }

        /* renamed from: e */
        public void mo137244e(int i, int i2) {
            this.f289522a.notifyItemMoved(i, i2);
        }
    }

    public C98734m() {
        this((C97906h) null, 1, (C8480h) null);
    }

    public C98734m(C97906h hVar) {
        this.f289519d = hVar;
        this.f289520e = new ArrayList<>();
    }

    /* renamed from: F4 */
    public final void mo138123F4(int i, C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289520e.add(i, q0Var);
    }

    /* renamed from: G4 */
    public void onBindViewHolder(C98748z<?> zVar, int i) {
        C87412m.m108594g(zVar, "holder");
        C97927q0 q0Var = this.f289520e.get(i);
        C87412m.m108593f(q0Var, "itemList[position]");
        zVar.mo136856y(q0Var);
    }

    /* renamed from: O4 */
    public C98748z<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        SparseArray<C97942y> sparseArray = C97944z.f287281a;
        C97942y yVar = C97944z.f287281a.get(i);
        if (yVar != null) {
            return yVar.mo136857a(viewGroup);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 1:
                View inflate = from.inflate(C0966R.C0971layout.f359651a23, viewGroup, false);
                C87412m.m108593f(inflate, "itemView");
                return new C98718g0(inflate, this.f289521f);
            case 2:
                View inflate2 = from.inflate(C0966R.C0971layout.a25, viewGroup, false);
                C87412m.m108593f(inflate2, "itemView");
                return new C98724j0(inflate2, this.f289521f, this.f289519d);
            case 3:
                View inflate3 = from.inflate(C0966R.C0971layout.c0b, viewGroup, false);
                C87412m.m108593f(inflate3, "itemView");
                return new C98737q(inflate3, this.f289521f);
            case 4:
                View inflate4 = from.inflate(C0966R.C0971layout.a1x, viewGroup, false);
                C87412m.m108593f(inflate4, "itemView");
                return new C98738r(inflate4, this.f289521f);
            case 5:
                View inflate5 = from.inflate(C0966R.C0971layout.c0c, viewGroup, false);
                C87412m.m108593f(inflate5, "itemView");
                return new C98748z<>(inflate5, this.f289521f);
            case 6:
                View inflate6 = from.inflate(C0966R.C0971layout.a1w, viewGroup, false);
                C87412m.m108593f(inflate6, "itemView");
                return new C98704b(inflate6, this.f289521f);
            case 7:
                View inflate7 = from.inflate(C0966R.C0971layout.a1u, viewGroup, false);
                C87412m.m108593f(inflate7, "itemView");
                return new C98701a(inflate7, this.f289521f);
            case 8:
                View inflate8 = from.inflate(C0966R.C0971layout.a1y, viewGroup, false);
                C87412m.m108593f(inflate8, "itemView");
                return new C98707c(inflate8, this.f289521f);
            case 9:
                View inflate9 = from.inflate(C0966R.C0971layout.f359652a24, viewGroup, false);
                C87412m.m108593f(inflate9, "itemView");
                return new C98739s(inflate9, this.f289521f);
            case 10:
                return new C97935v(viewGroup, this.f289521f, this.f289519d);
            default:
                View inflate10 = from.inflate(C0966R.C0971layout.a1v, viewGroup, false);
                C87412m.m108593f(inflate10, "itemView");
                return new C98736p(inflate10, this.f289521f);
        }
    }

    /* renamed from: Z */
    public void mo138124Z(C98744t tVar) {
        this.f289521f = tVar;
    }

    /* renamed from: c */
    public void mo138125c(List<? extends C97927q0> list) {
        C87412m.m108594g(list, "items");
        this.f289520e.clear();
        this.f289520e.addAll(list);
    }

    public C97927q0 getItem(int i) {
        return (C97927q0) C110818d0.m150917O(this.f289520e, i);
    }

    public int getItemCount() {
        return this.f289520e.size();
    }

    public int getItemViewType(int i) {
        C97927q0 item = getItem(i);
        if (item != null) {
            return item.f287255a;
        }
        return 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C98734m(C97906h hVar, int i, C8480h hVar2) {
        this((i & 1) != 0 ? null : hVar);
    }
}
