package com.tencent.liteav.beauty.p305b;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.p305b.C17149f;

/* renamed from: com.tencent.liteav.beauty.b.g */
final /* synthetic */ class C17151g implements Runnable {

    /* renamed from: a */
    private final C17149f.C17150a f46273a;

    private C17151g(C17149f.C17150a aVar) {
        this.f46273a = aVar;
    }

    /* renamed from: a */
    public static Runnable m16987a(C17149f.C17150a aVar) {
        return new C17151g(aVar);
    }

    public final void run() {
        C17149f.C17150a aVar = this.f46273a;
        GLES20.glUniform1f(aVar.f46269a, aVar.f46271c / ((float) aVar.mOutputSize.f309736a));
        GLES20.glUniform1f(aVar.f46270b, aVar.f46272d / ((float) aVar.mOutputSize.f309737b));
    }
}
