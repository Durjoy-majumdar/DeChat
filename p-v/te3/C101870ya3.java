package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ya3 */
public class C101870ya3 extends C47465a {

    /* renamed from: d */
    public int f299920d;

    /* renamed from: e */
    public int f299921e;

    /* renamed from: f */
    public int f299922f;

    /* renamed from: g */
    public String f299923g;

    /* renamed from: h */
    public int f299924h;

    /* renamed from: i */
    public String f299925i;

    /* renamed from: j */
    public String f299926j;

    /* renamed from: n */
    public String f299927n;

    /* renamed from: o */
    public String f299928o;

    /* renamed from: p */
    public String f299929p;

    /* renamed from: q */
    public int f299930q;

    /* renamed from: r */
    public String f299931r;

    /* renamed from: s */
    public String f299932s;

    /* renamed from: t */
    public String f299933t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101870ya3)) {
            return false;
        }
        C101870ya3 ya32 = (C101870ya3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299920d), Integer.valueOf(ya32.f299920d)) && C46238a.m51546a(Integer.valueOf(this.f299921e), Integer.valueOf(ya32.f299921e)) && C46238a.m51546a(Integer.valueOf(this.f299922f), Integer.valueOf(ya32.f299922f)) && C46238a.m51546a(this.f299923g, ya32.f299923g) && C46238a.m51546a(Integer.valueOf(this.f299924h), Integer.valueOf(ya32.f299924h)) && C46238a.m51546a(this.f299925i, ya32.f299925i) && C46238a.m51546a(this.f299926j, ya32.f299926j) && C46238a.m51546a(this.f299927n, ya32.f299927n) && C46238a.m51546a(this.f299928o, ya32.f299928o) && C46238a.m51546a(this.f299929p, ya32.f299929p) && C46238a.m51546a(Integer.valueOf(this.f299930q), Integer.valueOf(ya32.f299930q)) && C46238a.m51546a(this.f299931r, ya32.f299931r) && C46238a.m51546a(this.f299932s, ya32.f299932s) && C46238a.m51546a(this.f299933t, ya32.f299933t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299923g != null) {
                aVar.mo74318e(1, this.f299920d);
                aVar.mo74318e(2, this.f299921e);
                aVar.mo74318e(3, this.f299922f);
                String str = this.f299923g;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f299924h);
                String str2 = this.f299925i;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                String str3 = this.f299926j;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f299927n;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                String str5 = this.f299928o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f299929p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                aVar.mo74318e(12, this.f299930q);
                String str7 = this.f299931r;
                if (str7 != null) {
                    aVar.mo74323j(13, str7);
                }
                String str8 = this.f299932s;
                if (str8 != null) {
                    aVar.mo74323j(14, str8);
                }
                String str9 = this.f299933t;
                if (str9 != null) {
                    aVar.mo74323j(15, str9);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: FileMD5");
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f299920d) + 0 + C52418a.m58678e(2, this.f299921e) + C52418a.m58678e(3, this.f299922f);
            String str10 = this.f299923g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            int e2 = e + C52418a.m58678e(5, this.f299924h);
            String str11 = this.f299925i;
            if (str11 != null) {
                e2 += C52418a.m58683j(6, str11);
            }
            String str12 = this.f299926j;
            if (str12 != null) {
                e2 += C52418a.m58683j(7, str12);
            }
            String str13 = this.f299927n;
            if (str13 != null) {
                e2 += C52418a.m58683j(8, str13);
            }
            String str14 = this.f299928o;
            if (str14 != null) {
                e2 += C52418a.m58683j(10, str14);
            }
            String str15 = this.f299929p;
            if (str15 != null) {
                e2 += C52418a.m58683j(11, str15);
            }
            int e3 = e2 + C52418a.m58678e(12, this.f299930q);
            String str16 = this.f299931r;
            if (str16 != null) {
                e3 += C52418a.m58683j(13, str16);
            }
            String str17 = this.f299932s;
            if (str17 != null) {
                e3 += C52418a.m58683j(14, str17);
            }
            String str18 = this.f299933t;
            return str18 != null ? e3 + C52418a.m58683j(15, str18) : e3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299923g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: FileMD5");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101870ya3 ya32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ya32.f299920d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ya32.f299921e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ya32.f299922f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ya32.f299923g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ya32.f299924h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ya32.f299925i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ya32.f299926j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ya32.f299927n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ya32.f299928o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ya32.f299929p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ya32.f299930q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    ya32.f299931r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ya32.f299932s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    ya32.f299933t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
