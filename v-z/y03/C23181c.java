package y03;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import x03.C22947b;
import x03.C22949d;
import x03.C22953h;

/* renamed from: y03.c */
public class C23181c extends C22949d {
    /* renamed from: b */
    public void mo36128b(C22947b bVar) {
        RecyclerView recyclerView = bVar.getRecyclerView();
        C22953h a = C22949d.m27076a(bVar);
        if (a instanceof C23207k) {
            C23207k kVar = (C23207k) a;
            int j = kVar != null ? kVar.mo17363j() : -1;
            if (j != bVar.mo24981e2() && bVar.mo24995y5().f66031e) {
                bVar.mo24995y5().mo36221m();
                if (kVar != null) {
                    bVar.mo24967U2().mo36207e(kVar.f65949A);
                }
            }
            bVar.mo24943A();
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt.getTag() != null) {
                    C23207k kVar2 = (C23207k) bVar.getRecyclerView().mo17031P0(childAt);
                    if (kVar2.mo17363j() == j) {
                        kVar2.mo36117Y();
                        if (!bVar.mo24995y5().f66031e) {
                            kVar2.f66637D.mo36143g();
                        }
                    } else {
                        kVar2.f66637D.mo36152h();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo36129c(C22947b bVar) {
        C22953h a = C22949d.m27076a(bVar);
        if (a != null && (a instanceof C23207k)) {
            if (!bVar.mo24995y5().f66031e) {
                if (bVar.mo24973X4().mo36183b()) {
                    bVar.mo24977a7(a.f65949A);
                    a.mo36171I(true);
                } else {
                    a.mo36172y().mo36154j();
                    bVar.mo24995y5().mo36221m();
                }
            }
            a.mo36117Y();
            bVar.mo24992x1(a.mo36118Z());
        }
        bVar.mo24967U2().mo36205c();
    }
}
