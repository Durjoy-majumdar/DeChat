package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.q5 */
public class C47658q5 extends C47465a {

    /* renamed from: d */
    public int f127953d;

    /* renamed from: e */
    public String f127954e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47658q5)) {
            return false;
        }
        C47658q5 q5Var = (C47658q5) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127953d), Integer.valueOf(q5Var.f127953d)) && C46238a.m51546a(this.f127954e, q5Var.f127954e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127953d);
            String str = this.f127954e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127953d) + 0;
            String str2 = this.f127954e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            C47658q5 q5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q5Var.f127953d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                q5Var.f127954e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
