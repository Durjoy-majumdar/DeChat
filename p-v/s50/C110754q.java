package s50;

import android.opengl.GLES20;
import android.opengl.Matrix;
import u80.C111143e;

/* renamed from: s50.q */
public final class C110754q extends C111143e {

    /* renamed from: H */
    public int f331251H;

    /* renamed from: I */
    public int f331252I;

    /* renamed from: J */
    public int f331253J;

    /* renamed from: K */
    public int f331254K;

    public C110754q(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4, 1, 2);
    }

    /* renamed from: g */
    public void mo158521g() {
        if (System.currentTimeMillis() - 0 <= ((long) 0)) {
            float currentTimeMillis = (((float) (System.currentTimeMillis() - 0)) * 1.0f) / ((float) 0);
            int i = this.f331251H;
            float f = 0.0f + currentTimeMillis;
            int i2 = (int) (((float) i) * f);
            this.f332748c = i2;
            int i3 = this.f331252I;
            int i4 = (int) (((float) i3) * f);
            this.f332749d = i4;
            if (i2 > i) {
                this.f332748c = i;
            }
            if (i4 > i3) {
                this.f332748c = i3;
            }
            this.f331253J = (i - this.f332748c) / 2;
            this.f331254K = (i3 - i4) / 2;
        }
        Matrix.setIdentityM(this.f332757l, 0);
        Matrix.setRotateM(this.f332757l, 0, (float) this.f332758m, 0.0f, 0.0f, -1.0f);
        if (this.f332760o) {
            Matrix.scaleM(this.f332757l, 0, -1.0f, 1.0f, 1.0f);
        }
        if (this.f332751f == 5) {
            mo162878i(((float) this.f332748c) / ((float) this.f332749d), ((float) this.f332746a) / ((float) this.f332747b));
        }
        mo158337k();
        mo162882t();
        GLES20.glViewport(this.f331253J, this.f331254K, this.f332748c, this.f332749d);
    }

    /* renamed from: s */
    public void mo158522s(int i, int i2) {
        super.mo158522s(i, i2);
        this.f331251H = i;
        this.f331252I = i2;
    }
}
