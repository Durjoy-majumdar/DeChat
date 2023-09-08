package com.tencent.liteav.videobase.p309a;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.videobase.a.f */
final /* synthetic */ class C17193f implements Runnable {

    /* renamed from: a */
    private final int f46457a;

    /* renamed from: b */
    private final float[] f46458b;

    private C17193f(int i, float[] fArr) {
        this.f46457a = i;
        this.f46458b = fArr;
    }

    /* renamed from: a */
    public static Runnable m17033a(int i, float[] fArr) {
        return new C17193f(i, fArr);
    }

    public final void run() {
        GLES20.glUniform4fv(this.f46457a, 1, FloatBuffer.wrap(this.f46458b));
    }
}
