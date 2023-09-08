package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mp1 */
public class C64561mp1 extends C47465a {

    /* renamed from: d */
    public String f184367d;

    /* renamed from: e */
    public String f184368e;

    /* renamed from: f */
    public String f184369f;

    /* renamed from: g */
    public String f184370g;

    /* renamed from: h */
    public String f184371h;

    /* renamed from: i */
    public String f184372i;

    /* renamed from: j */
    public String f184373j;

    /* renamed from: n */
    public String f184374n;

    /* renamed from: o */
    public String f184375o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64561mp1)) {
            return false;
        }
        C64561mp1 mp12 = (C64561mp1) aVar;
        return C46238a.m51546a(this.f184367d, mp12.f184367d) && C46238a.m51546a(this.f184368e, mp12.f184368e) && C46238a.m51546a(this.f184369f, mp12.f184369f) && C46238a.m51546a(this.f184370g, mp12.f184370g) && C46238a.m51546a(this.f184371h, mp12.f184371h) && C46238a.m51546a(this.f184372i, mp12.f184372i) && C46238a.m51546a(this.f184373j, mp12.f184373j) && C46238a.m51546a(this.f184374n, mp12.f184374n) && C46238a.m51546a(this.f184375o, mp12.f184375o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184367d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184368e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184369f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f184370g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f184371h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f184372i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f184373j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f184374n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            String str9 = this.f184375o;
            if (str9 != null) {
                aVar.mo74323j(9, str9);
            }
            return 0;
        } else if (i == 1) {
            String str10 = this.f184367d;
            if (str10 != null) {
                i2 = 0 + C52418a.m58683j(1, str10);
            }
            String str11 = this.f184368e;
            if (str11 != null) {
                i2 += C52418a.m58683j(2, str11);
            }
            String str12 = this.f184369f;
            if (str12 != null) {
                i2 += C52418a.m58683j(3, str12);
            }
            String str13 = this.f184370g;
            if (str13 != null) {
                i2 += C52418a.m58683j(4, str13);
            }
            String str14 = this.f184371h;
            if (str14 != null) {
                i2 += C52418a.m58683j(5, str14);
            }
            String str15 = this.f184372i;
            if (str15 != null) {
                i2 += C52418a.m58683j(6, str15);
            }
            String str16 = this.f184373j;
            if (str16 != null) {
                i2 += C52418a.m58683j(7, str16);
            }
            String str17 = this.f184374n;
            if (str17 != null) {
                i2 += C52418a.m58683j(8, str17);
            }
            String str18 = this.f184375o;
            return str18 != null ? i2 + C52418a.m58683j(9, str18) : i2;
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
            C64561mp1 mp12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mp12.f184367d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    mp12.f184368e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mp12.f184369f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mp12.f184370g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mp12.f184371h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mp12.f184372i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mp12.f184373j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mp12.f184374n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    mp12.f184375o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
