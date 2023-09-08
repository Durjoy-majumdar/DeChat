package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y1 */
public class C64845y1 extends C47465a {

    /* renamed from: d */
    public int f186424d;

    /* renamed from: e */
    public int f186425e;

    /* renamed from: f */
    public int f186426f;

    /* renamed from: g */
    public C89349b f186427g;

    /* renamed from: h */
    public int f186428h;

    /* renamed from: i */
    public int f186429i;

    /* renamed from: j */
    public String f186430j;

    /* renamed from: n */
    public String f186431n;

    /* renamed from: o */
    public String f186432o;

    /* renamed from: p */
    public String f186433p;

    /* renamed from: q */
    public String f186434q;

    /* renamed from: r */
    public String f186435r;

    /* renamed from: s */
    public String f186436s;

    /* renamed from: t */
    public String f186437t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64845y1)) {
            return false;
        }
        C64845y1 y1Var = (C64845y1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186424d), Integer.valueOf(y1Var.f186424d)) && C46238a.m51546a(Integer.valueOf(this.f186425e), Integer.valueOf(y1Var.f186425e)) && C46238a.m51546a(Integer.valueOf(this.f186426f), Integer.valueOf(y1Var.f186426f)) && C46238a.m51546a(this.f186427g, y1Var.f186427g) && C46238a.m51546a(Integer.valueOf(this.f186428h), Integer.valueOf(y1Var.f186428h)) && C46238a.m51546a(Integer.valueOf(this.f186429i), Integer.valueOf(y1Var.f186429i)) && C46238a.m51546a(this.f186430j, y1Var.f186430j) && C46238a.m51546a(this.f186431n, y1Var.f186431n) && C46238a.m51546a(this.f186432o, y1Var.f186432o) && C46238a.m51546a(this.f186433p, y1Var.f186433p) && C46238a.m51546a(this.f186434q, y1Var.f186434q) && C46238a.m51546a(this.f186435r, y1Var.f186435r) && C46238a.m51546a(this.f186436s, y1Var.f186436s) && C46238a.m51546a(this.f186437t, y1Var.f186437t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186424d);
            aVar.mo74318e(2, this.f186425e);
            aVar.mo74318e(3, this.f186426f);
            C89349b bVar = this.f186427g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f186428h);
            aVar.mo74318e(6, this.f186429i);
            String str = this.f186430j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f186431n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f186432o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            String str4 = this.f186433p;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            String str5 = this.f186434q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            String str6 = this.f186435r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            String str7 = this.f186436s;
            if (str7 != null) {
                aVar.mo74323j(13, str7);
            }
            String str8 = this.f186437t;
            if (str8 != null) {
                aVar.mo74323j(14, str8);
            }
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f186424d) + 0 + C52418a.m58678e(2, this.f186425e) + C52418a.m58678e(3, this.f186426f);
            C89349b bVar2 = this.f186427g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            int e2 = e + C52418a.m58678e(5, this.f186428h) + C52418a.m58678e(6, this.f186429i);
            String str9 = this.f186430j;
            if (str9 != null) {
                e2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f186431n;
            if (str10 != null) {
                e2 += C52418a.m58683j(8, str10);
            }
            String str11 = this.f186432o;
            if (str11 != null) {
                e2 += C52418a.m58683j(9, str11);
            }
            String str12 = this.f186433p;
            if (str12 != null) {
                e2 += C52418a.m58683j(10, str12);
            }
            String str13 = this.f186434q;
            if (str13 != null) {
                e2 += C52418a.m58683j(11, str13);
            }
            String str14 = this.f186435r;
            if (str14 != null) {
                e2 += C52418a.m58683j(12, str14);
            }
            String str15 = this.f186436s;
            if (str15 != null) {
                e2 += C52418a.m58683j(13, str15);
            }
            String str16 = this.f186437t;
            return str16 != null ? e2 + C52418a.m58683j(14, str16) : e2;
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
            C64845y1 y1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    y1Var.f186424d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    y1Var.f186425e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    y1Var.f186426f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    y1Var.f186427g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    y1Var.f186428h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    y1Var.f186429i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    y1Var.f186430j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    y1Var.f186431n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    y1Var.f186432o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    y1Var.f186433p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    y1Var.f186434q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    y1Var.f186435r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    y1Var.f186436s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    y1Var.f186437t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
