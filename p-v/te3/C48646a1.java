package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a1 */
public class C48646a1 extends C47465a {

    /* renamed from: d */
    public String f130189d;

    /* renamed from: e */
    public String f130190e;

    /* renamed from: f */
    public String f130191f;

    /* renamed from: g */
    public int f130192g;

    /* renamed from: h */
    public String f130193h;

    /* renamed from: i */
    public int f130194i;

    /* renamed from: j */
    public String f130195j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48646a1)) {
            return false;
        }
        C48646a1 a1Var = (C48646a1) aVar;
        return C46238a.m51546a(this.f130189d, a1Var.f130189d) && C46238a.m51546a(this.f130190e, a1Var.f130190e) && C46238a.m51546a(this.f130191f, a1Var.f130191f) && C46238a.m51546a(Integer.valueOf(this.f130192g), Integer.valueOf(a1Var.f130192g)) && C46238a.m51546a(this.f130193h, a1Var.f130193h) && C46238a.m51546a(Integer.valueOf(this.f130194i), Integer.valueOf(a1Var.f130194i)) && C46238a.m51546a(this.f130195j, a1Var.f130195j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130189d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130190e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f130191f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f130192g);
            String str4 = this.f130193h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f130194i);
            String str5 = this.f130195j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f130189d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f130190e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f130191f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f130192g);
            String str9 = this.f130193h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            int e2 = e + C52418a.m58678e(6, this.f130194i);
            String str10 = this.f130195j;
            return str10 != null ? e2 + C52418a.m58683j(7, str10) : e2;
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
            C48646a1 a1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    a1Var.f130189d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    a1Var.f130190e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    a1Var.f130191f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    a1Var.f130192g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    a1Var.f130193h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    a1Var.f130194i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    a1Var.f130195j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
