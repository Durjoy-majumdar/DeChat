package com.tencent.mapsdk.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.th */
public final class C114356th extends View implements C113572bv {

    /* renamed from: a */
    private Context f342750a;

    /* renamed from: b */
    private C114322sx f342751b;

    /* renamed from: c */
    private Object f342752c;

    /* renamed from: d */
    private int f342753d;

    /* renamed from: e */
    private int f342754e;

    /* renamed from: f */
    private C114321sw f342755f;

    /* renamed from: g */
    private boolean f342756g = true;

    public C114356th(C113536be beVar) {
        super(beVar.getContext());
        Object i = beVar.mo171641i();
        if (i != null) {
            this.f342750a = beVar.getContext();
            this.f342751b = (C114322sx) beVar.mo171634b();
            this.f342752c = i;
            this.f342753d = beVar.mo171642j();
            int k = beVar.mo171643k();
            this.f342754e = k;
            if (k <= 0 || this.f342753d <= 0) {
                this.f342753d = 0;
                this.f342754e = 0;
            }
            C114321sw swVar = new C114321sw(this.f342751b);
            this.f342755f = swVar;
            swVar.mo172969a(this.f342752c);
            C114321sw.m160150a(beVar.mo171645m());
            this.f342755f.f342503a = beVar.mo171647o();
            this.f342755f.start();
        }
    }

    /* renamed from: f */
    private void m160447f() {
        C114322sx sxVar = this.f342751b;
        if (sxVar != null && this.f342756g) {
            sxVar.mo172980a((GL10) null, (EGLConfig) null);
            this.f342751b.mo172979a((GL10) null, this.f342753d, this.f342754e);
            this.f342751b.mo172984e(this.f342753d, this.f342754e);
            this.f342756g = false;
        }
    }

    /* renamed from: a */
    public final void mo171857a() {
        C114321sw swVar = this.f342755f;
        if (swVar != null) {
            swVar.mo172970b();
        }
        C114322sx sxVar = this.f342751b;
        if (sxVar != null && this.f342756g) {
            sxVar.mo172980a((GL10) null, (EGLConfig) null);
            this.f342751b.mo172979a((GL10) null, this.f342753d, this.f342754e);
            this.f342751b.mo172984e(this.f342753d, this.f342754e);
            this.f342756g = false;
        }
    }

    /* renamed from: b */
    public final void mo171860b() {
        C114321sw swVar = this.f342755f;
        if (swVar != null) {
            swVar.mo172968a();
        }
    }

    /* renamed from: c */
    public final void mo171861c() {
        C114321sw swVar = this.f342755f;
        if (swVar != null) {
            swVar.mo172971c();
        }
    }

    /* renamed from: d */
    public final void mo171862d() {
        C114321sw swVar = this.f342755f;
        if (swVar != null) {
            synchronized (swVar) {
                this.f342755f.notify();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo171863e() {
        return false;
    }

    public final View getView() {
        return this;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        C114322sx sxVar = this.f342751b;
        if (sxVar != null) {
            this.f342753d = i;
            this.f342754e = i2;
            sxVar.mo172979a((GL10) null, i, i2);
            this.f342751b.mo172984e(i, i2);
            this.f342751b.mo171542F();
            this.f342756g = true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setMapOpaque(boolean z) {
    }

    public final void setZOrderMediaOverlay(boolean z) {
    }

    /* renamed from: a */
    public final void mo171859a(Object obj, int i, int i2) {
        C114321sw swVar;
        if (this.f342751b != null && (swVar = this.f342755f) != null && swVar.isAlive()) {
            C114321sw swVar2 = this.f342755f;
            if (swVar2 != null) {
                this.f342752c = obj;
                swVar2.mo172969a(obj);
            }
            C114322sx sxVar = this.f342751b;
            if (sxVar != null) {
                sxVar.mo172980a((GL10) null, (EGLConfig) null);
                this.f342751b.mo172979a((GL10) null, i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo171858a(float f) {
        if (this.f342755f != null) {
            C114321sw.m160150a(f);
        }
    }
}
