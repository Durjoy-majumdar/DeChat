package fh1;

import a14.C53973z1;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* renamed from: fh1.y1 */
public final class C59090y1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f169054d;

    public C59090y1(C59018f2 f2Var) {
        this.f169054d = f2Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "bannerRv action down");
            C53973z1 z1Var = this.f169054d.f168864B;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
        } else if (action == 1) {
            HashMap<String, Bitmap> hashMap2 = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "bannerRv action up");
            this.f169054d.mo84250R3();
            this.f169054d.f168872J = true;
        } else if (action == 3) {
            HashMap<String, Bitmap> hashMap3 = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "bannerRv action cancel");
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
