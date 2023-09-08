package lu0;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import kr0.C88267e;
import p1027rd.C89926a;
import p958eb.C86475f;
import p964fd.C86815a;
import p964fd.C86826e;
import p964fd.C86850x;
import rx3.C13598b0;

/* renamed from: lu0.h */
public final class C88652h implements C86815a {

    /* renamed from: a */
    public C86826e f255961a;

    /* renamed from: b */
    public boolean f255962b;

    /* renamed from: c */
    public Surface f255963c;

    /* renamed from: d */
    public WeakReference<C83928t1> f255964d;

    /* renamed from: e */
    public Size f255965e;

    /* renamed from: f */
    public volatile Surface f255966f;

    /* renamed from: lu0.h$a */
    public static final class C88653a extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88652h f255967d;

        /* renamed from: e */
        public final /* synthetic */ Surface f255968e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88653a(C88652h hVar, Surface surface) {
            super(1);
            this.f255967d = hVar;
            this.f255968e = surface;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            Log.m105924i("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "replaceCallback, newTexture: " + surfaceTexture);
            if (surfaceTexture == null) {
                C86826e eVar = this.f255967d.f255961a;
                if (eVar != null) {
                    eVar.mo121276K(new C86850x(eVar, this.f255968e));
                } else {
                    C87412m.m108603p("videoPluginHandler");
                    throw null;
                }
            } else {
                Surface surface = this.f255967d.f255966f;
                if (surface != null) {
                    surface.release();
                }
                this.f255967d.f255966f = new Surface(surfaceTexture);
                C88652h hVar = this.f255967d;
                C86826e eVar2 = hVar.f255961a;
                if (eVar2 != null) {
                    eVar2.mo121276K(new C86850x(eVar2, hVar.f255966f));
                } else {
                    C87412m.m108603p("videoPluginHandler");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo121258a(C82381f fVar) {
        C87412m.m108594g(fVar, "insertComponent");
        Log.m105918d("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "onInsertJsApiCalled, insertComponent: " + fVar);
        if (fVar instanceof C83928t1) {
            this.f255964d = new WeakReference<>(fVar);
            mo123096e();
        }
    }

    /* renamed from: b */
    public void mo121259b(Surface surface) {
        C87412m.m108594g(surface, "sameLayerSurface");
        Log.m105918d("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "onSameLayerSurfaceReady, sameLayerSurface: " + surface);
        this.f255963c = surface;
        mo123096e();
    }

    /* renamed from: c */
    public void mo121260c(Size size) {
        C87412m.m108594g(size, "videoSize");
        Log.m105918d("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "onVideoSizeResolved, videoSize: " + size);
        this.f255965e = size;
        mo123096e();
    }

    /* renamed from: d */
    public void mo121261d() {
        C86475f fVar;
        if (this.f255962b) {
            WeakReference<C83928t1> weakReference = this.f255964d;
            C83928t1 t1Var = weakReference != null ? weakReference.get() : null;
            if (t1Var == null) {
                Log.m105920e("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "onSameLayerSurfacePreRelease, insertComponent is null");
                return;
            }
            C88267e K1 = t1Var.mo116160O0();
            C80301a U = (K1 == null || (fVar = (C86475f) K1.mo125517G0(C86475f.class)) == null) ? null : fVar.mo120910U();
            if (U == null) {
                Log.m105920e("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "onSameLayerSurfacePreRelease, magicBrush is null");
                return;
            }
            Log.m105918d("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "onSameLayerSurfacePreRelease, unregisterSurface");
            C89926a a = U.f235097m.mo111602a("video");
            C86826e eVar = this.f255961a;
            if (eVar != null) {
                a.mo124244d(eVar.f253971d);
                Surface surface = this.f255966f;
                if (surface != null) {
                    surface.release();
                }
                this.f255962b = false;
                return;
            }
            C87412m.m108603p("videoPluginHandler");
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo123096e() {
        C86475f fVar;
        if (!this.f255962b) {
            Surface surface = this.f255963c;
            WeakReference<C83928t1> weakReference = this.f255964d;
            C83928t1 t1Var = weakReference != null ? weakReference.get() : null;
            Size size = this.f255965e;
            if (surface != null && t1Var != null && size != null) {
                C88267e K1 = t1Var.mo116160O0();
                C80301a U = (K1 == null || (fVar = (C86475f) K1.mo125517G0(C86475f.class)) == null) ? null : fVar.mo120910U();
                if (U == null) {
                    Log.m105920e("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "tryRegisterProducerIfNeed, magicBrush is null");
                    return;
                }
                Log.m105918d("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "tryRegisterProducerIfNeed, registerSurface");
                C89926a a = U.f235097m.mo111602a("video");
                C86826e eVar = this.f255961a;
                if (eVar != null) {
                    a.mo124241a(eVar.f253971d, size.getWidth(), size.getHeight(), surface, new C88653a(this, surface), (C32226l<? super SurfaceTexture, C13598b0>) null);
                    this.f255962b = true;
                    return;
                }
                C87412m.m108603p("videoPluginHandler");
                throw null;
            }
        }
    }
}
