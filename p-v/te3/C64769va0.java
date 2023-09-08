package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.va0 */
public class C64769va0 extends C47465a {

    /* renamed from: d */
    public int f185853d;

    /* renamed from: e */
    public String f185854e;

    /* renamed from: f */
    public String f185855f;

    /* renamed from: g */
    public String f185856g;

    /* renamed from: h */
    public int f185857h;

    /* renamed from: i */
    public int f185858i;

    /* renamed from: j */
    public String f185859j;

    /* renamed from: n */
    public String f185860n;

    /* renamed from: o */
    public String f185861o;

    /* renamed from: p */
    public String f185862p;

    /* renamed from: q */
    public String f185863q;

    /* renamed from: r */
    public int f185864r;

    /* renamed from: s */
    public String f185865s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64769va0)) {
            return false;
        }
        C64769va0 va02 = (C64769va0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185853d), Integer.valueOf(va02.f185853d)) && C46238a.m51546a(this.f185854e, va02.f185854e) && C46238a.m51546a(this.f185855f, va02.f185855f) && C46238a.m51546a(this.f185856g, va02.f185856g) && C46238a.m51546a(Integer.valueOf(this.f185857h), Integer.valueOf(va02.f185857h)) && C46238a.m51546a(Integer.valueOf(this.f185858i), Integer.valueOf(va02.f185858i)) && C46238a.m51546a(this.f185859j, va02.f185859j) && C46238a.m51546a(this.f185860n, va02.f185860n) && C46238a.m51546a(this.f185861o, va02.f185861o) && C46238a.m51546a(this.f185862p, va02.f185862p) && C46238a.m51546a(this.f185863q, va02.f185863q) && C46238a.m51546a(Integer.valueOf(this.f185864r), Integer.valueOf(va02.f185864r)) && C46238a.m51546a(this.f185865s, va02.f185865s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185853d);
            String str = this.f185854e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f185855f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f185856g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f185857h);
            aVar.mo74318e(6, this.f185858i);
            String str4 = this.f185859j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f185860n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f185861o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f185862p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            String str8 = this.f185863q;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            aVar.mo74318e(12, this.f185864r);
            String str9 = this.f185865s;
            if (str9 == null) {
                return 0;
            }
            aVar.mo74323j(13, str9);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f185853d) + 0;
            String str10 = this.f185854e;
            if (str10 != null) {
                e += C52418a.m58683j(2, str10);
            }
            String str11 = this.f185855f;
            if (str11 != null) {
                e += C52418a.m58683j(3, str11);
            }
            String str12 = this.f185856g;
            if (str12 != null) {
                e += C52418a.m58683j(4, str12);
            }
            int e2 = e + C52418a.m58678e(5, this.f185857h) + C52418a.m58678e(6, this.f185858i);
            String str13 = this.f185859j;
            if (str13 != null) {
                e2 += C52418a.m58683j(7, str13);
            }
            String str14 = this.f185860n;
            if (str14 != null) {
                e2 += C52418a.m58683j(8, str14);
            }
            String str15 = this.f185861o;
            if (str15 != null) {
                e2 += C52418a.m58683j(9, str15);
            }
            String str16 = this.f185862p;
            if (str16 != null) {
                e2 += C52418a.m58683j(10, str16);
            }
            String str17 = this.f185863q;
            if (str17 != null) {
                e2 += C52418a.m58683j(11, str17);
            }
            int e3 = e2 + C52418a.m58678e(12, this.f185864r);
            String str18 = this.f185865s;
            return str18 != null ? e3 + C52418a.m58683j(13, str18) : e3;
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
            C64769va0 va02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    va02.f185853d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    va02.f185854e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    va02.f185855f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    va02.f185856g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    va02.f185857h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    va02.f185858i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    va02.f185859j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    va02.f185860n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    va02.f185861o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    va02.f185862p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    va02.f185863q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    va02.f185864r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    va02.f185865s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
