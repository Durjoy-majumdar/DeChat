package com.tencent.mapsdk.internal;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.mapsdk.internal.C114342tg;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.tj */
public final class C114358tj extends C114342tg implements C113572bv, C104561nz, C114015ol, C114342tg.C114354m {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C114322sx f342762i;

    /* renamed from: j */
    private boolean f342763j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Object f342764k;

    /* renamed from: l */
    private C113536be f342765l;

    public C114358tj(C113536be beVar) {
        super(beVar.getContext());
        this.f342765l = beVar;
        this.f342764k = beVar.mo171641i();
        this.f342689g = beVar.mo171647o();
        this.f342762i = (C114322sx) beVar.mo171634b();
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser((C114342tg.C114347e) new C114342tg.C114344b(8, 16, 8));
        setEGLContextFactory(new C114342tg.C114348f() {
            /* renamed from: a */
            public final void mo173029a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                if (C114358tj.this.f342762i != null) {
                    C114358tj.this.f342762i.mo171541E();
                }
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroyContext(eGLDisplay, eGLContext);
            }

            /* renamed from: a */
            public final EGLContext mo173028a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                if (C114358tj.this.f342762i != null) {
                    C114358tj.this.f342762i.mo171540D();
                }
                return eglCreateContext;
            }
        });
        if (this.f342764k != null) {
            setEGLWindowSurfaceFactory(new C114342tg.C114349g() {
                /* renamed from: a */
                public final EGLSurface mo173030a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
                    EGLSurface eGLSurface = null;
                    try {
                        eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, C114358tj.this.f342764k, (int[]) null);
                    } catch (IllegalArgumentException | OutOfMemoryError unused) {
                    }
                    if (C114358tj.this.f342762i != null) {
                        C114358tj.this.f342762i.mo171540D();
                    }
                    return eGLSurface;
                }

                /* renamed from: a */
                public final void mo173031a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
                    if (C114358tj.this.f342762i != null) {
                        C114358tj.this.f342762i.mo171541E();
                    }
                    egl10.eglDestroySurface(eGLDisplay, eGLSurface);
                }
            });
        }
        mo173004a(this, this.f342765l.mo171645m());
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
        this.f342763j = true;
        setContentDescription(AccessibleTouchItem.MAP_DEFAULT_CONTENT_DESCRIPTION);
    }

    /* renamed from: h */
    private void m160464h() {
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser((C114342tg.C114347e) new C114342tg.C114344b(8, 16, 8));
        setEGLContextFactory(new C114342tg.C114348f() {
            /* renamed from: a */
            public final void mo173029a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                if (C114358tj.this.f342762i != null) {
                    C114358tj.this.f342762i.mo171541E();
                }
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroyContext(eGLDisplay, eGLContext);
            }

            /* renamed from: a */
            public final EGLContext mo173028a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                if (C114358tj.this.f342762i != null) {
                    C114358tj.this.f342762i.mo171540D();
                }
                return eglCreateContext;
            }
        });
        if (this.f342764k != null) {
            setEGLWindowSurfaceFactory(new C114342tg.C114349g() {
                /* renamed from: a */
                public final EGLSurface mo173030a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
                    EGLSurface eGLSurface = null;
                    try {
                        eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, C114358tj.this.f342764k, (int[]) null);
                    } catch (IllegalArgumentException | OutOfMemoryError unused) {
                    }
                    if (C114358tj.this.f342762i != null) {
                        C114358tj.this.f342762i.mo171540D();
                    }
                    return eGLSurface;
                }

                /* renamed from: a */
                public final void mo173031a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
                    if (C114358tj.this.f342762i != null) {
                        C114358tj.this.f342762i.mo171541E();
                    }
                    egl10.eglDestroySurface(eGLDisplay, eGLSurface);
                }
            });
        }
    }

    /* renamed from: j */
    private static boolean m160465j(C114342tg tgVar) {
        tgVar.setPreserveEGLContextOnPause(true);
        return true;
    }

    /* renamed from: T */
    public final void mo172975T() {
        C114322sx sxVar = this.f342762i;
        if (sxVar != null) {
            sxVar.mo172975T();
        }
    }

    /* renamed from: a */
    public final void mo171859a(Object obj, int i, int i2) {
    }

    /* renamed from: c */
    public final void mo173006c() {
        super.mo173006c();
    }

    /* renamed from: d */
    public final void mo171862d() {
        if (getVisibility() == 0) {
            this.f342690h.mo173037c();
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C114322sx sxVar = this.f342762i;
        if (sxVar == null || !sxVar.mo172982a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo171863e() {
        return false;
    }

    /* renamed from: f */
    public final void mo147883f() {
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser((C114342tg.C114347e) new C114342tg.C114344b(8, 16, 8));
        setEGLContextFactory(new C114342tg.C114348f() {
            /* renamed from: a */
            public final void mo173029a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                if (C114358tj.this.f342762i != null) {
                    C114358tj.this.f342762i.mo171541E();
                }
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroyContext(eGLDisplay, eGLContext);
            }

            /* renamed from: a */
            public final EGLContext mo173028a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                if (C114358tj.this.f342762i != null) {
                    C114358tj.this.f342762i.mo171540D();
                }
                return eglCreateContext;
            }
        });
        if (this.f342764k != null) {
            setEGLWindowSurfaceFactory(new C114342tg.C114349g() {
                /* renamed from: a */
                public final EGLSurface mo173030a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
                    EGLSurface eGLSurface = null;
                    try {
                        eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, C114358tj.this.f342764k, (int[]) null);
                    } catch (IllegalArgumentException | OutOfMemoryError unused) {
                    }
                    if (C114358tj.this.f342762i != null) {
                        C114358tj.this.f342762i.mo171540D();
                    }
                    return eGLSurface;
                }

                /* renamed from: a */
                public final void mo173031a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
                    if (C114358tj.this.f342762i != null) {
                        C114358tj.this.f342762i.mo171541E();
                    }
                    egl10.eglDestroySurface(eGLDisplay, eGLSurface);
                }
            });
        }
        mo173004a(this, this.f342765l.mo171645m());
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
        this.f342763j = true;
    }

    public final int getEGLContextHash() {
        C114322sx sxVar = this.f342762i;
        if (sxVar != null) {
            return sxVar.getEGLContextHash();
        }
        return 0;
    }

    public final C113532ba getVectorMapDelegate() {
        return this.f342762i;
    }

    public final View getView() {
        return this;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C114322sx sxVar = this.f342762i;
        if (sxVar != null) {
            sxVar.mo172984e(i, i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setMapOpaque(boolean z) {
    }

    /* renamed from: a */
    public final void mo172980a(GL10 gl10, EGLConfig eGLConfig) {
        C114322sx sxVar = this.f342762i;
        if (sxVar != null) {
            sxVar.mo172980a(gl10, eGLConfig);
        }
    }

    /* renamed from: b */
    public final void mo173005b() {
        if (this.f342763j) {
            super.mo173005b();
        }
    }

    /* renamed from: a */
    public final void mo172979a(GL10 gl10, int i, int i2) {
        C114322sx sxVar = this.f342762i;
        if (sxVar != null) {
            sxVar.mo172979a(gl10, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo173002a() {
        if (this.f342763j) {
            super.mo173002a();
        }
    }

    /* renamed from: a */
    public final boolean mo172983a(GL10 gl10) {
        C114322sx sxVar = this.f342762i;
        if (sxVar == null) {
            return false;
        }
        return sxVar.mo172983a(gl10);
    }
}
