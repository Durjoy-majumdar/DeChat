package vn3;

import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vn3.f */
public final class C118688f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VASCommonFragment f355157d;

    public C118688f(VASCommonFragment vASCommonFragment) {
        this.f355157d = vASCommonFragment;
    }

    public final void run() {
        Log.m105924i("MicroMsg.VAS.VASLauncher", "oneShotPreDraw Call!!");
        this.f355157d.startPostponedEnterTransition();
    }
}
