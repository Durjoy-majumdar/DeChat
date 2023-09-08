package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xo */
public class C22534xo extends C47465a {

    /* renamed from: d */
    public String f64746d;

    /* renamed from: e */
    public String f64747e;

    /* renamed from: f */
    public String f64748f;

    /* renamed from: g */
    public String f64749g;

    /* renamed from: h */
    public long f64750h;

    /* renamed from: i */
    public String f64751i;

    /* renamed from: j */
    public String f64752j;

    /* renamed from: n */
    public String f64753n;

    /* renamed from: o */
    public String f64754o;

    /* renamed from: p */
    public String f64755p;

    /* renamed from: q */
    public String f64756q;

    /* renamed from: r */
    public String f64757r;

    /* renamed from: s */
    public String f64758s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22534xo)) {
            return false;
        }
        C22534xo xoVar = (C22534xo) aVar;
        return C46238a.m51546a(this.f64746d, xoVar.f64746d) && C46238a.m51546a(this.f64747e, xoVar.f64747e) && C46238a.m51546a(this.f64748f, xoVar.f64748f) && C46238a.m51546a(this.f64749g, xoVar.f64749g) && C46238a.m51546a(Long.valueOf(this.f64750h), Long.valueOf(xoVar.f64750h)) && C46238a.m51546a(this.f64751i, xoVar.f64751i) && C46238a.m51546a(this.f64752j, xoVar.f64752j) && C46238a.m51546a(this.f64753n, xoVar.f64753n) && C46238a.m51546a(this.f64754o, xoVar.f64754o) && C46238a.m51546a(this.f64755p, xoVar.f64755p) && C46238a.m51546a(this.f64756q, xoVar.f64756q) && C46238a.m51546a(this.f64757r, xoVar.f64757r) && C46238a.m51546a(this.f64758s, xoVar.f64758s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64746d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64747e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64748f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64749g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74321h(5, this.f64750h);
            String str5 = this.f64751i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f64752j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f64753n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f64754o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            String str9 = this.f64755p;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            String str10 = this.f64756q;
            if (str10 != null) {
                aVar.mo74323j(11, str10);
            }
            String str11 = this.f64757r;
            if (str11 != null) {
                aVar.mo74323j(12, str11);
            }
            String str12 = this.f64758s;
            if (str12 == null) {
                return 0;
            }
            aVar.mo74323j(13, str12);
            return 0;
        } else if (i2 == 1) {
            String str13 = this.f64746d;
            int j = str13 != null ? 0 + C52418a.m58683j(1, str13) : 0;
            String str14 = this.f64747e;
            if (str14 != null) {
                j += C52418a.m58683j(2, str14);
            }
            String str15 = this.f64748f;
            if (str15 != null) {
                j += C52418a.m58683j(3, str15);
            }
            String str16 = this.f64749g;
            if (str16 != null) {
                j += C52418a.m58683j(4, str16);
            }
            int h = j + C52418a.m58681h(5, this.f64750h);
            String str17 = this.f64751i;
            if (str17 != null) {
                h += C52418a.m58683j(6, str17);
            }
            String str18 = this.f64752j;
            if (str18 != null) {
                h += C52418a.m58683j(7, str18);
            }
            String str19 = this.f64753n;
            if (str19 != null) {
                h += C52418a.m58683j(8, str19);
            }
            String str20 = this.f64754o;
            if (str20 != null) {
                h += C52418a.m58683j(9, str20);
            }
            String str21 = this.f64755p;
            if (str21 != null) {
                h += C52418a.m58683j(10, str21);
            }
            String str22 = this.f64756q;
            if (str22 != null) {
                h += C52418a.m58683j(11, str22);
            }
            String str23 = this.f64757r;
            if (str23 != null) {
                h += C52418a.m58683j(12, str23);
            }
            String str24 = this.f64758s;
            return str24 != null ? h + C52418a.m58683j(13, str24) : h;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22534xo xoVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xoVar.f64746d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xoVar.f64747e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xoVar.f64748f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xoVar.f64749g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xoVar.f64750h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    xoVar.f64751i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    xoVar.f64752j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    xoVar.f64753n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xoVar.f64754o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    xoVar.f64755p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    xoVar.f64756q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    xoVar.f64757r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    xoVar.f64758s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
