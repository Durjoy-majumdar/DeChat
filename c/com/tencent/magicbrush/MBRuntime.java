package com.tencent.magicbrush;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.github.henryye.nativeiv.BaseImageDecodeService;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.ext_texture.MBExternalTextureMgr;
import com.tencent.magicbrush.handler.JsTouchEventHandler;
import com.tencent.magicbrush.handler.glfont.IMBFontHandler;
import com.tencent.magicbrush.handler.p940fs.IMBFileSystem;
import com.tencent.magicbrush.internal.EventDispatcher;
import com.tencent.magicbrush.p941ui.MBViewManager;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Objects;
import p1017od.C89154b;
import p1017od.C89156d;
import p1017od.C89157e;
import p1033sd.C90172b;
import p1059wd.C90954a;
import p416qd.C89590b;
import p416qd.C89598h;
import p748xd.C91174f;
import p748xd.C91175g;
import p748xd.g$$a;

public abstract class MBRuntime {

    /* renamed from: a */
    public volatile long f235052a;

    /* renamed from: b */
    public MBParams f235053b;

    /* renamed from: c */
    public C80300l f235054c = null;

    /* renamed from: d */
    public BaseImageDecodeService f235055d = null;

    /* renamed from: e */
    public IMBFontHandler f235056e = null;

    /* renamed from: f */
    public volatile C90172b f235057f;

    /* renamed from: g */
    public C90954a f235058g;

    /* renamed from: h */
    public C89157e f235059h = new C89157e(this);

    public static class MBParams {
        public boolean allow_antialias_ = false;
        public C90954a.C90956b animationFrameHandlerStrategy = C90954a.C90956b.ChoreographerInJsThread;
        public long app_brand_runtime = 0;
        public AssetManager asset_manager;
        public int cmd_pool_type = 1;
        public float device_pixel_ratio_ = -1.0f;
        public boolean enable_font_batch = true;
        public boolean enable_gfx = true;
        public boolean enable_gl_fake_id = false;
        public boolean enable_gpu_unwrap = false;
        public boolean enable_request_animation_frame = true;
        public boolean enable_skia_2d = false;
        public boolean enable_window_attributes_alpha = false;
        public boolean enable_wxbindcanvastexture = false;
        public IMBFileSystem file_system_ = null;
        public boolean force_run_v8_microtasks = false;
        public float gc_factor = 0.0f;
        public boolean is_game = false;
        public boolean perf_crazy_mode = false;
        public String render_thread_name;
        public boolean render_thread_profiler = false;
        public boolean revert_cpu_optimizer_test = false;
        public int screen_height_ = -1;
        public int screen_width_ = -1;
        public String sdcard_path;
        public boolean support_client_vertex_buffer = false;
        public boolean support_etc2_astc = false;
        public int support_gfximage_share_texture = 1;
        public boolean support_hardware_decode = true;
        public boolean support_hardware_encode = true;
        public boolean sync_surface_destroy = true;
        public boolean use_command_buffer = true;
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$a */
    public class C80289a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f235060d;

        /* renamed from: e */
        public final /* synthetic */ SurfaceTexture f235061e;

        public C80289a(int i, SurfaceTexture surfaceTexture) {
            this.f235060d = i;
            this.f235061e = surfaceTexture;
        }

