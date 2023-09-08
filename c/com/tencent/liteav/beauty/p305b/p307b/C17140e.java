package com.tencent.liteav.beauty.p305b.p307b;

import android.opengl.GLES20;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p310c.C17204d;

/* renamed from: com.tencent.liteav.beauty.b.b.e */
public final class C17140e extends C17204d {

    /* renamed from: a */
    public int f46235a = -1;

    /* renamed from: b */
    private int f46236b = -1;

    /* renamed from: c */
    private int f46237c = -1;

    public C17140e() {
        super((String) null, (String) null);
    }

    public final int buildProgram() {
        if (!LiteavSystemInfo.getBrand().equals("samsung") || !LiteavSystemInfo.getModel().equals("GT-I9500") || !LiteavSystemInfo.getSystemOSVersion().equals("4.3")) {
            return NativeLoad.nativeLoadGLProgram(5);
        }
        LiteavLog.m16896d("SmoothVertical", "SAMSUNG_S4 GT-I9500 + Android 4.3; use diffrent shader!");
        return NativeLoad.nativeLoadGLProgram(15);
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46236b = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.f46237c = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
        this.f46235a = GLES20.glGetUniformLocation(getProgramId(), "smoothDegree");
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        float f = 2.0f;
        if (i <= i2 ? i >= 540 : i2 >= 540) {
            f = 4.0f;
        }
        LiteavLog.m16901i("SmoothVertical", "mTextureRation ".concat(String.valueOf(f)));
        setFloatOnDraw(this.f46236b, f / ((float) i));
        setFloatOnDraw(this.f46237c, f / ((float) i2));
    }
}
