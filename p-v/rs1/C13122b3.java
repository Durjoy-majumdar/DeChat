package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;
import rs1.C13562z2;

/* renamed from: rs1.b3 */
public final class C13122b3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13562z2 f37351d;

    public C13122b3(C13562z2 z2Var) {
        this.f37351d = z2Var;
    }

    public final void onClick(View view) {
        C13562z2.C13563a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showTipsBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13562z2 z2Var = this.f37351d;
        BaseFinderFeed baseFinderFeed = z2Var.f38476f;
        if (baseFinderFeed != null) {
            String str = z2Var.f38477g;
            C13562z2.C13563a aVar2 = z2Var.f38480i.get(Long.valueOf(baseFinderFeed.getItemId()));
            if (aVar2 != null) {
                aVar2.mo12960a();
                aVar2.mo12962c(str);
            }
            BaseFinderFeed baseFinderFeed2 = z2Var.f38476f;
            if (!(baseFinderFeed2 == null || (aVar = z2Var.f38480i.get(Long.valueOf(baseFinderFeed2.getItemId()))) == null)) {
                aVar.mo12961b(false);
            }
            C76901s0 s0Var = z2Var.f38478h;
            if (s0Var != null) {
                s0Var.dismiss();
            }
            z2Var.f38478h = null;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showTipsBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
