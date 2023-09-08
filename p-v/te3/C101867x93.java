package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x93 */
public class C101867x93 extends C47465a {

    /* renamed from: d */
    public String f299876d;

    /* renamed from: e */
    public String f299877e;

    /* renamed from: f */
    public String f299878f;

    /* renamed from: g */
    public String f299879g;

    /* renamed from: h */
    public String f299880h;

    /* renamed from: i */
    public String f299881i;

    /* renamed from: j */
    public String f299882j;

    /* renamed from: n */
    public String f299883n;

    /* renamed from: o */
    public String f299884o;

    /* renamed from: p */
    public String f299885p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101867x93)) {
            return false;
        }
        C101867x93 x932 = (C101867x93) aVar;
        return C46238a.m51546a(this.f299876d, x932.f299876d) && C46238a.m51546a(this.f299877e, x932.f299877e) && C46238a.m51546a(this.f299878f, x932.f299878f) && C46238a.m51546a(this.f299879g, x932.f299879g) && C46238a.m51546a(this.f299880h, x932.f299880h) && C46238a.m51546a(this.f299881i, x932.f299881i) && C46238a.m51546a(this.f299882j, x932.f299882j) && C46238a.m51546a(this.f299883n, x932.f299883n) && C46238a.m51546a(this.f299884o, x932.f299884o) && C46238a.m51546a(this.f299885p, x932.f299885p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299876d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299877e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299878f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f299879g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f299880h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f299881i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f299882j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f299883n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            String str9 = this.f299884o;
            if (str9 != null) {
                aVar.mo74323j(9, str9);
            }
            String str10 = this.f299885p;
            if (str10 != null) {
                aVar.mo74323j(10, str10);
            }
            return 0;
        } else if (i == 1) {
            String str11 = this.f299876d;
            if (str11 != null) {
                i2 = 0 + C52418a.m58683j(1, str11);
            }
            String str12 = this.f299877e;
            if (str12 != null) {
                i2 += C52418a.m58683j(2, str12);
            }
            String str13 = this.f299878f;
            if (str13 != null) {
                i2 += C52418a.m58683j(3, str13);
            }
            String str14 = this.f299879g;
            if (str14 != null) {
                i2 += C52418a.m58683j(4, str14);
            }
            String str15 = this.f299880h;
            if (str15 != null) {
                i2 += C52418a.m58683j(5, str15);
            }
            String str16 = this.f299881i;
            if (str16 != null) {
                i2 += C52418a.m58683j(6, str16);
            }
            String str17 = this.f299882j;
            if (str17 != null) {
                i2 += C52418a.m58683j(7, str17);
            }
            String str18 = this.f299883n;
            if (str18 != null) {
                i2 += C52418a.m58683j(8, str18);
            }
            String str19 = this.f299884o;
            if (str19 != null) {
                i2 += C52418a.m58683j(9, str19);
            }
            String str20 = this.f299885p;
            return str20 != null ? i2 + C52418a.m58683j(10, str20) : i2;
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
            C101867x93 x932 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x932.f299876d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    x932.f299877e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x932.f299878f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    x932.f299879g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    x932.f299880h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    x932.f299881i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    x932.f299882j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    x932.f299883n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    x932.f299884o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    x932.f299885p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
