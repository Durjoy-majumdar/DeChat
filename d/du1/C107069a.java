package du1;

import com.tencent.p014mm.plugin.flash.view.FaceNumberView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: du1.a */
public class C107069a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceNumberView f320488d;

    public C107069a(FaceNumberView faceNumberView) {
        this.f320488d = faceNumberView;
    }

    public void run() {
        Log.m105924i("MicroMsg.FaceFlashManagerNumberView", "release");
        this.f320488d.f313151f.cancel();
        this.f320488d.f313150e.clearAnimation();
    }
}
