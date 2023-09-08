package xk1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.utils.FinderGameEventListener;
import di3.C86312j;
import er1.C58777u0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import qj1.C62987t2;
import te3.C50336m11;
import te3.C51006qs1;
import tf0.C13883o1;
import wg1.C66089v;

/* renamed from: xk1.h2 */
public final class C66315h2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f190903d;

    /* renamed from: e */
    public final /* synthetic */ C66297d2 f190904e;

    /* renamed from: f */
    public final /* synthetic */ List<C51006qs1> f190905f;

    public C66315h2(boolean z, C66297d2 d2Var, List<? extends C51006qs1> list) {
        this.f190903d = z;
        this.f190904e = d2Var;
        this.f190905f = list;
    }

    public final void onClick(View view) {
        C62987t2 t2Var;
        C66089v vVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$initPostLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58777u0.f168283a.mo83833b(2);
        Intent intent = new Intent();
        C50336m11 m112 = new C50336m11();
        m112.f137744d.addAll(this.f190905f);
        intent.putExtra("APP_LIST", m112.toByteArray());
        intent.putExtra("SHOW_SEARCH_LAYOUT", this.f190903d);
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (!(bVar == null || (t2Var = (C62987t2) bVar.getPlugin(C62987t2.class)) == null || (vVar = t2Var.f178716q) == null)) {
            vVar.mo90008x0();
        }
        ((C13883o1) C86312j.m106911c(C13883o1.class)).tb0(this.f190904e.getContext(), intent);
        this.f190904e.f190841B = new FinderGameEventListener(new WeakReference(this.f190904e.getContext()));
        FinderGameEventListener finderGameEventListener = this.f190904e.f190841B;
        if (finderGameEventListener != null) {
            finderGameEventListener.alive();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$initPostLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
