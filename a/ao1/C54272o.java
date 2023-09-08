package ao1;

import android.widget.RelativeLayout;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import gy3.C87412m;

/* renamed from: ao1.o */
public final class C54272o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54277t f152330d;

    public C54272o(C54277t tVar) {
        this.f152330d = tVar;
    }

    public final void run() {
        C54277t tVar = this.f152330d;
        RelativeLayout relativeLayout = tVar.f152343h;
        if (relativeLayout != null) {
            tVar.getClass();
            ((PostMainUIC) C39818r.f106831a.mo62444c(tVar.getActivity()).mo75002a(PostMainUIC.class)).mo78424e3(relativeLayout);
            return;
        }
        C87412m.m108603p("shortTitleLayout");
        throw null;
    }
}
