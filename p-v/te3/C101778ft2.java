package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ft2 */
public class C101778ft2 extends C47465a {

    /* renamed from: d */
    public String f298260d;

    /* renamed from: e */
    public String f298261e;

    /* renamed from: f */
    public int f298262f;

    /* renamed from: g */
    public String f298263g;

    /* renamed from: h */
    public String f298264h;

    /* renamed from: i */
    public String f298265i;

    /* renamed from: j */
    public String f298266j;

    /* renamed from: n */
    public String f298267n;

    /* renamed from: o */
    public String f298268o;

    /* renamed from: p */
    public int f298269p;

    /* renamed from: q */
    public String f298270q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101778ft2)) {
            return false;
        }
        C101778ft2 ft22 = (C101778ft2) aVar;
        return C46238a.m51546a(this.f298260d, ft22.f298260d) && C46238a.m51546a(this.f298261e, ft22.f298261e) && C46238a.m51546a(Integer.valueOf(this.f298262f), Integer.valueOf(ft22.f298262f)) && C46238a.m51546a(this.f298263g, ft22.f298263g) && C46238a.m51546a(this.f298264h, ft22.f298264h) && C46238a.m51546a(this.f298265i, ft22.f298265i) && C46238a.m51546a(this.f298266j, ft22.f298266j) && C46238a.m51546a(this.f298267n, ft22.f298267n) && C46238a.m51546a(this.f298268o, ft22.f298268o) && C46238a.m51546a(Integer.valueOf(this.f298269p), Integer.valueOf(ft22.f298269p)) && C46238a.m51546a(this.f298270q, ft22.f298270q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298260d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298261e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f298262f);
            String str3 = this.f298263g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f298264h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f298265i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f298266j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f298267n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f298268o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            aVar.mo74318e(10, this.f298269p);
            String str9 = this.f298270q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            return 0;
        } else if (i == 1) {
            String str10 = this.f298260d;
            if (str10 != null) {
                i2 = 0 + C52418a.m58683j(1, str10);
            }
            String str11 = this.f298261e;
            if (str11 != null) {
                i2 += C52418a.m58683j(2, str11);
            }
            int e = i2 + C52418a.m58678e(3, this.f298262f);
            String str12 = this.f298263g;
            if (str12 != null) {
                e += C52418a.m58683j(4, str12);
            }
            String str13 = this.f298264h;
            if (str13 != null) {
                e += C52418a.m58683j(5, str13);
            }
            String str14 = this.f298265i;
            if (str14 != null) {
                e += C52418a.m58683j(6, str14);
            }
            String str15 = this.f298266j;
            if (str15 != null) {
                e += C52418a.m58683j(7, str15);
            }
            String str16 = this.f298267n;
            if (str16 != null) {
                e += C52418a.m58683j(8, str16);
            }
            String str17 = this.f298268o;
            if (str17 != null) {
                e += C52418a.m58683j(9, str17);
            }
            int e2 = e + C52418a.m58678e(10, this.f298269p);
            String str18 = this.f298270q;
            return str18 != null ? e2 + C52418a.m58683j(11, str18) : e2;
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
            C101778ft2 ft22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ft22.f298260d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ft22.f298261e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ft22.f298262f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ft22.f298263g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ft22.f298264h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ft22.f298265i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ft22.f298266j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ft22.f298267n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ft22.f298268o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ft22.f298269p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ft22.f298270q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
