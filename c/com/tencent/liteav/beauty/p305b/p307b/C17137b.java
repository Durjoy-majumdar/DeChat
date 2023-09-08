package com.tencent.liteav.beauty.p305b.p307b;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p310c.C17204d;

/* renamed from: com.tencent.liteav.beauty.b.b.b */
public final class C17137b extends C17204d {

    /* renamed from: a */
    public int f46226a = -1;

    /* renamed from: b */
    public int f46227b = -1;

    /* renamed from: c */
    private int f46228c = -1;

    public C17137b() {
        super((String) null);
    }

    public final int buildProgram() {
        return NativeLoad.nativeLoadGLProgram(12);
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46226a = GLES20.glGetUniformLocation(getProgramId(), "whiteDegree");
        this.f46228c = GLES20.glGetUniformLocation(getProgramId(), "contrast");
        this.f46227b = GLES20.glGetUniformLocation(getProgramId(), "ruddyDegree");
    }
}
