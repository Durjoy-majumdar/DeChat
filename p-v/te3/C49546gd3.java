package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gd3 */
public class C49546gd3 extends C47465a {

    /* renamed from: d */
    public String f133975d;

    /* renamed from: e */
    public String f133976e;

    /* renamed from: f */
    public String f133977f;

    /* renamed from: g */
    public String f133978g;

    /* renamed from: h */
    public String f133979h;

    /* renamed from: i */
    public boolean f133980i;

    /* renamed from: j */
    public String f133981j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49546gd3)) {
            return false;
        }
        C49546gd3 gd32 = (C49546gd3) aVar;
        return C46238a.m51546a(this.f133975d, gd32.f133975d) && C46238a.m51546a(this.f133976e, gd32.f133976e) && C46238a.m51546a(this.f133977f, gd32.f133977f) && C46238a.m51546a(this.f133978g, gd32.f133978g) && C46238a.m51546a(this.f133979h, gd32.f133979h) && C46238a.m51546a(Boolean.valueOf(this.f133980i), Boolean.valueOf(gd32.f133980i)) && C46238a.m51546a(this.f133981j, gd32.f133981j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133975d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133976e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f133977f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f133978g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f133979h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74314a(6, this.f133980i);
            String str6 = this.f133981j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f133975d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f133976e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f133977f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f133978g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f133979h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            int a = i2 + C52418a.m58674a(6, this.f133980i);
            String str12 = this.f133981j;
            return str12 != null ? a + C52418a.m58683j(7, str12) : a;
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
            C49546gd3 gd32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gd32.f133975d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gd32.f133976e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gd32.f133977f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    gd32.f133978g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gd32.f133979h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gd32.f133980i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    gd32.f133981j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
