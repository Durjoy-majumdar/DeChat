package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ny */
public class C50608ny extends C47465a {

    /* renamed from: d */
    public String f138824d;

    /* renamed from: e */
    public String f138825e;

    /* renamed from: f */
    public int f138826f;

    /* renamed from: g */
    public int f138827g;

    /* renamed from: h */
    public int f138828h;

    /* renamed from: i */
    public String f138829i;

    /* renamed from: j */
    public int f138830j;

    /* renamed from: n */
    public int f138831n;

    /* renamed from: o */
    public int f138832o;

    /* renamed from: p */
    public int f138833p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50608ny)) {
            return false;
        }
        C50608ny nyVar = (C50608ny) aVar;
        return C46238a.m51546a(this.f138824d, nyVar.f138824d) && C46238a.m51546a(this.f138825e, nyVar.f138825e) && C46238a.m51546a(Integer.valueOf(this.f138826f), Integer.valueOf(nyVar.f138826f)) && C46238a.m51546a(Integer.valueOf(this.f138827g), Integer.valueOf(nyVar.f138827g)) && C46238a.m51546a(Integer.valueOf(this.f138828h), Integer.valueOf(nyVar.f138828h)) && C46238a.m51546a(this.f138829i, nyVar.f138829i) && C46238a.m51546a(Integer.valueOf(this.f138830j), Integer.valueOf(nyVar.f138830j)) && C46238a.m51546a(Integer.valueOf(this.f138831n), Integer.valueOf(nyVar.f138831n)) && C46238a.m51546a(Integer.valueOf(this.f138832o), Integer.valueOf(nyVar.f138832o)) && C46238a.m51546a(Integer.valueOf(this.f138833p), Integer.valueOf(nyVar.f138833p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138824d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138825e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f138826f);
            aVar.mo74318e(5, this.f138827g);
            aVar.mo74318e(6, this.f138828h);
            String str3 = this.f138829i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f138830j);
            aVar.mo74318e(9, this.f138831n);
            aVar.mo74318e(10, this.f138832o);
            aVar.mo74318e(11, this.f138833p);
            return 0;
        } else if (i == 1) {
            String str4 = this.f138824d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f138825e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f138826f) + C52418a.m58678e(5, this.f138827g) + C52418a.m58678e(6, this.f138828h);
            String str6 = this.f138829i;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            return e + C52418a.m58678e(8, this.f138830j) + C52418a.m58678e(9, this.f138831n) + C52418a.m58678e(10, this.f138832o) + C52418a.m58678e(11, this.f138833p);
        } else if (i == 2) {
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
            C50608ny nyVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nyVar.f138824d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nyVar.f138825e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nyVar.f138826f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    nyVar.f138827g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    nyVar.f138828h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    nyVar.f138829i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    nyVar.f138830j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    nyVar.f138831n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    nyVar.f138832o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    nyVar.f138833p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
