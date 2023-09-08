package ob1;

import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ob1.b */
public class C110024b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ double f329272d;

    /* renamed from: e */
    public final /* synthetic */ C110011a f329273e;

    public C110024b(C110011a aVar, double d) {
        this.f329273e = aVar;
        this.f329272d = d;
    }

    public void run() {
        Log.m105918d("MicroMsg.FaceReflectCam", "reset ratio");
        int i = this.f329273e.f329220A.getContext().getResources().getDisplayMetrics().widthPixels;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f329273e.f329220A.getLayoutParams();
        int i2 = (int) (((double) i) * 0.7d);
        layoutParams.width = i2;
        layoutParams.height = (int) (((double) i2) * this.f329272d);
        layoutParams.addRule(13, -1);
        this.f329273e.f329220A.setLayoutParams(layoutParams);
        this.f329273e.f329220A.setAspectRatio(this.f329272d);
        Log.m105918d("MicroMsg.FaceReflectCam", "after reset ratio=" + this.f329273e.f329220A.getmAspectRatio());
    }
}
