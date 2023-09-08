package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;
import java.util.HashMap;
import java.util.List;
import p1177ce.C113291d;
import p1177ce.C113314g;
import p269xe.C118873d;
import p269xe.d$$i;
import p269xe.d$$j;

/* renamed from: oe.u */
public final class C117778u extends C114436a {

    /* renamed from: k */
    public C118873d f352287k;

    /* renamed from: oe.u$a */
    public class C117779a implements MMHandler.TaskWatch {
        public C117779a() {
        }

        public void onTaskFinish(Runnable runnable) {
            C117778u.this.mo173639p(runnable.getClass().getName(), runnable.hashCode());
        }

        public void onTaskStart(Runnable runnable) {
            C117778u.this.mo173640q(runnable.getClass().getName(), runnable.hashCode());
        }
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
        if (MMApplicationContext.isMainProcess()) {
            C86709a0.m107525e().getWorkerHandler().setTaskWatch(new C117779a());
        }
    }

    /* renamed from: d */
    public int mo111818d() {
        return 0;
    }

    /* renamed from: e */
    public void mo173631e(C113314g gVar) {
        super.mo173631e(gVar);
        C113291d dVar = gVar.f339057d.f339031b;
        if (dVar instanceof C118873d) {
            this.f352287k = (C118873d) dVar;
        }
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.MMHandlerJiffies";
    }

    /* renamed from: o */
    public void mo173638o(int i, String str, long j) {
        super.mo173638o(i, str, j);
    }

    /* renamed from: r */
    public void mo173641r(List<C114490k0.C114491a.C114492a<C114436a.C114440d>> list) {
        C114490k0.C114491a.C114492a aVar;
        C118873d dVar = this.f352287k;
        if (dVar != null) {
            Log.m105924i("Matrix.battery.listener", "#onMMHandlerOverHeat, size = " + list.size());
            if (!list.isEmpty() && (aVar = list.get(0)) != null && ((Long) ((C114436a.C114440d) aVar.f343207c).f343110g.f343211a).longValue() > 0) {
                C113291d.C113292a.C113308d dVar2 = new C113291d.C113292a.C113308d();
                dVar2.mo165870i();
                dVar2.f339024a.append("| MMHandler Task Jiffies Tracing OverHeat");
                dVar2.mo165862a("\n");
                C117776s sVar = new C117776s(dVar.f338985d, "overheat");
                ((HashMap) sVar.f343158g).put(C117778u.class, list);
                new d$$i().mo165859a(sVar, dVar2);
                dVar2.mo165867f();
                dVar2.mo165865d();
                new d$$j("overheat").mo183582a(sVar);
            }
        }
    }

    /* renamed from: s */
    public boolean mo173642s(C114490k0.C114491a.C114492a<C114436a.C114440d> aVar) {
        return super.mo173642s(aVar);
    }
}
