package dm0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic$AppBrandOnOpReportStartEvent;
import u24.C90599h;

/* renamed from: dm0.a */
public class C86343a implements MMToClientEvent.C81947d {

    /* renamed from: a */
    public final MMToClientEvent.C81947d f251042a = this;

    /* renamed from: b */
    public final C83231l.C83234d f251043b;

    /* renamed from: c */
    public final /* synthetic */ C82554k f251044c;

    /* renamed from: dm0.a$a */
    public class C86344a extends C83231l.C83234d {
        public C86344a() {
        }

        /* renamed from: c */
        public void mo109497c() {
            MMToClientEvent.m100657u(C86343a.this.f251044c.getAppId(), C86343a.this.f251042a);
        }
    }

    public C86343a(C82554k kVar) {
        this.f251044c = kVar;
        C86344a aVar = new C86344a();
        this.f251043b = aVar;
        C83231l.m102140a(kVar.getAppId(), aVar);
    }

    /* renamed from: a */
    public void mo22085a(Object obj) {
        if ((obj instanceof AppBrandOpReportLogic$AppBrandOnOpReportStartEvent) && C90599h.m113509b(((AppBrandOpReportLogic$AppBrandOnOpReportStartEvent) obj).f242312d, this.f251044c.getAppId())) {
            MMToClientEvent.m100657u(this.f251044c.getAppId(), this.f251042a);
            C83231l.m102144e(this.f251044c.getAppId(), this.f251043b);
            AppBrandRuntime runtime = this.f251044c.getRuntime();
            if (runtime != null) {
                C81925i2 b0 = runtime.mo113047b0();
                C86346c cVar = new C86346c();
                cVar.mo115194p(b0);
                cVar.mo115158h();
            }
        }
    }
}
