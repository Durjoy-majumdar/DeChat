package com.tencent.liteav.beauty.p305b.p308c;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.beauty.b.c.b */
public final class C17143b extends C17189b {

    /* renamed from: a */
    private int f46246a = -1;

    /* renamed from: b */
    private int f46247b = -1;

    /* renamed from: c */
    private final float[] f46248c = new float[4];

    public C17143b() {
        super((String) null, (String) null);
    }

    /* renamed from: a */
    public final void mo19421a(float f) {
        float[] fArr = this.f46248c;
        fArr[0] = f;
        m16981a(fArr);
    }

    /* renamed from: b */
    public final void mo19422b(float f) {
        float[] fArr = this.f46248c;
        fArr[1] = f;
        m16981a(fArr);
    }

    public final int buildProgram() {
        return NativeLoad.nativeLoadGLProgram(14);
    }

    /* renamed from: c */
    public final void mo19423c(float f) {
        float[] fArr = this.f46248c;
        fArr[2] = f;
        m16981a(fArr);
    }

    public final boolean canBeSkipped() {
        return ((double) Math.abs(this.f46248c[0])) < 1.0E-5d && ((double) Math.abs(this.f46248c[1])) < 1.0E-5d && ((double) Math.abs(this.f46248c[2])) < 1.0E-5d;
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46246a = GLES20.glGetUniformLocation(getProgramId(), "singleStepOffset");
        this.f46247b = GLES20.glGetUniformLocation(getProgramId(), "beautyParams");
        mo19421a(5.0f);
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        setFloatVec2OnDraw(this.f46246a, new float[]{2.0f / ((float) i), 2.0f / ((float) i2)});
    }

    /* renamed from: a */
    private void m16981a(float[] fArr) {
        setFloatVec4OnDraw(this.f46247b, fArr);
    }
}
