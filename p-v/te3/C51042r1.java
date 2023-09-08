package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r1 */
public class C51042r1 extends C47465a {

    /* renamed from: d */
    public String f140648d;

    /* renamed from: e */
    public String f140649e;

    /* renamed from: f */
    public String f140650f;

    /* renamed from: g */
    public String f140651g;

    /* renamed from: h */
    public String f140652h;

    /* renamed from: i */
    public String f140653i;

    /* renamed from: j */
    public String f140654j;

    /* renamed from: n */
    public int f140655n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51042r1)) {
            return false;
        }
        C51042r1 r1Var = (C51042r1) aVar;
        return C46238a.m51546a(this.f140648d, r1Var.f140648d) && C46238a.m51546a(this.f140649e, r1Var.f140649e) && C46238a.m51546a(this.f140650f, r1Var.f140650f) && C46238a.m51546a(this.f140651g, r1Var.f140651g) && C46238a.m51546a(this.f140652h, r1Var.f140652h) && C46238a.m51546a(this.f140653i, r1Var.f140653i) && C46238a.m51546a(this.f140654j, r1Var.f140654j) && C46238a.m51546a(Integer.valueOf(this.f140655n), Integer.valueOf(r1Var.f140655n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140648d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140649e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f140650f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f140651g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f140652h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f140653i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f140654j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            aVar.mo74318e(8, this.f140655n);
            return 0;
        } else if (i == 1) {
            String str8 = this.f140648d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f140649e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f140650f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f140651g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f140652h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f140653i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f140654j;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            return i2 + C52418a.m58678e(8, this.f140655n);
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
            C51042r1 r1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    r1Var.f140648d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    r1Var.f140649e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    r1Var.f140650f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    r1Var.f140651g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    r1Var.f140652h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    r1Var.f140653i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    r1Var.f140654j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    r1Var.f140655n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
