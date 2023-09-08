package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import java.util.List;
import p1177ce.C113287a;
import p212oe.C117776s;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$g */
public final /* synthetic */ class d$$j$$g implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ d$$j f355626a;

    /* renamed from: b */
    public final /* synthetic */ C114467i f355627b;

    public /* synthetic */ d$$j$$g(d$$j d__j, C114467i iVar) {
        this.f355626a = d__j;
        this.f355627b = iVar;
    }

    public final void accept(Object obj) {
        C113287a aVar;
        d$$j d__j = this.f355626a;
        C114467i iVar = this.f355627b;
        C113287a aVar2 = (C113287a) obj;
        d__j.getClass();
        C117776s sVar = (C117776s) iVar;
        if (sVar.mo182525A()) {
            String y = sVar.mo182526y();
            if ("ExplicitBg".equals(y) || "ExplicitBgPoll".equals(y) || "ExcessiveCpu".equals(y)) {
                String str = iVar.f343167p;
                List<String> list = C91179e.C91181b.C91182a.f261437a;
                if (str.equals("biz") && (aVar = iVar.f343163l) != null) {
                    e$b$a$$b e_b_a__b = new e$b$a$$b(iVar, aVar);
                    List<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> g = ((C117776s) iVar).mo173663g();
                    if (g != null) {
                        e_b_a__b.accept(g);
                    }
                }
            }
            if ("ExplicitBg".equals(y) || "ExplicitBgPoll".equals(y) || "ExplicitFg".equals(y) || "ExcessiveCpu".equals(y)) {
                iVar.mo173664h(new d$$j$$h(iVar));
            }
        }
    }
}
