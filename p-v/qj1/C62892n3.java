package qj1;

import b50.C54405b;
import b50.C54412f;
import c50.C54655b;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;

/* renamed from: qj1.n3 */
public final class C62892n3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C62815i3 f178486d;

    public C62892n3(C62815i3 i3Var) {
        this.f178486d = i3Var;
    }

    public final void run() {
        C54405b bVar;
        C54655b c1 = this.f178486d.mo87797c1();
        if (c1 != null && (bVar = c1.f173032r) != null) {
            ((C54412f) bVar).mo75189c(FinderLiveService.f159376d.mo77650x());
        }
    }
}
