package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class t05 extends C47465a {

    /* renamed from: d */
    public String f141886d;

    /* renamed from: e */
    public String f141887e;

    /* renamed from: f */
    public String f141888f;

    /* renamed from: g */
    public String f141889g;

    /* renamed from: h */
    public String f141890h;

    /* renamed from: i */
    public String f141891i;

    /* renamed from: j */
    public String f141892j;

    /* renamed from: n */
    public String f141893n;

    /* renamed from: o */
    public String f141894o;

    /* renamed from: p */
    public int f141895p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t05)) {
            return false;
        }
        t05 t05 = (t05) aVar;
        return C46238a.m51546a(this.f141886d, t05.f141886d) && C46238a.m51546a(this.f141887e, t05.f141887e) && C46238a.m51546a(this.f141888f, t05.f141888f) && C46238a.m51546a(this.f141889g, t05.f141889g) && C46238a.m51546a(this.f141890h, t05.f141890h) && C46238a.m51546a(this.f141891i, t05.f141891i) && C46238a.m51546a(this.f141892j, t05.f141892j) && C46238a.m51546a(this.f141893n, t05.f141893n) && C46238a.m51546a(this.f141894o, t05.f141894o) && C46238a.m51546a(Integer.valueOf(this.f141895p), Integer.valueOf(t05.f141895p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141886d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f141887e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f141888f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f141889g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f141890h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                String str6 = this.f141891i;
                if (str6 != null) {
                    aVar.mo74323j(6, str6);
                }
                String str7 = this.f141892j;
                if (str7 != null) {
                    aVar.mo74323j(7, str7);
                }
                String str8 = this.f141893n;
                if (str8 != null) {
                    aVar.mo74323j(8, str8);
                }
                String str9 = this.f141894o;
                if (str9 != null) {
                    aVar.mo74323j(9, str9);
                }
                aVar.mo74318e(10, this.f141895p);
                return 0;
            }
            throw new C52419b("Not all required fields were included: LocalNodeId");
        } else if (i == 1) {
            String str10 = this.f141886d;
            if (str10 != null) {
                i2 = 0 + C52418a.m58683j(1, str10);
            }
            String str11 = this.f141887e;
            if (str11 != null) {
                i2 += C52418a.m58683j(2, str11);
            }
            String str12 = this.f141888f;
            if (str12 != null) {
                i2 += C52418a.m58683j(3, str12);
            }
            String str13 = this.f141889g;
            if (str13 != null) {
                i2 += C52418a.m58683j(4, str13);
            }
            String str14 = this.f141890h;
            if (str14 != null) {
                i2 += C52418a.m58683j(5, str14);
            }
            String str15 = this.f141891i;
            if (str15 != null) {
                i2 += C52418a.m58683j(6, str15);
            }
            String str16 = this.f141892j;
            if (str16 != null) {
                i2 += C52418a.m58683j(7, str16);
            }
            String str17 = this.f141893n;
            if (str17 != null) {
                i2 += C52418a.m58683j(8, str17);
            }
            String str18 = this.f141894o;
            if (str18 != null) {
                i2 += C52418a.m58683j(9, str18);
            }
            return i2 + C52418a.m58678e(10, this.f141895p);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141886d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: LocalNodeId");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            t05 t05 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    t05.f141886d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    t05.f141887e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t05.f141888f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t05.f141889g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t05.f141890h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t05.f141891i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    t05.f141892j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    t05.f141893n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    t05.f141894o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    t05.f141895p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
