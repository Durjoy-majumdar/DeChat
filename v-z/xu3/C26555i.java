package xu3;

import java.lang.Comparable;
import java.util.Arrays;
import pu3.C25478i;
import pu3.C25494p;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26718e;
import zu3.C26722g;

/* renamed from: xu3.i */
public abstract class C26555i<T extends Comparable<T>> {

    /* renamed from: a */
    public final C26639a f73895a;

    /* renamed from: b */
    public final C25478i f73896b;

    /* renamed from: c */
    public final C26722g f73897c;

    public C26555i(C26639a aVar, C25478i iVar, C26722g gVar) {
        this.f73895a = aVar;
        this.f73896b = iVar;
        this.f73897c = gVar;
    }

    /* renamed from: a */
    public T mo53495a(C26718e eVar, T t) {
        return t;
    }

    /* renamed from: b */
    public void mo53501b() {
        C25478i.C25484f fVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C25903a aVar = this.f73895a.f74127a;
        aVar.getClass();
        int[] f = mo53502f(C25494p.m32917b(aVar));
        C25903a aVar2 = this.f73895a.f74127a;
        aVar2.getClass();
        int[] f2 = mo53502f(C25494p.m32917b(aVar2));
        C25903a aVar3 = this.f73895a.f74127a;
        aVar3.getClass();
        int[] f3 = mo53502f(C25494p.m32917b(aVar3));
        C25499u.C25500a c = mo53496c(this.f73896b);
        char c2 = 0;
        if (c.mo52764a()) {
            C25478i.C25484f d = this.f73896b.mo52716d(c);
            i = c.f72182f;
            fVar = d;
        } else {
            fVar = null;
            i = 0;
        }
        int length = f.length;
        int length2 = f2.length;
        int length3 = f3.length;
        int i6 = (i + length2) - length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= i && i15 >= i6) {
                break;
            }
            if (i9 < length2 && f2[i9] == i15) {
                mo53500h(mo53498e(this.f73895a.f74127a));
                i9++;
            } else if (i8 >= length3 || f3[i8] != i15) {
                if (Arrays.binarySearch(f, i16) >= 0) {
                    Comparable e = mo53498e(fVar);
                    i4 = i8;
                    i3 = i9;
                    mo53497d(this.f73897c, i16, e instanceof C25499u.C25500a.C25501a ? ((C25499u.C25500a.C25501a) e).f72185d : i16);
                    i16++;
                    i7++;
                } else {
                    i4 = i8;
                    i3 = i9;
                    if (Arrays.binarySearch(f3, i16) >= 0) {
                        Comparable e2 = mo53498e(fVar);
                        mo53497d(this.f73897c, i16, e2 instanceof C25499u.C25500a.C25501a ? ((C25499u.C25500a.C25501a) e2).f72185d : i16);
                        i16++;
                    } else if (i16 < i) {
                        Comparable a = mo53495a(this.f73897c, mo53498e(fVar));
                        int i17 = i7;
                        int i18 = i15;
                        i2 = i6;
                        mo53499g(this.f73897c, i16, a instanceof C25499u.C25500a.C25501a ? ((C25499u.C25500a.C25501a) a).f72185d : i16, i18, mo53500h(a));
                        i16++;
                        i15 = i18 + 1;
                        i7 = i17;
                        i8 = i4;
                        i9 = i3;
                        i6 = i2;
                        c2 = 0;
                    } else {
                        int i19 = i7;
                        i5 = i15;
                        int i25 = i16;
                        i2 = i6;
                        i15 = i5;
                        i8 = i4;
                        i9 = i3;
                        i6 = i2;
                        c2 = 0;
                    }
                }
                i5 = i15;
                i2 = i6;
                i15 = i5;
                i8 = i4;
                i9 = i3;
                i6 = i2;
                c2 = 0;
            } else {
                mo53500h(mo53498e(this.f73895a.f74127a));
                i8++;
            }
            i15++;
            i2 = i6;
            i6 = i2;
            c2 = 0;
        }
        if (i9 != length2 || i7 != length || i8 != length3) {
            Object[] objArr = new Object[6];
            objArr[c2] = Integer.valueOf(i9);
            objArr[1] = Integer.valueOf(length2);
            objArr[2] = Integer.valueOf(i7);
            objArr[3] = Integer.valueOf(length);
            objArr[4] = Integer.valueOf(i8);
            objArr[5] = Integer.valueOf(length3);
            throw new IllegalStateException(String.format("bad patch operation sequence. addCounter: %d, addCount: %d, delCounter: %d, delCount: %d, replaceCounter: %d, replaceCount:%d", objArr));
        }
    }

    /* renamed from: c */
    public abstract C25499u.C25500a mo53496c(C25478i iVar);

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
    }

    /* renamed from: e */
    public abstract T mo53498e(C25903a aVar);

    /* renamed from: f */
    public final int[] mo53502f(int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C25903a aVar = this.f73895a.f74127a;
            aVar.getClass();
            i2 += C25494p.m32916a(aVar);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
    }

    /* renamed from: h */
    public abstract int mo53500h(T t);
}
