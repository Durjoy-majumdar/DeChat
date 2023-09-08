package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter;
import dp1.C7432d2;
import ef1.C58553c;
import ht1.C60172g4;
import rs1.C13442s8;

/* renamed from: kf1.e2 */
public final class C9694e2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedDetailUIContract$Presenter f30100d;

    public C9694e2(FinderFeedDetailUIContract$Presenter finderFeedDetailUIContract$Presenter) {
        this.f30100d = finderFeedDetailUIContract$Presenter;
    }

    public final void run() {
        C58553c a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30100d.f29961d);
        if (f != null && (a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) != null) {
            a.mo83451b(new C7432d2(0));
        }
    }
}
