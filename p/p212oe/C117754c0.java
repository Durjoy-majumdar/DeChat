package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import du3.C116630c;
import eu3.C86698f;
import java.util.HashMap;
import java.util.List;
import p1177ce.C113291d;
import p1177ce.C113314g;
import p269xe.C118873d;
import p269xe.d$$i;
import p269xe.d$$j;
import p981ie.C117187w;

/* renamed from: oe.c0 */
public final class C117754c0 extends C114436a {

    /* renamed from: k */
    public C118873d f352159k;

    /* renamed from: l */
    public C117755a f352160l;

    /* renamed from: oe.c0$a */
    public final class C117755a {

        /* renamed from: a */
        public final C116630c f352161a;

        public C117755a(C116630c cVar, C117749a0 a0Var) {
            this.f352161a = cVar;
        }
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
        C117755a aVar = this.f352160l;
        aVar.getClass();
        C86698f.f251708a = new C117752b0(aVar);
    }

    /* renamed from: d */
    public int mo111818d() {
        return 0;
    }

    /* renamed from: e */
    public void mo173631e(C113314g gVar) {
        super.mo173631e(gVar);
        Math.max(C117750b.f352131j, 5);
        this.f352160l = new C117755a(C86698f.f251708a, (C117749a0) null);
        C113291d dVar = gVar.f339057d.f339031b;
        if (dVar instanceof C118873d) {
            this.f352159k = (C118873d) dVar;
        }
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        C86698f.f251708a = this.f352160l.f352161a;
    }

    /* renamed from: l */
    public C117187w.C117192d mo173635l(int i, long j, long j2) {
        return super.mo173635l(i, j, j2);
    }

    /* renamed from: n */
    public void mo173637n(String str, int i, int i2) {
    }

    /* renamed from: o */
    public void mo173638o(int i, String str, long j) {
        super.mo173638o(i, str, j);
    }

    /* renamed from: p */
    public void mo173639p(String str, int i) {
        super.mo173639p(str, i);
    }

    /* renamed from: q */
    public void mo173640q(String str, int i) {
        super.mo173640q(str, i);
    }

    /* renamed from: r */
    public void mo173641r(List<C114490k0.C114491a.C114492a<C114436a.C114440d>> list) {
        C114490k0.C114491a.C114492a aVar;
        C118873d dVar = this.f352159k;
        if (dVar != null) {
            Log.m105924i("Matrix.battery.listener", "#onTraceOverHeat, size = " + list.size());
            if (!list.isEmpty() && (aVar = list.get(0)) != null && ((Long) ((C114436a.C114440d) aVar.f343207c).f343110g.f343211a).longValue() > 0) {
                C113291d.C113292a.C113308d dVar2 = new C113291d.C113292a.C113308d();
                dVar2.mo165870i();
                dVar2.f339024a.append("| ThreadPool Task Jiffies Tracing OverHeat");
                dVar2.mo165862a("\n");
                C117776s sVar = new C117776s(dVar.f338985d, "overheat");
                ((HashMap) sVar.f343158g).put(C117754c0.class, list);
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

    /* renamed from: u */
    public void mo173644u(C114490k0.C114491a.C114492a<C114436a.C114440d> aVar) {
        super.mo173644u(aVar);
    }
}
