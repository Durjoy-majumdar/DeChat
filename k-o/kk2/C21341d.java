package kk2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: kk2.d */
public class C21341d extends C47465a {

    /* renamed from: d */
    public String f60332d;

    /* renamed from: e */
    public String f60333e;

    /* renamed from: f */
    public String f60334f;

    /* renamed from: g */
    public String f60335g;

    /* renamed from: h */
    public String f60336h;

    /* renamed from: i */
    public String f60337i;

    /* renamed from: j */
    public String f60338j;

    /* renamed from: n */
    public int f60339n;

    /* renamed from: o */
    public boolean f60340o;

    /* renamed from: p */
    public boolean f60341p;

    /* renamed from: q */
    public String f60342q;

    /* renamed from: r */
    public String f60343r;

    /* renamed from: s */
    public String f60344s;

    /* renamed from: t */
    public String f60345t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C21341d)) {
            return false;
        }
        C21341d dVar = (C21341d) aVar;
        return C46238a.m51546a(this.f60332d, dVar.f60332d) && C46238a.m51546a(this.f60333e, dVar.f60333e) && C46238a.m51546a(this.f60334f, dVar.f60334f) && C46238a.m51546a(this.f60335g, dVar.f60335g) && C46238a.m51546a(this.f60336h, dVar.f60336h) && C46238a.m51546a(this.f60337i, dVar.f60337i) && C46238a.m51546a(this.f60338j, dVar.f60338j) && C46238a.m51546a(Integer.valueOf(this.f60339n), Integer.valueOf(dVar.f60339n)) && C46238a.m51546a(Boolean.valueOf(this.f60340o), Boolean.valueOf(dVar.f60340o)) && C46238a.m51546a(Boolean.valueOf(this.f60341p), Boolean.valueOf(dVar.f60341p)) && C46238a.m51546a(this.f60342q, dVar.f60342q) && C46238a.m51546a(this.f60343r, dVar.f60343r) && C46238a.m51546a(this.f60344s, dVar.f60344s) && C46238a.m51546a(this.f60345t, dVar.f60345t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f60332d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f60333e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f60334f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f60335g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f60336h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f60337i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f60338j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            aVar.mo74318e(8, this.f60339n);
            aVar.mo74314a(9, this.f60340o);
            aVar.mo74314a(10, this.f60341p);
            String str8 = this.f60342q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f60343r;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            String str10 = this.f60344s;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            String str11 = this.f60345t;
            if (str11 != null) {
                aVar.mo74323j(14, str11);
            }
            return 0;
        } else if (i2 == 1) {
            String str12 = this.f60332d;
            if (str12 != null) {
                i3 = C52418a.m58683j(1, str12) + 0;
            }
            String str13 = this.f60333e;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f60334f;
            if (str14 != null) {
                i3 += C52418a.m58683j(3, str14);
            }
            String str15 = this.f60335g;
            if (str15 != null) {
                i3 += C52418a.m58683j(4, str15);
            }
            String str16 = this.f60336h;
            if (str16 != null) {
                i3 += C52418a.m58683j(5, str16);
            }
            String str17 = this.f60337i;
            if (str17 != null) {
                i3 += C52418a.m58683j(6, str17);
            }
            String str18 = this.f60338j;
            if (str18 != null) {
                i3 += C52418a.m58683j(7, str18);
            }
            int e = i3 + C52418a.m58678e(8, this.f60339n) + C52418a.m58674a(9, this.f60340o) + C52418a.m58674a(10, this.f60341p);
            String str19 = this.f60342q;
            if (str19 != null) {
                e += C52418a.m58683j(11, str19);
            }
            String str20 = this.f60343r;
            if (str20 != null) {
                e += C52418a.m58683j(12, str20);
            }
            String str21 = this.f60344s;
            if (str21 != null) {
                e += C52418a.m58683j(13, str21);
            }
            String str22 = this.f60345t;
            return str22 != null ? e + C52418a.m58683j(14, str22) : e;
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
            C21341d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dVar.f60332d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    dVar.f60333e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dVar.f60334f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dVar.f60335g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dVar.f60336h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dVar.f60337i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    dVar.f60338j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dVar.f60339n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    dVar.f60340o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    dVar.f60341p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    dVar.f60342q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    dVar.f60343r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    dVar.f60344s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    dVar.f60345t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
