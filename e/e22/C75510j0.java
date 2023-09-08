package e22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import gl3.C75921a;
import gl3.C75922b;
import gy3.C87412m;

/* renamed from: e22.j0 */
public final class C75510j0 extends C75921a {

    /* renamed from: B */
    public C75513c f221881B;

    /* renamed from: C */
    public final C75512b f221882C = new C75512b();

    /* renamed from: D */
    public final C75511a f221883D = new C75511a(this);

    /* renamed from: e22.j0$a */
    public final class C75511a implements C75922b.C75923a {
        public C75511a(C75510j0 j0Var) {
        }
    }

    /* renamed from: e22.j0$b */
    public final class C75512b implements C75922b.C75924b {
        public C75512b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f7086xs, viewGroup, false);
            C75511a aVar = C75510j0.this.f221883D;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.HeaderAddDataItem.HeaderAddViewHolder");
            C87412m.m108591d(inflate);
            View findViewById = inflate.findViewById(C0966R.C0970id.fgs);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.label_add_member_layout)");
            ((LinearLayout) findViewById).setOnClickListener(new C75514k0(C75510j0.this));
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    /* renamed from: e22.j0$c */
    public interface C75513c {
        /* renamed from: a */
        void mo95164a();
    }

    public C75510j0(int i) {
        super(1, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f221882C;
    }
}
