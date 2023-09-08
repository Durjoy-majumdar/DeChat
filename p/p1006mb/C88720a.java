package p1006mb;

import android.app.Activity;
import android.view.WindowInsets;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86127t;
import js0.C88020k;
import p284zb.C91635f;
import p958eb.C86470a;
import p958eb.C86474e;
import p958eb.C86476g;

/* renamed from: mb.a */
public class C88720a {

    /* renamed from: mb.a$a */
    public static class C88721a {

        /* renamed from: a */
        public volatile boolean f256077a = false;
    }

    /* renamed from: a */
    public static int m110688a(C91635f fVar) {
        WindowInsets b;
        int stableInsetTop;
        if (!(fVar.getRuntime() == null || fVar.mo125517G0(C86470a.class) == null)) {
            if (((C86474e) fVar.mo125517G0(C86474e.class)) == null || !(fVar.f240292z instanceof C86127t)) {
                Log.printErrStackTrace("MicroMsg.WAGameCommonUtil", new C86476g(), "hy: not game service", new Object[0]);
            } else {
                Activity o0 = fVar.mo114344o0();
                if (!(o0 == null || (b = C85924r4.m106237b(o0)) == null || (stableInsetTop = b.getStableInsetTop()) <= 0)) {
                    return C88020k.m109555f(stableInsetTop);
                }
            }
        }
        return 0;
    }
}
