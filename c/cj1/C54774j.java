package cj1;

import c50.C54655b;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import d50.C58115i;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: cj1.j */
public final class C54774j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54769i f153528d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54774j(C54769i iVar) {
        super(0);
        this.f153528d = iVar;
    }

    public Object invoke() {
        C54655b b;
        C58115i iVar;
        C54769i iVar2 = this.f153528d;
        iVar2.getClass();
        C61926c.m72668M(new C54793n(iVar2));
        this.f153528d.mo75677f();
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C54655b b2 = finderLiveService.mo77626b();
        boolean z = true;
        if (b2 == null || (iVar = b2.f172989A) == null || !iVar.f166263j) {
            z = false;
        }
        if (z && (b = finderLiveService.mo77626b()) != null) {
            b.mo85695n0();
        }
        return C13598b0.f38549a;
    }
}
