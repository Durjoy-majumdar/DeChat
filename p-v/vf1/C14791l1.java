package vf1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cj1.C54804r0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorCommentManagerUI;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import rx3.C13598b0;

/* renamed from: vf1.l1 */
public final class C14791l1 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorCommentManagerUI f40774d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14791l1(FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
        super(1);
        this.f40774d = finderLiveAnchorCommentManagerUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI = this.f40774d;
        int i = FinderLiveAnchorCommentManagerUI.f158931z;
        finderLiveAnchorCommentManagerUI.getClass();
        if (!(str == null || str.length() == 0)) {
            C54804r0 r0Var = C54804r0.f153631a;
            AppCompatActivity context = finderLiveAnchorCommentManagerUI.getContext();
            C45795b bVar = new C45795b((String) null, 1, (C8480h) null);
            C39818r rVar = C39818r.f106831a;
            AppCompatActivity context2 = finderLiveAnchorCommentManagerUI.getContext();
            C87412m.m108593f(context2, "context");
            r0Var.mo75765g(context, bVar, false, str, ((C60172g4) rVar.mo62444c(context2).mo62447c(C60172g4.class)).mo12861q3());
        }
        return C13598b0.f38549a;
    }
}
