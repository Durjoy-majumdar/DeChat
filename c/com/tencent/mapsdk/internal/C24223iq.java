package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C24224ir;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.iq */
final class C24223iq extends C24228is {

    /* renamed from: g */
    private int f69342g;

    /* renamed from: h */
    private int f69343h;

    /* renamed from: i */
    private int f69344i;

    /* renamed from: j */
    private boolean f69345j = true;

    public C24223iq(C24224ir.C24226b... bVarArr) {
        super(bVarArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C24223iq clone() {
        ArrayList<C24224ir> arrayList = this.f69357e;
        int size = arrayList.size();
        C24224ir.C24226b[] bVarArr = new C24224ir.C24226b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = (C24224ir.C24226b) arrayList.get(i).clone();
        }
        return new C24223iq(bVarArr);
    }

    /* renamed from: a */
    public final Object mo40987a(float f) {
        return Integer.valueOf(mo40990b(f));
    }

    /* renamed from: b */
    public final int mo40990b(float f) {
        int i;
        int i2;
        int i3;
        int i4;
        float f2;
        int i5 = this.f69353a;
        if (i5 == 2) {
            if (this.f69345j) {
                this.f69345j = false;
                this.f69342g = ((C24224ir.C24226b) this.f69357e.get(0)).f69351e;
                int i6 = ((C24224ir.C24226b) this.f69357e.get(1)).f69351e;
                this.f69343h = i6;
                this.f69344i = i6 - this.f69342g;
            }
            Interpolator interpolator = this.f69356d;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            C24236ix ixVar = this.f69358f;
            if (ixVar != null) {
                return ((Number) ixVar.mo41013a(f, Integer.valueOf(this.f69342g), Integer.valueOf(this.f69343h))).intValue();
            }
            i = this.f69342g;
            i2 = this.f69344i;
        } else {
            if (f <= 0.0f) {
                C24224ir.C24226b bVar = (C24224ir.C24226b) this.f69357e.get(0);
                C24224ir.C24226b bVar2 = (C24224ir.C24226b) this.f69357e.get(1);
                i3 = bVar.f69351e;
                i4 = bVar2.f69351e;
                float f3 = bVar.f69346a;
                float f4 = bVar2.f69346a;
                Interpolator interpolator2 = bVar2.f69348c;
                if (interpolator2 != null) {
                    f = interpolator2.getInterpolation(f);
                }
                f2 = (f - f3) / (f4 - f3);
                C24236ix ixVar2 = this.f69358f;
                if (ixVar2 != null) {
                    return ((Number) ixVar2.mo41013a(f2, Integer.valueOf(i3), Integer.valueOf(i4))).intValue();
                }
            } else if (f >= 1.0f) {
                C24224ir.C24226b bVar3 = (C24224ir.C24226b) this.f69357e.get(i5 - 2);
                C24224ir.C24226b bVar4 = (C24224ir.C24226b) this.f69357e.get(this.f69353a - 1);
                i3 = bVar3.f69351e;
                i4 = bVar4.f69351e;
                float f5 = bVar3.f69346a;
                float f6 = bVar4.f69346a;
                Interpolator interpolator3 = bVar4.f69348c;
                if (interpolator3 != null) {
                    f = interpolator3.getInterpolation(f);
                }
                f2 = (f - f5) / (f6 - f5);
                C24236ix ixVar3 = this.f69358f;
                if (ixVar3 != null) {
                    return ((Number) ixVar3.mo41013a(f2, Integer.valueOf(i3), Integer.valueOf(i4))).intValue();
                }
            } else {
                C24224ir.C24226b bVar5 = (C24224ir.C24226b) this.f69357e.get(0);
                int i7 = 1;
                while (true) {
                    int i8 = this.f69353a;
                    if (i7 >= i8) {
                        return ((Number) this.f69357e.get(i8 - 1).mo40993d()).intValue();
                    }
                    C24224ir.C24226b bVar6 = (C24224ir.C24226b) this.f69357e.get(i7);
                    if (f < bVar6.f69346a) {
                        Interpolator interpolator4 = bVar6.f69348c;
                        if (interpolator4 != null) {
                            f = interpolator4.getInterpolation(f);
                        }
                        float f7 = bVar5.f69346a;
                        f = (f - f7) / (bVar6.f69346a - f7);
                        i = bVar5.f69351e;
                        int i9 = bVar6.f69351e;
                        C24236ix ixVar4 = this.f69358f;
                        if (ixVar4 != null) {
                            return ((Number) ixVar4.mo41013a(f, Integer.valueOf(i), Integer.valueOf(i9))).intValue();
                        }
                        i2 = i9 - i;
                    } else {
                        i7++;
                        bVar5 = bVar6;
                    }
                }
            }
            return i3 + ((int) (f2 * ((float) (i4 - i3))));
        }
        return i + ((int) (f * ((float) i2)));
    }
}
