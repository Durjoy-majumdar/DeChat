package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C24224ir;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.io */
final class C24222io extends C24228is {

    /* renamed from: g */
    private double f69338g;

    /* renamed from: h */
    private double f69339h;

    /* renamed from: i */
    private double f69340i;

    /* renamed from: j */
    private boolean f69341j = true;

    public C24222io(C24224ir.C24225a... aVarArr) {
        super(aVarArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C24222io clone() {
        ArrayList<C24224ir> arrayList = this.f69357e;
        int size = arrayList.size();
        C24224ir.C24225a[] aVarArr = new C24224ir.C24225a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = (C24224ir.C24225a) arrayList.get(i).clone();
        }
        return new C24222io(aVarArr);
    }

    /* renamed from: a */
    public final Object mo40987a(float f) {
        return Double.valueOf(mo40988b(f));
    }

    /* renamed from: b */
    public final double mo40988b(float f) {
        double d;
        double d2;
        float f2;
        int i = this.f69353a;
        if (i == 2) {
            if (this.f69341j) {
                this.f69341j = false;
                this.f69338g = ((C24224ir.C24225a) this.f69357e.get(0)).f69350e;
                double d3 = ((C24224ir.C24225a) this.f69357e.get(1)).f69350e;
                this.f69339h = d3;
                this.f69340i = d3 - this.f69338g;
            }
            Interpolator interpolator = this.f69356d;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            C24236ix ixVar = this.f69358f;
            if (ixVar == null) {
                return this.f69338g + (((double) f) * this.f69340i);
            }
            return ((Number) ixVar.mo41013a(f, Double.valueOf(this.f69338g), Double.valueOf(this.f69339h))).doubleValue();
        }
        if (f <= 0.0f) {
            C24224ir.C24225a aVar = (C24224ir.C24225a) this.f69357e.get(0);
            C24224ir.C24225a aVar2 = (C24224ir.C24225a) this.f69357e.get(1);
            d = aVar.f69350e;
            d2 = aVar2.f69350e;
            float f3 = aVar.f69346a;
            float f4 = aVar2.f69346a;
            Interpolator interpolator2 = aVar2.f69348c;
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            f2 = (f - f3) / (f4 - f3);
            C24236ix ixVar2 = this.f69358f;
            if (ixVar2 != null) {
                return (double) ((Number) ixVar2.mo41013a(f2, Double.valueOf(d), Double.valueOf(d2))).floatValue();
            }
        } else if (f >= 1.0f) {
            C24224ir.C24225a aVar3 = (C24224ir.C24225a) this.f69357e.get(i - 2);
            C24224ir.C24225a aVar4 = (C24224ir.C24225a) this.f69357e.get(this.f69353a - 1);
            d = aVar3.f69350e;
            d2 = aVar4.f69350e;
            float f5 = aVar3.f69346a;
            float f6 = aVar4.f69346a;
            Interpolator interpolator3 = aVar4.f69348c;
            if (interpolator3 != null) {
                f = interpolator3.getInterpolation(f);
            }
            f2 = (f - f5) / (f6 - f5);
            C24236ix ixVar3 = this.f69358f;
            if (ixVar3 != null) {
                return (double) ((Number) ixVar3.mo41013a(f2, Double.valueOf(d), Double.valueOf(d2))).floatValue();
            }
        } else {
            C24224ir.C24225a aVar5 = (C24224ir.C24225a) this.f69357e.get(0);
            int i2 = 1;
            while (true) {
                int i3 = this.f69353a;
                if (i2 >= i3) {
                    return (double) ((Number) this.f69357e.get(i3 - 1).mo40993d()).floatValue();
                }
                C24224ir.C24225a aVar6 = (C24224ir.C24225a) this.f69357e.get(i2);
                if (f < aVar6.f69346a) {
                    Interpolator interpolator4 = aVar6.f69348c;
                    if (interpolator4 != null) {
                        f = interpolator4.getInterpolation(f);
                    }
                    float f7 = aVar5.f69346a;
                    float f8 = (f - f7) / (aVar6.f69346a - f7);
                    double d4 = aVar5.f69350e;
                    double d5 = aVar6.f69350e;
                    C24236ix ixVar4 = this.f69358f;
                    if (ixVar4 == null) {
                        return d4 + (((double) f8) * (d5 - d4));
                    }
                    return (double) ((Number) ixVar4.mo41013a(f8, Double.valueOf(d4), Double.valueOf(d5))).floatValue();
                }
                i2++;
                aVar5 = aVar6;
            }
        }
        return d + (((double) f2) * (d2 - d));
    }
}
