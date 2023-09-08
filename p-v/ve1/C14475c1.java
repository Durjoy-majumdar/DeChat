package ve1;

import android.view.View;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import rx3.C13598b0;
import te3.C50581nr0;

/* renamed from: ve1.c1 */
public final class C14475c1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14512f1 f40116d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40117e;

    /* renamed from: f */
    public final /* synthetic */ C50581nr0 f40118f;

    public C14475c1(C14512f1 f1Var, C60905o oVar, C50581nr0 nr02) {
        this.f40116d = f1Var;
        this.f40117e = oVar;
        this.f40118f = nr02;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14512f1 f1Var = this.f40116d;
        C60905o oVar = this.f40117e;
        C50581nr0 nr02 = this.f40118f;
        f1Var.getClass();
        C87412m.m108594g(oVar, "vh");
        C87412m.m108594g(nr02, "likeInfo");
        if (nr02.f138728h == 1) {
            f1Var.mo13773k(oVar);
        } else {
            C14512f1.m13823j(f1Var, oVar, false, 2, (Object) null);
        }
        nr02.f138728h = (nr02.f138728h + 1) % 2;
        C32226l<? super C50581nr0, C13598b0> lVar = f1Var.f40234g;
        if (lVar != null) {
            lVar.invoke(nr02);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
