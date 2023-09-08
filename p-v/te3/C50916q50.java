package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q50 */
public class C50916q50 extends C47465a {

    /* renamed from: d */
    public String f140144d;

    /* renamed from: e */
    public String f140145e;

    /* renamed from: f */
    public String f140146f;

    /* renamed from: g */
    public String f140147g;

    /* renamed from: h */
    public String f140148h;

    /* renamed from: i */
    public String f140149i;

    /* renamed from: j */
    public String f140150j;

    /* renamed from: n */
    public String f140151n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50916q50)) {
            return false;
        }
        C50916q50 q502 = (C50916q50) aVar;
        return C46238a.m51546a(this.f140144d, q502.f140144d) && C46238a.m51546a(this.f140145e, q502.f140145e) && C46238a.m51546a(this.f140146f, q502.f140146f) && C46238a.m51546a(this.f140147g, q502.f140147g) && C46238a.m51546a(this.f140148h, q502.f140148h) && C46238a.m51546a(this.f140149i, q502.f140149i) && C46238a.m51546a(this.f140150j, q502.f140150j) && C46238a.m51546a(this.f140151n, q502.f140151n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140144d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140145e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f140146f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f140147g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f140148h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f140149i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f140150j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f140151n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f140144d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f140145e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f140146f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f140147g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f140148h;
            if (str13 != null) {
                i2 += C52418a.m58683j(5, str13);
            }
            String str14 = this.f140149i;
            if (str14 != null) {
                i2 += C52418a.m58683j(6, str14);
            }
            String str15 = this.f140150j;
            if (str15 != null) {
                i2 += C52418a.m58683j(7, str15);
            }
            String str16 = this.f140151n;
            return str16 != null ? i2 + C52418a.m58683j(8, str16) : i2;
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
            C50916q50 q502 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q502.f140144d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    q502.f140145e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    q502.f140146f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    q502.f140147g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    q502.f140148h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    q502.f140149i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    q502.f140150j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    q502.f140151n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
