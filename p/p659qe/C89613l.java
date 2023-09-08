package p659qe;

import android.os.Handler;
import com.tencent.matrix.util.JavaMemInfo;
import com.tencent.matrix.util.MemInfo;
import com.tencent.matrix.util.NativeMemInfo;
import com.tencent.matrix.util.PssInfo;
import gy3.C8477a0;
import gy3.C87412m;
import p723vf.C118672d;
import p723vf.C90778c;
import rx3.C13604l;

/* renamed from: qe.l */
public final class C89613l {

    /* renamed from: a */
    public final Handler f257812a = C90778c.m113843a();

    /* renamed from: b */
    public final Runnable f257813b = new C89614a(this);

    /* renamed from: c */
    public final C89616n f257814c;

    /* renamed from: qe.l$a */
    public static final class C89614a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89613l f257815d;

        public C89614a(C89613l lVar) {
            this.f257815d = lVar;
        }

        public final void run() {
            C89613l lVar = this.f257815d;
            lVar.getClass();
            MemInfo b = MemInfo.f235669p.mo112157b();
            C8477a0 a0Var = new C8477a0();
            a0Var.f27482d = false;
            C89616n nVar = lVar.f257814c;
            C35836o oVar = nVar.f257817a;
            JavaMemInfo javaMemInfo = b.f235673g;
            C87412m.m108591d(javaMemInfo);
            C35836o oVar2 = nVar.f257818b;
            NativeMemInfo nativeMemInfo = b.f235674h;
            C87412m.m108591d(nativeMemInfo);
            C13604l lVar2 = new C13604l("native", Boolean.valueOf(oVar2.mo60436a(nativeMemInfo.f235681f, new C35833i(b, a0Var))));
            boolean z = true;
            C35836o oVar3 = nVar.f257819c;
            PssInfo pssInfo = b.f235677n;
            C87412m.m108591d(pssInfo);
            C35836o oVar4 = nVar.f257820d;
            PssInfo pssInfo2 = b.f235676j;
            C87412m.m108591d(pssInfo2);
            C13604l[] lVarArr = {new C13604l("java", Boolean.valueOf(oVar.mo60436a(javaMemInfo.f235665f, new C35832h(b, a0Var)))), lVar2, new C13604l("debugPss", Boolean.valueOf(oVar3.mo60436a((long) pssInfo.f235688d, new C35834j(b, a0Var)))), new C13604l("amsPss", Boolean.valueOf(oVar4.mo60436a((long) pssInfo2.f235688d, new C35835k(b, a0Var))))};
            for (int i = 0; i < 4; i++) {
                C13604l lVar3 = lVarArr[i];
                C118672d.m167353c("Matrix.monitor.BackgroundMemoryMonitor", "is over threshold ? " + lVar3, new Object[0]);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    z = false;
                    break;
                } else if (((Boolean) lVarArr[i2].f38556e).booleanValue()) {
                    break;
                } else {
                    i2++;
                }
            }
            C118672d.m167353c("Matrix.monitor.BackgroundMemoryMonitor", "check: overThreshold: " + z + ", shouldCallback: " + a0Var.f27482d + ' ' + b, new Object[0]);
            if (z && a0Var.f27482d) {
                C118672d.m167353c("Matrix.monitor.BackgroundMemoryMonitor", "report over threshold", new Object[0]);
                lVar.f257814c.f257824h.invoke(b);
            }
        }
    }

    public C89613l(C89616n nVar) {
        C87412m.m108594g(nVar, "config");
        this.f257814c = nVar;
    }
}
