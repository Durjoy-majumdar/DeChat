package nv2;

import android.app.Activity;
import android.os.Handler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.ref.WeakReference;
import lt3.C21460a;
import pv2.C22023p;
import pv2.C22024q;

/* renamed from: nv2.a */
public enum C21695a {
    IML;

    /* renamed from: a */
    public C21708j mo33960a(Activity activity, C22023p pVar, C22024q qVar, Handler handler) {
        if (pVar == null || qVar == null) {
            Log.m105920e("MicroMsg.SoterControllerFactory", "hy: reqmodel or resp model is null");
            return null;
        } else if ((pVar.f62339a & 1) != 0 && C21460a.m24280n(MMApplicationContext.getContext())) {
            return new C21696b(new WeakReference(activity), pVar, qVar, handler);
        } else {
            Log.m105921e("MicroMsg.SoterControllerFactory", "hy: no matching: %d", Byte.valueOf(pVar.f62339a));
            return null;
        }
    }
}
