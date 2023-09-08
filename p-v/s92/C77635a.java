package s92;

import com.tencent.p014mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView;
import com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: s92.a */
public final class C77635a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DynamicBgContainer f226349d;

    public C77635a(DynamicBgContainer dynamicBgContainer) {
        this.f226349d = dynamicBgContainer;
    }

    public final void run() {
        Log.m105924i("MicroMsg.DynamicBgContainer.", "hide gradient");
        DynamicBackgroundGLSurfaceView dynamicBgSurfaceView = this.f226349d.getDynamicBgSurfaceView();
        if (dynamicBgSurfaceView != null) {
            dynamicBgSurfaceView.setShowGradientView(false);
        }
    }
}
