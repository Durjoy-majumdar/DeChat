package p212oe;

import a14.C53853a1;
import au3.C28134f;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import du3.C116630c;
import java.util.concurrent.ConcurrentHashMap;
import lu3.C117479j;
import p212oe.C117754c0;
import wx3.C15601d;
import yx3.C66705e;

/* renamed from: oe.b0 */
public class C117752b0 implements C116630c {

    /* renamed from: a */
    public final /* synthetic */ C117754c0.C117755a f352158a;

    public C117752b0(C117754c0.C117755a aVar) {
        this.f352158a = aVar;
    }

    /* renamed from: a */
    public void mo180611a(C117479j jVar) {
        this.f352158a.f352161a.mo180611a(jVar);
    }

    /* renamed from: b */
    public void mo180612b(C117479j jVar) {
        this.f352158a.f352161a.mo180612b(jVar);
    }

    /* renamed from: c */
    public boolean mo180613c(String str) {
        return this.f352158a.f352161a.mo180613c(str);
    }

    /* renamed from: d */
    public void mo180614d(C117479j jVar) {
        this.f352158a.f352161a.mo180614d(jVar);
        C117754c0.this.mo173639p(mo182501j(jVar), jVar.hashCode());
    }

    /* renamed from: e */
    public void mo180615e(C117479j jVar) {
        this.f352158a.f352161a.mo180615e(jVar);
        C117754c0 c0Var = C117754c0.this;
        jVar.hashCode();
        c0Var.getClass();
    }

    /* renamed from: f */
    public void mo180616f(C117479j jVar, long j, long j2) {
        this.f352158a.f352161a.mo180616f(jVar, j, j2);
        C117754c0.this.mo173639p(mo182501j(jVar), jVar.hashCode());
    }

    /* renamed from: g */
    public void mo180617g() {
        this.f352158a.f352161a.mo180617g();
    }

    /* renamed from: h */
    public void mo180618h(C117479j jVar) {
        this.f352158a.f352161a.mo180618h(jVar);
    }

    /* renamed from: i */
    public void mo180619i(C117479j jVar) {
        this.f352158a.f352161a.mo180619i(jVar);
        C117754c0.this.mo173640q(mo182501j(jVar), jVar.hashCode());
    }

    /* renamed from: j */
    public final String mo182501j(C117479j<?> jVar) {
        C114436a.C114440d dVar = (C114436a.C114440d) ((ConcurrentHashMap) C117754c0.this.f343097c).get(Integer.valueOf(jVar.hashCode()));
        if (dVar != null) {
            return dVar.f343108e;
        }
        Object obj = jVar.f351578o;
        if (!(obj instanceof C28134f)) {
            return jVar.getKey();
        }
        Runnable runnable = ((C28134f) obj).f77587d;
        if (runnable instanceof C53853a1) {
            String k = mo182502k(runnable);
            if (k != null) {
                return k;
            }
            return "ERR1-" + runnable.getClass().getName();
        }
        return "ERR2-" + runnable.getClass().getName();
    }

    /* renamed from: k */
    public final String mo182502k(Object obj) {
        C66705e callerFrame;
        if ((obj instanceof C66705e) && (callerFrame = ((C66705e) obj).getCallerFrame()) != null) {
            return mo182502k(callerFrame);
        }
        if (obj instanceof C15601d) {
            return obj.getClass().getName();
        }
        return null;
    }
}
