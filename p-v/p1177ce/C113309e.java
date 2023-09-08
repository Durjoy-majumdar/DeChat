package p1177ce;

import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import p1177ce.C113291d;
import p981ie.C87705i;

/* renamed from: ce.e */
public class C113309e implements C87705i<C114451e> {

    /* renamed from: a */
    public final /* synthetic */ C113291d.C113292a.C113308d f339025a;

    public C113309e(C113291d.C113292a.C113295c cVar, C113291d.C113292a.C113308d dVar) {
        this.f339025a = dVar;
    }

    public void accept(Object obj) {
        C114451e.C114458h i = ((C114451e) obj).mo173652i(0);
        this.f339025a.mo165864c("run_time");
        C113291d.C113292a.C113308d dVar = this.f339025a;
        dVar.mo165869h("time", (((Long) i.f343144d.f343211a).longValue() / 60000) + "(min)");
        this.f339025a.mo165869h("fg", String.valueOf(i.f343145e.f343211a));
        this.f339025a.mo165869h("bg", String.valueOf(i.f343146f.f343211a));
        this.f339025a.mo165869h("fgSrv", String.valueOf(i.f343147g.f343211a));
        this.f339025a.mo165869h("float", String.valueOf(i.f343148h.f343211a));
    }
}
