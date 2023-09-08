package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fa */
public class C49399fa extends C47465a {

    /* renamed from: d */
    public String f133366d;

    /* renamed from: e */
    public String f133367e;

    /* renamed from: f */
    public String f133368f;

    /* renamed from: g */
    public String f133369g;

    /* renamed from: h */
    public String f133370h;

    /* renamed from: i */
    public int f133371i;

    /* renamed from: j */
    public int f133372j;

    /* renamed from: n */
    public int f133373n;

    /* renamed from: o */
    public String f133374o;

    /* renamed from: p */
    public String f133375p;

    /* renamed from: q */
    public String f133376q;

    /* renamed from: r */
    public String f133377r;

    /* renamed from: s */
    public String f133378s;

    /* renamed from: t */
    public String f133379t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49399fa)) {
            return false;
        }
        C49399fa faVar = (C49399fa) aVar;
        return C46238a.m51546a(this.f133366d, faVar.f133366d) && C46238a.m51546a(this.f133367e, faVar.f133367e) && C46238a.m51546a(this.f133368f, faVar.f133368f) && C46238a.m51546a(this.f133369g, faVar.f133369g) && C46238a.m51546a(this.f133370h, faVar.f133370h) && C46238a.m51546a(Integer.valueOf(this.f133371i), Integer.valueOf(faVar.f133371i)) && C46238a.m51546a(Integer.valueOf(this.f133372j), Integer.valueOf(faVar.f133372j)) && C46238a.m51546a(Integer.valueOf(this.f133373n), Integer.valueOf(faVar.f133373n)) && C46238a.m51546a(this.f133374o, faVar.f133374o) && C46238a.m51546a(this.f133375p, faVar.f133375p) && C46238a.m51546a(this.f133376q, faVar.f133376q) && C46238a.m51546a(this.f133377r, faVar.f133377r) && C46238a.m51546a(this.f133378s, faVar.f133378s) && C46238a.m51546a(this.f133379t, faVar.f133379t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133366d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133367e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f133368f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f133369g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f133370h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f133371i);
            aVar.mo74318e(7, this.f133372j);
            aVar.mo74318e(8, this.f133373n);
            String str6 = this.f133374o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f133375p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f133376q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f133377r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            String str10 = this.f133378s;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            String str11 = this.f133379t;
            if (str11 != null) {
                aVar.mo74323j(14, str11);
            }
            return 0;
        } else if (i2 == 1) {
            String str12 = this.f133366d;
            if (str12 != null) {
                i3 = C52418a.m58683j(1, str12) + 0;
            }
            String str13 = this.f133367e;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f133368f;
            if (str14 != null) {
                i3 += C52418a.m58683j(3, str14);
            }
            String str15 = this.f133369g;
            if (str15 != null) {
                i3 += C52418a.m58683j(4, str15);
            }
            String str16 = this.f133370h;
            if (str16 != null) {
                i3 += C52418a.m58683j(5, str16);
            }
            int e = i3 + C52418a.m58678e(6, this.f133371i) + C52418a.m58678e(7, this.f133372j) + C52418a.m58678e(8, this.f133373n);
            String str17 = this.f133374o;
            if (str17 != null) {
                e += C52418a.m58683j(9, str17);
            }
            String str18 = this.f133375p;
            if (str18 != null) {
                e += C52418a.m58683j(10, str18);
            }
            String str19 = this.f133376q;
            if (str19 != null) {
                e += C52418a.m58683j(11, str19);
            }
            String str20 = this.f133377r;
            if (str20 != null) {
                e += C52418a.m58683j(12, str20);
            }
            String str21 = this.f133378s;
            if (str21 != null) {
                e += C52418a.m58683j(13, str21);
            }
            String str22 = this.f133379t;
            return str22 != null ? e + C52418a.m58683j(14, str22) : e;
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
            C49399fa faVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    faVar.f133366d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    faVar.f133367e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    faVar.f133368f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    faVar.f133369g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    faVar.f133370h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    faVar.f133371i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    faVar.f133372j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    faVar.f133373n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    faVar.f133374o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    faVar.f133375p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    faVar.f133376q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    faVar.f133377r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    faVar.f133378s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    faVar.f133379t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
