package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h5 */
public class C64411h5 extends C47465a {

    /* renamed from: d */
    public int f183401d;

    /* renamed from: e */
    public String f183402e;

    /* renamed from: f */
    public boolean f183403f;

    /* renamed from: g */
    public boolean f183404g;

    /* renamed from: h */
    public boolean f183405h;

    /* renamed from: i */
    public int f183406i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64411h5)) {
            return false;
        }
        C64411h5 h5Var = (C64411h5) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183401d), Integer.valueOf(h5Var.f183401d)) && C46238a.m51546a(this.f183402e, h5Var.f183402e) && C46238a.m51546a(Boolean.valueOf(this.f183403f), Boolean.valueOf(h5Var.f183403f)) && C46238a.m51546a(Boolean.valueOf(this.f183404g), Boolean.valueOf(h5Var.f183404g)) && C46238a.m51546a(Boolean.valueOf(this.f183405h), Boolean.valueOf(h5Var.f183405h)) && C46238a.m51546a(Integer.valueOf(this.f183406i), Integer.valueOf(h5Var.f183406i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183401d);
            String str = this.f183402e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f183403f);
            aVar.mo74314a(4, this.f183404g);
            aVar.mo74314a(5, this.f183405h);
            aVar.mo74318e(6, this.f183406i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183401d) + 0;
            String str2 = this.f183402e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58674a(3, this.f183403f) + C52418a.m58674a(4, this.f183404g) + C52418a.m58674a(5, this.f183405h) + C52418a.m58678e(6, this.f183406i);
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
            C64411h5 h5Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    h5Var.f183401d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    h5Var.f183402e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    h5Var.f183403f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    h5Var.f183404g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    h5Var.f183405h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    h5Var.f183406i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
