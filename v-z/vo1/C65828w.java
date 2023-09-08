package vo1;

import android.view.View;
import android.view.ViewGroup;
import kg3.C76577a;
import qj1.C12669t4;
import zo1.C66911a;

/* renamed from: vo1.w */
public final class C65828w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f189303d;

    /* renamed from: e */
    public final /* synthetic */ View f189304e;

    /* renamed from: f */
    public final /* synthetic */ C65826v f189305f;

    /* renamed from: vo1.w$a */
    public static final class C65829a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f189306d;

        /* renamed from: e */
        public final /* synthetic */ C65826v f189307e;

        /* renamed from: f */
        public final /* synthetic */ int f189308f;

        public C65829a(ViewGroup viewGroup, C65826v vVar, int i) {
            this.f189306d = viewGroup;
            this.f189307e = vVar;
            this.f189308f = i;
        }

        public final void run() {
            int measuredHeight = this.f189306d.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = this.f189306d.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            C66911a aVar = (C66911a) this.f189307e.f189296a.getPlugin(C66911a.class);
            if (aVar != null) {
                aVar.mo90906Z0(this.f189308f + i + C76577a.m92151b(this.f189306d.getContext(), 12));
            }
        }
    }

    public C65828w(ViewGroup viewGroup, View view, C65826v vVar) {
        this.f189303d = viewGroup;
        this.f189304e = view;
        this.f189305f = vVar;
    }

    public final void run() {
        ViewGroup viewGroup;
        Class cls = C12669t4.class;
        int measuredHeight = this.f189303d.getMeasuredHeight() != 0 ? this.f189303d.getMeasuredHeight() : C76577a.m92151b(this.f189303d.getContext(), 32);
        View view = this.f189304e;
        boolean z = false;
        int measuredHeight2 = (view != null ? view.getMeasuredHeight() : 0) + measuredHeight;
        ViewGroup.LayoutParams layoutParams = this.f189303d.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        C12669t4 t4Var = (C12669t4) this.f189305f.f189296a.getPlugin(cls);
        if (t4Var != null && t4Var.mo14483f0() == 0) {
            z = true;
        }
        if (z) {
            C12669t4 t4Var2 = (C12669t4) this.f189305f.f189296a.getPlugin(cls);
            if (t4Var2 != null && (viewGroup = t4Var2.f166287d) != null) {
                viewGroup.post(new C65829a(viewGroup, this.f189305f, i));
                return;
            }
            return;
        }
        C66911a aVar = (C66911a) this.f189305f.f189296a.getPlugin(C66911a.class);
        if (aVar != null) {
            aVar.mo90906Z0(i + C76577a.m92151b(this.f189303d.getContext(), 12));
        }
    }
}
