package z03;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import x03.C22947b;
import x03.C22949d;

/* renamed from: z03.d */
public class C23424d extends C22949d {
    /* renamed from: e */
    public static RecyclerView.C16631z m27948e(C22947b bVar) {
        View view;
        int i = 0;
        while (true) {
            if (i >= bVar.getRecyclerView().getChildCount()) {
                view = null;
                break;
            }
            view = bVar.getRecyclerView().getChildAt(i);
            RecyclerView.C16631z P0 = bVar.getRecyclerView().mo17031P0(view);
            if (view.getTag() != null && view.getTag().equals("video") && view.getTop() > 0 && P0.mo17363j() >= 0) {
                break;
            }
            i++;
        }
        if (view != null) {
            return bVar.getRecyclerView().mo17031P0(view);
        }
        return null;
    }

    /* renamed from: b */
    public void mo36128b(C22947b bVar) {
        RecyclerView recyclerView = bVar.getRecyclerView();
        RecyclerView.C16631z e = m27948e(bVar);
        if (e instanceof C23449k) {
            C23449k kVar = (C23449k) e;
            int Z = kVar != null ? kVar.mo36118Z() : -1;
            if (Z != bVar.mo24981e2() && bVar.mo24995y5().f66031e) {
                bVar.mo24995y5().mo36221m();
            }
            bVar.mo24943A();
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt.getTag() != null) {
                    C23449k kVar2 = (C23449k) bVar.getRecyclerView().mo17031P0(childAt);
                    if (kVar2.mo36118Z() == Z) {
                        kVar2.mo36908J();
                        kVar2.mo36117Y();
                        if (!bVar.mo24995y5().f66031e) {
                            kVar2.f67223D.mo36143g();
                        }
                    } else {
                        kVar2.mo36909K();
                        kVar2.f67223D.mo36152h();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo36129c(C22947b bVar) {
        RecyclerView.C16631z e = m27948e(bVar);
        if (e instanceof C23449k) {
            C23449k kVar = (C23449k) e;
            if (!bVar.mo24995y5().f66031e) {
                if (bVar.mo24973X4().mo36183b()) {
                    kVar.mo36171I(true);
                } else {
                    kVar.f67223D.mo36154j();
                    bVar.mo24995y5().mo36221m();
                }
            }
            kVar.mo36117Y();
            bVar.mo24992x1(kVar.mo36118Z());
            bVar.mo24967U2().mo36205c();
        }
    }

    /* renamed from: d */
    public void mo36130d(C22947b bVar, int i) {
        View view = null;
        for (int i2 = 0; i2 < bVar.getRecyclerView().getChildCount(); i2++) {
            view = bVar.getRecyclerView().getChildAt(i2);
            if (bVar.getRecyclerView().mo17029N0(view) == i) {
                break;
            }
        }
        if (view != null) {
            bVar.getRecyclerView().smoothScrollBy(0, bVar.mo24944C1().mo17564e(view) - bVar.mo24964S2());
        }
    }
}
