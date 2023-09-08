package j90;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i72.C108382h;
import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.opengles.GL10;
import k90.C108965b;
import k90.C108968c;
import k90.C108970d;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import w80.C111742d;
import y80.C66557b;

/* renamed from: j90.d */
public class C108663d implements C108667e {

    /* renamed from: d */
    public C111742d.C65942b f325416d;

    /* renamed from: e */
    public Surface f325417e;

    /* renamed from: f */
    public HandlerThread f325418f;

    /* renamed from: g */
    public MMHandler f325419g;

    /* renamed from: h */
    public C110777a f325420h;

    /* renamed from: i */
    public C108965b f325421i;

    /* renamed from: j */
    public boolean f325422j;

    /* renamed from: n */
    public C32226l<? super SurfaceTexture, C13598b0> f325423n;

    /* renamed from: o */
    public ArrayList<C32224a<C13598b0>> f325424o = new ArrayList<>();

    /* renamed from: j90.d$a */
    public static final class C108664a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108663d f325425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108664a(C108663d dVar) {
            super(0);
            this.f325425d = dVar;
        }

        public Object invoke() {
            C110777a aVar = this.f325425d.f325420h;
            if (aVar != null) {
                C110777a.m150773o(aVar, false, 1, (Object) null);
            }
            this.f325425d.f325420h = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j90.d$b */
    public static final class C108665b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108663d f325426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108665b(C108663d dVar) {
            super(0);
            this.f325426d = dVar;
        }

        public Object invoke() {
            SurfaceTexture b;
            C108965b bVar = this.f325426d.f325421i;
            if (!(bVar == null || (b = bVar.mo160064b()) == null)) {
                b.updateTexImage();
            }
            C110777a aVar = this.f325426d.f325420h;
            if (aVar != null) {
                aVar.onDrawFrame((GL10) null);
            }
            C111742d.C65942b bVar2 = this.f325426d.f325416d;
            if (bVar2 != null) {
                EGLExt.eglPresentationTimeANDROID(bVar2.f189591a, bVar2.f189592b, System.nanoTime());
                EGL14.eglSwapBuffers(bVar2.f189591a, bVar2.f189592b);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j90.d$c */
    public static final class C108666c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f325427d;

        public C108666c(C32224a aVar) {
            this.f325427d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f325427d.invoke();
        }
    }

    public C108663d() {
        mo159681a();
    }

    /* renamed from: a */
    public final void mo159681a() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("CameraPreviewTextureView_renderThread", -2);
        a.start();
        this.f325419g = new MMHandler(a.getLooper());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f325424o);
        this.f325424o.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo148312q((C32224a) it.next());
        }
        this.f325418f = a;
    }

    public EGLContext getEGLContext() {
        C111742d.C65942b bVar = this.f325416d;
        if (bVar != null) {
            return bVar.f189593c;
        }
        return null;
    }

    public C108382h getFrameDataCallback() {
        C108965b bVar = this.f325421i;
        if (bVar != null) {
            return bVar.mo160063a();
        }
        return null;
    }

    public C110194c getPreviewTexture() {
        C110777a aVar = this.f325420h;
        if (aVar != null) {
            return aVar.mo157954j();
        }
        return null;
    }

    /* renamed from: i */
    public void mo148308i(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        Log.printInfoStack("MicroMsg.CameraPreviewGLTextureRender", "tryCameraPreview canPreview:" + this.f325422j, new Object[0]);
        if (!this.f325422j) {
            this.f325423n = lVar;
        } else if (lVar != null) {
            C108965b bVar = this.f325421i;
            lVar.invoke(bVar != null ? bVar.mo160064b() : null);
        }
    }

    /* renamed from: j */
    public void mo148309j(C110777a aVar, boolean z) {
        C87412m.m108594g(aVar, "renderer");
        Log.m105924i("MicroMsg.CameraPreviewGLTextureRender", "setRenderer:" + aVar.hashCode() + "  cpuCrop:" + z);
        C108965b bVar = this.f325421i;
        if (bVar != null) {
            C108965b.m147848h(bVar, false, false, 3, (Object) null);
        }
        C108965b cVar = z ? new C108968c(this) : new C108970d(this);
        this.f325421i = cVar;
        cVar.mo160070i(aVar);
        this.f325420h = aVar;
    }

    /* renamed from: m */
    public void mo148310m(C66557b bVar) {
        C87412m.m108594g(bVar, "cameraConfig");
        Log.m105924i("MicroMsg.CameraPreviewGLTextureRender", "updateCameraConfig: " + bVar);
        C108965b bVar2 = this.f325421i;
        if (bVar2 != null) {
            bVar2.mo160071j(bVar);
        }
    }

    /* renamed from: n */
    public void mo148311n() {
        C110777a aVar;
        C108965b bVar = this.f325421i;
        if (bVar != null && (aVar = bVar.f326404c) != null) {
            aVar.f331386k = true;
        }
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "r");
        MMHandler mMHandler = this.f325419g;
        if (mMHandler == null) {
            this.f325424o.add(aVar);
        } else if (mMHandler != null) {
            mMHandler.post(new C108666c(aVar));
        }
    }

    public void release() {
        mo148312q(new C108664a(this));
    }

    public void requestRender() {
        mo148312q(new C108665b(this));
    }

    /* renamed from: s */
    public void mo148314s() {
        Log.printInfoStack("MicroMsg.CameraPreviewGLTextureRender", "tryStopCameraPreview", new Object[0]);
        this.f325423n = null;
    }

    public void setOnDrawListener(C32226l<? super C110194c, C13598b0> lVar) {
        C108965b bVar = this.f325421i;
        if (bVar != null) {
            bVar.f326406e = lVar;
        }
    }
}
