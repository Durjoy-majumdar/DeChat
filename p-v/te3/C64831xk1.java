package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xk1 */
public class C64831xk1 extends C47465a {

    /* renamed from: d */
    public String f186326d;

    /* renamed from: e */
    public String f186327e;

    /* renamed from: f */
    public String f186328f;

    /* renamed from: g */
    public String f186329g;

    /* renamed from: h */
    public String f186330h;

    /* renamed from: i */
    public String f186331i;

    /* renamed from: j */
    public String f186332j;

    /* renamed from: n */
    public String f186333n;

    /* renamed from: o */
    public String f186334o;

    /* renamed from: p */
    public String f186335p;

    /* renamed from: q */
    public String f186336q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64831xk1)) {
            return false;
        }
        C64831xk1 xk12 = (C64831xk1) aVar;
        return C46238a.m51546a(this.f186326d, xk12.f186326d) && C46238a.m51546a(this.f186327e, xk12.f186327e) && C46238a.m51546a(this.f186328f, xk12.f186328f) && C46238a.m51546a(this.f186329g, xk12.f186329g) && C46238a.m51546a(this.f186330h, xk12.f186330h) && C46238a.m51546a(this.f186331i, xk12.f186331i) && C46238a.m51546a(this.f186332j, xk12.f186332j) && C46238a.m51546a(this.f186333n, xk12.f186333n) && C46238a.m51546a(this.f186334o, xk12.f186334o) && C46238a.m51546a(this.f186335p, xk12.f186335p) && C46238a.m51546a(this.f186336q, xk12.f186336q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186326d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186327e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186328f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f186329g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f186330h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f186331i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f186332j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f186333n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            String str9 = this.f186334o;
            if (str9 != null) {
                aVar.mo74323j(9, str9);
            }
            String str10 = this.f186335p;
            if (str10 != null) {
                aVar.mo74323j(10, str10);
            }
            String str11 = this.f186336q;
            if (str11 != null) {
                aVar.mo74323j(11, str11);
            }
            return 0;
        } else if (i == 1) {
            String str12 = this.f186326d;
            if (str12 != null) {
                i2 = 0 + C52418a.m58683j(1, str12);
            }
            String str13 = this.f186327e;
            if (str13 != null) {
                i2 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f186328f;
            if (str14 != null) {
                i2 += C52418a.m58683j(3, str14);
            }
            String str15 = this.f186329g;
            if (str15 != null) {
                i2 += C52418a.m58683j(4, str15);
            }
            String str16 = this.f186330h;
            if (str16 != null) {
                i2 += C52418a.m58683j(5, str16);
            }
            String str17 = this.f186331i;
            if (str17 != null) {
                i2 += C52418a.m58683j(6, str17);
            }
            String str18 = this.f186332j;
            if (str18 != null) {
                i2 += C52418a.m58683j(7, str18);
            }
            String str19 = this.f186333n;
            if (str19 != null) {
                i2 += C52418a.m58683j(8, str19);
            }
            String str20 = this.f186334o;
            if (str20 != null) {
                i2 += C52418a.m58683j(9, str20);
            }
            String str21 = this.f186335p;
            if (str21 != null) {
                i2 += C52418a.m58683j(10, str21);
            }
            String str22 = this.f186336q;
            return str22 != null ? i2 + C52418a.m58683j(11, str22) : i2;
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
            C64831xk1 xk12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xk12.f186326d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xk12.f186327e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xk12.f186328f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xk12.f186329g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xk12.f186330h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xk12.f186331i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    xk12.f186332j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    xk12.f186333n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xk12.f186334o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    xk12.f186335p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    xk12.f186336q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
