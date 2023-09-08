package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C24224ir;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.tencent.mapsdk.internal.is */
public class C24228is {

    /* renamed from: a */
    public int f69353a;

    /* renamed from: b */
    public C24224ir f69354b = this.f69357e.get(0);

    /* renamed from: c */
    public C24224ir f69355c;

    /* renamed from: d */
    public Interpolator f69356d;

    /* renamed from: e */
    public ArrayList<C24224ir> f69357e;

    /* renamed from: f */
    public C24236ix f69358f;

    public C24228is(C24224ir... irVarArr) {
        this.f69353a = irVarArr.length;
        ArrayList<C24224ir> arrayList = new ArrayList<>();
        this.f69357e = arrayList;
        arrayList.addAll(Arrays.asList(irVarArr));
        C24224ir irVar = this.f69357e.get(this.f69353a - 1);
        this.f69355c = irVar;
        this.f69356d = irVar.f69348c;
    }

    /* renamed from: a */
    private static C24228is m30226a(int... iArr) {
        int length = iArr.length;
        C24224ir.C24226b[] bVarArr = new C24224ir.C24226b[Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = (C24224ir.C24226b) C24224ir.m30196a();
            bVarArr[1] = (C24224ir.C24226b) C24224ir.m30198a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (C24224ir.C24226b) C24224ir.m30198a(0.0f, iArr[0]);
            for (int i = 1; i < length; i++) {
                bVarArr[i] = (C24224ir.C24226b) C24224ir.m30198a(((float) i) / ((float) (length - 1)), iArr[i]);
            }
        }
        return new C24223iq(bVarArr);
    }

    public String toString() {
        String str = " ";
        for (int i = 0; i < this.f69353a; i++) {
            str = str + this.f69357e.get(i).mo40993d() + "  ";
        }
        return str;
    }

    /* renamed from: a */
    private static C24228is m30225a(double... dArr) {
        int length = dArr.length;
        C24224ir.C24225a[] aVarArr = new C24224ir.C24225a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (C24224ir.C24225a) C24224ir.m30202b();
            aVarArr[1] = (C24224ir.C24225a) C24224ir.m30197a(1.0f, dArr[0]);
        } else {
            aVarArr[0] = (C24224ir.C24225a) C24224ir.m30197a(0.0f, dArr[0]);
            for (int i = 1; i < length; i++) {
                aVarArr[i] = (C24224ir.C24225a) C24224ir.m30197a(((float) i) / ((float) (length - 1)), dArr[i]);
            }
        }
        return new C24222io(aVarArr);
    }

    /* renamed from: a */
    private static C24228is m30227a(C24224ir... irVarArr) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (C24224ir irVar : irVarArr) {
            if (irVar instanceof C24224ir.C24225a) {
                z = true;
            } else if (irVar instanceof C24224ir.C24226b) {
                z2 = true;
            } else {
                z3 = true;
            }
        }
        if (z && !z2 && !z3) {
            C24224ir.C24225a[] aVarArr = new C24224ir.C24225a[r0];
            while (i < r0) {
                aVarArr[i] = irVarArr[i];
                i++;
            }
            return new C24222io(aVarArr);
        } else if (!z2 || z || z3) {
            return new C24228is(irVarArr);
        } else {
            C24224ir.C24226b[] bVarArr = new C24224ir.C24226b[r0];
            while (i < r0) {
                bVarArr[i] = irVarArr[i];
                i++;
            }
            return new C24223iq(bVarArr);
        }
    }

    /* renamed from: a */
    public static C24228is m30228a(Object... objArr) {
        int length = objArr.length;
        C24224ir.C24227c[] cVarArr = new C24224ir.C24227c[Math.max(length, 2)];
        if (length == 1) {
            cVarArr[0] = (C24224ir.C24227c) C24224ir.m30203c();
            cVarArr[1] = (C24224ir.C24227c) C24224ir.m30199a(1.0f, objArr[0]);
        } else {
            cVarArr[0] = (C24224ir.C24227c) C24224ir.m30199a(0.0f, objArr[0]);
            for (int i = 1; i < length; i++) {
                cVarArr[i] = (C24224ir.C24227c) C24224ir.m30199a(((float) i) / ((float) (length - 1)), objArr[i]);
            }
        }
        return new C24228is(cVarArr);
    }

    /* renamed from: a */
    private void m30229a(C24236ix ixVar) {
        this.f69358f = ixVar;
    }

    /* renamed from: a */
    public C24228is clone() {
        ArrayList<C24224ir> arrayList = this.f69357e;
        int size = arrayList.size();
        C24224ir[] irVarArr = new C24224ir[size];
        for (int i = 0; i < size; i++) {
            irVarArr[i] = arrayList.get(i).clone();
        }
        return new C24228is(irVarArr);
    }

    /* renamed from: a */
    public Object mo40987a(float f) {
        int i = this.f69353a;
        if (i == 2) {
            Interpolator interpolator = this.f69356d;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            return this.f69358f.mo41013a(f, this.f69354b.mo40993d(), this.f69355c.mo40993d());
        }
        int i2 = 1;
        if (f <= 0.0f) {
            C24224ir irVar = this.f69357e.get(1);
            Interpolator interpolator2 = irVar.f69348c;
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            C24224ir irVar2 = this.f69354b;
            float f2 = irVar2.f69346a;
            return this.f69358f.mo41013a((f - f2) / (irVar.f69346a - f2), irVar2.mo40993d(), irVar.mo40993d());
        } else if (f >= 1.0f) {
            C24224ir irVar3 = this.f69357e.get(i - 2);
            Interpolator interpolator3 = this.f69355c.f69348c;
            if (interpolator3 != null) {
                f = interpolator3.getInterpolation(f);
            }
            float f3 = irVar3.f69346a;
            return this.f69358f.mo41013a((f - f3) / (this.f69355c.f69346a - f3), irVar3.mo40993d(), this.f69355c.mo40993d());
        } else {
            C24224ir irVar4 = this.f69354b;
            while (i2 < this.f69353a) {
                C24224ir irVar5 = this.f69357e.get(i2);
                if (f < irVar5.f69346a) {
                    Interpolator interpolator4 = irVar5.f69348c;
                    if (interpolator4 != null) {
                        f = interpolator4.getInterpolation(f);
                    }
                    float f4 = irVar4.f69346a;
                    return this.f69358f.mo41013a((f - f4) / (irVar5.f69346a - f4), irVar4.mo40993d(), irVar5.mo40993d());
                }
                i2++;
                irVar4 = irVar5;
            }
            return this.f69355c.mo40993d();
        }
    }
}
