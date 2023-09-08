package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.d5 */
public class C47567d5 extends C47465a {

    /* renamed from: d */
    public String f127643d;

    /* renamed from: e */
    public String f127644e;

    /* renamed from: f */
    public int f127645f;

    /* renamed from: g */
    public String f127646g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47567d5)) {
            return false;
        }
        C47567d5 d5Var = (C47567d5) aVar;
        return C46238a.m51546a(this.f127643d, d5Var.f127643d) && C46238a.m51546a(this.f127644e, d5Var.f127644e) && C46238a.m51546a(Integer.valueOf(this.f127645f), Integer.valueOf(d5Var.f127645f)) && C46238a.m51546a(this.f127646g, d5Var.f127646g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127643d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127644e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f127645f);
            String str3 = this.f127646g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f127643d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f127644e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f127645f);
            String str6 = this.f127646g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            C47567d5 d5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d5Var.f127643d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                d5Var.f127644e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                d5Var.f127645f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                d5Var.f127646g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
