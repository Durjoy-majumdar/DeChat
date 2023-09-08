package vo2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;

/* renamed from: vo2.b */
public class C65831b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f189310d;

    /* renamed from: e */
    public final /* synthetic */ float f189311e;

    public C65831b(boolean z, float f) {
        this.f189310d = z;
        this.f189311e = f;
    }

    public void run() {
        RecyclerViewDrawerSquares.C45117c cVar;
        try {
            if (this.f189310d && (cVar = C65833d.f189314a) != null) {
                cVar.mo9497e(this.f189311e);
            }
        } catch (Throwable th) {
            Log.m105920e("AdHalfScreenLandingPageState", "onHalfScreenHeightChange, exp=" + th.toString());
        }
    }
}
