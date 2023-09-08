package aw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p646pn.C110234e;
import xv0.C112181e;

/* renamed from: aw0.o */
public class C103928o {
    /* renamed from: a */
    public static void m138641a(boolean z, boolean z2, boolean z3) {
        C112181e pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        if (pY == null) {
            Log.m105924i("MicroMsg.FloatBallVisibilityUtil", "operateFloatBall, service is null");
        } else if (!z) {
            Log.printInfoStack("MicroMsg.FloatBallVisibilityUtil", "operateFloatBall, show float ball, mark:%s", Boolean.valueOf(z3));
            if (z3) {
                pY.mo149097O(z2);
            } else {
                pY.mo149115d(z2);
            }
        } else if (z3) {
            pY.mo149086D(z2);
        } else {
            pY.mo149113c(z2);
        }
    }

    /* renamed from: b */
    public static void m138642b() {
        m138641a(false, true, true);
    }
}
