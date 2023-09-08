package lq1;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76879j;
import rx3.C13598b0;
import sq1.C64151e;

/* renamed from: lq1.r */
public final class C61376r extends C87413o implements C32226l<C64151e, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ UniCommentDrawerPresenter f174574d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61376r(UniCommentDrawerPresenter uniCommentDrawerPresenter) {
        super(1);
        this.f174574d = uniCommentDrawerPresenter;
    }

    public Object invoke(Object obj) {
        C64151e eVar = (C64151e) obj;
        C87412m.m108594g(eVar, "commentItem");
        UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f174574d;
        uniCommentDrawerPresenter.getClass();
        Context context = uniCommentDrawerPresenter.f161376d;
        if (context != null) {
            C76879j.m92743n(context, C0966R.string.ejt, 0, new C61365i(uniCommentDrawerPresenter, eVar, context), (DialogInterface.OnClickListener) null);
        }
        return C13598b0.f38549a;
    }
}
