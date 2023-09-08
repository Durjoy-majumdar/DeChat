package fh1;

import a14.C53973z1;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* renamed from: fh1.z1 */
public final class C59091z1 implements RecyclerHorizontalViewPager.C57876b {

    /* renamed from: a */
    public final /* synthetic */ C59018f2 f169055a;

    public C59091z1(C59018f2 f2Var) {
        this.f169055a = f2Var;
    }

    /* renamed from: a */
    public void mo37032a(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
    }

    /* renamed from: b */
    public boolean mo37033b(int i, MotionEvent motionEvent, boolean z) {
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "bannerRv action down");
            C53973z1 z1Var = this.f169055a.f168864B;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
        }
        return z;
    }
}
