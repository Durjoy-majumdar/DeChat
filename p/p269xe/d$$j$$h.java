package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import java.util.List;
import p1177ce.C113287a;
import p212oe.C117750b;
import p212oe.C117776s;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$h */
public final /* synthetic */ class d$$j$$h implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355628a;

    public /* synthetic */ d$$j$$h(C114467i iVar) {
        this.f355628a = iVar;
    }

    public final void accept(Object obj) {
        C114467i iVar = this.f355628a;
        C113287a aVar = (C113287a) obj;
        if ((iVar instanceof C117776s) && ((C117776s) iVar).mo182525A() && aVar.f338976n >= Math.max(C117750b.f352134m, 10000)) {
            String str = iVar.f343167p;
            List<String> list = C91179e.C91181b.C91182a.f261437a;
            if ((str.equals("module") || str.equals("biz")) && ((C117776s) iVar).mo182527z()) {
                iVar.mo173664h(new e$b$a$$p(iVar));
            }
        }
    }
}
