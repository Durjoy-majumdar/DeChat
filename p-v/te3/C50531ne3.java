package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ne3 */
public class C50531ne3 extends C47465a {

    /* renamed from: d */
    public String f138559d;

    /* renamed from: e */
    public String f138560e;

    /* renamed from: f */
    public String f138561f;

    /* renamed from: g */
    public String f138562g;

    /* renamed from: h */
    public String f138563h;

    /* renamed from: i */
    public String f138564i;

    /* renamed from: j */
    public String f138565j;

    /* renamed from: n */
    public String f138566n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50531ne3)) {
            return false;
        }
        C50531ne3 ne32 = (C50531ne3) aVar;
        return C46238a.m51546a(this.f138559d, ne32.f138559d) && C46238a.m51546a(this.f138560e, ne32.f138560e) && C46238a.m51546a(this.f138561f, ne32.f138561f) && C46238a.m51546a(this.f138562g, ne32.f138562g) && C46238a.m51546a(this.f138563h, ne32.f138563h) && C46238a.m51546a(this.f138564i, ne32.f138564i) && C46238a.m51546a(this.f138565j, ne32.f138565j) && C46238a.m51546a(this.f138566n, ne32.f138566n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138559d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138560e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f138561f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f138562g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f138563h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f138564i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f138565j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f138566n;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f138559d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f138560e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f138561f;
            if (str11 != null) {
                i2 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f138562g;
            if (str12 != null) {
                i2 += C52418a.m58683j(4, str12);
            }
            String str13 = this.f138563h;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f138564i;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            String str15 = this.f138565j;
            if (str15 != null) {
                i2 += C52418a.m58683j(8, str15);
            }
            String str16 = this.f138566n;
            return str16 != null ? i2 + C52418a.m58683j(9, str16) : i2;
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
            C50531ne3 ne32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ne32.f138559d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ne32.f138560e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ne32.f138561f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ne32.f138562g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ne32.f138563h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ne32.f138564i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ne32.f138565j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    ne32.f138566n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
