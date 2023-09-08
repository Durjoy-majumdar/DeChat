package ye0;

import fy3.C32226l;
import gy3.C87412m;
import org.libpag.PAGFile;
import rx3.C13598b0;
import ye0.C102831a;
import ze0.C103011a;

/* renamed from: ye0.b */
public final class C102836b extends C102831a {

    /* renamed from: o */
    public final C103011a f303574o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102836b(C103011a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "loadConfig");
        this.f303574o = aVar;
    }

    /* renamed from: e */
    public void mo142557e(C102831a.C102832a aVar) {
        C32226l<? super PAGFile, C13598b0> lVar;
        C87412m.m108594g(aVar, "result");
        if (aVar instanceof C102831a.C102832a.C102834b) {
            PAGFile Load = PAGFile.Load(((C102831a.C102832a.C102834b) aVar).f303570a);
            C32226l<? super PAGFile, C13598b0> lVar2 = this.f303574o.f303960d;
            if (lVar2 != null) {
                lVar2.invoke(Load);
            }
        } else if ((aVar instanceof C102831a.C102832a.C102833a) && (lVar = this.f303574o.f303960d) != null) {
            lVar.invoke(null);
        }
        this.f303574o.f303960d = null;
    }
}
