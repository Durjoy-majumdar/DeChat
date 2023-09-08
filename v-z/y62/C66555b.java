package y62;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.mmplayer.render.MMSurfaceViewRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import db0.C58248a;
import rx3.C13598b0;

/* renamed from: y62.b */
public final class C66555b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MMSurfaceViewRender f191411d;

    /* renamed from: e */
    public final /* synthetic */ int[] f191412e;

    public C66555b(MMSurfaceViewRender mMSurfaceViewRender, int[] iArr) {
        this.f191411d = mMSurfaceViewRender;
        this.f191412e = iArr;
    }

    public final void run() {
        C13598b0 b0Var;
        C58248a surfaceViewSwitchHelper = this.f191411d.getSurfaceViewSwitchHelper();
        if (surfaceViewSwitchHelper != null) {
            int[] iArr = this.f191412e;
            int i = iArr[0];
            int i2 = iArr[1];
            View findViewWithTag = surfaceViewSwitchHelper.f166778a.findViewWithTag("MMSurfaceViewSwitchHelper.COVER_VIEW");
            if (findViewWithTag != null) {
                String c = surfaceViewSwitchHelper.mo82999c();
                Log.m105928w(c, "onSurfaceViewSizeChange [" + i + " x " + i2 + "] captureBitmap:" + surfaceViewSwitchHelper.f166782e + '.');
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
                String c2 = surfaceViewSwitchHelper.mo82999c();
                Log.m105928w(c2, "onSurfaceViewSizeChange ignore captureBitmap:" + surfaceViewSwitchHelper.f166782e + '.');
            }
        }
    }
}
