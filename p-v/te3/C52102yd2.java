package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yd2 */
public class C52102yd2 extends C47465a {

    /* renamed from: d */
    public String f145233d;

    /* renamed from: e */
    public String f145234e;

    /* renamed from: f */
    public String f145235f;

    /* renamed from: g */
    public String f145236g;

    /* renamed from: h */
    public int f145237h;

    /* renamed from: i */
    public String f145238i;

    /* renamed from: j */
    public String f145239j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52102yd2)) {
            return false;
        }
        C52102yd2 yd22 = (C52102yd2) aVar;
        return C46238a.m51546a(this.f145233d, yd22.f145233d) && C46238a.m51546a(this.f145234e, yd22.f145234e) && C46238a.m51546a(this.f145235f, yd22.f145235f) && C46238a.m51546a(this.f145236g, yd22.f145236g) && C46238a.m51546a(Integer.valueOf(this.f145237h), Integer.valueOf(yd22.f145237h)) && C46238a.m51546a(this.f145238i, yd22.f145238i) && C46238a.m51546a(this.f145239j, yd22.f145239j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145233d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f145234e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f145235f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f145236g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f145237h);
            String str5 = this.f145238i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f145239j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f145233d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f145234e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f145235f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f145236g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int e = i2 + C52418a.m58678e(5, this.f145237h);
            String str11 = this.f145238i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f145239j;
            return str12 != null ? e + C52418a.m58683j(7, str12) : e;
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
            C52102yd2 yd22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yd22.f145233d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    yd22.f145234e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yd22.f145235f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yd22.f145236g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yd22.f145237h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yd22.f145238i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    yd22.f145239j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
