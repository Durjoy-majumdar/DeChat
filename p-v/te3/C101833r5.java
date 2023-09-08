package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r5 */
public class C101833r5 extends C47465a {

    /* renamed from: d */
    public String f299236d;

    /* renamed from: e */
    public String f299237e;

    /* renamed from: f */
    public String f299238f;

    /* renamed from: g */
    public String f299239g;

    /* renamed from: h */
    public String f299240h;

    /* renamed from: i */
    public int f299241i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101833r5)) {
            return false;
        }
        C101833r5 r5Var = (C101833r5) aVar;
        return C46238a.m51546a(this.f299236d, r5Var.f299236d) && C46238a.m51546a(this.f299237e, r5Var.f299237e) && C46238a.m51546a(this.f299238f, r5Var.f299238f) && C46238a.m51546a(this.f299239g, r5Var.f299239g) && C46238a.m51546a(this.f299240h, r5Var.f299240h) && C46238a.m51546a(Integer.valueOf(this.f299241i), Integer.valueOf(r5Var.f299241i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299236d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299237e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299238f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f299239g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f299240h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f299241i);
            return 0;
        } else if (i == 1) {
            String str6 = this.f299236d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f299237e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f299238f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f299239g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f299240h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            return i2 + C52418a.m58678e(6, this.f299241i);
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
            C101833r5 r5Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    r5Var.f299236d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    r5Var.f299237e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    r5Var.f299238f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    r5Var.f299239g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    r5Var.f299240h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    r5Var.f299241i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
