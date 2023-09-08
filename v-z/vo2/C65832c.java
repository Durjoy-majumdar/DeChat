package vo2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;

/* renamed from: vo2.c */
public class C65832c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f189312d;

    /* renamed from: e */
    public final /* synthetic */ boolean f189313e;

    public C65832c(boolean z, boolean z2) {
        this.f189312d = z;
        this.f189313e = z2;
    }

    public void run() {
        try {
            RecyclerViewDrawerSquares.C45117c cVar = C65833d.f189314a;
            if (cVar != null) {
                if (this.f189312d) {
                    cVar.mo3766g(true, this.f189313e, 0);
                    return;
                }
                cVar.mo3766g(false, this.f189313e, 0);
                if (!this.f189313e) {
                    C65833d.f189314a.mo9498f();
                    C65833d.m77548c((RecyclerViewDrawerSquares.C45117c) null);
                }
            }
        } catch (Throwable th) {
            Log.m105920e("AdHalfScreenLandingPageState", "onHalfScreenAnimationChange, exp=" + th.toString());
        }
    }
}
