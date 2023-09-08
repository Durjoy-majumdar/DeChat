package f90;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.util.AttributeSet;
import android.view.Surface;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import i72.C108382h;
import j90.C108660a;
import j90.C108661b;
import j90.C108662c;
import j90.C108663d;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import y80.C66557b;

/* renamed from: f90.d */
public final class C107514d extends CameraPreviewGLSurfaceView {

    /* renamed from: h */
    public Context f321674h;

    /* renamed from: i */
    public Surface f321675i;

    /* renamed from: j */
    public int f321676j;

    /* renamed from: n */
    public int f321677n;

    /* renamed from: o */
    public C108663d f321678o = new C108663d();

    /* renamed from: p */
    public String f321679p = "MicroMsg.CameraPreviewSurfaceRenderView";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107514d(Context context, Surface surface, int i, int i2) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(surface, "surface");
        this.f321674h = context;
        this.f321675i = surface;
        this.f321676j = i;
        this.f321677n = i2;
    }

    public EGLContext getEGLContext() {
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            return dVar.getEGLContext();
        }
        return null;
    }

    public C108382h getFrameDataCallback() {
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            return dVar.getFrameDataCallback();
        }
        return null;
    }

    public final Context getMContext() {
        return this.f321674h;
    }

    public final int getMHeight() {
        return this.f321677n;
    }

    public final int getMWidth() {
        return this.f321676j;
    }

    public C110194c getPreviewTexture() {
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            return dVar.getPreviewTexture();
        }
        return null;
    }

    public final Surface getSurface() {
        return this.f321675i;
    }

    /* renamed from: i */
    public void mo148308i(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            dVar.mo148308i(lVar);
        }
    }

    /* renamed from: j */
    public void mo148309j(C110777a aVar, boolean z) {
        C87412m.m108594g(aVar, "renderer");
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            dVar.mo148309j(aVar, false);
        }
        C108663d dVar2 = this.f321678o;
        if (dVar2 != null) {
            Surface surface = this.f321675i;
            int i = this.f321676j;
            int i2 = this.f321677n;
            Log.m105924i("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceAvailable, surface:" + surface + ", width:" + i + ", height:" + i2 + ", handler: " + dVar2.f325419g);
            if (dVar2.f325419g == null) {
                dVar2.mo159681a();
            }
            if (surface != null) {
                dVar2.mo148312q(new C108660a(dVar2, i, i2, surface));
            }
        }
        C108663d dVar3 = this.f321678o;
        if (dVar3 != null) {
            Surface surface2 = this.f321675i;
            int i3 = this.f321676j;
            int i4 = this.f321677n;
            Log.m105924i("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceSizeChanged, surface:" + surface2 + ", width:" + i3 + ", height:" + i4);
            dVar3.mo148312q(new C108662c(dVar3, i3, i4));
        }
    }

    /* renamed from: m */
    public void mo148310m(C66557b bVar) {
        C87412m.m108594g(bVar, "cameraConfig");
        String str = this.f321679p;
        Log.printInfoStack(str, "updateCameraConfig:" + bVar, new Object[0]);
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            dVar.mo148310m(bVar);
        }
    }

    /* renamed from: n */
    public void mo148311n() {
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            dVar.mo148311n();
        }
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            dVar.mo148312q(aVar);
        }
    }

    public void release() {
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            Log.printInfoStack("MicroMsg.CameraPreviewGLTextureRender", "onSurfaceDestroyed", new Object[0]);
            dVar.f325422j = false;
            dVar.mo148312q(new C108661b(dVar));
        }
        C108663d dVar2 = this.f321678o;
        if (dVar2 != null) {
            dVar2.release();
        }
        this.f321678o = null;
    }

    public void requestRender() {
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            dVar.mo148312q(new C108663d.C108665b(dVar));
        }
    }

    /* renamed from: s */
    public void mo148314s() {
        Log.printInfoStack(this.f321679p, "tryStopCameraPreview", new Object[0]);
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            dVar.mo148314s();
        }
    }

    public final void setMContext(Context context) {
        C87412m.m108594g(context, "<set-?>");
        this.f321674h = context;
    }

    public final void setMHeight(int i) {
        this.f321677n = i;
    }

    public final void setMWidth(int i) {
        this.f321676j = i;
    }

    public void setOnDrawListener(C32226l<? super C110194c, C13598b0> lVar) {
        Log.printInfoStack(this.f321679p, "setOnDrawListener", new Object[0]);
        C108663d dVar = this.f321678o;
        if (dVar != null) {
            dVar.setOnDrawListener(lVar);
        }
    }

    public final void setSurface(Surface surface) {
        C87412m.m108594g(surface, "<set-?>");
        this.f321675i = surface;
    }
}
