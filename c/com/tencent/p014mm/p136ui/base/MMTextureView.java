package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import nj3.C100123u0;
import nj3.C88998t0;
import p156gj.C107835h0;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.ui.base.MMTextureView */
public class MMTextureView extends TextureView implements C100123u0 {

    /* renamed from: d */
    public Field f165059d;

    /* renamed from: e */
    public boolean f165060e = false;

    /* renamed from: f */
    public Object f165061f;

    /* renamed from: g */
    public Object f165062g;

    public MMTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: A */
    public void mo82023A() {
        try {
            Log.m105924i("MicroMsg.MMTextureView", "hookInnerDetach");
            Field declaredField = TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f165061f = declaredField.get(this);
            declaredField.set(this, (Object) null);
            Field declaredField2 = TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f165062g = declaredField2.get(this);
            declaredField2.set(this, (Object) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMTextureView", e, "", new Object[0]);
        }
    }

    /* renamed from: B */
    public void mo82024B() {
        if (C11171e.m11044a(16)) {
            Log.m105925i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", Integer.valueOf(Build.VERSION.SDK_INT));
        } else if (C11171e.m11045b(20)) {
            Log.m105925i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", Integer.valueOf(Build.VERSION.SDK_INT));
        } else if (C107835h0.f322856m.f322888a0 == 2) {
            Log.m105924i("MicroMsg.MMTextureView", "do not do sly textureView, config ERROR");
        } else {
            Log.m105924i("MicroMsg.MMTextureView", "detect texture problem, sly");
            try {
                if (this.f165059d == null) {
                    Field declaredField = TextureView.class.getDeclaredField("mSurface");
                    this.f165059d = declaredField;
                    declaredField.setAccessible(true);
                }
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f165059d.get(this);
                if (surfaceTexture == null) {
                    Log.m105924i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
                } else if (!(surfaceTexture instanceof C88998t0)) {
                    C88998t0 t0Var = new C88998t0(0);
                    t0Var.f256586a = surfaceTexture;
                    this.f165059d.set(this, t0Var);
                    Log.m105924i("MicroMsg.MMTextureView", "detect texture problem, wrap");
                } else {
                    Log.m105924i("MicroMsg.MMTextureView", "detect texture problem, wrapped");
                }
            } catch (NoSuchFieldException e) {
                Log.printErrStackTrace("MicroMsg.MMTextureView", e, "", new Object[0]);
                Log.m105920e("MicroMsg.MMTextureView", "detect texture problem, NoSuchFieldException");
            } catch (IllegalArgumentException e2) {
                Log.printErrStackTrace("MicroMsg.MMTextureView", e2, "", new Object[0]);
                Log.m105920e("MicroMsg.MMTextureView", "detect texture problem, IllegalArgumentException");
            } catch (IllegalAccessException e3) {
                Log.printErrStackTrace("MicroMsg.MMTextureView", e3, "", new Object[0]);
                Log.m105920e("MicroMsg.MMTextureView", "detect texture problem, IllegalAccessException");
            }
        }
    }

    /* renamed from: C */
    public void mo82025C() {
        try {
            Log.m105924i("MicroMsg.MMTextureView", "unHookInnerDetach");
            if (this.f165061f != null) {
                Field declaredField = TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f165061f);
                this.f165061f = null;
            }
            if (this.f165062g != null) {
                Field declaredField2 = TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f165062g);
                this.f165062g = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMTextureView", e, "", new Object[0]);
        }
    }

    public void destroyDrawingCache() {
        super.destroyDrawingCache();
        if (this.f165060e) {
            mo82025C();
        }
    }

    public void onAttachedToWindow() {
        if (this.f165060e) {
            mo82023A();
        }
        super.onAttachedToWindow();
        if (this.f165060e) {
            mo82025C();
        }
    }

    public void onDetachedFromWindow() {
        if (this.f165060e) {
            mo82023A();
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMTextureView", e, "unkown error", new Object[0]);
        }
    }

    public void setInterceptDetach(boolean z) {
        this.f165060e = z;
    }

    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
        mo82024B();
    }

    public MMTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMTextureView(Context context) {
        super(context);
    }
}
