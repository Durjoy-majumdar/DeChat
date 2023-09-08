package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;

/* renamed from: com.tencent.mapsdk.internal.fv */
public final class C113740fv {

    /* renamed from: a */
    public C113741fw f340302a;

    /* renamed from: b */
    public C113741fw[] f340303b;

    /* renamed from: c */
    public float f340304c;

    public C113740fv(C113741fw fwVar, C113741fw[] fwVarArr, float f) {
        this.f340302a = fwVar;
        this.f340303b = fwVarArr;
        this.f340304c = f;
    }

    /* renamed from: b */
    private C113741fw m156890b() {
        return this.f340302a;
    }

    /* renamed from: c */
    private C113741fw[] m156891c() {
        return this.f340303b;
    }

    /* renamed from: d */
    private float m156892d() {
        return this.f340304c;
    }

    /* renamed from: a */
    public final void mo172109a(C113741fw fwVar, C113741fw[] fwVarArr, float f) {
        this.f340302a = fwVar;
        this.f340303b = fwVarArr;
        this.f340304c = f;
    }

    /* renamed from: a */
    public final boolean mo172110a(C113740fv fvVar) {
        C113741fw[] fwVarArr;
        C113741fw fwVar;
        if (fvVar == null || Float.compare(fvVar.f340304c, this.f340304c) > 0) {
            return true;
        }
        C113741fw fwVar2 = this.f340302a;
        if (fwVar2 != null && (fwVar = fvVar.f340302a) != null && C113904kw.m157744a((Coordinate) fwVar2, (Coordinate) fwVar) > 50.0d) {
            return true;
        }
        C113741fw[] fwVarArr2 = this.f340303b;
        if (fwVarArr2 != null && (fwVarArr = fvVar.f340303b) != null && fwVarArr2.length == fwVarArr.length) {
            int i = 0;
            while (true) {
                C113741fw[] fwVarArr3 = this.f340303b;
                if (i >= fwVarArr3.length) {
                    break;
                } else if (C113904kw.m157744a((Coordinate) fwVarArr3[i], (Coordinate) fvVar.f340303b[i]) > 50.0d) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C113740fv clone() {
        return new C113740fv(this.f340302a, this.f340303b, this.f340304c);
    }
}
