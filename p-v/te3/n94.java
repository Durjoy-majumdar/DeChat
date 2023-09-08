package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class n94 extends C47465a {

    /* renamed from: d */
    public String f298902d;

    /* renamed from: e */
    public String f298903e;

    /* renamed from: f */
    public int f298904f;

    /* renamed from: g */
    public String f298905g;

    /* renamed from: h */
    public String f298906h;

    /* renamed from: i */
    public String f298907i;

    /* renamed from: j */
    public String f298908j;

    /* renamed from: n */
    public String f298909n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n94)) {
            return false;
        }
        n94 n94 = (n94) aVar;
        return C46238a.m51546a(this.f298902d, n94.f298902d) && C46238a.m51546a(this.f298903e, n94.f298903e) && C46238a.m51546a(Integer.valueOf(this.f298904f), Integer.valueOf(n94.f298904f)) && C46238a.m51546a(this.f298905g, n94.f298905g) && C46238a.m51546a(this.f298906h, n94.f298906h) && C46238a.m51546a(this.f298907i, n94.f298907i) && C46238a.m51546a(this.f298908j, n94.f298908j) && C46238a.m51546a(this.f298909n, n94.f298909n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298902d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298903e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f298904f);
            String str3 = this.f298905g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f298906h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f298907i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f298908j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f298909n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f298902d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f298903e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int e = i2 + C52418a.m58678e(3, this.f298904f);
            String str10 = this.f298905g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f298906h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f298907i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f298908j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f298909n;
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
            n94 n94 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    n94.f298902d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    n94.f298903e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    n94.f298904f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    n94.f298905g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    n94.f298906h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    n94.f298907i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    n94.f298908j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    n94.f298909n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
