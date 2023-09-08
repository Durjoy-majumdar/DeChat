package com.tencent.liteav.videobase.p309a;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.videobase.a.d */
final /* synthetic */ class C17191d implements Runnable {

    /* renamed from: a */
    private final int f46453a;

    /* renamed from: b */
    private final float[] f46454b;

    private C17191d(int i, float[] fArr) {
        this.f46453a = i;
        this.f46454b = fArr;
    }

    /* renamed from: a */
    public static Runnable m17031a(int i, float[] fArr) {
        return new C17191d(i, fArr);
    }

    public final void run() {
        GLES20.glUniform3fv(this.f46453a, 1, FloatBuffer.wrap(this.f46454b));
    }
}
