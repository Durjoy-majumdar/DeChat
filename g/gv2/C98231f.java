package gv2;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: gv2.f */
public class C98231f extends Animation {

    /* renamed from: d */
    public final float f288004d;

    /* renamed from: e */
    public final float f288005e;

    /* renamed from: f */
    public final float f288006f;

    /* renamed from: g */
    public final float f288007g;

    /* renamed from: h */
    public final float f288008h;

    /* renamed from: i */
    public final boolean f288009i;

    /* renamed from: j */
    public Camera f288010j;

    /* renamed from: n */
    public Context f288011n;

    /* renamed from: o */
    public float f288012o = 1.0f;

    public C98231f(Context context, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.f288011n = context;
        this.f288004d = f;
        this.f288005e = f2;
        this.f288006f = f3;
        this.f288007g = f4;
        this.f288008h = f5;
        this.f288009i = z;
        this.f288012o = context.getResources().getDisplayMetrics().density;
    }

    public void applyTransformation(float f, Transformation transformation) {
        SnsMethodCalculate.markStartTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.widget.Rotate3DAnimation");
        float f2 = this.f288004d;
        float f3 = f2 + ((this.f288005e - f2) * f);
        float f4 = this.f288006f;
        float f5 = this.f288007g;
        Camera camera = this.f288010j;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f288009i) {
            camera.translate(0.0f, 0.0f, this.f288008h * f);
        } else {
            camera.translate(0.0f, 0.0f, this.f288008h * (1.0f - f));
        }
        camera.rotateY(f3);
        camera.getMatrix(matrix);
        camera.restore();
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        matrix.getValues(fArr);
        fArr[6] = fArr[6] / this.f288012o;
        matrix.setValues(fArr);
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
        SnsMethodCalculate.markEndTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.widget.Rotate3DAnimation");
    }

    public void initialize(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("initialize", "com.tencent.mm.plugin.sns.ui.widget.Rotate3DAnimation");
        super.initialize(i, i2, i3, i4);
        this.f288010j = new Camera();
        SnsMethodCalculate.markEndTimeMs("initialize", "com.tencent.mm.plugin.sns.ui.widget.Rotate3DAnimation");
    }
}
