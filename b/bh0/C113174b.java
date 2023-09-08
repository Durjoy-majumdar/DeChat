package bh0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: bh0.b */
public class C113174b extends C47465a {

    /* renamed from: d */
    public int f338614d;

    /* renamed from: e */
    public String f338615e;

    /* renamed from: f */
    public String f338616f;

    /* renamed from: g */
    public String f338617g;

    /* renamed from: h */
    public String f338618h;

    /* renamed from: i */
    public String f338619i;

    /* renamed from: j */
    public String f338620j;

    /* renamed from: n */
    public String f338621n;

    /* renamed from: o */
    public String f338622o;

    /* renamed from: p */
    public String f338623p;

    /* renamed from: q */
    public String f338624q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C113174b)) {
            return false;
        }
        C113174b bVar = (C113174b) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f338614d), Integer.valueOf(bVar.f338614d)) && C46238a.m51546a(this.f338615e, bVar.f338615e) && C46238a.m51546a(this.f338616f, bVar.f338616f) && C46238a.m51546a(this.f338617g, bVar.f338617g) && C46238a.m51546a(this.f338618h, bVar.f338618h) && C46238a.m51546a(this.f338619i, bVar.f338619i) && C46238a.m51546a(this.f338620j, bVar.f338620j) && C46238a.m51546a(this.f338621n, bVar.f338621n) && C46238a.m51546a(this.f338622o, bVar.f338622o) && C46238a.m51546a(this.f338623p, bVar.f338623p) && C46238a.m51546a(this.f338624q, bVar.f338624q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f338614d);
            String str = this.f338615e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f338616f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f338617g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f338618h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f338619i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f338620j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f338621n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f338622o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            String str9 = this.f338623p;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            String str10 = this.f338624q;
            if (str10 != null) {
                aVar.mo74323j(11, str10);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f338614d) + 0;
            String str11 = this.f338615e;
            if (str11 != null) {
                e += C52418a.m58683j(2, str11);
            }
            String str12 = this.f338616f;
            if (str12 != null) {
                e += C52418a.m58683j(3, str12);
            }
            String str13 = this.f338617g;
            if (str13 != null) {
                e += C52418a.m58683j(4, str13);
            }
            String str14 = this.f338618h;
            if (str14 != null) {
                e += C52418a.m58683j(5, str14);
            }
            String str15 = this.f338619i;
            if (str15 != null) {
                e += C52418a.m58683j(6, str15);
            }
            String str16 = this.f338620j;
            if (str16 != null) {
                e += C52418a.m58683j(7, str16);
            }
            String str17 = this.f338621n;
            if (str17 != null) {
                e += C52418a.m58683j(8, str17);
            }
            String str18 = this.f338622o;
            if (str18 != null) {
                e += C52418a.m58683j(9, str18);
            }
            String str19 = this.f338623p;
            if (str19 != null) {
                e += C52418a.m58683j(10, str19);
            }
            String str20 = this.f338624q;
            return str20 != null ? e + C52418a.m58683j(11, str20) : e;
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
            C113174b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bVar.f338614d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    bVar.f338615e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bVar.f338616f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bVar.f338617g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bVar.f338618h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bVar.f338619i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bVar.f338620j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bVar.f338621n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bVar.f338622o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    bVar.f338623p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    bVar.f338624q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