        public void run() {
            if (MBRuntime.this.f235052a != 0) {
                MBRuntime mBRuntime = MBRuntime.this;
                mBRuntime.nativeNotifyWindowDestroyed(mBRuntime.f235052a, this.f235060d);
                SurfaceTexture surfaceTexture = this.f235061e;
                if (surfaceTexture == null) {
                    C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", new RuntimeException("Stub here!"), "hy: text is null, do not release. maybe released by other module", new Object[0]);
                } else {
                    surfaceTexture.release();
                }
            }
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$b */
    public class C80290b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f235063d;

        public C80290b(int i) {
            this.f235063d = i;
        }

        public void run() {
            MBRuntime mBRuntime = MBRuntime.this;
            mBRuntime.nativeNotifyWindowDestroyed(mBRuntime.f235052a, this.f235063d);
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$c */
    public class C80291c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JsTouchEventHandler.C80307a f235065d;

        /* renamed from: e */
        public final /* synthetic */ long f235066e;

        /* renamed from: f */
        public final /* synthetic */ int f235067f;

        public C80291c(JsTouchEventHandler.C80307a aVar, long j, int i) {
            this.f235065d = aVar;
            this.f235066e = j;
            this.f235067f = i;
        }

        public void run() {
            if (MBRuntime.this.f235052a == 0) {
                JsTouchEventHandler.C80307a aVar = this.f235065d;
                long j = this.f235066e;
                JsTouchEventHandler jsTouchEventHandler = ((JsTouchEventHandler.C80309c) aVar).f235114a.get();
                if (jsTouchEventHandler != null) {
                    jsTouchEventHandler.nativeFreeTouchEvent(j);
                    return;
                }
                return;
            }
            MBRuntime mBRuntime = MBRuntime.this;
            mBRuntime.nativeNotifyTouchEvent(mBRuntime.f235052a, this.f235067f, this.f235066e);
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$d */
    public class C80292d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f235069d;

        /* renamed from: e */
        public final /* synthetic */ boolean f235070e;

        public C80292d(int i, boolean z) {
            this.f235069d = i;
            this.f235070e = z;
        }

        public void run() {
            MagicBrushView findOrNull = MBRuntime.this.mo111559o().findOrNull(this.f235069d);
            if (findOrNull != null) {
                findOrNull.setOpaque(!this.f235070e);
            }
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$e */
    public class C80293e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f235072d;

        public C80293e(int i) {
            this.f235072d = i;
        }

        public void run() {
            C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "switchToJsThread Runnable taskId: " + this.f235072d, new Object[0]);
            MBRuntime mBRuntime = MBRuntime.this;
            mBRuntime.nativeRunOnJsThread(mBRuntime.f235052a, this.f235072d);
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$f */
    public class C80294f implements Runnable {
        public C80294f() {
        }

        public void run() {
            MBRuntime mBRuntime = MBRuntime.this;
            mBRuntime.nativeResume(mBRuntime.f235052a);
            MBRuntime mBRuntime2 = MBRuntime.this;
            if (mBRuntime2.f235053b.enable_request_animation_frame) {
                mBRuntime2.f235058g.mo125032i();
            }
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$g */
    public class C80295g implements Runnable {
        public C80295g() {
        }

        public void run() {
            MBRuntime mBRuntime = MBRuntime.this;
            if (mBRuntime.f235053b.enable_request_animation_frame) {
                mBRuntime.f235058g.mo125031h();
            }
            MBRuntime mBRuntime2 = MBRuntime.this;
            mBRuntime2.nativePause(mBRuntime2.f235052a);
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$h */
    public class C80296h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SurfaceTexture f235076d;

        /* renamed from: e */
        public final /* synthetic */ int f235077e;

        /* renamed from: f */
        public final /* synthetic */ int f235078f;

        /* renamed from: g */
        public final /* synthetic */ int f235079g;

        /* renamed from: h */
        public final /* synthetic */ boolean f235080h;

        public C80296h(SurfaceTexture surfaceTexture, int i, int i2, int i3, boolean z) {
            this.f235076d = surfaceTexture;
            this.f235077e = i;
            this.f235078f = i2;
            this.f235079g = i3;
            this.f235080h = z;
        }

        public void run() {
            if (this.f235076d == null) {
                C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", new RuntimeException("Stub here!"), "hy: text is null, do not notifyWindowAvailable. maybe released by other module", new Object[0]);
                return;
            }
            MBRuntime mBRuntime = MBRuntime.this;
            mBRuntime.nativeNotifyWindowAvailable(mBRuntime.f235052a, this.f235077e, this.f235076d, this.f235078f, this.f235079g, this.f235080h);
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$i */
    public class C80297i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f235082d;

        public C80297i(Runnable runnable) {
            this.f235082d = runnable;
        }

        public void run() {
            if (MBRuntime.this.f235052a != 0) {
                this.f235082d.run();
            }
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$j */
    public class C80298j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f235084d;

        public C80298j(Runnable runnable) {
            this.f235084d = runnable;
        }

        public void run() {
            if (MBRuntime.this.f235052a != 0) {
                this.f235084d.run();
            }
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$k */
    public class C80299k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f235086d;

        /* renamed from: e */
        public final /* synthetic */ Surface f235087e;

        /* renamed from: f */
        public final /* synthetic */ int f235088f;

        /* renamed from: g */
        public final /* synthetic */ int f235089g;

        /* renamed from: h */
        public final /* synthetic */ boolean f235090h;

        public C80299k(int i, Surface surface, int i2, int i3, boolean z) {
            this.f235086d = i;
            this.f235087e = surface;
            this.f235088f = i2;
            this.f235089g = i3;
            this.f235090h = z;
        }

        public void run() {
            MBRuntime mBRuntime = MBRuntime.this;
            mBRuntime.nativeNotifyWindowAvailableForSurface(mBRuntime.f235052a, this.f235086d, this.f235087e, this.f235088f, this.f235089g, this.f235090h);
        }
    }

    /* renamed from: com.tencent.magicbrush.MBRuntime$l */
    public interface C80300l {
        /* renamed from: a */
        void mo111577a(boolean z);
    }

    static {
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "enter static block", new Object[0]);
        C89590b.m112027a();
    }

    private native int[] nativeGetCanvasSize(long j, int i);

    private native int nativeGetGLThreadTid(long j);

    private native int nativeGetJsThreadTid(long j);

    private native void nativeMarkNeedCallbackBeforeSwapThisFrame(long j);

    private native void nativeNotifyScreenSizeChanged(long j, int i, int i2);

    private native void nativeRequestV8GarbageCollectionForTest(long j);

    /* access modifiers changed from: private */
    public native void nativeRunOnJsThread(long j, int i);

    private native void nativeSetIsCpuProfiling(long j, boolean z);

    public void applyWindowAttributes(int i, boolean z) {
        C91175g.m114415b(new C80292d(i, z));
    }

    /* renamed from: b */
    public abstract C89154b mo111502b();

    public void beforeSwap(boolean z) {
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "hy: beforeSwap! %b", Boolean.valueOf(z));
        C80300l lVar = this.f235054c;
        if (lVar != null) {
            lVar.mo111577a(z);
        }
    }

    /* renamed from: c */
    public void mo111504c() {
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.pause ", new Object[0]);
        C89157e eVar = this.f235059h;
        Handler handler = eVar.f256901d;
        if (handler != null) {
            handler.removeCallbacks(eVar.f256902e);
            eVar.f256901d = null;
        }
        mo111516l(new C80295g());
    }

    public Bitmap captureScreen(int i, int i2, int i3, Bitmap bitmap) {
        C89154b b = mo111502b();
        b.getClass();
        if (i2 > 0 && i3 > 0) {
            MagicBrushView e = b.mo123495e(i);
            if (e == null) {
                return null;
            }
            Handler handler = C91175g.f261413a;
            C91174f fVar = new C91174f(new g$$a(new C89156d(e, i2, i3, bitmap)));
            C91175g.m114415b(fVar);
            return (Bitmap) fVar.mo125236b();
        }
        String format = String.format("captureScreenCanvas of [%d] [%d, %d]", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
        C87412m.m108593f(format, "format(this, *args)");
        throw new IllegalStateException(format.toString());
    }

    /* renamed from: d */
    public void mo111506d() {
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.resume ", new Object[0]);
        C89157e eVar = this.f235059h;
        if (eVar.f256901d == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            eVar.f256901d = handler;
            handler.post(eVar.f256902e);
        }
        mo111516l(new C80294f());
    }

    public boolean doInnerLoopTask() {
        if (this.f235057f != null) {
            return this.f235057f.mo123771d();
        }
        return true;
    }

    /* renamed from: e */
    public void mo111508e(int i, long j, JsTouchEventHandler.C80307a aVar) {
        if (this.f235052a == 0) {
            JsTouchEventHandler jsTouchEventHandler = ((JsTouchEventHandler.C80309c) aVar).f235114a.get();
            if (jsTouchEventHandler != null) {
                jsTouchEventHandler.nativeFreeTouchEvent(j);
                return;
            }
            return;
        }
        C90172b bVar = this.f235057f;
        if (bVar == null) {
            JsTouchEventHandler jsTouchEventHandler2 = ((JsTouchEventHandler.C80309c) aVar).f235114a.get();
            if (jsTouchEventHandler2 != null) {
                jsTouchEventHandler2.nativeFreeTouchEvent(j);
                return;
            }
            return;
        }
        bVar.mo123773p(new C80291c(aVar, j, i), false);
    }

    /* renamed from: f */
    public void mo111509f(int i, SurfaceTexture surfaceTexture, int i2, int i3, boolean z) {
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowAvailable windowId:%d %s", Integer.valueOf(i), surfaceTexture);
        if (i >= 0) {
            mo111516l(new C80296h(surfaceTexture, i, i2, i3, z));
            return;
        }
        throw new IllegalArgumentException("windowId < 0");
    }

    /* renamed from: g */
    public void mo111510g(int i, Surface surface, int i2, int i3, boolean z) {
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "hy: notifyWindowAvailable: %d, %d, %d %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), surface);
        if (surface != null) {
            mo111516l(new C80299k(i, surface, i2, i3, z));
            return;
        }
        throw new RuntimeException("surface == null");
    }

    /* renamed from: h */
    public void mo111511h(int i, SurfaceTexture surfaceTexture, boolean z) {
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowDestroyed shouldDestroySync: %b", Boolean.valueOf(z));
        if (this.f235052a != 0) {
            if (i >= 0) {
                C80289a aVar = new C80289a(i, surfaceTexture);
                if (z) {
                    boolean z2 = this.f235053b.sync_surface_destroy;
                    C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surfacetexture) param:true windowId:%d sync?%b %s", Integer.valueOf(i), Boolean.valueOf(z2), surfaceTexture);
                    if (z2) {
                        C91174f fVar = new C91174f((Runnable) aVar);
                        if (mo111516l(fVar)) {
                            fVar.mo125235a(3000);
                            fVar.f261412d.isDone();
                        }
                    } else {
                        mo111516l(aVar);
                    }
                    C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surfacetexture) done. windowId:%d", Integer.valueOf(i));
                    return;
                }
                C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surfacetexture) runOnJsThreadIgnorePause windowId:%d %s", Integer.valueOf(i), surfaceTexture);
                mo111516l(aVar);
                return;
            }
            throw new IllegalArgumentException("windowId < 0");
        }
    }

    /* renamed from: i */
    public void mo111512i(int i, Surface surface, boolean z) {
        boolean z2;
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "hy: notifyWindowDestroyed: %d", Integer.valueOf(i));
        if (this.f235052a != 0) {
            if (i >= 0) {
                nativeNotifyBeforeWindowDestroyed(this.f235052a, i);
                boolean z3 = this.f235053b.sync_surface_destroy || z;
                C80290b bVar = new C80290b(i);
                C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "[surface] destroy window(surface) windowId:%d sync?%b", Integer.valueOf(i), Boolean.valueOf(z3));
                if (z3) {
                    C91174f fVar = new C91174f((Runnable) bVar);
                    if (!mo111516l(fVar)) {
                        z2 = false;
                    } else {
                        fVar.mo125235a(3000);
                        z2 = fVar.f261412d.isDone();
                    }
                    if (!z2) {
                        C89598h.m112044a("MicroMsg.MagicBrush.MBRuntime", "notifyWindowDestroyed, but await fail. [deadlock]:    %s", this.f235057f.mo123772e());
                        return;
                    }
                    return;
                }
                mo111516l(bVar);
                return;
            }
            throw new IllegalArgumentException("windowId < 0");
        }
    }

    public int insertElement(float f, float f2, float f3, float f4, int i) {
        int i2;
        try {
            C80301a.C80305d m = mo111517m();
            Objects.requireNonNull(m);
            MagicBrushView q = m.mo111588q();
            try {
                float f5 = this.f235053b.device_pixel_ratio_;
                if (f5 > 0.0f) {
                    C80301a.C80305d m2 = mo111517m();
                    Objects.requireNonNull(m2);
                    m2.mo111585P(q, (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5), (int) (f5 * f4), i);
                    i2 = q.getVirtualElementId();
                    try {
                        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: insertElement a ScreenCanvas [%f, %f, %f, %f, %d]...done", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i));
                    } catch (Exception e) {
                        e = e;
                    }
                    C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: insertElement a ScreenCanvas, result = [%d]", Integer.valueOf(i2));
                    return i2;
                }
                throw new IllegalStateException("device pixel ratio is null");
            } catch (Exception e2) {
                e = e2;
                i2 = -1;
                C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", e, "dl: ScreenCanvas: insertElement failed", new Object[0]);
                C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: insertElement a ScreenCanvas, result = [%d]", Integer.valueOf(i2));
                return i2;
            }
        } catch (Exception e3) {
            e = e3;
            i2 = -1;
            C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", e, "dl: ScreenCanvas: insertElement failed", new Object[0]);
            C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: insertElement a ScreenCanvas, result = [%d]", Integer.valueOf(i2));
            return i2;
        }
    }

    /* renamed from: j */
    public void mo111514j(C80300l lVar) {
        this.f235054c = lVar;
        nativeMarkNeedCallbackBeforeSwapThisFrame(this.f235052a);
    }

    /* renamed from: k */
    public boolean mo111515k(Runnable runnable) {
        C90172b bVar;
        if (runnable == null || this.f235052a == 0 || (bVar = this.f235057f) == null) {
            return false;
        }
        bVar.mo123773p(new C80297i(runnable), false);
        return true;
    }

    /* renamed from: l */
    public boolean mo111516l(Runnable runnable) {
        C90172b bVar;
        if (runnable == null || this.f235052a == 0 || (bVar = this.f235057f) == null) {
            return false;
        }
        bVar.mo123773p(new C80298j(runnable), true);
        return true;
    }

    /* renamed from: m */
    public abstract C80301a.C80305d mo111517m();

    /* renamed from: n */
    public void mo111518n(boolean z) {
        if (this.f235052a != 0) {
            nativeSetIsCpuProfiling(this.f235052a, z);
        }
    }

    public native void nativeBindExtTextureManager(long j, MBExternalTextureMgr mBExternalTextureMgr);

    public native void nativeBindTo(long j, long j2, long j3, long j4);

    public native Bitmap nativeCaptureCanvas(long j, int i);

    public native Bitmap nativeCaptureScreen(long j, int i);

    public native long nativeCreate(MBParams mBParams);

    public native void nativeDebug(long j, int i);

    public native void nativeDestroy(long j);

    public native float[] nativeGetCurrentFps(long j);

    public native float nativeGetCurrentFpsVariance(long j);

    public native int nativeGetDrawCalls(long j);

    public native int nativeGetFrameCounter(long j);

    public native boolean nativeGetIsMali(long j);

    public native int nativeGetTriangles(long j);

    public native int nativeGetVertexes(long j);

    public native void nativeInit(long j);

    public native void nativeLazyLoadBox2D(long j, String str);

    public native void nativeLazyLoadPhysx(long j, String str);

    public native void nativeNotifyAnimationFrame(long j, double d);

    public native void nativeNotifyAnimationFrameLooper(long j);

    public native void nativeNotifyBeforeWindowDestroyed(long j, int i);

    public native void nativeNotifyExtSurfaceFrameAvailable(long j, int i, String str);

    public native void nativeNotifyImageDecoded(long j, String str, Object obj, ImageDecodeConfig imageDecodeConfig);

    public native void nativeNotifyTouchEvent(long j, int i, long j2);

    public native void nativeNotifyWindowAvailable(long j, int i, SurfaceTexture surfaceTexture, int i2, int i3, boolean z);

    public native void nativeNotifyWindowAvailableForSurface(long j, int i, Surface surface, int i2, int i3, boolean z);

    public native void nativeNotifyWindowChanged(long j, int i, SurfaceTexture surfaceTexture, int i2, int i3);

    public native void nativeNotifyWindowChangedForSurface(long j, int i, Surface surface, int i2, int i3);

    public native void nativeNotifyWindowDestroyed(long j, int i);

    public native void nativePause(long j);

    public native void nativeRegisterExtSurface(long j, int i, String str, int i2, int i3, Surface surface);

    public native void nativeResume(long j);

    public native void nativeSetEnableInspectFpsVariance(long j, boolean z);

    public native void nativeSetEventListener(long j, EventDispatcher eventDispatcher);

    public native void nativeSetFontHandler(long j, IMBFontHandler iMBFontHandler);

    public native void nativeSetImageHandler(long j, IImageDecodeService iImageDecodeService);

    public native void nativeSetJsThreadHandler(long j, long j2);

    public native void nativeSetUserPreferredFps(long j, double d);

    public native void nativeStopAnimationFrameLooper(long j);

    public native void nativeUnregisterExtSurface(long j, int i, String str);

    public native void nativeUpdateParams(long j, boolean z);

    /* renamed from: o */
    public abstract MBViewManager mo111559o();

    public void removeElement(int i) {
        try {
            MagicBrushView findOrNull = mo111559o().findOrNull(i);
            if (findOrNull == null) {
                C89598h.m112044a("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: removeElement window_id = [%d] not found!", Integer.valueOf(i));
                return;
            }
            C80301a.C80305d m = mo111517m();
            Objects.requireNonNull(m);
            m.mo111587c0(findOrNull);
            C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: removeElement a ScreenCanvas window_id = [%d]...done", Integer.valueOf(i));
        } catch (Exception e) {
            C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", e, "dl: ScreenCanvas: removeElement failed", new Object[0]);
        }
    }

    public void resumeLoopTasks() {
        if (this.f235057f != null) {
            this.f235057f.mo123770a();
        }
    }

    public void setTouchableRectList(int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        try {
            MagicBrushView findOrNull = mo111559o().findOrNull(i);
            if (findOrNull == null) {
                C89598h.m112044a("MicroMsg.MagicBrush.MBRuntime", "ScreenCanvas: setTouchableRectList window_id = [%d] not found!", Integer.valueOf(i));
                return;
            }
            float f = this.f235053b.device_pixel_ratio_;
            for (int i2 = 0; i2 < fArr.length; i2++) {
                fArr[i2] = fArr[i2] * f;
                fArr2[i2] = fArr2[i2] * f;
                fArr3[i2] = fArr3[i2] * f;
                fArr4[i2] = fArr4[i2] * f;
            }
            C80301a.C80305d m = mo111517m();
            Objects.requireNonNull(m);
            m.mo111584M(findOrNull, fArr, fArr2, fArr3, fArr4);
            C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "ScreenCanvas: setTouchableRectList for window_id = [%d]...done", Integer.valueOf(i));
        } catch (Exception e) {
            C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", e, "ScreenCanvas: setTouchableRect failed", new Object[0]);
        }
    }

    public void switchToJsThread(int i) {
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "switchToJsThread taskId: " + i, new Object[0]);
        if (this.f235057f != null) {
            try {
                C90172b bVar = this.f235057f;
                C80293e eVar = new C80293e(i);
                if (bVar.f258890a.mo123774q()) {
                    eVar.run();
                } else {
                    bVar.f258890a.mo123773p(eVar, false);
                }
            } catch (Throwable th) {
                C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", th, "hy: switchToJsThread crash!", new Object[0]);
                throw th;
            }
        } else {
            C89598h.m112044a("MicroMsg.MagicBrush.MBRuntime", "hy: switchToJsThread no js thread handler", new Object[0]);
        }
    }

    public void touchJava() {
    }

    public void updateElement(int i, float f, float f2, float f3, float f4, int i2) {
        try {
            int i3 = i;
            MagicBrushView findOrNull = mo111559o().findOrNull(i);
            if (findOrNull == null) {
                C89598h.m112044a("MicroMsg.MagicBrush.MBRuntime", "dl: ScreenCanvas: updateElement window_id = [%d] not found!", Integer.valueOf(i));
                return;
            }
            try {
                float f5 = this.f235053b.device_pixel_ratio_;
                if (f5 > 0.0f) {
                    C80301a.C80305d m = mo111517m();
                    Objects.requireNonNull(m);
                    m.mo111586W(findOrNull, (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5), (int) (f5 * f4), i2);
                    return;
                }
                throw new IllegalStateException("device pixel ratio is null");
            } catch (Exception e) {
                e = e;
                C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", e, "dl: ScreenCanvas: updateElement failed", new Object[0]);
            }
        } catch (Exception e2) {
            e = e2;
            C89598h.m112046c("MicroMsg.MagicBrush.MBRuntime", e, "dl: ScreenCanvas: updateElement failed", new Object[0]);
        }
    }
}
