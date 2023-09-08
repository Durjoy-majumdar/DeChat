package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kw */
public class C90425kw extends C47465a {

    /* renamed from: d */
    public String f259658d;

    /* renamed from: e */
    public String f259659e;

    /* renamed from: f */
    public int f259660f;

    /* renamed from: g */
    public int f259661g;

    /* renamed from: h */
    public String f259662h;

    /* renamed from: i */
    public String f259663i;

    /* renamed from: j */
    public String f259664j;

    /* renamed from: n */
    public String f259665n;

    /* renamed from: o */
    public int f259666o;

    /* renamed from: p */
    public String f259667p;

    /* renamed from: q */
    public int f259668q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90425kw)) {
            return false;
        }
        C90425kw kwVar = (C90425kw) aVar;
        return C46238a.m51546a(this.f259658d, kwVar.f259658d) && C46238a.m51546a(this.f259659e, kwVar.f259659e) && C46238a.m51546a(Integer.valueOf(this.f259660f), Integer.valueOf(kwVar.f259660f)) && C46238a.m51546a(Integer.valueOf(this.f259661g), Integer.valueOf(kwVar.f259661g)) && C46238a.m51546a(this.f259662h, kwVar.f259662h) && C46238a.m51546a(this.f259663i, kwVar.f259663i) && C46238a.m51546a(this.f259664j, kwVar.f259664j) && C46238a.m51546a(this.f259665n, kwVar.f259665n) && C46238a.m51546a(Integer.valueOf(this.f259666o), Integer.valueOf(kwVar.f259666o)) && C46238a.m51546a(this.f259667p, kwVar.f259667p) && C46238a.m51546a(Integer.valueOf(this.f259668q), Integer.valueOf(kwVar.f259668q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259658d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259659e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f259660f);
            aVar.mo74318e(4, this.f259661g);
            String str3 = this.f259662h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f259663i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f259664j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f259665n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74318e(9, this.f259666o);
            String str7 = this.f259667p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74318e(11, this.f259668q);
            return 0;
        } else if (i == 1) {
            String str8 = this.f259658d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f259659e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int e = i2 + C52418a.m58678e(3, this.f259660f) + C52418a.m58678e(4, this.f259661g);
            String str10 = this.f259662h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f259663i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f259664j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            String str13 = this.f259665n;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            int e2 = e + C52418a.m58678e(9, this.f259666o);
            String str14 = this.f259667p;
            if (str14 != null) {
                e2 += C52418a.m58683j(10, str14);
            }
            return e2 + C52418a.m58678e(11, this.f259668q);
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
            C90425kw kwVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kwVar.f259658d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    kwVar.f259659e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    kwVar.f259660f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    kwVar.f259661g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    kwVar.f259662h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kwVar.f259663i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    kwVar.f259664j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kwVar.f259665n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    kwVar.f259666o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    kwVar.f259667p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    kwVar.f259668q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
