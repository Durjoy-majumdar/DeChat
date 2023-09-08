package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p1050v2.C111331h;
import p1057w2.C111712c;
import p853i4.C108348j;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    public final Path f306692a;

    /* renamed from: b */
    public final Matrix f306693b;

    public PatternPathMotion() {
        Path path = new Path();
        this.f306692a = path;
        this.f306693b = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }

    /* renamed from: a */
    public Path mo145263a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f306693b.setScale(sqrt, sqrt);
        this.f306693b.postRotate((float) Math.toDegrees(atan2));
        this.f306693b.postTranslate(f, f2);
        Path path = new Path();
        this.f306692a.transform(this.f306693b, path);
        return path;
    }

    /* renamed from: b */
    public void mo145305b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f306693b.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float sqrt = 1.0f / ((float) Math.sqrt((double) ((f5 * f5) + (f6 * f6))));
        this.f306693b.postScale(sqrt, sqrt);
        this.f306693b.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f306693b, this.f306692a);
    }

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f306692a = new Path();
        this.f306693b = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324384j);
        try {
            String f = C111331h.m151819f(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (f != null) {
                mo145305b(C111712c.m152281d(f));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
