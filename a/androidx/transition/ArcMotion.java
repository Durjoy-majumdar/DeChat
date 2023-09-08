package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p1050v2.C111331h;
import p853i4.C108348j;

public class ArcMotion extends PathMotion {

    /* renamed from: d */
    public static final float f306630d = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    public float f306631a = 0.0f;

    /* renamed from: b */
    public float f306632b = 0.0f;

    /* renamed from: c */
    public float f306633c = f306630d;

    public ArcMotion() {
    }

    /* renamed from: b */
    public static float m138223b(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    /* renamed from: a */
    public Path mo145263a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f15 = f3 - f;
        float f16 = f4 - f2;
        float f17 = (f15 * f15) + (f16 * f16);
        float f18 = (f + f3) / 2.0f;
        float f19 = (f2 + f4) / 2.0f;
        float f25 = 0.25f * f17;
        boolean z = f2 > f4;
        if (Math.abs(f15) < Math.abs(f16)) {
            float abs = Math.abs(f17 / (f16 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f306632b;
        } else {
            float f26 = f17 / (f15 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f26 + f;
            } else {
                f8 = f3 - f26;
                f9 = f4;
            }
            f5 = this.f306631a;
        }
        float f27 = f25 * f5 * f5;
        float f28 = f18 - f6;
        float f29 = f19 - f7;
        float f35 = (f28 * f28) + (f29 * f29);
        float f36 = this.f306633c;
        float f37 = f25 * f36 * f36;
        if (f35 >= f27) {
            f27 = f35 > f37 ? f37 : 0.0f;
        }
        if (f27 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f27 / f35));
            f6 = ((f6 - f18) * sqrt) + f18;
            f7 = f19 + (sqrt * (f7 - f19));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324383i);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f306632b = m138223b(C111331h.m151816c(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.f306631a = m138223b(C111331h.m151816c(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        this.f306633c = m138223b(C111331h.m151816c(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}
