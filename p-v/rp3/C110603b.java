package rp3;

import android.opengl.GLES20;

/* renamed from: rp3.b */
public class C110603b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f330872d;

    /* renamed from: e */
    public final /* synthetic */ float f330873e;

    public C110603b(C110604c cVar, int i, float f) {
        this.f330872d = i;
        this.f330873e = f;
    }

    public void run() {
        GLES20.glUniform1f(this.f330872d, this.f330873e);
    }
}
