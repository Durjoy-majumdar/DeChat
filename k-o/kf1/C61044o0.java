package kf1;

import android.content.Context;
import android.content.DialogInterface;
import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;

/* renamed from: kf1.o0 */
public final class C61044o0 extends C87413o implements C32226l<C55033u, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f173843d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61044o0(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        super(1);
        this.f173843d = finderCommentDrawerPresenter;
    }

    public Object invoke(Object obj) {
        C55033u uVar = (C55033u) obj;
        C87412m.m108594g(uVar, "commentItem");
        FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f173843d;
        finderCommentDrawerPresenter.getClass();
        Context context = finderCommentDrawerPresenter.f158615d;
        if (context != null) {
            C76879j.m92743n(context, C0966R.string.ejt, 0, new C61073z(finderCommentDrawerPresenter, uVar, context), (DialogInterface.OnClickListener) null);
        }
        return C13598b0.f38549a;
    }
}
