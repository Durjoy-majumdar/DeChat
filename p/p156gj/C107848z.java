package p156gj;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.concurrent.atomic.AtomicInteger;
import p966fj.C86869a;

/* renamed from: gj.z */
public class C107848z {

    /* renamed from: d */
    public static final AtomicInteger f322934d = new AtomicInteger(0);

    /* renamed from: e */
    public static final AtomicInteger f322935e = new AtomicInteger(0);

    /* renamed from: a */
    public Camera f322936a;

    /* renamed from: b */
    public int f322937b = 1;

    /* renamed from: c */
    public volatile boolean f322938c = false;

    /* renamed from: gj.z$a */
    public class C107849a implements Camera.AutoFocusCallback {

        /* renamed from: d */
        public final /* synthetic */ Camera.AutoFocusCallback f322939d;

        public C107849a(Camera.AutoFocusCallback autoFocusCallback) {
            this.f322939d = autoFocusCallback;
        }

        public void onAutoFocus(boolean z, Camera camera) {
            if (!C107848z.this.f322938c) {
                this.f322939d.onAutoFocus(z, camera);
            }
        }
    }

    public C107848z(Camera camera) {
        this.f322936a = camera;
        if (camera != null) {
            AtomicInteger atomicInteger = f322934d;
            atomicInteger.incrementAndGet();
            AtomicInteger atomicInteger2 = f322935e;
            Log.printInfoStack("MicroMsg.MCamera", "init MCamera, initCount:%s, releaseCount:%s, isCameraRelease:%s", atomicInteger, atomicInteger2, Boolean.valueOf(this.f322938c));
            if (atomicInteger.get() - atomicInteger2.get() > 1) {
                Log.m105925i("MicroMsg.MCamera", "MCamera leak, do report, current process:%s", MMApplicationContext.getProcessName());
                C86869a aVar = C86869a.INSTANCE;
                aVar.mo121330b(650, 61, 1);
                if (MMApplicationContext.isMMProcess()) {
                    aVar.mo121330b(650, 62, 1);
                } else if (MMApplicationContext.isToolsProcess()) {
                    aVar.mo121330b(650, 63, 1);
                } else if (MMApplicationContext.isAppBrandProcess()) {
                    aVar.mo121330b(650, 64, 1);
                }
                atomicInteger.set(0);
                atomicInteger2.set(0);
            }
            this.f322938c = false;
            return;
        }
        Log.printInfoStack("MicroMsg.MCamera", "init MCamera with null camera!!!", new Object[0]);
    }

    /* renamed from: a */
    public final void mo158257a(byte[] bArr) {
        Camera camera = this.f322936a;
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
    }

    /* renamed from: b */
    public final void mo158258b(Camera.AutoFocusCallback autoFocusCallback) {
        Camera camera = this.f322936a;
        if (camera != null) {
            camera.autoFocus(new C107849a(autoFocusCallback));
        }
    }

    /* renamed from: c */
    public Camera.Parameters mo158259c() {
        Camera camera = this.f322936a;
        if (camera != null) {
            return camera.getParameters();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo158260d() {
        if (this.f322936a != null) {
            try {
                this.f322938c = true;
                C117292a.m165363i(this.f322936a, "com/tencent/mm/compatible/deviceinfo/MCamera", "release", "()V", "android/hardware/Camera", "release", "()V");
            } catch (Exception e) {
                Log.m105925i("MicroMsg.MCamera", "release camera failed cause sometimes native crash while", e.fillInStackTrace());
            } finally {
                AtomicInteger atomicInteger = f322935e;
                atomicInteger.incrementAndGet();
                Log.printInfoStack("MicroMsg.MCamera", "release MCamera, initCount: %s, releaseCount: %s,isCameraRelease %s", f322934d, atomicInteger, Boolean.valueOf(this.f322938c));
            }
        }
    }

    /* renamed from: e */
    public final void mo158261e(int i) {
        Camera camera = this.f322936a;
        if (camera != null) {
            camera.setDisplayOrientation(i);
        }
    }

    /* renamed from: f */
    public void mo158262f(Camera.Parameters parameters) {
        Camera camera = this.f322936a;
        if (camera != null) {
            camera.setParameters(parameters);
        }
    }

    /* renamed from: g */
    public final void mo158263g(Camera.PreviewCallback previewCallback) {
        Camera camera = this.f322936a;
        if (camera != null) {
            camera.setPreviewCallback(previewCallback);
        }
    }

    /* renamed from: h */
    public final void mo158264h(Camera.PreviewCallback previewCallback) {
        Camera camera = this.f322936a;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(previewCallback);
        }
    }

    /* renamed from: i */
    public final void mo158265i(SurfaceTexture surfaceTexture) {
        Camera camera = this.f322936a;
        if (camera != null) {
            camera.setPreviewTexture(surfaceTexture);
        }
    }

    /* renamed from: j */
    public void mo158266j(String str) {
        Camera camera = this.f322936a;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            parameters.set("wechat-scene", str);
            this.f322936a.setParameters(parameters);
        }
    }

    /* renamed from: k */
    public final void mo158267k() {
        Camera camera = this.f322936a;
        if (camera != null) {
            C117292a.m165363i(camera, "com/tencent/mm/compatible/deviceinfo/MCamera", "startPreview", "()V", "android/hardware/Camera", "startPreview", "()V");
        }
    }

    /* renamed from: l */
    public final void mo158268l() {
        Camera camera = this.f322936a;
        if (camera != null) {
            camera.stopPreview();
        }
    }
}
