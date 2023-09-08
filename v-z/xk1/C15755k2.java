package xk1;

import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import il1.C9002h2;
import il1.C9118u;
import j20.C117292a;
import java.util.ArrayList;
import kj1.C10125e1;
import rx3.C13598b0;

/* renamed from: xk1.k2 */
public final class C15755k2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66297d2 f42481d;

    public C15755k2(C66297d2 d2Var) {
        this.f42481d = d2Var;
    }

    public final void onClick(View view) {
        C10125e1.C10132d dVar;
        C9118u uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("Finder.FinderLivePostUIC", "netSpeedTestResult:" + this.f42481d.f190842C);
        this.f42481d.mo90419j3();
        C10125e1 e1Var = ((C15715a2) C39818r.f106831a.mo62444c(this.f42481d.getActivity()).mo75002a(C15715a2.class)).f42407i;
        if (!(e1Var == null || (dVar = e1Var.f30989h) == null || (uVar = dVar.f31037c) == null)) {
            uVar.f28732b.mo9760f();
            C9002h2 h2Var = uVar.f28733c;
            h2Var.f28738f = null;
            h2Var.f28441n = null;
            h2Var.f28444q.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
