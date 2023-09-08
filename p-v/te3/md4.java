package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class md4 extends C47465a {

    /* renamed from: d */
    public String f64226d;

    /* renamed from: e */
    public String f64227e;

    /* renamed from: f */
    public String f64228f;

    /* renamed from: g */
    public String f64229g;

    /* renamed from: h */
    public String f64230h;

    /* renamed from: i */
    public String f64231i;

    /* renamed from: j */
    public String f64232j;

    /* renamed from: n */
    public String f64233n;

    /* renamed from: o */
    public String f64234o;

    /* renamed from: p */
    public String f64235p;

    /* renamed from: q */
    public String f64236q;

    /* renamed from: r */
    public String f64237r;

    /* renamed from: s */
    public String f64238s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof md4)) {
            return false;
        }
        md4 md4 = (md4) aVar;
        return C46238a.m51546a(this.f64226d, md4.f64226d) && C46238a.m51546a(this.f64227e, md4.f64227e) && C46238a.m51546a(this.f64228f, md4.f64228f) && C46238a.m51546a(this.f64229g, md4.f64229g) && C46238a.m51546a(this.f64230h, md4.f64230h) && C46238a.m51546a(this.f64231i, md4.f64231i) && C46238a.m51546a(this.f64232j, md4.f64232j) && C46238a.m51546a(this.f64233n, md4.f64233n) && C46238a.m51546a(this.f64234o, md4.f64234o) && C46238a.m51546a(this.f64235p, md4.f64235p) && C46238a.m51546a(this.f64236q, md4.f64236q) && C46238a.m51546a(this.f64237r, md4.f64237r) && C46238a.m51546a(this.f64238s, md4.f64238s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64226d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64227e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64228f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64229g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f64230h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f64231i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f64232j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f64233n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            String str9 = this.f64234o;
            if (str9 != null) {
                aVar.mo74323j(9, str9);
            }
            String str10 = this.f64235p;
            if (str10 != null) {
                aVar.mo74323j(10, str10);
            }
            String str11 = this.f64236q;
            if (str11 != null) {
                aVar.mo74323j(11, str11);
            }
            String str12 = this.f64237r;
            if (str12 != null) {
                aVar.mo74323j(12, str12);
            }
            String str13 = this.f64238s;
            if (str13 == null) {
                return 0;
            }
            aVar.mo74323j(13, str13);
            return 0;
        } else if (i2 == 1) {
            String str14 = this.f64226d;
            int j = str14 != null ? 0 + C52418a.m58683j(1, str14) : 0;
            String str15 = this.f64227e;
            if (str15 != null) {
                j += C52418a.m58683j(2, str15);
            }
            String str16 = this.f64228f;
            if (str16 != null) {
                j += C52418a.m58683j(3, str16);
            }
            String str17 = this.f64229g;
            if (str17 != null) {
                j += C52418a.m58683j(4, str17);
            }
            String str18 = this.f64230h;
            if (str18 != null) {
                j += C52418a.m58683j(5, str18);
            }
            String str19 = this.f64231i;
            if (str19 != null) {
                j += C52418a.m58683j(6, str19);
            }
            String str20 = this.f64232j;
            if (str20 != null) {
                j += C52418a.m58683j(7, str20);
            }
            String str21 = this.f64233n;
            if (str21 != null) {
                j += C52418a.m58683j(8, str21);
            }
            String str22 = this.f64234o;
            if (str22 != null) {
                j += C52418a.m58683j(9, str22);
            }
            String str23 = this.f64235p;
            if (str23 != null) {
                j += C52418a.m58683j(10, str23);
            }
            String str24 = this.f64236q;
            if (str24 != null) {
                j += C52418a.m58683j(11, str24);
            }
            String str25 = this.f64237r;
            if (str25 != null) {
                j += C52418a.m58683j(12, str25);
            }
            String str26 = this.f64238s;
            return str26 != null ? j + C52418a.m58683j(13, str26) : j;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            md4 md4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    md4.f64226d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    md4.f64227e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    md4.f64228f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    md4.f64229g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    md4.f64230h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    md4.f64231i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    md4.f64232j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    md4.f64233n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    md4.f64234o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    md4.f64235p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    md4.f64236q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    md4.f64237r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    md4.f64238s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
