package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class sc4 extends C47465a {

    /* renamed from: d */
    public String f299425d;

    /* renamed from: e */
    public int f299426e;

    /* renamed from: f */
    public String f299427f;

    /* renamed from: g */
    public String f299428g;

    /* renamed from: h */
    public String f299429h;

    /* renamed from: i */
    public String f299430i;

    /* renamed from: j */
    public String f299431j;

    /* renamed from: n */
    public String f299432n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof sc4)) {
            return false;
        }
        sc4 sc4 = (sc4) aVar;
        return C46238a.m51546a(this.f299425d, sc4.f299425d) && C46238a.m51546a(Integer.valueOf(this.f299426e), Integer.valueOf(sc4.f299426e)) && C46238a.m51546a(this.f299427f, sc4.f299427f) && C46238a.m51546a(this.f299428g, sc4.f299428g) && C46238a.m51546a(this.f299429h, sc4.f299429h) && C46238a.m51546a(this.f299430i, sc4.f299430i) && C46238a.m51546a(this.f299431j, sc4.f299431j) && C46238a.m51546a(this.f299432n, sc4.f299432n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299425d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f299426e);
            String str2 = this.f299427f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f299428g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f299429h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f299430i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f299431j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f299432n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f299425d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            int e = i2 + C52418a.m58678e(2, this.f299426e);
            String str9 = this.f299427f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f299428g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f299429h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f299430i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f299431j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f299432n;
            return str14 != null ? e + C52418a.m58683j(8, str14) : e;
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
            sc4 sc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sc4.f299425d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    sc4.f299426e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sc4.f299427f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sc4.f299428g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sc4.f299429h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sc4.f299430i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    sc4.f299431j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    sc4.f299432n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
