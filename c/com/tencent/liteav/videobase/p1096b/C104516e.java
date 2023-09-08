package com.tencent.liteav.videobase.p1096b;

import android.opengl.EGLContext;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C17118l;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.liteav.videobase.b.e */
public final class C104516e {

    /* renamed from: b */
    private static final C17118l f309782b = new C17118l();

    /* renamed from: c */
    private static final AtomicInteger f309783c = new AtomicInteger();

    /* renamed from: a */
    public C104519h<?> f309784a;

    /* renamed from: d */
    private boolean f309785d = false;

    /* renamed from: a */
    public final void mo147196a(Object obj, Surface surface, int i, int i2) {
        this.f309785d = surface == null;
        if (obj == null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                this.f309784a = C104513b.m139813a((EGLContext) null, surface, i, i2);
            } else {
                this.f309784a = C104512a.m139802a((javax.microedition.khronos.egl.EGLContext) null, surface, i, i2);
            }
        } else if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            this.f309784a = C104512a.m139802a((javax.microedition.khronos.egl.EGLContext) obj, surface, i, i2);
        } else if (LiteavSystemInfo.getSystemOSVersionInt() < 17 || !(obj instanceof EGLContext)) {
            throw new C104518g(0, "sharedContext isn't EGLContext");
        } else {
            this.f309784a = C104513b.m139813a((EGLContext) obj, surface, i, i2);
        }
        f309783c.incrementAndGet();
        LiteavLog.m16901i("EGLCore", "EGLCore created in thread " + Thread.currentThread().getId() + ", sharedContext: " + obj + ", Surface: " + surface + ", width: " + i + ", height:" + i2);
    }

    /* renamed from: b */
    public final void mo147197b() {
        C104519h<?> hVar = this.f309784a;
        if (hVar != null) {
            hVar.mo147188a();
        }
    }

    /* renamed from: c */
    public final Object mo147198c() {
        C104519h<?> hVar = this.f309784a;
        if (hVar == null) {
            return null;
        }
        return hVar.mo147193f();
    }

    /* renamed from: b */
    public static /* synthetic */ void m139823b(C104516e eVar) {
        try {
            C104519h<?> hVar = eVar.f309784a;
            if (hVar != null) {
                hVar.mo147190c();
                eVar.f309784a = null;
            }
            f309783c.decrementAndGet();
            LiteavLog.m16901i("EGLCore", "EGLCore destroy success. ".concat(String.valueOf(eVar)));
        } catch (C104518g e) {
            LiteavLog.m16899e("EGLCore", "EGLCore destroy failed.", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo147195a() {
        C104519h<?> hVar = this.f309784a;
        if (hVar != null) {
            hVar.mo147189b();
        }
    }

    /* renamed from: a */
    public static void m139822a(C104516e eVar) {
        if (eVar != null) {
            C104519h<?> hVar = eVar.f309784a;
            if (hVar != null) {
                hVar.mo147191d();
            }
            Runnable a = C104517f.m139828a(eVar);
            if (!eVar.f309785d) {
                a.run();
            } else {
                f309782b.mo19370a(a, 100);
            }
        }
    }
}
