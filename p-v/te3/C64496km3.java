package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.km3 */
public class C64496km3 extends C47465a {

    /* renamed from: d */
    public String f183957d;

    /* renamed from: e */
    public int f183958e;

    /* renamed from: f */
    public String f183959f;

    /* renamed from: g */
    public String f183960g;

    /* renamed from: h */
    public String f183961h;

    /* renamed from: i */
    public String f183962i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64496km3)) {
            return false;
        }
        C64496km3 km32 = (C64496km3) aVar;
        return C46238a.m51546a(this.f183957d, km32.f183957d) && C46238a.m51546a(Integer.valueOf(this.f183958e), Integer.valueOf(km32.f183958e)) && C46238a.m51546a(this.f183959f, km32.f183959f) && C46238a.m51546a(this.f183960g, km32.f183960g) && C46238a.m51546a(this.f183961h, km32.f183961h) && C46238a.m51546a(this.f183962i, km32.f183962i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183957d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f183958e);
            String str2 = this.f183959f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f183960g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f183961h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f183962i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f183957d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            int e = i2 + C52418a.m58678e(2, this.f183958e);
            String str7 = this.f183959f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f183960g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f183961h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f183962i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
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
            C64496km3 km32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    km32.f183957d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    km32.f183958e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    km32.f183959f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    km32.f183960g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    km32.f183961h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    km32.f183962i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
