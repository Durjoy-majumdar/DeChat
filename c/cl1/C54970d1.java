package cl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import java.util.ArrayList;
import java.util.Collection;
import rx3.C13598b0;

/* renamed from: cl1.d1 */
public final class C54970d1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54943a1 f154090d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<ArrayList<Object>> f154091e;

    public C54970d1(C54943a1 a1Var, C8479f0<ArrayList<Object>> f0Var) {
        this.f154090d = a1Var;
        this.f154091e = f0Var;
    }

    public final void run() {
        C54943a1 a1Var = this.f154090d;
        C8479f0<ArrayList<Object>> f0Var = this.f154091e;
        synchronized (a1Var) {
            Log.m105924i("MMFinder.LiveMsgSpeedControlSlice", "add msg size = " + ((ArrayList) f0Var.f27484d).size());
            a1Var.f153979j.addAll((Collection) f0Var.f27484d);
            if (a1Var.f153979j.size() > a1Var.f153975f.f184130d) {
                int size = a1Var.f153979j.size() - a1Var.f153975f.f184130d;
                Log.m105924i("MMFinder.LiveMsgSpeedControlSlice", "cacheSize: " + a1Var.f153979j.size() + ", reach cache limit:" + a1Var.f153975f.f184130d + " del size:" + size);
                a1Var.f153979j.mo75856f(size);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
