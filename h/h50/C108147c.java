package h50;

import android.graphics.PointF;
import android.opengl.Matrix;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import g50.C107754k;

/* renamed from: h50.c */
public class C108147c {

    /* renamed from: a */
    public boolean f323845a = false;

    /* renamed from: b */
    public float[] f323846b = new float[16];

    /* renamed from: c */
    public boolean f323847c = false;

    /* renamed from: d */
    public boolean f323848d = false;

    /* renamed from: e */
    public boolean f323849e = false;

    /* renamed from: f */
    public C107754k f323850f;

    /* renamed from: g */
    public PointF f323851g = new PointF();

    /* renamed from: h */
    public PointF f323852h = new PointF();

    /* renamed from: i */
    public int f323853i;

    /* renamed from: j */
    public float f323854j;

    /* renamed from: k */
    public float f323855k;

    /* renamed from: l */
    public float f323856l;

    /* renamed from: m */
    public float f323857m;

    /* renamed from: n */
    public float f323858n;

    /* renamed from: o */
    public float f323859o;

    /* renamed from: p */
    public float f323860p;

    /* renamed from: q */
    public float f323861q;

    /* renamed from: r */
    public float f323862r;

    /* renamed from: s */
    public int f323863s;

    /* renamed from: t */
    public int f323864t;

    public C108147c() {
        mo158553c();
        this.f323845a = true;
    }

    /* renamed from: a */
    public final void mo158551a() {
        float[] fArr = this.f323846b;
        fArr[12] = mo158552b(fArr[12], this.f323861q);
        float[] fArr2 = this.f323846b;
        fArr2[13] = mo158552b(fArr2[13], this.f323862r);
    }

    /* renamed from: b */
    public final float mo158552b(float f, float f2) {
        float f3 = this.f323846b[0];
        if (((double) (f3 * f2)) < 1.0d) {
            return 0.0f;
        }
        float f4 = f3 - 1.0f;
        float f5 = f4 * f2;
        if (f > f5) {
            return f5;
        }
        float f6 = f4 * (-f2);
        return f < f6 ? f6 : f;
    }

    /* renamed from: c */
    public void mo158553c() {
        this.f323857m = 0.0f;
        this.f323858n = 0.0f;
        this.f323859o = 0.0f;
        this.f323860p = 0.0f;
        this.f323856l = 1.0f;
        this.f323861q = 1.0f;
        this.f323862r = 1.0f;
        this.f323854j = -1.0f;
        this.f323855k = -1.0f;
        this.f323851g.set(-1.0f, -1.0f);
        this.f323852h.set(-1.0f, -1.0f);
        Matrix.setIdentityM(this.f323846b, 0);
        this.f323847c = false;
        this.f323848d = false;
        if (BuildInfo.DEBUG) {
            Log.m105924i("CustomRender.ScaleControl", "livescale reset");
        }
    }

    /* renamed from: d */
    public final void mo158554d() {
        int i;
        int i2 = this.f323863s;
        if (i2 <= 0 || (i = this.f323864t) <= 0) {
            Matrix.setIdentityM(this.f323846b, 0);
            return;
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, (this.f323857m / ((float) i2)) * 2.0f, ((-this.f323858n) / ((float) i)) * 2.0f, 0.0f);
        float[] fArr2 = this.f323846b;
        float[] fArr3 = fArr;
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr2, 0);
        Matrix.setIdentityM(fArr, 0);
        float f = this.f323856l;
        Matrix.scaleM(fArr, 0, f, f, 0.0f);
        float[] fArr4 = this.f323846b;
        Matrix.multiplyMM(fArr4, 0, fArr3, 0, fArr4, 0);
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, (this.f323859o / ((float) this.f323863s)) * 2.0f, ((-this.f323860p) / ((float) this.f323864t)) * 2.0f, 0.0f);
        float[] fArr5 = this.f323846b;
        Matrix.multiplyMM(fArr5, 0, fArr, 0, fArr5, 0);
        mo158551a();
        this.f323856l = 1.0f;
        this.f323857m = 0.0f;
        this.f323858n = 0.0f;
        this.f323859o = 0.0f;
        this.f323860p = 0.0f;
    }
}
