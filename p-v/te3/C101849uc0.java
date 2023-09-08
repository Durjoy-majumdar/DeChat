package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uc0 */
public class C101849uc0 extends C47465a {

    /* renamed from: d */
    public String f299610d;

    /* renamed from: e */
    public int f299611e;

    /* renamed from: f */
    public String f299612f;

    /* renamed from: g */
    public String f299613g;

    /* renamed from: h */
    public String f299614h;

    /* renamed from: i */
    public String f299615i;

    /* renamed from: j */
    public String f299616j;

    /* renamed from: n */
    public String f299617n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101849uc0)) {
            return false;
        }
        C101849uc0 uc02 = (C101849uc0) aVar;
        return C46238a.m51546a(this.f299610d, uc02.f299610d) && C46238a.m51546a(Integer.valueOf(this.f299611e), Integer.valueOf(uc02.f299611e)) && C46238a.m51546a(this.f299612f, uc02.f299612f) && C46238a.m51546a(this.f299613g, uc02.f299613g) && C46238a.m51546a(this.f299614h, uc02.f299614h) && C46238a.m51546a(this.f299615i, uc02.f299615i) && C46238a.m51546a(this.f299616j, uc02.f299616j) && C46238a.m51546a(this.f299617n, uc02.f299617n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299610d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f299611e);
            String str2 = this.f299612f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f299613g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f299614h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f299615i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f299616j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f299617n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f299610d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            int e = i2 + C52418a.m58678e(2, this.f299611e);
            String str9 = this.f299612f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f299613g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f299614h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f299615i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f299616j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f299617n;
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
            C101849uc0 uc02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uc02.f299610d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    uc02.f299611e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    uc02.f299612f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uc02.f299613g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    uc02.f299614h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    uc02.f299615i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    uc02.f299616j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    uc02.f299617n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
