package com.google.android.material.bottomappbar;

import p1157t8.C110937b;
import p1157t8.C110939d;

/* renamed from: com.google.android.material.bottomappbar.f */
public class C104416f extends C110937b {

    /* renamed from: a */
    public float f309160a;

    /* renamed from: b */
    public float f309161b;

    /* renamed from: c */
    public float f309162c;

    /* renamed from: d */
    public float f309163d;

    /* renamed from: e */
    public float f309164e;

    public C104416f(float f, float f2, float f3) {
        this.f309161b = f;
        this.f309160a = f2;
        this.f309163d = f3;
        if (f3 >= 0.0f) {
            this.f309164e = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: a */
    public void mo146302a(float f, float f2, C110939d dVar) {
        float f3 = f;
        C110939d dVar2 = dVar;
        float f4 = this.f309162c;
        if (f4 == 0.0f) {
            dVar2.mo162626b(f3, 0.0f);
            return;
        }
        float f5 = ((this.f309161b * 2.0f) + f4) / 2.0f;
        float f6 = f2 * this.f309160a;
        float f7 = (f3 / 2.0f) + this.f309164e;
        float f8 = (this.f309163d * f2) + ((1.0f - f2) * f5);
        if (f8 / f5 >= 1.0f) {
            dVar2.mo162626b(f3, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f15 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f15 * f15)));
        float f16 = f7 - sqrt;
        float f17 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f15)));
        float f18 = 90.0f - degrees;
        float f19 = f16 - f6;
        dVar2.mo162626b(f19, 0.0f);
        float f25 = f6 * 2.0f;
        float f26 = degrees;
        dVar.mo162625a(f19, 0.0f, f16 + f6, f25, 270.0f, degrees);
        dVar.mo162625a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f18, (f18 * 2.0f) - 180.0f);
        dVar.mo162625a(f17 - f6, 0.0f, f17 + f6, f25, 270.0f - f26, f26);
        dVar2.mo162626b(f3, 0.0f);
    }
}
