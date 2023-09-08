package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.List;
import p1177ce.C113291d;
import p212oe.C117776s;
import p212oe.C117778u;
import p981ie.C87705i;

/* renamed from: xe.d$$i$$b */
public final /* synthetic */ class d$$i$$b implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ d$$i f355602a;

    /* renamed from: b */
    public final /* synthetic */ C114467i f355603b;

    /* renamed from: c */
    public final /* synthetic */ C113291d.C113292a.C113308d f355604c;

    public /* synthetic */ d$$i$$b(d$$i d__i, C114467i iVar, C113291d.C113292a.C113308d dVar) {
        this.f355602a = d__i;
        this.f355603b = iVar;
        this.f355604c = dVar;
    }

    public final void accept(Object obj) {
        d$$i d__i = this.f355602a;
        C114467i iVar = this.f355603b;
        C113291d.C113292a.C113308d dVar = this.f355604c;
        C117778u uVar = (C117778u) obj;
        d__i.getClass();
        List<C114490k0.C114491a.C114492a<C114436a.C114440d>> r = ((C117776s) iVar).mo173674r(C117778u.class);
        if (!r.isEmpty()) {
            dVar.mo165863b("mm_handler(" + r.size() + ")");
            d__i.mo183581d(r, iVar, dVar);
        }
    }
}
