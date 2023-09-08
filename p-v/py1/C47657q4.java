package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.q4 */
public class C47657q4 extends C47465a {

    /* renamed from: d */
    public int f127951d;

    /* renamed from: e */
    public String f127952e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47657q4)) {
            return false;
        }
        C47657q4 q4Var = (C47657q4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127951d), Integer.valueOf(q4Var.f127951d)) && C46238a.m51546a(this.f127952e, q4Var.f127952e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127952e != null) {
                aVar.mo74318e(1, this.f127951d);
                String str = this.f127952e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Name");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127951d) + 0;
            String str2 = this.f127952e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127952e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Name");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47657q4 q4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q4Var.f127951d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                q4Var.f127952e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
