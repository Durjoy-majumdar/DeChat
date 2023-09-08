package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;
import rs1.C13562z2;

/* renamed from: rs1.c3 */
public final class C13136c3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13562z2 f37378d;

    public C13136c3(C13562z2 z2Var) {
        this.f37378d = z2Var;
    }

    public final void onClick(View view) {
        C13562z2.C13563a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showTipsBar$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13562z2 z2Var = this.f37378d;
        BaseFinderFeed baseFinderFeed = z2Var.f38476f;
        if (!(baseFinderFeed == null || (aVar = z2Var.f38480i.get(Long.valueOf(baseFinderFeed.getItemId()))) == null)) {
            aVar.mo12961b(false);
        }
        C76901s0 s0Var = z2Var.f38478h;
        if (s0Var != null) {
            s0Var.dismiss();
        }
        z2Var.f38478h = null;
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showTipsBar$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
