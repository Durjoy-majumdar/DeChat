package e23;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import p171il.C98744t;
import p171il.C98748z;
import p813fl.C97942y;

/* renamed from: e23.e */
public final class C97595e implements C97942y {

    /* renamed from: a */
    public final C98744t f286328a;

    public C97595e(C98744t tVar) {
        C87412m.m108594g(tVar, "clickListener");
        this.f286328a = tVar;
    }

    /* renamed from: a */
    public C98748z<?> mo136857a(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b2u, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C97594d(inflate, this.f286328a);
    }

    /* renamed from: b */
    public int mo136858b() {
        List<String> list = C97592a.f286326a;
        return 108;
    }
}
