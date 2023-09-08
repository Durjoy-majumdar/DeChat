package il1;

import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import w50.C65929d;

/* renamed from: il1.n1 */
public final class C60461n1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60413h1 f172372d;

    public C60461n1(C60413h1 h1Var) {
        this.f172372d = h1Var;
    }

    public final void run() {
        C60413h1 h1Var = this.f172372d;
        h1Var.f172255m = h1Var.f172246d.getMeasuredWidth() - this.f172372d.f172245c.getMeasuredWidth();
        C60413h1 h1Var2 = this.f172372d;
        C65929d.C65930a aVar = h1Var2.f172252j;
        if (aVar != null) {
            FinderLiveService.f159376d.getClass();
            C65929d.C65930a aVar2 = FinderLiveService.f159394x.get(Integer.valueOf(aVar.f189538a));
            C60413h1.m70666c(h1Var2, aVar2 != null ? aVar2.f189541d : 0);
            h1Var2.mo85381e();
        }
    }
}
