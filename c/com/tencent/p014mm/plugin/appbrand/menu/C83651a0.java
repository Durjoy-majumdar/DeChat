package com.tencent.p014mm.plugin.appbrand.menu;

import android.os.Process;
import android.os.SystemClock;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p1032sc.C90160a;
import p1032sc.C90161b;
import p1032sc.C90165c;
import p170ic.C87690d;
import rx3.C13604l;
import sx3.C77813z;
import ux3.C65486b;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.a0 */
public final class C83651a0 implements Runnable {

    /* renamed from: d */
    public static final C83651a0 f244276d = new C83651a0();

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.a0$a */
    public static final class C83652a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(((C90160a) t2).f258864e, ((C90160a) t).f258864e);
        }
    }

    public final void run() {
        String str;
        C86009m1 m1Var = new C86009m1("/proc/" + Process.myPid() + "/smaps");
        if (!m1Var.mo119967g() || !m1Var.mo119961a()) {
            Log.m105924i("AnalyzeSmaps", "smaps file isn't readable");
            return;
        }
        InputStream D = C86013q1.m106422D(m1Var);
        C87412m.m108593f(D, "openRead(this)");
        C90165c cVar = new C90165c(D);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList<C90160a> b = cVar.mo124417b();
        if (b instanceof C87690d.C87691a) {
            str = ((C87690d.C87691a) b).mo63320l();
        } else if (b == null || (str = b.toString()) == null) {
            str = "";
        }
        boolean a = C2039g2.m1987a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a) {
            Log.m105924i("Luggage.Utils.Profile", "runProfiled:log:" + "AnalyzeSmaps" + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a + ' ');
        } else {
            Log.m105928w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / ((long) 16))) + " frames! runProfiled:log:" + "AnalyzeSmaps" + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a + ' ');
        }
        C87412m.m108591d(b);
        Log.m105924i("AnalyzeSmaps", "===============SMAPS SUMMARY===============");
        Log.m105924i("AnalyzeSmaps", cVar.mo124418c());
        Log.m105924i("AnalyzeSmaps", "===============SMAPS GROUP TOP 50===============");
        List<C13604l<String, C90161b>> a2 = cVar.mo124416a();
        for (C13604l lVar : a2.subList(0, Math.min(50, a2.size()))) {
            Log.m105924i("AnalyzeSmaps", "\n[+] " + lVar);
        }
        Log.m105924i("AnalyzeSmaps", "===============SMAPS TOP 50 FOR===============");
        if (b.size() > 1) {
            C77813z.m93909o(b, new C83652a());
        }
        List<C90160a> subList = b.subList(0, Math.min(50, b.size()));
        C87412m.m108593f(subList, "entities.subList(0, minOf(50, entities.size))");
        for (C90160a aVar : subList) {
            Log.m105924i("AnalyzeSmaps", "* " + aVar);
        }
    }
}
