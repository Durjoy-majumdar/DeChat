package cs1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;
import p171il.C98718g0;
import p171il.C98734m;
import p171il.C98748z;
import p813fl.C97906h;

/* renamed from: cs1.a */
public final class C97365a extends C98734m {
    public C97365a() {
        super((C97906h) null, 1, (C8480h) null);
    }

    /* renamed from: O4 */
    public C98748z<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            View inflate = from.inflate(C0966R.C0971layout.ckq, viewGroup, false);
            C87412m.m108593f(inflate, "itemView");
            return new C98718g0(inflate, this.f289521f);
        }
        View inflate2 = from.inflate(C0966R.C0971layout.ckq, viewGroup, false);
        C87412m.m108593f(inflate2, "itemView");
        return new C98718g0(inflate2, this.f289521f);
    }
}
