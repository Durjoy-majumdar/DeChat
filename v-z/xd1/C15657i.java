package xd1;

import android.view.View;
import bl3.C39818r;
import com.google.android.material.appbar.AppBarLayout;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: xd1.i */
public final class C15657i implements AppBarLayout.C67445c {

    /* renamed from: a */
    public final /* synthetic */ C15644c f42330a;

    /* renamed from: xd1.i$a */
    public static final class C15658a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15644c f42331d;

        public C15658a(C15644c cVar) {
            this.f42331d = cVar;
        }

        public final void run() {
            C15665p pVar;
            C39818r rVar = C39818r.f106831a;
            C15669q qVar = (C15669q) rVar.mo62443b(this.f42331d.getContext()).mo75002a(C15669q.class);
            if (!qVar.mo80061o3().isEmpty() && (pVar = (C15665p) rVar.mo62445d(qVar.getActiveFragment()).mo62449e(C15665p.class)) != null && !pVar.mo14410e3().getDataList().isEmpty()) {
                pVar.mo14412g3().f30220j.getRecyclerView().mo17155w1();
                pVar.mo14412g3().f30220j.setTranslationY(0.0f);
            }
        }
    }

    public C15657i(C15644c cVar) {
        this.f42330a = cVar;
    }

    /* renamed from: a */
    public final void mo3128a(AppBarLayout appBarLayout, int i) {
        C15644c cVar = this.f42330a;
        View view = cVar.f42291g;
        if (view != null) {
            int height = view.getHeight();
            if (height != 0) {
                float f = (float) height;
                float abs = (f - ((float) Math.abs(i))) / f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(abs));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$initDrawerHeader$7", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$initDrawerHeader$7", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (i == 0 && appBarLayout != null) {
                appBarLayout.postDelayed(new C15658a(cVar), 250);
            }
        }
    }
}
