package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kr2 */
public class C101802kr2 extends C47465a {

    /* renamed from: d */
    public float f298647d;

    /* renamed from: e */
    public float f298648e;

    /* renamed from: f */
    public String f298649f;

    /* renamed from: g */
    public String f298650g;

    /* renamed from: h */
    public String f298651h;

    /* renamed from: i */
    public String f298652i;

    /* renamed from: j */
    public int f298653j;

    /* renamed from: n */
    public String f298654n;

    /* renamed from: o */
    public int f298655o;

    /* renamed from: p */
    public int f298656p;

    /* renamed from: q */
    public int f298657q;

    /* renamed from: r */
    public float f298658r;

    /* renamed from: s */
    public C89349b f298659s;

    /* renamed from: t */
    public int f298660t;

    /* renamed from: u */
    public String f298661u;

    /* renamed from: v */
    public String f298662v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101802kr2)) {
            return false;
        }
        C101802kr2 kr22 = (C101802kr2) aVar;
        return C46238a.m51546a(Float.valueOf(this.f298647d), Float.valueOf(kr22.f298647d)) && C46238a.m51546a(Float.valueOf(this.f298648e), Float.valueOf(kr22.f298648e)) && C46238a.m51546a(this.f298649f, kr22.f298649f) && C46238a.m51546a(this.f298650g, kr22.f298650g) && C46238a.m51546a(this.f298651h, kr22.f298651h) && C46238a.m51546a(this.f298652i, kr22.f298652i) && C46238a.m51546a(Integer.valueOf(this.f298653j), Integer.valueOf(kr22.f298653j)) && C46238a.m51546a(this.f298654n, kr22.f298654n) && C46238a.m51546a(Integer.valueOf(this.f298655o), Integer.valueOf(kr22.f298655o)) && C46238a.m51546a(Integer.valueOf(this.f298656p), Integer.valueOf(kr22.f298656p)) && C46238a.m51546a(Integer.valueOf(this.f298657q), Integer.valueOf(kr22.f298657q)) && C46238a.m51546a(Float.valueOf(this.f298658r), Float.valueOf(kr22.f298658r)) && C46238a.m51546a(this.f298659s, kr22.f298659s) && C46238a.m51546a(Integer.valueOf(this.f298660t), Integer.valueOf(kr22.f298660t)) && C46238a.m51546a(this.f298661u, kr22.f298661u) && C46238a.m51546a(this.f298662v, kr22.f298662v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f298647d);
            aVar.mo74317d(2, this.f298648e);
            String str = this.f298649f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f298650g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f298651h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f298652i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f298653j);
            String str5 = this.f298654n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74318e(9, this.f298655o);
            aVar.mo74318e(10, this.f298656p);
            aVar.mo74318e(11, this.f298657q);
            aVar.mo74317d(12, this.f298658r);
            C89349b bVar = this.f298659s;
            if (bVar != null) {
                aVar.mo74315b(13, bVar);
            }
            aVar.mo74318e(14, this.f298660t);
            String str6 = this.f298661u;
            if (str6 != null) {
                aVar.mo74323j(15, str6);
            }
            String str7 = this.f298662v;
            if (str7 != null) {
                aVar.mo74323j(16, str7);
            }
            return 0;
        } else if (i2 == 1) {
            int d = C52418a.m58677d(1, this.f298647d) + 0 + C52418a.m58677d(2, this.f298648e);
            String str8 = this.f298649f;
            if (str8 != null) {
                d += C52418a.m58683j(3, str8);
            }
            String str9 = this.f298650g;
            if (str9 != null) {
                d += C52418a.m58683j(4, str9);
            }
            String str10 = this.f298651h;
            if (str10 != null) {
                d += C52418a.m58683j(5, str10);
            }
            String str11 = this.f298652i;
            if (str11 != null) {
                d += C52418a.m58683j(6, str11);
            }
            int e = d + C52418a.m58678e(7, this.f298653j);
            String str12 = this.f298654n;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            int e2 = e + C52418a.m58678e(9, this.f298655o) + C52418a.m58678e(10, this.f298656p) + C52418a.m58678e(11, this.f298657q) + C52418a.m58677d(12, this.f298658r);
            C89349b bVar2 = this.f298659s;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(13, bVar2);
            }
            int e3 = e2 + C52418a.m58678e(14, this.f298660t);
            String str13 = this.f298661u;
            if (str13 != null) {
                e3 += C52418a.m58683j(15, str13);
            }
            String str14 = this.f298662v;
            return str14 != null ? e3 + C52418a.m58683j(16, str14) : e3;
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
            C101802kr2 kr22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kr22.f298647d = aVar3.mo141628f(intValue);
                    return 0;
                case 2:
                    kr22.f298648e = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    kr22.f298649f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kr22.f298650g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    kr22.f298651h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kr22.f298652i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    kr22.f298653j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    kr22.f298654n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    kr22.f298655o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    kr22.f298656p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    kr22.f298657q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    kr22.f298658r = aVar3.mo141628f(intValue);
                    return 0;
                case 13:
                    kr22.f298659s = aVar3.mo141626d(intValue);
                    return 0;
                case 14:
                    kr22.f298660t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    kr22.f298661u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    kr22.f298662v = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
