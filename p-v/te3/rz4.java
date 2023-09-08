package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class rz4 extends C47465a {

    /* renamed from: d */
    public String f354314d;

    /* renamed from: e */
    public String f354315e;

    /* renamed from: f */
    public String f354316f;

    /* renamed from: g */
    public String f354317g;

    /* renamed from: h */
    public String f354318h;

    /* renamed from: i */
    public String f354319i;

    /* renamed from: j */
    public String f354320j;

    /* renamed from: n */
    public String f354321n;

    /* renamed from: o */
    public String f354322o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rz4)) {
            return false;
        }
        rz4 rz4 = (rz4) aVar;
        return C46238a.m51546a(this.f354314d, rz4.f354314d) && C46238a.m51546a(this.f354315e, rz4.f354315e) && C46238a.m51546a(this.f354316f, rz4.f354316f) && C46238a.m51546a(this.f354317g, rz4.f354317g) && C46238a.m51546a(this.f354318h, rz4.f354318h) && C46238a.m51546a(this.f354319i, rz4.f354319i) && C46238a.m51546a(this.f354320j, rz4.f354320j) && C46238a.m51546a(this.f354321n, rz4.f354321n) && C46238a.m51546a(this.f354322o, rz4.f354322o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354314d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354315e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f354316f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f354317g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f354318h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f354319i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f354320j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f354321n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            String str9 = this.f354322o;
            if (str9 != null) {
                aVar.mo74323j(9, str9);
            }
            return 0;
        } else if (i == 1) {
            String str10 = this.f354314d;
            if (str10 != null) {
                i2 = 0 + C52418a.m58683j(1, str10);
            }
            String str11 = this.f354315e;
            if (str11 != null) {
                i2 += C52418a.m58683j(2, str11);
            }
            String str12 = this.f354316f;
            if (str12 != null) {
                i2 += C52418a.m58683j(3, str12);
            }
            String str13 = this.f354317g;
            if (str13 != null) {
                i2 += C52418a.m58683j(4, str13);
            }
            String str14 = this.f354318h;
            if (str14 != null) {
                i2 += C52418a.m58683j(5, str14);
            }
            String str15 = this.f354319i;
            if (str15 != null) {
                i2 += C52418a.m58683j(6, str15);
            }
            String str16 = this.f354320j;
            if (str16 != null) {
                i2 += C52418a.m58683j(7, str16);
            }
            String str17 = this.f354321n;
            if (str17 != null) {
                i2 += C52418a.m58683j(8, str17);
            }
            String str18 = this.f354322o;
            return str18 != null ? i2 + C52418a.m58683j(9, str18) : i2;
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
            rz4 rz4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rz4.f354314d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rz4.f354315e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rz4.f354316f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rz4.f354317g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rz4.f354318h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rz4.f354319i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rz4.f354320j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rz4.f354321n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    rz4.f354322o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
