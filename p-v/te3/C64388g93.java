package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g93 */
public class C64388g93 extends C47465a {

    /* renamed from: d */
    public String f183282d;

    /* renamed from: e */
    public String f183283e;

    /* renamed from: f */
    public String f183284f;

    /* renamed from: g */
    public String f183285g;

    /* renamed from: h */
    public String f183286h;

    /* renamed from: i */
    public String f183287i;

    /* renamed from: j */
    public String f183288j;

    /* renamed from: n */
    public int f183289n;

    /* renamed from: o */
    public String f183290o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64388g93)) {
            return false;
        }
        C64388g93 g932 = (C64388g93) aVar;
        return C46238a.m51546a(this.f183282d, g932.f183282d) && C46238a.m51546a(this.f183283e, g932.f183283e) && C46238a.m51546a(this.f183284f, g932.f183284f) && C46238a.m51546a(this.f183285g, g932.f183285g) && C46238a.m51546a(this.f183286h, g932.f183286h) && C46238a.m51546a(this.f183287i, g932.f183287i) && C46238a.m51546a(this.f183288j, g932.f183288j) && C46238a.m51546a(Integer.valueOf(this.f183289n), Integer.valueOf(g932.f183289n)) && C46238a.m51546a(this.f183290o, g932.f183290o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183282d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183283e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183284f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f183285g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f183286h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f183287i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f183288j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            aVar.mo74318e(8, this.f183289n);
            String str8 = this.f183290o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f183282d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f183283e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f183284f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f183285g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f183286h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f183287i;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f183288j;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            int e = i2 + C52418a.m58678e(8, this.f183289n);
            String str16 = this.f183290o;
            return str16 != null ? e + C52418a.m58683j(9, str16) : e;
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
            C64388g93 g932 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    g932.f183282d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    g932.f183283e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    g932.f183284f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    g932.f183285g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    g932.f183286h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    g932.f183287i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    g932.f183288j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    g932.f183289n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    g932.f183290o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
