package p1059wd;

import android.view.Choreographer;
import gy3.C87412m;
import p416qd.C89598h;

/* renamed from: wd.b$$a */
public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90957b f261012d;

    public /* synthetic */ b$$a(C90957b bVar) {
        this.f261012d = bVar;
    }

    public final void run() {
        Choreographer j;
        C90957b bVar = this.f261012d;
        C87412m.m108594g(bVar, "this$0");
        if (bVar.f261001g && (j = bVar.mo125035j(true)) != null) {
            j.removeFrameCallback(bVar);
            j.postFrameCallback(bVar);
            C89598h.m112045b("AnimationFrameHandler", "Aha! we get a choreographer after try [" + bVar.f261010n + "] times ", new Object[0]);
        }
    }
}
