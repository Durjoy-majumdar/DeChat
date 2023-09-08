package rs1;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: rs1.x5 */
public final class C63667x5 implements AppBarLayout.C67445c {

    /* renamed from: a */
    public final /* synthetic */ C63539a6 f180488a;

    /* renamed from: b */
    public final /* synthetic */ View f180489b;

    public C63667x5(C63539a6 a6Var, View view) {
        this.f180488a = a6Var;
        this.f180489b = view;
    }

    /* renamed from: a */
    public final void mo3128a(AppBarLayout appBarLayout, int i) {
        C63539a6 a6Var = this.f180488a;
        a6Var.f180208i = a6Var.mo88397c3().f42968b.getTotalScrollRange();
        this.f180488a.f180210j = Math.abs(i);
        boolean z = false;
        if (this.f180489b.getHeight() < this.f180488a.mo88397c3().f42973g.getMinimumHeight()) {
            C63539a6 a6Var2 = this.f180488a;
            a6Var2.f180206h = true;
            a6Var2.f180211n = false;
        } else {
            C63539a6 a6Var3 = this.f180488a;
            int i2 = a6Var3.f180208i;
            if (i2 == 0 || ((double) (((float) a6Var3.f180210j) / ((float) i2))) < 0.5d) {
                z = true;
            }
            a6Var3.f180206h = z;
        }
        this.f180488a.mo88401g3();
    }
}
