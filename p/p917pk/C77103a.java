package p917pk;

import com.tencent.p014mm.dynamicbackground.model.DynamicBackgroundNative;
import com.tencent.p014mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView;
import p413ok.C77014c;

/* renamed from: pk.a */
public final class C77103a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DynamicBackgroundGLSurfaceView f225208d;

    /* renamed from: e */
    public final /* synthetic */ DynamicBackgroundGLSurfaceView.C68018b f225209e;

    public C77103a(DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView, DynamicBackgroundGLSurfaceView.C68018b bVar) {
        this.f225208d = dynamicBackgroundGLSurfaceView;
        this.f225209e = bVar;
    }

    public final void run() {
        DynamicBackgroundGLSurfaceView.C68012a aVar = this.f225208d.f195179t;
        if (aVar != null) {
            try {
                C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo NativeRender release", new Object[0]);
                DynamicBackgroundNative dynamicBackgroundNative = aVar.f195181a;
                if (dynamicBackgroundNative != null) {
                    dynamicBackgroundNative.mo93405a();
                }
                aVar.f195185e = null;
                C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo SurfaceView reset and nativeRelease", new Object[0]);
                aVar.f195183c = 0;
                aVar.f195184d = 0;
                aVar.f195192l = false;
                aVar.f195186f = false;
                aVar.f195188h = false;
                aVar.f195187g = false;
            } catch (Throwable th) {
                C77014c.m92923c("MicroMsg.DynamicBgSurfaceView", th, "alvinluo nativeRelease exception", new Object[0]);
            }
        }
        DynamicBackgroundGLSurfaceView.C68018b bVar = this.f225209e;
        if (bVar != null) {
            bVar.finish();
        }
    }
}
