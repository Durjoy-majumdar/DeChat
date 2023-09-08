package com.tencent.liteav.beauty.p305b.p307b;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.beauty.b.b.d */
public final class C17139d extends C17189b {

    /* renamed from: a */
    private int f46233a = -1;

    /* renamed from: b */
    private int f46234b = -1;

    public C17139d() {
        super((String) null, (String) null);
    }

    public final int buildProgram() {
        return NativeLoad.nativeLoadGLProgram(13);
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46233a = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.f46234b = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        float f = 2.0f;
        if (i <= i2 ? i >= 540 : i2 >= 540) {
            f = 4.0f;
        }
        LiteavLog.m16901i("SmoothHorizontal", "m_textureRation ".concat(String.valueOf(f)));
        setFloatOnDraw(this.f46233a, f / ((float) i));
        setFloatOnDraw(this.f46234b, f / ((float) i2));
    }
}
