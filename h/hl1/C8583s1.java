package hl1;

import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import dk1.C58312g;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hl1.s1 */
public final class C8583s1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C59988k f27671d;

    public C8583s1(C59988k kVar) {
        this.f27671d = kVar;
    }

    public final void onClick(View view) {
        Class cls = C58312g.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$lazyInitPlugins$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39818r rVar = C39818r.f106831a;
        if (((C58312g) rVar.mo62444c(this.f27671d.f166847e).mo75002a(cls)).f166967e) {
            FinderLiveSideBar finderLiveSideBar = ((C58312g) rVar.mo62444c(this.f27671d.f166847e).mo75002a(cls)).f166968f;
            if (finderLiveSideBar != null) {
                finderLiveSideBar.mo77737d();
            }
            ((C58312g) rVar.mo62444c(this.f27671d.f166847e).mo75002a(cls)).f166971i.f166979h = 3;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$lazyInitPlugins$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
