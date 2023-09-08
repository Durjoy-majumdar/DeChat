package com.tencent.liteav.videobase.p309a;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.videobase.a.e */
final /* synthetic */ class C17192e implements Runnable {

    /* renamed from: a */
    private final int f46455a;

    /* renamed from: b */
    private final float[] f46456b;

    private C17192e(int i, float[] fArr) {
        this.f46455a = i;
        this.f46456b = fArr;
    }

    /* renamed from: a */
    public static Runnable m17032a(int i, float[] fArr) {
        return new C17192e(i, fArr);
    }

    public final void run() {
        GLES20.glUniform2fv(this.f46455a, 1, FloatBuffer.wrap(this.f46456b));
    }
}
