package p964fd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1066yc.C91408g;
import p964fd.C86821c0;
import po0.C89427n;

/* renamed from: fd.b0 */
public class C86818b0 extends C91408g<TextureImageViewLikeImpl> {

    /* renamed from: g */
    public final /* synthetic */ C89427n f251974g;

    /* renamed from: fd.b0$a */
    public class C86819a extends C91408g<TextureImageViewLikeImpl>.b<TextureImageViewLikeImpl> {

        /* renamed from: h */
        public Surface f251975h = null;

        public C86819a(TextureImageViewLikeImpl textureImageViewLikeImpl, Runnable runnable) {
            super(textureImageViewLikeImpl, runnable);
        }

        /* renamed from: b */
        public void mo109557b() {
            C86818b0.this.mo121263h((Runnable) null);
        }

        /* renamed from: c */
        public boolean mo109558c(Surface surface, int i, int i2) {
            Surface surface2 = this.f251975h;
            if (surface2 != null && surface2 == surface) {
                return true;
            }
            try {
                boolean b = C86818b0.this.f251974g.mo123756b(surface);
                if (b) {
                    this.f251975h = surface;
                }
                return b;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public C86818b0(C86821c0.C86822a aVar, C89427n nVar) {
        this.f251974g = nVar;
    }

    /* renamed from: b */
    public void mo109554b(View view, Runnable runnable) {
        String str = this.f262123a;
        Log.m105924i(str, "transferFrom, textureView: " + ((TextureImageViewLikeImpl) view));
        this.f262126d = false;
        mo121263h(runnable);
    }

    /* renamed from: e */
    public View mo109555e(Context context) {
        Log.m105918d(this.f262123a, "createVideoContainerView");
        TextureImageViewLikeImpl textureImageViewLikeImpl = new TextureImageViewLikeImpl(context, (AttributeSet) null);
        C89427n nVar = this.f251974g;
        nVar.f257465a.f252020X0 = new C86824d(nVar, textureImageViewLikeImpl);
        return textureImageViewLikeImpl;
    }

    /* renamed from: g */
    public C91408g.C91410b mo109556g(View view, Runnable runnable) {
        return new C86819a((TextureImageViewLikeImpl) view, runnable);
    }

    /* renamed from: h */
    public final void mo121263h(Runnable runnable) {
        Surface surface = this.f251974g.f257465a.f252031g;
        if (surface == null || !surface.isValid()) {
            Log.m105928w(this.f262123a, "transferFrom, originSurface is invalid");
            if (runnable != null) {
                Log.m105924i(this.f262123a, "transferFrom, run afterTransferFromTask when originSurface is invalid");
                runnable.run();
                return;
            }
            return;
        }
        try {
            this.f251974g.mo123756b(surface);
            if (runnable != null) {
                this.f251974g.f257465a.getClass();
                Log.m105924i(this.f262123a, "transferFrom, run afterTransferFromTask when originSurfaceTexture is null");
                runnable.run();
            }
        } catch (Exception unused) {
        }
    }
}
