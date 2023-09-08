package p604m1;

import gy3.C8480h;
import java.util.ArrayList;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p560i2.C108331t;

/* renamed from: m1.f */
public final class C109464f {

    /* renamed from: a */
    public final C109461b[] f327634a;

    /* renamed from: b */
    public int f327635b;

    public C109464f() {
        C109461b[] bVarArr = new C109461b[20];
        for (int i = 0; i < 20; i++) {
            bVarArr[i] = null;
        }
        this.f327634a = bVarArr;
    }

    /* renamed from: a */
    public final long mo160701a() {
        C109463e eVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.f327635b;
        C109461b bVar = this.f327634a[i];
        if (bVar == null) {
            eVar = C109463e.f327629e;
        } else {
            int i2 = 0;
            C109461b bVar2 = bVar;
            while (true) {
                C109461b bVar3 = this.f327634a[i];
                if (bVar3 != null) {
                    long j = bVar.f327626b;
                    long j2 = bVar3.f327626b;
                    float f = (float) (j - j2);
                    float abs = (float) Math.abs(j2 - bVar2.f327626b);
                    if (f > 100.0f || abs > 40.0f) {
                        break;
                    }
                    long j3 = bVar3.f327625a;
                    arrayList.add(Float.valueOf(C112539e.m153738c(j3)));
                    arrayList2.add(Float.valueOf(C112539e.m153739d(j3)));
                    arrayList3.add(Float.valueOf(-f));
                    if (i == 0) {
                        i = 20;
                    }
                    i--;
                    i2++;
                    if (i2 >= 20) {
                        bVar2 = bVar3;
                        break;
                    }
                    bVar2 = bVar3;
                } else {
                    break;
                }
            }
            if (i2 >= 3) {
                try {
                    C34458c b = C109465g.m148684b(arrayList3, arrayList, 2);
                    C34458c b2 = C109465g.m148684b(arrayList3, arrayList2, 2);
                    float f2 = (float) 1000;
                    eVar = new C109463e(C112540f.m153745a(b.f92759a.get(1).floatValue() * f2, b2.f92759a.get(1).floatValue() * f2), b.f92760b * b2.f92760b, bVar.f327626b - bVar2.f327626b, C112539e.m153741f(bVar.f327625a, bVar2.f327625a), (C8480h) null);
                } catch (IllegalArgumentException unused) {
                    eVar = C109463e.f327629e;
                }
            } else {
                eVar = new C109463e(C112539e.f336955b, 1.0f, bVar.f327626b - bVar2.f327626b, C112539e.m153741f(bVar.f327625a, bVar2.f327625a), (C8480h) null);
            }
        }
        long j4 = eVar.f327630a;
        return C108331t.m146750a(C112539e.m153738c(j4), C112539e.m153739d(j4));
    }
}
