package re3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.l */
public class C48022l extends C47465a {

    /* renamed from: d */
    public int f128807d;

    /* renamed from: e */
    public int f128808e;

    /* renamed from: f */
    public int f128809f;

    /* renamed from: g */
    public int f128810g;

    /* renamed from: h */
    public int f128811h;

    /* renamed from: i */
    public int f128812i;

    /* renamed from: j */
    public int f128813j;

    /* renamed from: n */
    public int f128814n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48022l)) {
            return false;
        }
        C48022l lVar = (C48022l) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f128807d), Integer.valueOf(lVar.f128807d)) && C46238a.m51546a(Integer.valueOf(this.f128808e), Integer.valueOf(lVar.f128808e)) && C46238a.m51546a(Integer.valueOf(this.f128809f), Integer.valueOf(lVar.f128809f)) && C46238a.m51546a(Integer.valueOf(this.f128810g), Integer.valueOf(lVar.f128810g)) && C46238a.m51546a(Integer.valueOf(this.f128811h), Integer.valueOf(lVar.f128811h)) && C46238a.m51546a(Integer.valueOf(this.f128812i), Integer.valueOf(lVar.f128812i)) && C46238a.m51546a(Integer.valueOf(this.f128813j), Integer.valueOf(lVar.f128813j)) && C46238a.m51546a(Integer.valueOf(this.f128814n), Integer.valueOf(lVar.f128814n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f128807d);
            aVar.mo74318e(2, this.f128808e);
            aVar.mo74318e(3, this.f128809f);
            aVar.mo74318e(4, this.f128810g);
            aVar.mo74318e(5, this.f128811h);
            aVar.mo74318e(6, this.f128812i);
            aVar.mo74318e(7, this.f128813j);
            aVar.mo74318e(8, this.f128814n);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f128807d) + 0 + C52418a.m58678e(2, this.f128808e) + C52418a.m58678e(3, this.f128809f) + C52418a.m58678e(4, this.f128810g) + C52418a.m58678e(5, this.f128811h) + C52418a.m58678e(6, this.f128812i) + C52418a.m58678e(7, this.f128813j) + C52418a.m58678e(8, this.f128814n);
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
                C48022l lVar = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        lVar.f128807d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        lVar.f128808e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        lVar.f128809f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        lVar.f128810g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        lVar.f128811h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        lVar.f128812i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        lVar.f128813j = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        lVar.f128814n = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
