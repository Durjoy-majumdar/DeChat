package ve1;

import android.view.View;
import cm1.C55033u;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.k0 */
public final class C65615k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65592g0 f188812d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f188813e;

    /* renamed from: f */
    public final /* synthetic */ C55033u f188814f;

    public C65615k0(C65592g0 g0Var, C60905o oVar, C55033u uVar) {
        this.f188812d = g0Var;
        this.f188813e = oVar;
        this.f188814f = uVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CommentDrawerContract.NPresenter nPresenter = this.f188812d.f188747e;
        View view2 = this.f188813e.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        nPresenter.mo77335l1(view2, this.f188814f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$16$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
