package vp1;

import gy3.C8480h;
import gy3.C87412m;
import te3.C51985xk0;

/* renamed from: vp1.r */
public final class C14943r {

    /* renamed from: a */
    public final C14924a[] f40982a;

    public C14943r(C14924a[] aVarArr) {
        C87412m.m108594g(aVarArr, "array");
        this.f40982a = aVarArr;
    }

    /* renamed from: a */
    public final C14924a mo13997a(int i) {
        C14924a aVar;
        C14924a[] aVarArr = this.f40982a;
        int length = aVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i2];
            if (aVar.f40953a == i) {
                break;
            }
            i2++;
        }
        return aVar == null ? new C14924a(10000, "default_v3", new C51985xk0(), false, 8, (C8480h) null) : aVar;
    }
}
