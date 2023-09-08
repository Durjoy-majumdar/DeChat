package vf1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cj1.C54804r0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import rx3.C13598b0;

/* renamed from: vf1.f2 */
public final class C14760f2 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f40734d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14760f2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(1);
        this.f40734d = finderLiveDelManagerUI;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        FinderLiveDelManagerUI finderLiveDelManagerUI = this.f40734d;
        int i = FinderLiveDelManagerUI.f158985j;
        finderLiveDelManagerUI.getClass();
        if (!(str == null || str.length() == 0)) {
            C54804r0 r0Var = C54804r0.f153631a;
            AppCompatActivity context = finderLiveDelManagerUI.getContext();
            C45795b bVar = new C45795b((String) null, 1, (C8480h) null);
            C39818r rVar = C39818r.f106831a;
            AppCompatActivity context2 = finderLiveDelManagerUI.getContext();
            C87412m.m108593f(context2, "context");
            r0Var.mo75765g(context, bVar, false, str, ((C60172g4) rVar.mo62444c(context2).mo62447c(C60172g4.class)).mo12861q3());
        }
        return C13598b0.f38549a;
    }
}
