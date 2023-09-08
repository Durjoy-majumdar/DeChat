package q70;

import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner;
import com.tencent.matrix.util.MemInfo;
import com.tencent.matrix.util.ProcessInfo;
import com.tencent.matrix.util.PssInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import p659qe.C89610e;
import p659qe.C89611f;

/* renamed from: q70.b0 */
public final class C89489b0 implements Runnable {

    /* renamed from: d */
    public static final C89489b0 f257562d = new C89489b0();

    public final void run() {
        MemInfo[] a = MemInfo.f235669p.mo112156a();
        C89496f fVar = C89496f.f257573a;
        int i = 0;
        for (MemInfo memInfo : a) {
            PssInfo pssInfo = memInfo.f235676j;
            C87412m.m108591d(pssInfo);
            i += pssInfo.f235688d;
        }
        C89496f.m111882a(fVar, a, 2001, i, 0);
        C89496f fVar2 = C89496f.f257573a;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (MemInfo memInfo2 : a) {
            if (!z) {
                sb.append("\n|> SystemInfo: " + memInfo2.f235675i + 10);
                z = true;
            }
            sb.append("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemInfo <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("|> Process   : ");
            ProcessInfo processInfo = memInfo2.f235671e;
            C87412m.m108591d(processInfo);
            sb4.append(processInfo.f235683e);
            sb4.append(10);
            sb.append(sb4.toString());
            sb.append("|> AMS-Pss   : " + memInfo2.f235676j + 10);
            sb.append("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        }
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "builder.toString()");
        Log.m105918d("MicroMsg.monitor.AppBackgroundMemory", sb5);
        C89496f fVar3 = C89496f.f257573a;
        Log.m105918d("MicroMsg.monitor.AppBackgroundMemory", String.valueOf(fVar3.mo123799l(a)));
        fVar3.mo123797j().f257810f.mo162I(1, 1, a, a);
        fVar3.mo123794g().f257810f.mo162I(1, 1, a, a);
        fVar3.mo123793f().f257810f.mo162I(1, 1, a, a);
        fVar3.mo123792e().f257810f.mo162I(1, 1, a, a);
        fVar3.mo123791d().f257810f.mo162I(1, 1, a, a);
        fVar3.mo123790c().f257810f.mo162I(1, 1, a, a);
        fVar3.mo123789b().f257810f.mo162I(1, 1, a, a);
        fVar3.mo123796i().f257810f.mo162I(1, 1, a, a);
        fVar3.mo123795h().f257810f.mo162I(1, 1, a, a);
        long k = fVar3.mo123798k(500.0d);
        C89496f fVar4 = C89496f.f257573a;
        Object obj = AppDeepBackgroundOwner.INSTANCE;
        C32229r jVar = new C89514j(k);
        Object obj2 = C89515k.f257607d;
        if (true && true) {
            obj = AppStagedBackgroundOwner.INSTANCE;
        }
        if (true && true) {
            TimeUnit.MINUTES.toMillis(3);
        }
        if (true && true) {
            jVar = C89610e.f257803d;
        }
        if (true && true) {
            obj2 = C89611f.f257804d;
        }
        C87412m.m108594g(obj, "bgStatefulOwner");
        C87412m.m108594g(jVar, "callback");
        C87412m.m108594g(obj2, "extraPssFactory");
        TimeUnit.MINUTES.toMillis(5);
        jVar.mo162I(1, 1, a, a);
    }
}
