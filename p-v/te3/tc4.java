package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class tc4 extends C47465a {

    /* renamed from: d */
    public String f299537d;

    /* renamed from: e */
    public int f299538e;

    /* renamed from: f */
    public String f299539f;

    /* renamed from: g */
    public String f299540g;

    /* renamed from: h */
    public String f299541h;

    /* renamed from: i */
    public String f299542i;

    /* renamed from: j */
    public String f299543j;

    /* renamed from: n */
    public String f299544n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tc4)) {
            return false;
        }
        tc4 tc4 = (tc4) aVar;
        return C46238a.m51546a(this.f299537d, tc4.f299537d) && C46238a.m51546a(Integer.valueOf(this.f299538e), Integer.valueOf(tc4.f299538e)) && C46238a.m51546a(this.f299539f, tc4.f299539f) && C46238a.m51546a(this.f299540g, tc4.f299540g) && C46238a.m51546a(this.f299541h, tc4.f299541h) && C46238a.m51546a(this.f299542i, tc4.f299542i) && C46238a.m51546a(this.f299543j, tc4.f299543j) && C46238a.m51546a(this.f299544n, tc4.f299544n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299537d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f299538e);
            String str2 = this.f299539f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f299540g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f299541h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f299542i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f299543j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f299544n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f299537d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            int e = i2 + C52418a.m58678e(2, this.f299538e);
            String str9 = this.f299539f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f299540g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f299541h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f299542i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            String str13 = this.f299543j;
            if (str13 != null) {
                e += C52418a.m58683j(7, str13);
            }
            String str14 = this.f299544n;
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
            tc4 tc4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tc4.f299537d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    tc4.f299538e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    tc4.f299539f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    tc4.f299540g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tc4.f299541h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    tc4.f299542i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    tc4.f299543j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    tc4.f299544n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
