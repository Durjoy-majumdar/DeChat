package rp3;

import android.opengl.GLES20;

/* renamed from: rp3.a */
public class C110602a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f330870d;

    /* renamed from: e */
    public final /* synthetic */ int f330871e;

    public C110602a(C110604c cVar, int i, int i2) {
        this.f330870d = i;
        this.f330871e = i2;
    }

    public void run() {
        GLES20.glUniform1i(this.f330870d, this.f330871e);
    }
}
