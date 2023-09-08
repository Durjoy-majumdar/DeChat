package j14;

import a14.C53896h0;
import a14.C53935p1;
import f14.C58874d0;
import f14.C58876e0;
import f14.C58888k;
import java.util.concurrent.Executor;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: j14.b */
public final class C60719b extends C53935p1 implements Executor {

    /* renamed from: e */
    public static final C60719b f172955e = new C60719b();

    /* renamed from: f */
    public static final C53896h0 f172956f;

    static {
        C60730m mVar = C60730m.f172971e;
        int i = C58876e0.f168513a;
        int b = C58874d0.m68709b("kotlinx.coroutines.io.parallelism", 64 < i ? i : 64, 0, 0, 12, (Object) null);
        mVar.getClass();
        boolean z = true;
        if (b < 1) {
            z = false;
        }
        if (z) {
            f172956f = new C58888k(mVar, b);
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + b).toString());
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        f172956f.mo74497S(fVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        mo74497S(C66217g.f190253d, runnable);
    }

    /* renamed from: f0 */
    public void mo74564f0(C66212f fVar, Runnable runnable) {
        f172956f.mo74564f0(fVar, runnable);
    }

    /* renamed from: i0 */
    public Executor mo74625i0() {
        return this;
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
