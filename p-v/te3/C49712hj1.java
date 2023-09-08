package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hj1 */
public class C49712hj1 extends C47465a {

    /* renamed from: d */
    public String f134670d;

    /* renamed from: e */
    public String f134671e;

    /* renamed from: f */
    public String f134672f;

    /* renamed from: g */
    public String f134673g;

    /* renamed from: h */
    public int f134674h;

    /* renamed from: i */
    public int f134675i;

    /* renamed from: j */
    public long f134676j;

    /* renamed from: n */
    public int f134677n;

    /* renamed from: o */
    public int f134678o;

    /* renamed from: p */
    public String f134679p;

    /* renamed from: q */
    public int f134680q;

    /* renamed from: r */
    public String f134681r;

    /* renamed from: s */
    public String f134682s;

    /* renamed from: t */
    public boolean f134683t;

    /* renamed from: u */
    public int f134684u;

    /* renamed from: v */
    public String f134685v;

    /* renamed from: w */
    public String f134686w;

    /* renamed from: x */
    public String f134687x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49712hj1)) {
            return false;
        }
        C49712hj1 hj12 = (C49712hj1) aVar;
        return C46238a.m51546a(this.f134670d, hj12.f134670d) && C46238a.m51546a(this.f134671e, hj12.f134671e) && C46238a.m51546a(this.f134672f, hj12.f134672f) && C46238a.m51546a(this.f134673g, hj12.f134673g) && C46238a.m51546a(Integer.valueOf(this.f134674h), Integer.valueOf(hj12.f134674h)) && C46238a.m51546a(Integer.valueOf(this.f134675i), Integer.valueOf(hj12.f134675i)) && C46238a.m51546a(Long.valueOf(this.f134676j), Long.valueOf(hj12.f134676j)) && C46238a.m51546a(Integer.valueOf(this.f134677n), Integer.valueOf(hj12.f134677n)) && C46238a.m51546a(Integer.valueOf(this.f134678o), Integer.valueOf(hj12.f134678o)) && C46238a.m51546a(this.f134679p, hj12.f134679p) && C46238a.m51546a(Integer.valueOf(this.f134680q), Integer.valueOf(hj12.f134680q)) && C46238a.m51546a(this.f134681r, hj12.f134681r) && C46238a.m51546a(this.f134682s, hj12.f134682s) && C46238a.m51546a(Boolean.valueOf(this.f134683t), Boolean.valueOf(hj12.f134683t)) && C46238a.m51546a(Integer.valueOf(this.f134684u), Integer.valueOf(hj12.f134684u)) && C46238a.m51546a(this.f134685v, hj12.f134685v) && C46238a.m51546a(this.f134686w, hj12.f134686w) && C46238a.m51546a(this.f134687x, hj12.f134687x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134670d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134671e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f134672f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f134673g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f134674h);
            aVar.mo74318e(6, this.f134675i);
            aVar.mo74321h(7, this.f134676j);
            aVar.mo74318e(8, this.f134677n);
            aVar.mo74318e(9, this.f134678o);
            String str5 = this.f134679p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            aVar.mo74318e(11, this.f134680q);
            String str6 = this.f134681r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            String str7 = this.f134682s;
            if (str7 != null) {
                aVar.mo74323j(13, str7);
            }
            aVar.mo74314a(14, this.f134683t);
            aVar.mo74318e(15, this.f134684u);
            String str8 = this.f134685v;
            if (str8 != null) {
                aVar.mo74323j(16, str8);
            }
            String str9 = this.f134686w;
            if (str9 != null) {
                aVar.mo74323j(17, str9);
            }
            String str10 = this.f134687x;
            if (str10 != null) {
                aVar.mo74323j(18, str10);
            }
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f134670d;
            if (str11 != null) {
                i3 = C52418a.m58683j(1, str11) + 0;
            }
            String str12 = this.f134671e;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            String str13 = this.f134672f;
            if (str13 != null) {
                i3 += C52418a.m58683j(3, str13);
            }
            String str14 = this.f134673g;
            if (str14 != null) {
                i3 += C52418a.m58683j(4, str14);
            }
            int e = i3 + C52418a.m58678e(5, this.f134674h) + C52418a.m58678e(6, this.f134675i) + C52418a.m58681h(7, this.f134676j) + C52418a.m58678e(8, this.f134677n) + C52418a.m58678e(9, this.f134678o);
            String str15 = this.f134679p;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            int e2 = e + C52418a.m58678e(11, this.f134680q);
            String str16 = this.f134681r;
            if (str16 != null) {
                e2 += C52418a.m58683j(12, str16);
            }
            String str17 = this.f134682s;
            if (str17 != null) {
                e2 += C52418a.m58683j(13, str17);
            }
            int a = e2 + C52418a.m58674a(14, this.f134683t) + C52418a.m58678e(15, this.f134684u);
            String str18 = this.f134685v;
            if (str18 != null) {
                a += C52418a.m58683j(16, str18);
            }
            String str19 = this.f134686w;
            if (str19 != null) {
                a += C52418a.m58683j(17, str19);
            }
            String str20 = this.f134687x;
            return str20 != null ? a + C52418a.m58683j(18, str20) : a;
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
            C49712hj1 hj12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hj12.f134670d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hj12.f134671e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hj12.f134672f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hj12.f134673g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hj12.f134674h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    hj12.f134675i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    hj12.f134676j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    hj12.f134677n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    hj12.f134678o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    hj12.f134679p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    hj12.f134680q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    hj12.f134681r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    hj12.f134682s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    hj12.f134683t = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    hj12.f134684u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    hj12.f134685v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    hj12.f134686w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    hj12.f134687x = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
