package fj1;

import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fj1.c */
public final class C45797c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45795b f123704d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45797c(C45795b bVar) {
        super(0);
        this.f123704d = bVar;
    }

    public Object invoke() {
        C45795b bVar = this.f123704d;
        if (bVar.f123701h.f306531b == C39623j.C39626c.DESTROYED) {
            bVar.f123701h = new C103766u(bVar);
            C45795b bVar2 = this.f123704d;
            bVar2.f123702i = new C55908a(bVar2, "liveScope");
        }
        this.f123704d.f123701h.mo145138f(C39623j.C39626c.RESUMED);
        return C13598b0.f38549a;
    }
}
