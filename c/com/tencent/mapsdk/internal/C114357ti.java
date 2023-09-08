package com.tencent.mapsdk.internal;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.ti */
public final class C114357ti extends TextureView implements TextureView.SurfaceTextureListener, C113572bv {

    /* renamed from: a */
    private C114322sx f342757a;

    /* renamed from: b */
    private C114321sw f342758b;

    /* renamed from: c */
    private SurfaceTexture f342759c;

    /* renamed from: d */
    private boolean f342760d = false;

    /* renamed from: e */
    private boolean f342761e = false;

    public C114357ti(C113536be beVar) {
        super(beVar.getContext());
        this.f342757a = (C114322sx) beVar.mo171634b();
        setSurfaceTextureListener(this);
        setOpaque(beVar.mo171646n());
        this.f342758b = new C114321sw(this.f342757a);
        C114321sw.m160150a(beVar.mo171645m());
        this.f342758b.f342503a = beVar.mo171647o();
        this.f342758b.start();
    }

    /* renamed from: a */
    public final void mo171857a() {
        this.f342761e = false;
        if (this.f342759c != null && this.f342760d && getSurfaceTexture() != this.f342759c && isAvailable()) {
            setSurfaceTexture(this.f342759c);
            this.f342760d = false;
        }
        C114321sw swVar = this.f342758b;
        if (swVar != null) {
            swVar.mo172970b();
        }
    }

    /* renamed from: b */
    public final void mo171860b() {
        this.f342761e = true;
        C114321sw swVar = this.f342758b;
        if (swVar != null) {
            swVar.mo172968a();
        }
    }

    /* renamed from: c */
    public final void mo171861c() {
        C114321sw swVar = this.f342758b;
        if (swVar != null) {
            swVar.mo172971c();
        }
        SurfaceTexture surfaceTexture = this.f342759c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f342759c = null;
        }
    }

    /* renamed from: d */
    public final void mo171862d() {
        C114321sw swVar = this.f342758b;
        if (swVar != null) {
            synchronized (swVar) {
                this.f342758b.notify();
            }
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C114322sx sxVar = this.f342757a;
        if (sxVar == null || !sxVar.mo172982a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo171863e() {
        return isOpaque();
    }

    public final View getView() {
        return this;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C114322sx sxVar = this.f342757a;
        if (sxVar != null) {
            sxVar.mo172984e(i, i2);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f342759c = surfaceTexture;
        mo171859a(surfaceTexture, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f342760d = true;
        return !this.f342761e;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C114322sx sxVar = this.f342757a;
        if (sxVar != null) {
            sxVar.mo172979a((GL10) null, i, i2);
            C114321sw swVar = this.f342758b;
            if (swVar != null) {
                swVar.mo172972d();
            }
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setMapOpaque(boolean z) {
        if (this.f342757a != null) {
            setOpaque(z);
        }
    }

    public final void setZOrderMediaOverlay(boolean z) {
    }

    /* renamed from: a */
    public final void mo171859a(Object obj, int i, int i2) {
        this.f342758b.mo172969a(obj);
        C114322sx sxVar = this.f342757a;
        if (sxVar != null) {
            sxVar.mo172980a((GL10) null, (EGLConfig) null);
            this.f342757a.mo172979a((GL10) null, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo171858a(float f) {
        if (this.f342758b != null) {
            C114321sw.m160150a(f);
        }
    }
}
