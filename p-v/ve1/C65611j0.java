package ve1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.j0 */
public final class C65611j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65592g0 f188800d;

    /* renamed from: e */
    public final /* synthetic */ TextView f188801e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188802f;

    public C65611j0(C65592g0 g0Var, TextView textView, C60905o oVar) {
        this.f188800d = g0Var;
        this.f188801e = textView;
        this.f188802f = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CommentDrawerContract.NPresenter nPresenter = this.f188800d.f188747e;
        TextView textView = this.f188801e;
        C87412m.m108593f(textView, "commentFailTV");
        nPresenter.mo77329f(textView, this.f188802f.mo17363j());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
