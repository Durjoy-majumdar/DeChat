package tq3;

import com.google.android.material.appbar.AppBarLayout;
import qq3.C110444a;

/* renamed from: tq3.a */
public final class C111051a implements AppBarLayout.C67445c {

    /* renamed from: a */
    public final /* synthetic */ C110444a f332549a;

    public C111051a(C110444a aVar) {
        this.f332549a = aVar;
    }

    /* renamed from: a */
    public final void mo3128a(AppBarLayout appBarLayout, int i) {
        C110444a aVar = this.f332549a;
        boolean z = true;
        boolean z2 = i >= 0;
        if (appBarLayout.getTotalScrollRange() + i > 0) {
            z = false;
        }
        aVar.mo161934e(z2, z);
    }
}
