package com.tencent.p014mm.plugin.music.p080ui.transition;

import android.content.Context;
import android.graphics.Path;
import android.transition.ArcMotion;
import android.util.AttributeSet;

/* renamed from: com.tencent.mm.plugin.music.ui.transition.GravityArcMotion */
public class GravityArcMotion extends ArcMotion {

    /* renamed from: g */
    public static final float f272313g = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    public float f272314a = 0.0f;

    /* renamed from: b */
    public float f272315b = 0.0f;

    /* renamed from: c */
    public float f272316c = 70.0f;

    /* renamed from: d */
    public float f272317d = 0.0f;

    /* renamed from: e */
    public float f272318e = 0.0f;

    /* renamed from: f */
    public float f272319f = f272313g;

    public GravityArcMotion() {
    }

    /* renamed from: a */
    public static float m119198a(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public float getMaximumAngle() {
        return this.f272316c;
    }

    public float getMinimumHorizontalAngle() {
        return this.f272314a;
    }

    public float getMinimumVerticalAngle() {
        return this.f272315b;
    }

    public Path getPath(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = f;
        float f9 = f2;
        Path path = new Path();
        path.moveTo(f, f9);
        if (f9 == f4) {
            f6 = (f8 + f3) / 2.0f;
            f5 = ((this.f272317d * Math.abs(f3 - f8)) / 2.0f) + f9;
        } else if (f8 == f3) {
            f6 = ((this.f272318e * Math.abs(f4 - f9)) / 2.0f) + f8;
            f5 = (f9 + f4) / 2.0f;
        } else {
            float f15 = f3 - f8;
            float f16 = f4 < f9 ? f9 - f4 : f4 - f9;
            float f17 = (f15 * f15) + (f16 * f16);
            float f18 = (f8 + f3) / 2.0f;
            float f19 = (f9 + f4) / 2.0f;
            float f25 = 0.25f * f17;
            if (Math.abs(f15) < Math.abs(f16)) {
                float f26 = f4 + (f17 / (f16 * 2.0f));
                float f27 = this.f272318e;
                f7 = f25 * f27 * f27;
                f5 = f26;
                f6 = f3;
            } else {
                f6 = f3 + (f17 / (f15 * 2.0f));
                float f28 = this.f272317d;
                f7 = f25 * f28 * f28;
                f5 = f4;
            }
            float f29 = f18 - f6;
            float f35 = f19 - f5;
            float f36 = (f29 * f29) + (f35 * f35);
            float f37 = this.f272319f;
            float f38 = f25 * f37 * f37;
            if (f36 >= f7) {
                f7 = f36 > f38 ? f38 : 0.0f;
            }
            if (f7 != 0.0f) {
                float sqrt = (float) Math.sqrt((double) (f7 / f36));
                f6 = ((f6 - f18) * sqrt) + f18;
                f5 = f19 + (sqrt * (f5 - f19));
            }
        }
        path.cubicTo((f8 + f6) / 2.0f, (f9 + f5) / 2.0f, (f6 + f3) / 2.0f, (f5 + f4) / 2.0f, f3, f4);
        return path;
    }

    public void setMaximumAngle(float f) {
        this.f272316c = f;
        this.f272319f = m119198a(f);
    }

    public void setMinimumHorizontalAngle(float f) {
        this.f272314a = f;
        this.f272317d = m119198a(f);
    }

    public void setMinimumVerticalAngle(float f) {
        this.f272315b = f;
        this.f272318e = m119198a(f);
    }

    public GravityArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
