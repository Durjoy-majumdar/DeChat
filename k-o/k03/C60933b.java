package k03;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import rx3.C13598b0;

/* renamed from: k03.b */
public final class C60933b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MMSurfaceViewRender f173554d;

    /* renamed from: e */
    public final /* synthetic */ int[] f173555e;

    public C60933b(MMSurfaceViewRender mMSurfaceViewRender, int[] iArr) {
        this.f173554d = mMSurfaceViewRender;
        this.f173555e = iArr;
    }

    public final void run() {
        C13598b0 b0Var;
        C60934c surfaceViewSwitchHelper = this.f173554d.getSurfaceViewSwitchHelper();
        if (surfaceViewSwitchHelper != null) {
            int[] iArr = this.f173555e;
            int i = iArr[0];
            int i2 = iArr[1];
            View findViewWithTag = surfaceViewSwitchHelper.f173556a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
            if (findViewWithTag != null) {
                String d = surfaceViewSwitchHelper.mo85888d();
                Log.m105928w(d, "onSurfaceViewSizeChange [" + i + " x " + i2 + "] captureBitmap:" + surfaceViewSwitchHelper.f173560e + '.');
                ViewGroup.LayoutParams layoutParams = findViewWithTag.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i2;
                findViewWithTag.setLayoutParams(layoutParams);
                findViewWithTag.requestLayout();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                String d2 = surfaceViewSwitchHelper.mo85888d();
                Log.m105928w(d2, "onSurfaceViewSizeChange ignore captureBitmap:" + surfaceViewSwitchHelper.f173560e + '.');
            }
        }
    }
}
