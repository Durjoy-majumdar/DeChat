package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.List;
import p1177ce.C113291d;
import p212oe.C117754c0;
import p212oe.C117776s;
import p981ie.C87705i;

/* renamed from: xe.d$$i$$a */
public final /* synthetic */ class d$$i$$a implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ d$$i f355599a;

    /* renamed from: b */
    public final /* synthetic */ C114467i f355600b;

    /* renamed from: c */
    public final /* synthetic */ C113291d.C113292a.C113308d f355601c;

    public /* synthetic */ d$$i$$a(d$$i d__i, C114467i iVar, C113291d.C113292a.C113308d dVar) {
        this.f355599a = d__i;
        this.f355600b = iVar;
        this.f355601c = dVar;
    }

    public final void accept(Object obj) {
        d$$i d__i = this.f355599a;
        C114467i iVar = this.f355600b;
        C113291d.C113292a.C113308d dVar = this.f355601c;
        C117754c0 c0Var = (C117754c0) obj;
        d__i.getClass();
        List<C114490k0.C114491a.C114492a<C114436a.C114440d>> r = ((C117776s) iVar).mo173674r(C117754c0.class);
        if (!r.isEmpty()) {
            dVar.mo165863b("thread_pool(" + r.size() + ")");
            d__i.mo183581d(r, iVar, dVar);
        }
    }
}
