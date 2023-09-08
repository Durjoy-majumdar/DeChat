package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import p1177ce.C113287a;
import p1177ce.C113291d;
import p269xe.d$$i;
import p269xe.d$$j;
import p981ie.C87705i;

/* renamed from: oe.v$$d */
public final /* synthetic */ class v$$d implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f352291a;

    /* renamed from: b */
    public final /* synthetic */ String f352292b;

    public /* synthetic */ v$$d(C114467i iVar, String str) {
        this.f352291a = iVar;
        this.f352292b = str;
    }

    public final void accept(Object obj) {
        C114467i iVar = this.f352291a;
        String str = this.f352292b;
        C113287a aVar = (C113287a) obj;
        if (((C117776s) iVar).mo182525A()) {
            C113291d.C113292a.C113308d dVar = new C113291d.C113292a.C113308d();
            dVar.mo165870i();
            dVar.f339024a.append("| ModuleTest: '");
            dVar.f339024a.append(str);
            dVar.mo165862a("'\n");
            new d$$i().mo165859a(iVar, dVar);
            dVar.mo165867f();
            dVar.mo165865d();
            new d$$j("module").mo183582a(iVar);
        }
    }
}
