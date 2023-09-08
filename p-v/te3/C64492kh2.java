package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kh2 */
public class C64492kh2 extends C47465a {

    /* renamed from: d */
    public int f183934d;

    /* renamed from: e */
    public int f183935e;

    /* renamed from: f */
    public int f183936f;

    /* renamed from: g */
    public int f183937g;

    /* renamed from: h */
    public int f183938h;

    /* renamed from: i */
    public int f183939i;

    /* renamed from: j */
    public int f183940j;

    /* renamed from: n */
    public int f183941n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64492kh2)) {
            return false;
        }
        C64492kh2 kh22 = (C64492kh2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183934d), Integer.valueOf(kh22.f183934d)) && C46238a.m51546a(Integer.valueOf(this.f183935e), Integer.valueOf(kh22.f183935e)) && C46238a.m51546a(Integer.valueOf(this.f183936f), Integer.valueOf(kh22.f183936f)) && C46238a.m51546a(Integer.valueOf(this.f183937g), Integer.valueOf(kh22.f183937g)) && C46238a.m51546a(Integer.valueOf(this.f183938h), Integer.valueOf(kh22.f183938h)) && C46238a.m51546a(Integer.valueOf(this.f183939i), Integer.valueOf(kh22.f183939i)) && C46238a.m51546a(Integer.valueOf(this.f183940j), Integer.valueOf(kh22.f183940j)) && C46238a.m51546a(Integer.valueOf(this.f183941n), Integer.valueOf(kh22.f183941n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183934d);
            aVar.mo74318e(2, this.f183935e);
            aVar.mo74318e(3, this.f183936f);
            aVar.mo74318e(4, this.f183937g);
            aVar.mo74318e(5, this.f183938h);
            aVar.mo74318e(6, this.f183939i);
            aVar.mo74318e(7, this.f183940j);
            aVar.mo74318e(8, this.f183941n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f183934d) + 0 + C52418a.m58678e(2, this.f183935e) + C52418a.m58678e(3, this.f183936f) + C52418a.m58678e(4, this.f183937g) + C52418a.m58678e(5, this.f183938h) + C52418a.m58678e(6, this.f183939i) + C52418a.m58678e(7, this.f183940j) + C52418a.m58678e(8, this.f183941n);
        } else {
            if (i == 2) {
                C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                    if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                        aVar2.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar3 = objArr[0];
                C64492kh2 kh22 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        kh22.f183934d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        kh22.f183935e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        kh22.f183936f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        kh22.f183937g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        kh22.f183938h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        kh22.f183939i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        kh22.f183940j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        kh22.f183941n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
