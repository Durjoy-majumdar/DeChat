package com.tencent.p014mm.plugin.thumbplayer.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.hook.THookTextureView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m03.C61424a;
import m03.C88688g;
import nj3.C100123u0;
import p156gj.C107835h0;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMTextureView */
public class MMTextureView extends THookTextureView implements C61424a, C100123u0 {

    /* renamed from: d */
    public Field f164640d;

    /* renamed from: e */
    public boolean f164641e = false;

    /* renamed from: f */
    public Object f164642f;

    /* renamed from: g */
    public Object f164643g;

    public MMTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void destroyDrawingCache() {
        super.destroyDrawingCache();
        if (this.f164641e) {
            mo81136l();
        }
    }

    /* renamed from: i */
    public void mo81134i() {
        try {
            setInterceptDetach(false);
            mo81136l();
            Method method = TextureView.class.getMethod("destroyHardwareLayer", new Class[0]);
            method.setAccessible(true);
            method.invoke(this, new Object[0]);
            Method method2 = TextureView.class.getMethod("releaseSurfaceTexture", new Class[0]);
            method2.setAccessible(true);
            method2.invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public void mo81135k() {
        try {
            Log.m105924i("MicroMsg.MMTextureView", "hookInnerDetach");
            Field declaredField = TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f164642f = declaredField.get(this);
            declaredField.set(this, (Object) null);
            Field declaredField2 = TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f164643g = declaredField2.get(this);
            declaredField2.set(this, (Object) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMTextureView", e, "", new Object[0]);
        }
    }

    /* renamed from: l */
    public void mo81136l() {
        try {
            Log.m105924i("MicroMsg.MMTextureView", "unHookInnerDetach");
            if (this.f164642f != null) {
                Field declaredField = TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f164642f);
                this.f164642f = null;
            }
            if (this.f164643g != null) {
                Field declaredField2 = TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f164643g);
                this.f164643g = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMTextureView", e, "", new Object[0]);
        }
    }

    public void onAttachedToWindow() {
        if (this.f164641e) {
            mo81135k();
        }
        super.onAttachedToWindow();
        if (this.f164641e) {
            mo81136l();
        }
    }

    public void onDetachedFromWindow() {
        if (this.f164641e) {
            mo81135k();
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMTextureView", e, "unkown error", new Object[0]);
        }
    }

    public void setInterceptDetach(boolean z) {
        this.f164641e = z;
    }

    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
        if (C11171e.m11044a(16)) {
            Log.m105925i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", Integer.valueOf(Build.VERSION.SDK_INT));
        } else if (C11171e.m11045b(20)) {
            Log.m105925i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", Integer.valueOf(Build.VERSION.SDK_INT));
        } else if (C107835h0.f322856m.f322888a0 == 2) {
            Log.m105924i("MicroMsg.MMTextureView", "do not do sly textureView, config ERROR");
        } else {
            Log.m105924i("MicroMsg.MMTextureView", "detect texture problem, sly");
            try {
                if (this.f164640d == null) {
                    Field declaredField = TextureView.class.getDeclaredField("mSurface");
                    this.f164640d = declaredField;
                    declaredField.setAccessible(true);
                }
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f164640d.get(this);
                if (surfaceTexture2 == null) {
                    Log.m105924i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
                } else if (!(surfaceTexture2 instanceof C88688g)) {
                    C88688g gVar = new C88688g(0);
                    gVar.f256041a = surfaceTexture2;
                    this.f164640d.set(this, gVar);
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

    public MMTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMTextureView(Context context) {
        super(context);
    }
}
