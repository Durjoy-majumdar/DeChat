package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.List;
import p1177ce.C113291d;
import p212oe.C117775r;
import p212oe.C117776s;
import p981ie.C87705i;

/* renamed from: xe.d$$i$$c */
public final /* synthetic */ class d$$i$$c implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ d$$i f355605a;

    /* renamed from: b */
    public final /* synthetic */ C114467i f355606b;

    /* renamed from: c */
    public final /* synthetic */ C113291d.C113292a.C113308d f355607c;

    public /* synthetic */ d$$i$$c(d$$i d__i, C114467i iVar, C113291d.C113292a.C113308d dVar) {
        this.f355605a = d__i;
        this.f355606b = iVar;
        this.f355607c = dVar;
    }

    public final void accept(Object obj) {
        d$$i d__i = this.f355605a;
        C114467i iVar = this.f355606b;
        C113291d.C113292a.C113308d dVar = this.f355607c;
        C117775r rVar = (C117775r) obj;
        d__i.getClass();
        List<C114490k0.C114491a.C114492a<C114436a.C114440d>> r = ((C117776s) iVar).mo173674r(C117775r.class);
        if (!r.isEmpty()) {
            dVar.mo165863b("ipc_pool(" + r.size() + ")");
            d__i.mo183581d(r, iVar, dVar);
        }
    }
}
